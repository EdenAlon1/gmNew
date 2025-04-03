package defpackage;

import android.app.Notification;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cety {
    static final emyl l = cfvl.w("constaints_only_on_work_manager");

    public static cetx l() {
        ceti cetiVar = new ceti();
        cetiVar.g(10000L);
        cetiVar.f(poa.LINEAR);
        cetiVar.b(cevc.WAKELOCK);
        cetiVar.e = Optional.empty();
        cetiVar.d(1);
        cetiVar.c(1);
        cetiVar.e(false);
        return cetiVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract Notification d();

    public abstract poa e();

    public abstract poj f();

    public abstract cevc g();

    public abstract eogt h();

    public abstract Duration i();

    public abstract Optional j();

    public abstract boolean k();

    final void m() {
        int ordinal = g().ordinal();
        if ((ordinal == 2 || ordinal == 3) && d() == null) {
            throw new IllegalStateException("must supply foreground notification");
        }
    }
}
