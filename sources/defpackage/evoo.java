package defpackage;

import java.util.Currency;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evoo extends evlf {
    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        String j = evplVar.j();
        try {
            return Currency.getInstance(j);
        } catch (IllegalArgumentException e) {
            throw new evlb(a.Q(j, evplVar, "Failed parsing '", "' as Currency; at path "), e);
        }
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        evpnVar.m(((Currency) obj).getCurrencyCode());
    }
}
