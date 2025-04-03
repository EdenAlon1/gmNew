package defpackage;

import android.media.MediaCodec;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cac {
    public final ByteBuffer a;
    private final MediaCodec c;
    private final int d;
    private final ListenableFuture e;
    private final kfb f;
    private final AtomicBoolean g = new AtomicBoolean(false);
    private long h = 0;
    public boolean b = false;

    public cac(MediaCodec mediaCodec, int i) {
        ksw.h(mediaCodec);
        this.c = mediaCodec;
        ksw.f(i);
        this.d = i;
        this.a = mediaCodec.getInputBuffer(i);
        final AtomicReference atomicReference = new AtomicReference();
        this.e = kfg.a(new kfd() { // from class: cab
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                atomicReference.set(kfbVar);
                return "Terminate InputBuffer";
            }
        });
        kfb kfbVar = (kfb) atomicReference.get();
        ksw.h(kfbVar);
        this.f = kfbVar;
    }

    public final ListenableFuture a() {
        return bkj.d(this.e);
    }

    public final void b(long j) {
        c();
        ksw.a(j >= 0);
        this.h = j;
    }

    public final void c() {
        if (this.g.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    public final void d() {
        if (this.g.getAndSet(true)) {
            return;
        }
        try {
            this.c.queueInputBuffer(this.d, 0, 0, 0L, 0);
            this.f.b(null);
        } catch (IllegalStateException e) {
            this.f.c(e);
        }
    }

    public final void e() {
        if (this.g.getAndSet(true)) {
            return;
        }
        try {
            this.c.queueInputBuffer(this.d, this.a.position(), this.a.limit(), this.h, true != this.b ? 0 : 4);
            this.f.b(null);
        } catch (IllegalStateException e) {
            this.f.c(e);
        }
    }
}
