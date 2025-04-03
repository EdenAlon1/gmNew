package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqgo {
    public final cqfv a;

    public cqgo(cqfv cqfvVar) {
        this.a = cqfvVar;
    }

    public final /* synthetic */ cqgk a() {
        eyfy build = this.a.build();
        build.getClass();
        return (cqgk) build;
    }

    public final void b(cqfu cqfuVar) {
        cqfuVar.getClass();
        cqfv cqfvVar = this.a;
        cqfvVar.copyOnWrite();
        cqgk cqgkVar = (cqgk) cqfvVar.instance;
        cqgk cqgkVar2 = cqgk.a;
        cqgkVar.d = cqfuVar;
        cqgkVar.b |= 1;
    }

    public final /* synthetic */ void c(Iterable iterable) {
        iterable.getClass();
        cqfv cqfvVar = this.a;
        cqfvVar.copyOnWrite();
        cqgk cqgkVar = (cqgk) cqfvVar.instance;
        cqgk cqgkVar2 = cqgk.a;
        cqgkVar.a();
        eydl.addAll(iterable, cqgkVar.c);
    }

    public final /* synthetic */ void d() {
        cqfv cqfvVar = this.a;
        cqfvVar.copyOnWrite();
        cqgk cqgkVar = (cqgk) cqfvVar.instance;
        cqgk cqgkVar2 = cqgk.a;
        cqgkVar.c = cqgk.emptyProtobufList();
    }

    public final /* synthetic */ void e() {
        DesugarCollections.unmodifiableList(((cqgk) this.a.instance).c).getClass();
    }
}
