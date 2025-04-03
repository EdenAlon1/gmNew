package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dunr {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/concurrent/StalledTaskDetector");
    public final ScheduledExecutorService b;
    public final Map c = new ConcurrentHashMap();
    public final emwl d;

    public dunr(ScheduledExecutorService scheduledExecutorService, emwl emwlVar) {
        this.b = scheduledExecutorService;
        this.d = emwlVar;
    }
}
