package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gqm extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ ffjn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqm(ffjm ffjmVar, ffjm ffjmVar2, ffjn ffjnVar) {
        super(2);
        this.a = ffjmVar;
        this.b = ffjmVar2;
        this.c = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi d;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            boolean D = hfdVar.D(this.a) | hfdVar.D(this.b) | hfdVar.D(this.c);
            ffjm ffjmVar = this.a;
            ffjm ffjmVar2 = this.b;
            ffjn ffjnVar = this.c;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new gql(ffjmVar, ffjmVar2, ffjnVar);
                hfdVar.y(f);
            }
            ira.a(d, (ffjm) f, hfdVar, 6, 0);
        }
        return ffcu.a;
    }
}
