package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enva extends envp {
    public static final enva a = new enva(envz.a);
    public final AtomicReference b;

    public enva(envp envpVar) {
        this.b = new AtomicReference(envpVar);
    }

    @Override // defpackage.envp
    public final ents b() {
        return ((envp) this.b.get()).b();
    }

    @Override // defpackage.envp
    public final enwf c() {
        return ((envp) this.b.get()).c();
    }

    @Override // defpackage.envp
    public final enwo d() {
        return ((envp) this.b.get()).d();
    }

    @Override // defpackage.envp
    public final void e(String str, Level level, boolean z) {
        ((envp) this.b.get()).e(str, level, z);
    }
}
