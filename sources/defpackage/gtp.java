package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gtp extends ffkk implements ffjn {
    final /* synthetic */ jvu a;
    final /* synthetic */ gqr b;
    final /* synthetic */ dwn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtp(jvu jvuVar, dwn dwnVar, gqr gqrVar) {
        super(3);
        this.a = jvuVar;
        this.c = dwnVar;
        this.b = gqrVar;
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
            gjg gjgVar = gjg.a;
            String a = jvuVar.a();
            int i = jwn.d;
            jwn jwnVar = jwm.a;
            ebf ebfVar = new ebf(0.0f, 0.0f, 0.0f, 0.0f);
            dwn dwnVar = this.c;
            gqr gqrVar = this.b;
            gjgVar.a(a, ffjmVar, true, true, jwnVar, dwnVar, false, null, null, null, null, gqrVar, ebfVar, hpx.d(-833003881, new gto(dwnVar, gqrVar), hfdVar), hfdVar, ((intValue << 3) & 112) | 224640, 14352384, 16320);
        }
        return ffcu.a;
    }
}
