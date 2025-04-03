package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evor extends evlf {
    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        BitSet bitSet = new BitSet();
        evplVar.l();
        int t = evplVar.t();
        int i = 0;
        while (t != 2) {
            int i2 = t - 1;
            if (i2 == 5 || i2 == 6) {
                int c = evplVar.c();
                if (c != 0) {
                    if (c != 1) {
                        throw new evlb("Invalid bitset value " + c + ", expected 0 or 1; at path " + evplVar.f());
                    }
                    bitSet.set(i);
                    i++;
                    t = evplVar.t();
                } else {
                    continue;
                    i++;
                    t = evplVar.t();
                }
            } else {
                if (i2 != 7) {
                    throw new evlb("Invalid bitset value type: " + evpm.a(t) + "; at path " + evplVar.e());
                }
                if (!evplVar.s()) {
                    i++;
                    t = evplVar.t();
                }
                bitSet.set(i);
                i++;
                t = evplVar.t();
            }
        }
        evplVar.n();
        return bitSet;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        evpnVar.e();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            evpnVar.k(bitSet.get(i) ? 1L : 0L);
        }
        evpnVar.g();
    }
}
