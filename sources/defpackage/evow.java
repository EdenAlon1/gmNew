package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evow extends evlf {
    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        try {
            int c = evplVar.c();
            if (c <= 65535 && c >= -32768) {
                return Short.valueOf((short) c);
            }
            throw new evlb("Lossy conversion from " + c + " to short; at path " + evplVar.f());
        } catch (NumberFormatException e) {
            throw new evlb(e);
        }
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        if (((Number) obj) == null) {
            evpnVar.j();
        } else {
            evpnVar.k(r4.shortValue());
        }
    }
}
