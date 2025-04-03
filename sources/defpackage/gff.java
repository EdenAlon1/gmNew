package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gff extends ffkk implements ffjm {
    final /* synthetic */ gez a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gff(gez gezVar, ffjm ffjmVar) {
        super(2);
        this.a = gezVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            gez gezVar = this.a;
            gfl.d(gezVar.d, hdy.d, this.b, hfdVar, 48);
        }
        return ffcu.a;
    }
}
