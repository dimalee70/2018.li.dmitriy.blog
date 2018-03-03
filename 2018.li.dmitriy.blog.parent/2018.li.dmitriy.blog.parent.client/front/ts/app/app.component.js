"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
var core_1 = require("@angular/core");
require("rxjs/add/operator/toPromise");
var AppComponent = (function () {
    function AppComponent(httpService) {
        this.httpService = httpService;
    }
    AppComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.httpService.get("/getMainText").toPromise().then(function (result) {
            _this.text = result.json().text;
        }, function (error) {
            _this.text = "Something is wrong";
        });
    };
    AppComponent = __decorate([
        core_1.Component({
            selector: "home_app",
            template: require('./app.component.html'),
            styles: [require('./app.component.css')]
        })
    ], AppComponent);
    return AppComponent;
}());
exports.AppComponent = AppComponent;
