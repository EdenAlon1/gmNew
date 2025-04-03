package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gji extends ffkk implements ffjn {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    final /* synthetic */ jwn c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ ffjm e;
    final /* synthetic */ gqr f;
    final /* synthetic */ idh g;
    final /* synthetic */ dwn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gji(String str, boolean z, jwn jwnVar, dwn dwnVar, ffjm ffjmVar, ffjm ffjmVar2, gqr gqrVar, idh idhVar) {
        super(3);
        this.a = str;
        this.b = z;
        this.c = jwnVar;
        this.h = dwnVar;
        this.d = ffjmVar;
        this.e = ffjmVar2;
        this.f = gqrVar;
        this.g = idhVar;
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
            int i = intValue;
            String str = this.a;
            boolean z = this.b;
            jwn jwnVar = this.c;
            dwn dwnVar = this.h;
            ffjm ffjmVar2 = this.d;
            ffjm ffjmVar3 = this.e;
            gqr gqrVar = this.f;
            gjg.a.a(str, ffjmVar, z, false, jwnVar, dwnVar, false, null, ffjmVar2, ffjmVar3, null, gqrVar, null, hpx.d(2108828640, new gjh(z, dwnVar, gqrVar, this.g), hfdVar), hfdVar, (i << 3) & 112, 14155776, 32768);
        }
        return ffcu.a;
    }
}
