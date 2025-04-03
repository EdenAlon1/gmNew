package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsq extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsq(ffjm ffjmVar, ffjm ffjmVar2) {
        super(2);
        this.a = ffjmVar;
        this.b = ffjmVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ffjm ffjmVar = this.a;
            if (ffjmVar == null) {
                hfdVar.v(-835359461);
            } else {
                hfdVar.v(1497073574);
                ffjmVar.a(hfdVar, 0);
            }
            hfdVar.o();
            this.b.a(hfdVar, 0);
        }
        return ffcu.a;
    }
}
