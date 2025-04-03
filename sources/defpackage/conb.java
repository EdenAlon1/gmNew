package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class conb {
    public final AtomicBoolean a;
    public final ConcurrentHashMap b;

    public conb() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof conb)) {
            return false;
        }
        conb conbVar = (conb) obj;
        return ffkj.e(this.a, conbVar.a) && ffkj.e(this.b, conbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CacheState(allDataCached=" + this.a + ", data=" + this.b + ")";
    }

    public /* synthetic */ conb(byte[] bArr) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.a = atomicBoolean;
        this.b = concurrentHashMap;
    }
}
