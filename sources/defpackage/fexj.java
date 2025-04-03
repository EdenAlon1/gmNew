package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fexj implements Runnable {
    final /* synthetic */ fexk b;

    public fexj(fexk fexkVar) {
        this.b = fexkVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.b.f == null) {
                throw new IOException("Unable to perform write due to unavailable sink.");
            }
            a();
        } catch (Exception e) {
            this.b.c.a(e);
        }
    }
}
