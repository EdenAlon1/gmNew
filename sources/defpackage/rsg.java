package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsg {
    public static final /* synthetic */ rsf a(rse rseVar) {
        eyfy build = rseVar.build();
        build.getClass();
        return (rsf) build;
    }

    public static final void b(rqo rqoVar, rse rseVar) {
        rseVar.copyOnWrite();
        rsf rsfVar = (rsf) rseVar.instance;
        rsf rsfVar2 = rsf.a;
        rsfVar.c = rqoVar;
        rsfVar.b |= 1;
    }

    public static final void c(rqq rqqVar, rse rseVar) {
        rseVar.copyOnWrite();
        rsf rsfVar = (rsf) rseVar.instance;
        rsf rsfVar2 = rsf.a;
        rsfVar.d = rqqVar;
        rsfVar.b |= 2;
    }
}
