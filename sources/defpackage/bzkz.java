package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzkz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bzla b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzkz(bzla bzlaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bzlaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzkz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            bzla bzlaVar = this.b;
            this.a = 1;
            if (bzlaVar.b(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzkz(this.b, ffguVar);
    }
}
