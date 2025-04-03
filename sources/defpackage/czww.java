package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czww implements ffjm {
    final /* synthetic */ czxn a;
    final /* synthetic */ hho b;
    final /* synthetic */ hho c;

    public czww(czxn czxnVar, hho hhoVar, hho hhoVar2) {
        this.a = czxnVar;
        this.b = hhoVar;
        this.c = hhoVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            cwoi.a(null, null, false, null, false, hpx.d(698719017, new czwv(this.a, this.b, this.c), hfdVar), hfdVar, 196608, 31);
        }
        return ffcu.a;
    }
}
