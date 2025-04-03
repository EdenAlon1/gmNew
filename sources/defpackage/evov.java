package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evov extends evlf {
    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        try {
            int c = evplVar.c();
            if (c <= 255 && c >= -128) {
                return Byte.valueOf((byte) c);
            }
            throw new evlb("Lossy conversion from " + c + " to byte; at path " + evplVar.f());
        } catch (NumberFormatException e) {
            throw new evlb(e);
        }
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        if (((Number) obj) == null) {
            evpnVar.j();
        } else {
            evpnVar.k(r4.byteValue());
        }
    }
}
