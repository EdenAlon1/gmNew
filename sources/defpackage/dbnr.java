package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbnr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ dbiq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbnr(ffjm ffjmVar, dbiq dbiqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjmVar;
        this.c = dbiqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbnr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffjm ffjmVar = this.b;
            dbiq dbiqVar = this.c;
            this.a = 1;
            if (ffjmVar.a(dbiqVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dbnr(this.b, this.c, ffguVar);
    }
}
