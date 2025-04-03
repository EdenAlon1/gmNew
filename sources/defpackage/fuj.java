package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fuj extends ffkk implements ffjm {
    final /* synthetic */ fvn a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ idh e;
    final /* synthetic */ long f;
    final /* synthetic */ long g;
    final /* synthetic */ float h;
    final /* synthetic */ float i;
    final /* synthetic */ ffjm j;
    final /* synthetic */ ffjn k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuj(fvn fvnVar, float f, float f2, boolean z, idh idhVar, long j, long j2, float f3, float f4, ffjm ffjmVar, ffjn ffjnVar) {
        super(2);
        this.a = fvnVar;
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = idhVar;
        this.f = j;
        this.g = j2;
        this.h = f3;
        this.i = f4;
        this.j = ffjmVar;
        this.k = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            fvn fvnVar = this.a;
            fvm.d(fvnVar.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, hfdVar, 0, 0);
        }
        return ffcu.a;
    }
}
