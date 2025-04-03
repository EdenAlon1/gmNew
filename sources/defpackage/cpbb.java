package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpbb {
    private static final Lock b = new ReentrantLock();
    static final Map a = new HashMap();

    public static cpba a(String str) {
        Lock lock = b;
        lock.lock();
        try {
            Map map = a;
            cpba cpbaVar = (cpba) map.get(str);
            if (cpbaVar == null) {
                cpbaVar = new cpba(str);
                map.put(str, cpbaVar);
            }
            lock.unlock();
            return cpbaVar;
        } catch (Throwable th) {
            b.unlock();
            throw th;
        }
    }
}
