package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fwv extends ffkk implements ffjn {
    final /* synthetic */ cyq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwv(cyq cyqVar) {
        super(3);
        this.a = cyqVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dau dauVar = (dau) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(630790831);
        Object daaVar = dauVar.a() == jlc.b ? new daa(0) : dauVar.b() == jlc.b ? new daa(100) : this.a;
        hfdVar.o();
        return daaVar;
    }
}
