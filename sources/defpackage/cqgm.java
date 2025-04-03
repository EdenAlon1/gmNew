package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqgm {
    public final cqft a;

    public cqgm(cqft cqftVar) {
        this.a = cqftVar;
    }

    public final /* synthetic */ cqfu a() {
        eyfy build = this.a.build();
        build.getClass();
        return (cqfu) build;
    }

    public final cqgj b() {
        cqgj cqgjVar = ((cqfu) this.a.instance).c;
        if (cqgjVar == null) {
            cqgjVar = cqgj.a;
        }
        cqgjVar.getClass();
        return cqgjVar;
    }

    public final void c(eyja eyjaVar) {
        cqft cqftVar = this.a;
        cqftVar.copyOnWrite();
        cqfu cqfuVar = (cqfu) cqftVar.instance;
        cqfu cqfuVar2 = cqfu.a;
        cqfuVar.i = eyjaVar;
        cqfuVar.b |= 16;
    }

    public final void d(int i) {
        cqft cqftVar = this.a;
        cqftVar.copyOnWrite();
        cqfu cqfuVar = (cqfu) cqftVar.instance;
        cqfu cqfuVar2 = cqfu.a;
        cqfuVar.g = i;
    }

    public final void e(eyja eyjaVar) {
        cqft cqftVar = this.a;
        cqftVar.copyOnWrite();
        cqfu cqfuVar = (cqfu) cqftVar.instance;
        cqfu cqfuVar2 = cqfu.a;
        cqfuVar.d = eyjaVar;
        cqfuVar.b |= 2;
    }

    public final void f(cqgj cqgjVar) {
        cqft cqftVar = this.a;
        cqftVar.copyOnWrite();
        cqfu cqfuVar = (cqfu) cqftVar.instance;
        cqfu cqfuVar2 = cqfu.a;
        cqfuVar.c = cqgjVar;
        cqfuVar.b |= 1;
    }
}
