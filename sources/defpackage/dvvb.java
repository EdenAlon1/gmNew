package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvvb {
    public final AtomicReference a = new AtomicReference();

    public final void a(dvuy dvuyVar) {
        this.a.set(dvuyVar);
    }

    public final void b() {
        this.a.set(null);
    }
}
