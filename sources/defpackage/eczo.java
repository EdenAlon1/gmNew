package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eczo {
    public final ConcurrentMap a = new ConcurrentHashMap();

    public final eczp[] a(String str) {
        AtomicReference atomicReference = (AtomicReference) this.a.get(str);
        if (atomicReference == null) {
            return null;
        }
        return (eczp[]) atomicReference.get();
    }
}
