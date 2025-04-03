package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjff extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public cjff(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjff) c((cjen) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cjek cjekVar = (cjek) ((cjen) this.a).toBuilder();
        cjekVar.getClass();
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((cjen) cjekVar.instance).c)).getClass();
        cjfx.e(cjekVar);
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((cjen) cjekVar.instance).h)).getClass();
        cjfx.d(cjekVar);
        cjfx.b(cjekVar);
        cjfx.c(cjekVar);
        return cjfx.a(cjekVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjff cjffVar = new cjff(ffguVar);
        cjffVar.a = obj;
        return cjffVar;
    }
}
