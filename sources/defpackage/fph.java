package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fph extends ffkk implements ffjm {
    final /* synthetic */ long a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fph(long j, ffjm ffjmVar) {
        super(2);
        this.a = j;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            hfz.a(fjb.a.c(new ibw(this.a)), hpx.d(-1132188434, new fpg(this.b, this.a), hfdVar), hfdVar, 56);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
