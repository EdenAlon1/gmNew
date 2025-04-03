package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcy extends ffkk implements ffjn {
    final /* synthetic */ cyq a;
    final /* synthetic */ cyq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcy(cyq cyqVar, cyq cyqVar2) {
        super(3);
        this.a = cyqVar;
        this.b = cyqVar2;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dau dauVar = (dau) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(-1154662212);
        cyq cyqVar = dauVar.d(hbh.a, hbh.b) ? this.a : (dauVar.d(hbh.b, hbh.a) || dauVar.d(hbh.c, hbh.b)) ? this.b : this.a;
        hfdVar.o();
        return cyqVar;
    }
}
