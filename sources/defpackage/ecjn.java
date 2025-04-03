package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecjn {
    private final emyg c;
    private volatile Process d;
    public volatile boolean b = false;
    public final emwl a = new emwl() { // from class: ecjm
        @Override // defpackage.emwl
        public final Object apply(Object obj) {
            try {
                return new ProcessBuilder("/system/bin/trigger_perfetto", (String) obj).start();
            } catch (IOException unused) {
                ecjn.this.b = true;
                return null;
            }
        }
    };

    public ecjn(emyv emyvVar) {
        this.c = new emyg(emyvVar);
    }

    public final void a(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (this.d != null) {
            try {
                if (this.d.exitValue() != 0) {
                    this.b = true;
                    this.d = null;
                }
            } catch (IllegalThreadStateException unused) {
                return;
            }
        }
        if (this.b) {
            return;
        }
        synchronized (this) {
            emyg emygVar = this.c;
            if (!emygVar.a || emygVar.a(TimeUnit.MILLISECONDS) >= 60000) {
                this.c.e();
                this.c.f();
                this.d = (Process) this.a.apply(str);
            }
        }
    }
}
