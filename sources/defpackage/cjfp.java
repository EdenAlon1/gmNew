package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjfp extends ffhv implements ffjm {
    /* synthetic */ Object a;

    public cjfp(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjfp) c((cjen) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cjek cjekVar = (cjek) ((cjen) this.a).toBuilder();
        cjekVar.getClass();
        cjekVar.copyOnWrite();
        cjen cjenVar = (cjen) cjekVar.instance;
        cjenVar.b |= 2;
        cjenVar.e = true;
        return cjfx.a(cjekVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjfp cjfpVar = new cjfp(ffguVar);
        cjfpVar.a = obj;
        return cjfpVar;
    }
}
