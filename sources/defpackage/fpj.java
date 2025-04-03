package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpj extends ffkk implements ffjn {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    final /* synthetic */ jwn c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ idh e;
    final /* synthetic */ dwn f;
    final /* synthetic */ fjj g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpj(String str, boolean z, jwn jwnVar, dwn dwnVar, ffjm ffjmVar, idh idhVar, fjj fjjVar) {
        super(3);
        this.a = str;
        this.b = z;
        this.c = jwnVar;
        this.f = dwnVar;
        this.d = ffjmVar;
        this.e = idhVar;
        this.g = fjjVar;
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
            fow.a.c(this.a, ffjmVar, this.b, this.c, this.f, this.d, this.e, this.g, null, hfdVar, (intValue << 3) & 112, 24576);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
