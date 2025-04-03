package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tzw extends ffhv implements ffji {
    int a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ dtyq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzw(ffjm ffjmVar, dtyq dtyqVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = ffjmVar;
        this.c = dtyqVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ffjm ffjmVar = this.b;
        dtyq dtyqVar = this.c;
        this.a = 1;
        Object a = ffjmVar.a(dtyqVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new tzw(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
