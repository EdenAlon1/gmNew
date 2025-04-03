package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evkl extends evlf {
    final /* synthetic */ evlf a;

    public evkl(evlf evlfVar) {
        this.a = evlfVar;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        ArrayList arrayList = new ArrayList();
        evplVar.l();
        while (evplVar.r()) {
            arrayList.add(Long.valueOf(((Number) this.a.a(evplVar)).longValue()));
        }
        evplVar.n();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        evpnVar.e();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.a.b(evpnVar, Long.valueOf(atomicLongArray.get(i)));
        }
        evpnVar.g();
    }
}
