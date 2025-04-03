package defpackage;

import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enlw implements enlc {
    public static final enlw a = new enlw();

    public static final enly g(enlz enlzVar, Object obj, int i, enly enlyVar) {
        ReferenceQueue referenceQueue = enlzVar.g;
        return enlyVar == null ? new enly(referenceQueue, obj, i) : new enlx(referenceQueue, obj, i, enlyVar);
    }

    @Override // defpackage.enlc
    public final /* bridge */ /* synthetic */ enlb a(enlf enlfVar, enlb enlbVar, enlb enlbVar2) {
        enlz enlzVar = (enlz) enlfVar;
        enly enlyVar = (enly) enlbVar;
        enly enlyVar2 = (enly) enlbVar2;
        Object obj = enlyVar.get();
        if (obj == null || enlf.m(enlyVar)) {
            return null;
        }
        enly g = g(enlzVar, obj, enlyVar.a, enlyVar2);
        g.b = enlyVar.b.b(enlzVar.h, g);
        return g;
    }

    @Override // defpackage.enlc
    public final /* bridge */ /* synthetic */ enlb b(enlf enlfVar, Object obj, int i, enlb enlbVar) {
        return g((enlz) enlfVar, obj, i, (enly) enlbVar);
    }

    @Override // defpackage.enlc
    public final /* synthetic */ enlf c(enme enmeVar, int i) {
        return new enlz(enmeVar, i);
    }

    @Override // defpackage.enlc
    public final enlh d() {
        return enlh.WEAK;
    }

    @Override // defpackage.enlc
    public final enlh e() {
        return enlh.WEAK;
    }

    @Override // defpackage.enlc
    public final /* bridge */ /* synthetic */ void f(enlf enlfVar, enlb enlbVar, Object obj) {
        enly enlyVar = (enly) enlbVar;
        enmb enmbVar = enlyVar.b;
        enlyVar.b = new enmc(((enlz) enlfVar).h, obj, enlyVar);
        enmbVar.clear();
    }
}
