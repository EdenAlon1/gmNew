package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deln {
    private final AtomicReference a = new AtomicReference(null);

    public final String a() {
        return (String) this.a.get();
    }

    public final void b(String str) {
        this.a.set(str);
    }
}
