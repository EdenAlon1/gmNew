package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class flq extends ffkk implements ffjn {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    final /* synthetic */ jwn c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ ffjm e;
    final /* synthetic */ idh f;
    final /* synthetic */ dwn g;
    final /* synthetic */ fjj h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flq(String str, boolean z, jwn jwnVar, dwn dwnVar, ffjm ffjmVar, ffjm ffjmVar2, idh idhVar, fjj fjjVar) {
        super(3);
        this.a = str;
        this.b = z;
        this.c = jwnVar;
        this.g = dwnVar;
        this.d = ffjmVar;
        this.e = ffjmVar2;
        this.f = idhVar;
        this.h = fjjVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ffjm ffjmVar = (ffjm) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.F(ffjmVar) ? 2 : 4;
        }
        if (hfdVar.J((intValue & 19) != 18, intValue & 1)) {
            String str = this.a;
            boolean z = this.b;
            jwn jwnVar = this.c;
            dwn dwnVar = this.g;
            ffjm ffjmVar2 = this.d;
            ffjm ffjmVar3 = this.e;
            idh idhVar = this.f;
            fjj fjjVar = this.h;
            fow.a.b(str, ffjmVar, z, jwnVar, dwnVar, ffjmVar2, ffjmVar3, idhVar, fjjVar, null, hpx.d(1757478222, new flp(z, dwnVar, fjjVar, idhVar), hfdVar), hfdVar, (intValue << 3) & 112, 221184);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
