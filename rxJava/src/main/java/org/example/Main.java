package org.example;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //1、创建被观察者Observable
        Observable<String> observable = Observable.create(e -> {
            e.onNext("RxJava：e.onNext== 第一次");
            e.onNext("RxJava：e.onNext== 第二次");
            e.onNext("RxJava：e.onNext== 第三次");
            e.onComplete();
        });

        //2、创建观察者Observer
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("onSubscribe == 订阅");
            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext == " + s);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("onError == " + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete == ");
            }
        };

        //3、订阅(观察者观察被观察者)
        observable.subscribe(observer);

    }
}