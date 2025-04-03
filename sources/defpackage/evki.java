package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evki extends evlf {
    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        if (evplVar.t() != 9) {
            return Double.valueOf(evplVar.a());
        }
        evplVar.p();
        return null;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            evpnVar.j();
            return;
        }
        double doubleValue = number.doubleValue();
        evkn.l(doubleValue);
        evpnVar.c();
        if (evpnVar.d == 1 || !(Double.isNaN(doubleValue) || Double.isInfinite(doubleValue))) {
            evpnVar.a();
            evpnVar.a.append((CharSequence) Double.toString(doubleValue));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + doubleValue);
        }
    }
}
