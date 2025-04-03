package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgd implements bge {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final bge b;

    public bgd(bge bgeVar) {
        this.b = bgeVar;
    }

    @Override // defpackage.bge
    public final void a(bgk bgkVar) {
        if (this.a.get()) {
            return;
        }
        this.b.a(bgkVar);
    }

    public final void b() {
        this.a.set(true);
    }
}
