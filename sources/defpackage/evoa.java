package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evoa extends evlf {
    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        ArrayList arrayList = new ArrayList();
        evplVar.l();
        while (evplVar.r()) {
            try {
                arrayList.add(Integer.valueOf(evplVar.c()));
            } catch (NumberFormatException e) {
                throw new evlb(e);
            }
        }
        evplVar.n();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        evpnVar.e();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            evpnVar.k(r6.get(i));
        }
        evpnVar.g();
    }
}
