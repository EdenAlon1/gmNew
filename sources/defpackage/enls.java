package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enls implements enlc {
    public static final enls a = new enls();

    public static final enlu g(enlv enlvVar, Object obj, int i, enlu enluVar) {
        ReferenceQueue referenceQueue = enlvVar.g;
        return enluVar == null ? new enlu(referenceQueue, obj, i) : new enlt(referenceQueue, obj, i, enluVar);
    }

    @Override // defpackage.enlc
    public final /* bridge */ /* synthetic */ enlb a(enlf enlfVar, enlb enlbVar, enlb enlbVar2) {
        enlv enlvVar = (enlv) enlfVar;
        enlu enluVar = (enlu) enlbVar;
        enlu enluVar2 = (enlu) enlbVar2;
        Object obj = enluVar.get();
        if (obj == null) {
            return null;
        }
        enlu g = g(enlvVar, obj, enluVar.a, enluVar2);
        g.b = enluVar.b;
        return g;
    }

    @Override // defpackage.enlc
    public final /* bridge */ /* synthetic */ enlb b(enlf enlfVar, Object obj, int i, enlb enlbVar) {
        return g((enlv) enlfVar, obj, i, (enlu) enlbVar);
    }

    @Override // defpackage.enlc
    public final /* synthetic */ enlf c(enme enmeVar, int i) {
        return new enlv(enmeVar, i);
    }

    @Override // defpackage.enlc
    public final enlh d() {
        return enlh.WEAK;
    }

    @Override // defpackage.enlc
    public final enlh e() {
        return enlh.STRONG;
    }

    @Override // defpackage.enlc
    public final /* synthetic */ void f(enlf enlfVar, enlb enlbVar, Object obj) {
        ((enlu) enlbVar).b = obj;
    }
}
