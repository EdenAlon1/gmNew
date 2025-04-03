package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmpd implements ffjn {
    final /* synthetic */ String a;

    public dmpd(String str) {
        this.a = str;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ffjm ffjmVar = (ffjm) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ffjmVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.F(ffjmVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwjo dwjoVar = dwjo.a;
            int i = jwn.d;
            jwn jwnVar = jwm.a;
            hfdVar.v(-1834239829);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new dwn();
                hfdVar.y(f);
            }
            hfdVar.o();
            dwjoVar.a(this.a, ffjmVar, false, jwnVar, (dwn) f, dmko.b, null, null, new ebf(0.0f, 0.0f, 0.0f, 0.0f), dmko.c, hfdVar, ((intValue << 3) & 112) | 100887936, 114819072);
        }
        return ffcu.a;
    }
}
