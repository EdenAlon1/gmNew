package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evkk extends evlf {
    final /* synthetic */ evlf a;

    public evkk(evlf evlfVar) {
        this.a = evlfVar;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        return new AtomicLong(((Number) this.a.a(evplVar)).longValue());
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        this.a.b(evpnVar, Long.valueOf(((AtomicLong) obj).get()));
    }
}
