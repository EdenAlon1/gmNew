package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axst extends ffhv implements ffji {
    int a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ ffxy c;
    final /* synthetic */ ffkx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axst(ffjm ffjmVar, ffxy ffxyVar, ffkx ffkxVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = ffjmVar;
        this.c = ffxyVar;
        this.d = ffkxVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffjm ffjmVar = this.b;
            ffxy ffxyVar = this.c;
            this.a = 1;
            if (ffjmVar.a(ffxyVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.d.a = true;
        return true;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new axst(this.b, this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}
