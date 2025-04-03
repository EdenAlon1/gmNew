package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpe extends ffkk implements ffjn {
    final /* synthetic */ boolean a;
    final /* synthetic */ fjj b;
    final /* synthetic */ dwn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpe(fjj fjjVar, boolean z, dwn dwnVar) {
        super(3);
        this.b = fjjVar;
        this.a = z;
        this.c = dwnVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(-1272940975);
        hfdVar.v(727091888);
        hkx a = dwj.a(this.c, hfdVar, 0);
        fjj fjjVar = this.b;
        hkx a2 = hku.a(new ibw(!this.a ? fjjVar.k : ((Boolean) a.a()).booleanValue() ? fjjVar.i : fjjVar.j), hfdVar);
        hfdVar.o();
        long j = ((ibw) a2.a()).i;
        hfdVar.o();
        return new ibw(j);
    }
}
