package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyww extends ffhv implements ffjm {
    final /* synthetic */ cywx a;
    final /* synthetic */ cyvt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyww(cywx cywxVar, cyvt cyvtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cywxVar;
        this.b = cyvtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyww) c((cyxc) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cywx cywxVar = this.a;
        ffbr ffbrVar = cywxVar.b;
        cyvq cyvqVar = cywxVar.g;
        fgcm fgcmVar = cyvqVar.d;
        fgcm b = axrb.b(cyvqVar.c, "visibility");
        fgcm b2 = axrb.b(fgcmVar, "avatarPosition");
        fgdj c = axrb.c(((cyul) ffbrVar.b()).a(new cyuk(this.b.a)), "actionsUiData");
        fgdj c2 = axrb.c(((cyvd) this.a.c.b()).a(), "avatarUiData");
        ffxx a = axrb.a(this.a.f, "photoSelectorUiData");
        cyvt cyvtVar = this.b;
        cywx cywxVar2 = this.a;
        return axsp.f(b, b2, c, c2, a, cywxVar2.a, new cywv(cyvtVar, cywxVar2, null));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cyww(this.a, this.b, ffguVar);
    }
}
