package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class flp extends ffkk implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ idh b;
    final /* synthetic */ dwn c;
    final /* synthetic */ fjj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flp(boolean z, dwn dwnVar, fjj fjjVar, idh idhVar) {
        super(2);
        this.a = z;
        this.c = dwnVar;
        this.d = fjjVar;
        this.b = idhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            fow.a.a(this.a, this.c, this.d, this.b, 0.0f, 0.0f, hfdVar, 12582912);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
