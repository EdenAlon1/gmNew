package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fefz {
    public final int a;
    public final ConcurrentHashMap b = new ConcurrentHashMap(8);
    public final Executor c;
    public final feel d;

    public fefz(int i, feel feelVar, Executor executor) {
        this.a = i;
        this.d = feelVar;
        this.c = executor;
    }
}
