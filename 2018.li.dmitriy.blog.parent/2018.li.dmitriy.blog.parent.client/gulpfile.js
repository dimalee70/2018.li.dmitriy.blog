const gulp = require("gulp");
//const task1 = gulp.task;
const del = require("del");
// const ser = require("ser");
const less = require("gulp-less");
const pug = require("gulp-pug");
const path = require("path");

let isWatch= true;
function outDir(){
    return path.resolve(__dirname,'build','public', 'blog');
}
task('webpack', function (callback) {

    let options = {
        entry: [path.resolve('.', 'front', 'ts', 'main.ts')],
        output: {
            path: path.resolve(outDir(), 'js'),
            publicPath: '/',
            filename: '[name].js',
            sourceMapFilename: '[name].js.map',
        },
        watch: isWatch,
        devtool: 'cheap-module-inline-source-map',
        module: {
            loaders: [{
                test: /\.ts$/,
                include: path.resolve(__dirname, 'front', 'ts'),
                loader: ['ts-loader'],
            }],
        },
        resolve: {
            extensions: [".ts", ".js"]
        },
        plugins: [
            new webpack.NoEmitOnErrorsPlugin() // otherwise error still gives a file
        ]
    };

    webpack(options, function (err, stats) {
        if (!err) { // no hard error
            // try to get a soft error from stats
            err = stats.toJson().errors[0];
        }

        if (err) {
            notifier.notify({
                title: 'Webpack',
                message: err
            });

            gulpLog.error(err);
        } else {
            gulpLog.info(stats.toString({
                colors: true
            }));
        }

        // task never errs in watch mode, it waits and recompile
        if (!options.watch && err) {
            callback(err);
        } else {
            callback();
        }

    });
});

gulp.task('clean',function(){
    return del(['build1']);
});
gulp.task('less',function () {
    return gulp.src("front/less/*.less")
        .pipe(gulp.dest(outDir()));
});
// gulp.task('pug',function () {
//     return gulp.src("front/pug/*.pug")
//         .pipe(pug()).pipe(gulp.dest('build/styles/less/'));
// });
gulp.task('pug', function (){
    return gulp.src("front/pug/*.pug")
        .pipe(pug())
        .pipe(gulp.dest(outDir()))
});
gulp.task('def', gulp.parallel('less', 'pug'));
gulp.task('ser', gulp.series('clean',gulp.parallel('less', 'pug')));