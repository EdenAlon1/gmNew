package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fidw {
    public static final AtomicReference a = new AtomicReference();

    private fidw() {
    }

    public static fidw a() {
        return (fidw) a.get();
    }

    public abstract String b();

    public abstract boolean c();
}
