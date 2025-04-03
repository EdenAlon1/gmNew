package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcc extends ffsd {
    public static final ffbz a = ffca.a(jby.a);
    public static final ThreadLocal b = new jbz();
    public final Choreographer c;
    public final Handler d;
    public boolean h;
    public final hhh j;
    private boolean n;
    public final Object e = new Object();
    private final ffdn m = new ffdn();
    public List f = new ArrayList();
    public List g = new ArrayList();
    public final jcb i = new jcb(this);

    public jcc(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.j = new jch(choreographer, this);
    }

    private final Runnable c() {
        Runnable runnable;
        synchronized (this.e) {
            runnable = (Runnable) this.m.g();
        }
        return runnable;
    }

    @Override // defpackage.ffsd
    public final void a(ffhd ffhdVar, Runnable runnable) {
        synchronized (this.e) {
            this.m.addLast(runnable);
            if (!this.n) {
                this.n = true;
                this.d.post(this.i);
                if (!this.h) {
                    this.h = true;
                    this.c.postFrameCallback(this.i);
                }
            }
        }
    }

    public final void b() {
        boolean z;
        do {
            Runnable c = c();
            while (c != null) {
                c.run();
                c = c();
            }
            synchronized (this.e) {
                if (this.m.isEmpty()) {
                    z = false;
                    this.n = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
