package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bdgd {
    public static final entd w = entd.c("BugleDataModel");

    public static bdgc y() {
        bczj bczjVar = new bczj();
        bczjVar.f(byyt.UNARCHIVED);
        bczjVar.n(true);
        bczjVar.o(true);
        bczjVar.y();
        bczjVar.m(0);
        bczjVar.u(-1L);
        bczjVar.x(false);
        bczjVar.v(1);
        bczjVar.g(amer.a);
        return bczjVar;
    }

    public static bdgc z(cqdh cqdhVar) {
        bczj bczjVar = new bczj();
        bczjVar.f(cqdhVar.a);
        bczjVar.y();
        bczjVar.n(!cqdhVar.b);
        bczjVar.o(!cqdhVar.c);
        bczjVar.a = Optional.ofNullable(cqdhVar.d);
        bczjVar.m(cqdhVar.e);
        bczjVar.u(cqdhVar.f);
        bczjVar.x(false);
        bczjVar.g(amer.a);
        return bczjVar;
    }

    public abstract int a();

    public abstract long b();

    public abstract amer c();

    public abstract bdgc d();

    public abstract byyt e();

    public abstract cpxu f();

    public abstract engw g();

    public abstract Optional h();

    public abstract Optional i();

    public abstract Optional j();

    public abstract Optional k();

    public abstract Optional l();

    public abstract Optional m();

    public abstract Optional n();

    public abstract Optional o();

    public abstract Optional p();

    public abstract Optional q();

    public abstract boolean r();

    public abstract boolean s();

    public abstract boolean t();

    public abstract boolean u();

    @Deprecated
    public abstract boolean v();

    public abstract int w();

    public abstract void x();
}
