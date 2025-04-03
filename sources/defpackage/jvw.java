package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
@ffbs
/* loaded from: classes.dex */
public final class jvw {
    public final jvn a;
    public final AtomicReference b = new AtomicReference(null);

    public jvw(jvn jvnVar) {
        this.a = jvnVar;
    }

    public final jwj a() {
        return (jwj) this.b.get();
    }
}
