package defpackage;

import java.lang.Thread;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtnu {
    public static final WeakHashMap a = new WeakHashMap();

    public static void a(Thread thread) {
        Thread.State state = thread.getState();
        if (state != Thread.State.NEW) {
            throw new IllegalArgumentException(a.E(state, thread, "This method can only be applied to threads that have been created but not yet started, and ", " was in state "));
        }
        WeakHashMap weakHashMap = a;
        synchronized (weakHashMap) {
            weakHashMap.put(thread, true);
        }
    }
}
