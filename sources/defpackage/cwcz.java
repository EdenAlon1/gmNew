package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwcz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fgcq b;
    final /* synthetic */ god c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwcz(fgcq fgcqVar, god godVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fgcqVar;
        this.c = godVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwcz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fgbq fgbqVar = new fgbq(this.b);
            cwcy cwcyVar = new cwcy(this.c);
            this.a = 1;
            if (fgbqVar.a(cwcyVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwcz(this.b, this.c, ffguVar);
    }
}
