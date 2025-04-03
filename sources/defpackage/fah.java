package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fah extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fai b;
    final /* synthetic */ ffjm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fah(fai faiVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = faiVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fah) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fai faiVar = this.b;
            ffjm ffjmVar = this.c;
            this.a = 1;
            if (jfk.b(faiVar, ffjmVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fah(this.b, this.c, ffguVar);
    }
}
