package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cklz extends ffhv implements ffjm {
    final /* synthetic */ ckma a;
    final /* synthetic */ fcea b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cklz(ckma ckmaVar, fcea fceaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ckmaVar;
        this.b = fceaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cklz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (((ersq) ((arqv) this.a.a).a.b()).a("bugle.enable_publish_extended_messaging_capability") && this.a.b.a() && this.a.c.a()) {
            fcea fceaVar = this.b;
            fcdv fcdvVar = (fcdv) fcdx.a.createBuilder();
            fcdvVar.getClass();
            fcdy fcdyVar = (fcdy) fcdz.a.createBuilder();
            fcdyVar.getClass();
            fbda.b("+g.3gpp.iari-ref", fcdyVar);
            fbcz.b(fbda.a(fcdyVar), fcdvVar);
            fcdy fcdyVar2 = (fcdy) fcdz.a.createBuilder();
            fcdyVar2.getClass();
            fbda.b("urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.msg.extended", fcdyVar2);
            fbcz.c(fbda.a(fcdyVar2), fcdvVar);
            fbcz.d(3, fcdvVar);
            fceaVar.b(fbcz.a(fcdvVar));
        }
        return this.b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cklz(this.a, this.b, ffguVar);
    }
}
