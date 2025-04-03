package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjfh extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public cjfh(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjfh) c((cjen) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cjek cjekVar = (cjek) ((cjen) this.a).toBuilder();
        cjekVar.getClass();
        cjekVar.copyOnWrite();
        cjen cjenVar = (cjen) cjekVar.instance;
        cjenVar.b &= -3;
        cjenVar.e = false;
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((cjen) cjekVar.instance).c)).getClass();
        cjfx.e(cjekVar);
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((cjen) cjekVar.instance).h)).getClass();
        cjfx.d(cjekVar);
        cjfx.b(cjekVar);
        cjfx.c(cjekVar);
        cjekVar.copyOnWrite();
        cjen cjenVar2 = (cjen) cjekVar.instance;
        cjenVar2.b &= -33;
        cjenVar2.j = 0;
        return cjfx.a(cjekVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjfh cjfhVar = new cjfh(ffguVar);
        cjfhVar.a = obj;
        return cjfhVar;
    }
}
