package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjfj extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjfj(String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjfj) c((cjen) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cjek cjekVar = (cjek) ((cjen) this.a).toBuilder();
        cjekVar.getClass();
        cjekVar.copyOnWrite();
        cjen cjenVar = (cjen) cjekVar.instance;
        cjenVar.b |= 8;
        cjenVar.g = this.b;
        return cjfx.a(cjekVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjfj cjfjVar = new cjfj(this.b, ffguVar);
        cjfjVar.a = obj;
        return cjfjVar;
    }
}
