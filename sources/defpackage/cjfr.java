package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjfr extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ eisx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjfr(eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjfr) c((cjen) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cjek cjekVar = (cjek) ((cjen) this.a).toBuilder();
        cjekVar.getClass();
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((cjen) cjekVar.instance).c)).getClass();
        int a = this.b.a();
        cjekVar.copyOnWrite();
        ((cjen) cjekVar.instance).a().put(Integer.valueOf(a), true);
        return cjfx.a(cjekVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjfr cjfrVar = new cjfr(this.b, ffguVar);
        cjfrVar.a = obj;
        return cjfrVar;
    }
}
