package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evoy extends evlf {
    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        try {
            return new AtomicInteger(evplVar.c());
        } catch (NumberFormatException e) {
            throw new evlb(e);
        }
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        evpnVar.k(((AtomicInteger) obj).get());
    }
}
