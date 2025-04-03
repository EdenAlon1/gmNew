package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awxm {
    public final awxh a;

    public awxm(awxh awxhVar) {
        this.a = awxhVar;
    }

    public final /* synthetic */ awxk a() {
        eyfy build = this.a.build();
        build.getClass();
        return (awxk) build;
    }

    public final void b(azjw azjwVar) {
        awxh awxhVar = this.a;
        awxhVar.copyOnWrite();
        awxk awxkVar = (awxk) awxhVar.instance;
        eygj eygjVar = awxk.a;
        awxkVar.i = azjwVar;
        awxkVar.c |= 32;
    }

    public final void c(String str) {
        awxh awxhVar = this.a;
        awxhVar.copyOnWrite();
        awxk awxkVar = (awxk) awxhVar.instance;
        eygj eygjVar = awxk.a;
        awxkVar.c |= 16;
        awxkVar.h = str;
    }

    public final void d(azvx azvxVar) {
        awxh awxhVar = this.a;
        awxhVar.copyOnWrite();
        awxk awxkVar = (awxk) awxhVar.instance;
        eygj eygjVar = awxk.a;
        awxkVar.k = azvxVar;
        awxkVar.c |= 128;
    }

    public final void e(String str) {
        awxh awxhVar = this.a;
        awxhVar.copyOnWrite();
        awxk awxkVar = (awxk) awxhVar.instance;
        eygj eygjVar = awxk.a;
        awxkVar.c |= 2;
        awxkVar.e = str;
    }

    public final void f(azee azeeVar) {
        awxh awxhVar = this.a;
        awxhVar.copyOnWrite();
        awxk awxkVar = (awxk) awxhVar.instance;
        eygj eygjVar = awxk.a;
        awxkVar.f = azeeVar;
        awxkVar.c |= 4;
    }
}
