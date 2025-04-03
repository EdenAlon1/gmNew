package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsm extends ffkk implements ffix {
    final /* synthetic */ ftb a;
    final /* synthetic */ jzn b;
    final /* synthetic */ hho c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsm(ftb ftbVar, jzn jznVar, hho hhoVar) {
        super(0);
        this.a = ftbVar;
        this.b = jznVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        long d = guj.d(this.a);
        float a = jzt.a(d);
        jzn jznVar = this.b;
        return Boolean.valueOf(guj.e(this.c).g(ial.a(jznVar.em(a), jznVar.em(jzt.b(d)))));
    }
}
