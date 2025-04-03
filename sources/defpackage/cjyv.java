package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjyv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjyw b;
    final /* synthetic */ fcea c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjyv(cjyw cjywVar, fcea fceaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjywVar;
        this.c = fceaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjyv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl a = this.b.a.a();
            this.a = 1;
            obj = fgfz.c(a, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        fcea fceaVar = this.c;
        fcdv fcdvVar = (fcdv) fcdx.a.createBuilder();
        fcdvVar.getClass();
        fcdy fcdyVar = (fcdy) fcdz.a.createBuilder();
        fcdyVar.getClass();
        fbda.b("profile-version", fcdyVar);
        fbcz.b(fbda.a(fcdyVar), fcdvVar);
        fcdy fcdyVar2 = (fcdy) fcdz.a.createBuilder();
        fcdyVar2.getClass();
        fbda.b("1", fcdyVar2);
        fbcz.c(fbda.a(fcdyVar2), fcdvVar);
        fbcz.d(4, fcdvVar);
        fcdv fcdvVar2 = (fcdv) fcdx.a.createBuilder();
        fcdvVar2.getClass();
        fcdy fcdyVar3 = (fcdy) fcdz.a.createBuilder();
        fcdyVar3.getClass();
        fbda.b("profile-signed-in", fcdyVar3);
        fbcz.b(fbda.a(fcdyVar3), fcdvVar2);
        fcdy fcdyVar4 = (fcdy) fcdz.a.createBuilder();
        fcdyVar4.getClass();
        fbda.b(((Boolean) obj).toString(), fcdyVar4);
        fbcz.c(fbda.a(fcdyVar4), fcdvVar2);
        fbcz.d(4, fcdvVar2);
        fceaVar.a(ffdx.g(fbcz.a(fcdvVar), fbcz.a(fcdvVar2)));
        return this.c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjyv(this.b, this.c, ffguVar);
    }
}
