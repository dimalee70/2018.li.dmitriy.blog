const gulp = require("gulp");
//const task1 = gulp.task;
const del = require("del");
// const ser = require("ser");
const less = require("gulp-less");
const pug = require("gulp-pug");
gulp.task('clean',function(){
    return del(['build1']);
});
gulp.task('less',function () {
    return gulp.src("front/less/*.less")
        .pipe(gulp.dest('build/styles/less'));
});
// gulp.task('pug',function () {
//     return gulp.src("front/pug/*.pug")
//         .pipe(pug()).pipe(gulp.dest('build/styles/less/'));
// });
gulp.task('pug', function (){
    return gulp.src("front/pug/*.pug")
        .pipe(pug())
        .pipe(gulp.dest('build/views/'))
});
gulp.task('def', gulp.parallel('less', 'pug'));
gulp.task('ser', gulp.series('clean',gulp.parallel('less', 'pug')));