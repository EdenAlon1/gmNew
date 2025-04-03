package com.google.media.webrtc.common;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class EventQueue<T> {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    public void produce(T t) {
        for (final Map.Entry entry : this.a.entrySet()) {
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: exkl
                @Override // java.lang.Runnable
                public final void run() {
                    ((exkm) entry.getKey()).a();
                }
            });
        }
    }
}
