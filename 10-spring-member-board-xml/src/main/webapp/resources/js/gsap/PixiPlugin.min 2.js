/*!
 * PixiPlugin 3.8.0
 * https://greensock.com
 * 
 * @license Copyright 2021, GreenSock. All rights reserved.
 * Subject to the terms at https://greensock.com/standard-license or for Club GreenSock members, the agreement issued with that membership.
 * @author: Jack Doyle, jack@greensock.com
 */

!function(t,i){"object"==typeof exports&&"undefined"!=typeof module?i(exports):"function"==typeof define&&define.amd?define(["exports"],i):i((t=t||self).window=t.window||{})}(this,function(i){"use strict";function l(){return"undefined"!=typeof window}function m(){return o||l()&&(o=window.gsap)&&o.registerPlugin&&o}function n(t){return"function"==typeof t}function t(t,i){var r,o,n=[],e=0,s=0;for(r=0;r<4;r++){for(o=0;o<5;o++)s=4===o?t[e+4]:0,n[e+o]=t[e]*i[o]+t[e+1]*i[o+5]+t[e+2]*i[o+10]+t[e+3]*i[o+15]+s;e+=5}return n}function u(i,r){var o=1-r,n=o*g,e=o*b,s=o*I;return t([n+r,e,s,0,0,n,e+r,s,0,0,n,e,s+r,0,0,0,0,0,1,0],i)}function v(i,r,o){var n=c(r),e=n[0]/255,s=n[1]/255,l=n[2]/255,a=1-o;return t([a+o*e*g,o*e*b,o*e*I,0,0,o*s*g,a+o*s*b,o*s*I,0,0,o*l*g,o*l*b,a+o*l*I,0,0,0,0,0,1,0],i)}function w(i,r){r*=Math.PI/180;var o=Math.cos(r),n=Math.sin(r);return t([g+o*(1-g)+n*-g,b+o*-b+n*-b,I+o*-I+n*(1-I),0,0,g+o*-g+.143*n,b+o*(1-b)+.14*n,I+o*-I+-.283*n,0,0,g+o*-g+n*-(1-g),b+o*-b+n*b,I+o*(1-I)+n*I,0,0,0,0,0,1,0,0,0,0,0,1],i)}function x(i,r){return t([r,0,0,0,.5*(1-r),0,r,0,0,.5*(1-r),0,0,r,0,.5*(1-r),0,0,0,1,0],i)}function y(t,i){var r,o=f.filters[i],n=t.filters||[],e=n.length;for(o||function _warn(t){console.warn(t)}(i+" not found. PixiPlugin.registerPIXI(PIXI)");-1<--e;)if(n[e]instanceof o)return n[e];return r=new o,"BlurFilter"===i&&(r.blur=0),n.push(r),t.filters=n,r}function z(t,i,r,o){i.add(r,t,r[t],o[t]),i._props.push(t)}function A(t,i){var r=new f.filters.ColorMatrixFilter;return r.matrix=i,r.brightness(t,!0),r.matrix}function D(t,i,r){var o,n,e,s=y(t,"ColorMatrixFilter"),l=t._gsColorMatrixFilter=t._gsColorMatrixFilter||function _copy(t){var i,r={};for(i in t)r[i]=t[i];return r}(M),a=i.combineCMF&&!("colorMatrixFilter"in i&&!i.colorMatrixFilter);e=s.matrix,i.resolution&&(s.resolution=i.resolution),i.matrix&&i.matrix.length===e.length?(n=i.matrix,1!==l.contrast&&z("contrast",r,l,M),l.hue&&z("hue",r,l,M),1!==l.brightness&&z("brightness",r,l,M),l.colorizeAmount&&(z("colorize",r,l,M),z("colorizeAmount",r,l,M)),1!==l.saturation&&z("saturation",r,l,M)):(n=p.slice(),null!=i.contrast?(n=x(n,+i.contrast),z("contrast",r,l,i)):1!==l.contrast&&(a?n=x(n,l.contrast):z("contrast",r,l,M)),null!=i.hue?(n=w(n,+i.hue),z("hue",r,l,i)):l.hue&&(a?n=w(n,l.hue):z("hue",r,l,M)),null!=i.brightness?(n=A(+i.brightness,n),z("brightness",r,l,i)):1!==l.brightness&&(a?n=A(l.brightness,n):z("brightness",r,l,M)),null!=i.colorize?(i.colorizeAmount="colorizeAmount"in i?+i.colorizeAmount:1,n=v(n,i.colorize,i.colorizeAmount),z("colorize",r,l,i),z("colorizeAmount",r,l,i)):l.colorizeAmount&&(a?n=v(n,l.colorize,l.colorizeAmount):(z("colorize",r,l,M),z("colorizeAmount",r,l,M))),null!=i.saturation?(n=u(n,+i.saturation),z("saturation",r,l,i)):1!==l.saturation&&(a?n=u(n,l.saturation):z("saturation",r,l,M))),o=n.length;for(;-1<--o;)n[o]!==e[o]&&r.add(e,o,e[o],n[o],"colorMatrixFilter");r._props.push("colorMatrixFilter")}function E(t,i){var r=i.t,o=i.p,n=i.color;(0,i.set)(r,o,n[0]<<16|n[1]<<8|n[2])}function F(t,i){var r=i.g;r&&(r.dirty++,r.clearDirty++)}function G(t,i){i.t.visible=!!i.t.alpha}function H(t,i,r,o){var e=t[i],s=c(n(e)?t[i.indexOf("set")||!n(t["get"+i.substr(3)])?i:"get"+i.substr(3)]():e),l=c(r);o._pt=new d(o._pt,t,i,0,0,E,{t:t,p:i,color:s,set:a(t,i)}),o.add(s,0,s[0],l[0]),o.add(s,1,s[1],l[1]),o.add(s,2,s[2],l[2])}function N(t){return"string"==typeof t}function O(t){return N(t)&&"="===t.charAt(1)?t.substr(0,2)+parseFloat(t.substr(2))*j:t*j}function P(t,i){return i.set(i.t,i.p,1===t?i.e:Math.round(1e5*(i.s+i.c*t))/1e5,i)}function Q(t,i,r,o,n,e){var s,l,a=360*(e?j:1),u=N(n),c=u&&"="===n.charAt(1)?+(n.charAt(0)+"1"):0,f=parseFloat(c?n.substr(2):n)*(e?j:1),h=c?f*c:f-o,p=o+h;return u&&("short"===(s=n.split("_")[1])&&(h%=a)!==h%(a/2)&&(h+=h<0?a:-a),"cw"===s&&h<0?h=(h+1e10*a)%a-~~(h/a)*a:"ccw"===s&&0<h&&(h=(h-1e10*a)%a-~~(h/a)*a)),t._pt=l=new d(t._pt,i,r,o,h,P),l.e=p,l}function R(){l()&&(r=window,o=m(),f=f||r.PIXI,h=f&&f.VERSION&&"4"===f.VERSION.charAt(0),c=function _splitColor(t){return o.utils.splitColor("0x"===(t+"").substr(0,2)?"#"+t.substr(2):t)})}var o,r,c,f,d,a,h,e,s,p=[1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0],g=.212671,b=.71516,I=.072169,M={contrast:1,saturation:1,colorizeAmount:0,colorize:"rgb(255,255,255)",hue:0,brightness:1},_={tint:1,lineColor:1,fillColor:1},C="position,scale,skew,pivot,anchor,tilePosition,tileScale".split(","),X={x:"position",y:"position",tileX:"tilePosition",tileY:"tilePosition"},S={colorMatrixFilter:1,saturation:1,contrast:1,hue:1,colorize:1,colorizeAmount:1,brightness:1,combineCMF:1},j=Math.PI/180;for(e=0;e<C.length;e++)s=C[e],X[s+"X"]=s,X[s+"Y"]=s;var Y={version:"3.8.0",name:"pixi",register:function register(t,i,r){o=t,d=r,a=i.getSetter,R()},registerPIXI:function registerPIXI(t){f=t},init:function init(t,i){if(f||R(),!(f&&t instanceof f.DisplayObject))return console.warn(t,"is not a DisplayObject or PIXI was not found. PixiPlugin.registerPIXI(PIXI);"),!1;var r,o,n,e,s,l,a,u,c;for(l in i){if(r=X[l],n=i[l],r)o=~l.charAt(l.length-1).toLowerCase().indexOf("x")?"x":"y",this.add(t[r],o,t[r][o],"skew"===r?O(n):n);else if("scale"===l||"anchor"===l||"pivot"===l||"tileScale"===l)this.add(t[l],"x",t[l].x,n),this.add(t[l],"y",t[l].y,n);else if("rotation"===l||"angle"===l)Q(this,t,l,t[l],n,"rotation"===l);else if(S[l])e||(D(t,i.colorMatrixFilter||i,this),e=!0);else if("blur"===l||"blurX"===l||"blurY"===l||"blurPadding"===l){if(s=y(t,"BlurFilter"),this.add(s,l,s[l],n),0!==i.blurPadding)for(a=i.blurPadding||2*Math.max(s[l],n),u=t.filters.length;-1<--u;)t.filters[u].padding=Math.max(t.filters[u].padding,a)}else if(_[l])if(("lineColor"===l||"fillColor"===l)&&t instanceof f.Graphics)for(c=(t.geometry||t).graphicsData,this._pt=new d(this._pt,t,l,0,0,F,{g:t.geometry||t}),u=c.length;-1<--u;)H(h?c[u]:c[u][l.substr(0,4)+"Style"],h?l:"color",n,this);else H(t,l,n,this);else"autoAlpha"===l?(this._pt=new d(this._pt,t,"visible",0,0,G),this.add(t,"alpha",t.alpha,n),this._props.push("alpha","visible")):"resolution"!==l&&this.add(t,l,"get",n);this._props.push(l)}}};m()&&o.registerPlugin(Y),i.PixiPlugin=Y,i.default=Y;if (typeof(window)==="undefined"||window!==i){Object.defineProperty(i,"__esModule",{value:!0})} else {delete i.default}});

