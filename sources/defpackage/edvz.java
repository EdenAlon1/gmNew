package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edvz {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final edwa a(int i, long j) {
        return (edwa) a.get(new edvx(i, j));
    }

    public static final boolean b(int i, long j) {
        return a.containsKey(new edvx(i, j));
    }
}
