package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gla extends ffkk implements ffjm {
    final /* synthetic */ int a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ ffjn c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ ffjm e;
    final /* synthetic */ hbt f;
    final /* synthetic */ ffjm g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gla(int i, ffjm ffjmVar, ffjn ffjnVar, ffjm ffjmVar2, ffjm ffjmVar3, hbt hbtVar, ffjm ffjmVar4) {
        super(2);
        this.a = i;
        this.b = ffjmVar;
        this.c = ffjnVar;
        this.d = ffjmVar2;
        this.e = ffjmVar3;
        this.f = hbtVar;
        this.g = ffjmVar4;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            gll.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, hfdVar, 0);
        }
        return ffcu.a;
    }
}
