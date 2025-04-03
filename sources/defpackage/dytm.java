package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dytm {
    public static Object a(dyti dytiVar, Callable callable) {
        dyhw.b();
        try {
            try {
                dytiVar.d();
                Object call = callable.call();
                dytiVar.f();
                if (dytiVar.g()) {
                    dytiVar.e();
                }
                return call;
            } catch (Exception e) {
                throw new dytj(e);
            }
        } catch (Throwable th) {
            if (dytiVar.g()) {
                dytiVar.e();
            }
            throw th;
        }
    }

    public static void b(dyti dytiVar, final Runnable runnable) {
        a(dytiVar, new Callable() { // from class: dytk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                runnable.run();
                return null;
            }
        });
    }
}
