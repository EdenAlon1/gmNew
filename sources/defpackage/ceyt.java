package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class ceyt {
    public static ceys h() {
        cetn cetnVar = new cetn();
        cetnVar.d(false);
        return cetnVar;
    }

    public static ceyt i() {
        cetn cetnVar = new cetn();
        cetnVar.b(true);
        cetnVar.c(false);
        cetnVar.d(false);
        return cetnVar.a();
    }

    public static ceyt j(engw engwVar) {
        ceys h = ceto.h();
        h.b(true);
        h.c(false);
        ((cetn) h).a = engwVar;
        return h.a();
    }

    public static ceyt k() {
        ceys h = ceto.h();
        h.b(false);
        h.c(false);
        h.d(false);
        return h.a();
    }

    public static ceyt l(Exception exc) {
        ceys h = ceto.h();
        h.b(false);
        h.c(false);
        h.d(false);
        ((cetn) h).b = exc;
        return h.a();
    }

    public static ceyt m() {
        ceys h = ceto.h();
        h.b(false);
        h.c(true);
        h.d(false);
        return h.a();
    }

    static ceyt n() {
        ceys h = ceto.h();
        h.b(false);
        h.c(true);
        h.d(true);
        return h.a();
    }

    public abstract Bundle a();

    public abstract ceys b();

    public abstract engw c();

    public abstract Exception d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();
}
