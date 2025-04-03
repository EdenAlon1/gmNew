package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ett extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ild b;
    final /* synthetic */ evy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ett(ild ildVar, evy evyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ildVar;
        this.c = evyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ett) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ild ildVar = this.b;
            evy evyVar = this.c;
            this.a = 1;
            if (evn.a(ildVar, evyVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ett(this.b, this.c, ffguVar);
    }
}
