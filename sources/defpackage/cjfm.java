package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjfm extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjfm(boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjfm) c((cjen) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cjek cjekVar = (cjek) ((cjen) this.a).toBuilder();
        cjekVar.getClass();
        cjekVar.copyOnWrite();
        cjen cjenVar = (cjen) cjekVar.instance;
        cjenVar.b |= 16;
        cjenVar.i = this.b;
        return cjfx.a(cjekVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjfm cjfmVar = new cjfm(this.b, ffguVar);
        cjfmVar.a = obj;
        return cjfmVar;
    }
}
