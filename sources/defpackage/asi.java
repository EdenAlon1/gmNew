package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asi {
    public final Executor c;
    kfb f;
    private final agj g;
    public boolean a = false;
    public boolean b = false;
    public final Object d = new Object();
    public afl e = new afl();

    public asi(agj agjVar, Executor executor) {
        this.g = agjVar;
        this.c = executor;
    }

    public final void a(Exception exc) {
        kfb kfbVar = this.f;
        if (kfbVar != null) {
            kfbVar.c(exc);
            this.f = null;
        }
    }

    public final void b(kfb kfbVar) {
        this.b = true;
        a(new atb("Camera2CameraControl was updated with new options."));
        this.f = kfbVar;
        if (this.a) {
            c();
        }
    }

    public final void c() {
        this.g.n().b(new Runnable() { // from class: ase
            @Override // java.lang.Runnable
            public final void run() {
                asi asiVar = asi.this;
                kfb kfbVar = asiVar.f;
                if (kfbVar != null) {
                    kfbVar.b(null);
                    asiVar.f = null;
                }
            }
        }, this.c);
        this.b = false;
    }
}
