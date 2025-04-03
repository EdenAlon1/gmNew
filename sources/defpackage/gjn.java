package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjn extends ffkk implements ffjn {
    final /* synthetic */ jvu a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ jwn d;
    final /* synthetic */ boolean e;
    final /* synthetic */ ffjm f;
    final /* synthetic */ ffjm g;
    final /* synthetic */ ffjm h;
    final /* synthetic */ ffjm i;
    final /* synthetic */ gqr j;
    final /* synthetic */ idh k;
    final /* synthetic */ dwn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjn(jvu jvuVar, boolean z, boolean z2, jwn jwnVar, dwn dwnVar, boolean z3, ffjm ffjmVar, ffjm ffjmVar2, ffjm ffjmVar3, ffjm ffjmVar4, gqr gqrVar, idh idhVar) {
        super(3);
        this.a = jvuVar;
        this.b = z;
        this.c = z2;
        this.d = jwnVar;
        this.l = dwnVar;
        this.e = z3;
        this.f = ffjmVar;
        this.g = ffjmVar2;
        this.h = ffjmVar3;
        this.i = ffjmVar4;
        this.j = gqrVar;
        this.k = idhVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ffjm ffjmVar = (ffjm) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.F(ffjmVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            jvu jvuVar = this.a;
            boolean z = this.b;
            boolean z2 = this.c;
            jwn jwnVar = this.d;
            dwn dwnVar = this.l;
            boolean z3 = this.e;
            ffjm ffjmVar2 = this.f;
            ffjm ffjmVar3 = this.g;
            ffjm ffjmVar4 = this.h;
            ffjm ffjmVar5 = this.i;
            gqr gqrVar = this.j;
            gjg.a.a(jvuVar.a(), ffjmVar, z, z2, jwnVar, dwnVar, z3, ffjmVar2, ffjmVar3, ffjmVar4, ffjmVar5, gqrVar, null, hpx.d(255570733, new gjm(z, z3, dwnVar, gqrVar, this.k), hfdVar), hfdVar, (intValue << 3) & 112, 14155776, 32768);
        }
        return ffcu.a;
    }
}
