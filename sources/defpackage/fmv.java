package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmv extends ffkk implements ffjm {
    final /* synthetic */ int a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ ffjn c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ fln e;
    final /* synthetic */ ffjm f;
    final /* synthetic */ ffjn g;
    final /* synthetic */ fnf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmv(int i, ffjm ffjmVar, ffjn ffjnVar, ffjm ffjmVar2, fln flnVar, ffjm ffjmVar3, ffjn ffjnVar2, fnf fnfVar) {
        super(2);
        this.a = i;
        this.b = ffjmVar;
        this.c = ffjnVar;
        this.d = ffjmVar2;
        this.e = flnVar;
        this.f = ffjmVar3;
        this.g = ffjnVar2;
        this.h = fnfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            fnd.c(this.a, this.b, this.c, hpx.d(433906483, new fmu(this.g, this.h), hfdVar), this.d, this.e, this.f, hfdVar, 24576);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
