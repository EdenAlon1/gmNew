package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lcg implements lcx {
    public final File a;
    public final lcv b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public lcg(File file, lcv lcvVar) {
        this.a = file;
        this.b = lcvVar;
    }

    @Override // defpackage.lae
    public final void a() {
        this.c.set(true);
    }

    @Override // defpackage.lcx
    public final Object b(ffgu ffguVar) {
        c();
        return lco.a(this.a, new lcf(this, null), ffguVar);
    }

    protected final void c() {
        if (this.c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }
}
