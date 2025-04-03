package defpackage;

import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buj {
    public final Executor a;
    public final Executor b;
    public bxz c = null;
    public Surface d = null;
    public axt e = null;
    public Executor f = null;
    public bxy g = null;
    public int l = 1;
    public ListenableFuture h = new bkk(new IllegalStateException("Cannot close the encoder before configuring."));
    public kfb i = null;
    public ListenableFuture j = new bkk(new IllegalStateException("Cannot close the encoder before configuring."));
    public kfb k = null;

    public buj(Executor executor, Executor executor2) {
        this.a = executor2;
        this.b = executor;
    }

    public final void a() {
        int i = this.l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0 || i2 == 1) {
            b();
            return;
        }
        if (i2 == 2 || i2 == 3) {
            avw.a("VideoEncoderSession", "closeInternal in " + ((Object) bui.a(this.l)) + " state");
            this.l = 3;
            return;
        }
        if (i2 == 4) {
            avw.a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + ((Object) bui.a(this.l)) + " is not handled");
    }

    final void b() {
        int i = this.l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            this.l = 5;
            return;
        }
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 != 4) {
                throw new IllegalStateException("State " + ((Object) bui.a(this.l)) + " is not handled");
            }
            avw.a("VideoEncoderSession", "terminateNow in " + ((Object) bui.a(this.l)) + ", No-op");
            return;
        }
        this.l = 5;
        this.k.b(this.c);
        this.e = null;
        if (this.c == null) {
            avw.f("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.i.b(null);
            return;
        }
        bxz bxzVar = this.c;
        Objects.toString(bxzVar);
        avw.a("VideoEncoderSession", "VideoEncoder is releasing: ".concat(String.valueOf(bxzVar)));
        this.c.b();
        ((bzy) this.c).i.b(new Runnable() { // from class: bue
            @Override // java.lang.Runnable
            public final void run() {
                buj.this.i.b(null);
            }
        }, this.b);
        this.c = null;
    }

    public final String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + j$.util.Objects.toString(this.e, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
