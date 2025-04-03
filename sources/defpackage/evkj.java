package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evkj extends evlf {
    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        if (evplVar.t() != 9) {
            return Float.valueOf((float) evplVar.a());
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
        float floatValue = number.floatValue();
        evkn.l(floatValue);
        if (!(number instanceof Float)) {
            number = Float.valueOf(floatValue);
        }
        evpnVar.l(number);
    }
}
