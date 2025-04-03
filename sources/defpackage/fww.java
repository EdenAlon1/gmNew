package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fww extends ffkk implements ffjn {
    final /* synthetic */ cyq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fww(cyq cyqVar) {
        super(3);
        this.a = cyqVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dau dauVar = (dau) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(1780794470);
        Object daaVar = dauVar.a() == jlc.b ? this.a : dauVar.b() == jlc.b ? new daa(100) : this.a;
        hfdVar.o();
        return daaVar;
    }
}
