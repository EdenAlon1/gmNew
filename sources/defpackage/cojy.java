package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cojy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cojz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cojy(cojz cojzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cojzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cojy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx a = ffyo.a(new ffxn(new cojv(this.b, null)));
            cojx cojxVar = new cojx(this.b);
            this.a = 1;
            if (a.a(cojxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cojy(this.b, ffguVar);
    }
}
