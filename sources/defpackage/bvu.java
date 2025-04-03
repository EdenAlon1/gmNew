package defpackage;

import android.content.Context;
import android.media.AudioManager$AudioRecordingCallback;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvu {
    public final Executor a;
    final bvy d;
    final bwo e;
    public final long f;
    boolean h;
    Executor i;
    buy j;
    boolean k;
    public long l;
    boolean m;
    boolean n;
    public byte[] o;
    double p;
    public final int r;
    bsh t;
    private bjt u;
    private bfk v;
    final AtomicReference b = new AtomicReference(null);
    final AtomicBoolean c = new AtomicBoolean(false);
    int s = 1;
    bux g = bux.INACTIVE;
    long q = 0;

    public bvu(bve bveVar, Executor executor, Context context) {
        final bjp bjpVar = new bjp(executor);
        this.a = bjpVar;
        this.f = TimeUnit.MILLISECONDS.toNanos(3000L);
        try {
            final bwn bwnVar = new bwn(new bwb(bveVar, context), bveVar);
            this.d = bwnVar;
            final bvs bvsVar = new bvs(this);
            ksw.d(!bwnVar.a.get(), "AudioStream can not be started when setCallback.");
            bwnVar.c();
            ksw.b(true, "executor can't be null with non-null callback.");
            bwnVar.d.execute(new Runnable() { // from class: bwh
                @Override // java.lang.Runnable
                public final void run() {
                    bwb bwbVar = (bwb) bwn.this.g;
                    ksw.d(!bwbVar.d.get(), "AudioStream can not be started when setCallback.");
                    bwbVar.e();
                    ksw.b(true, "executor can't be null with non-null callback.");
                    bwbVar.k = bvsVar;
                    Executor executor2 = bjpVar;
                    bwbVar.g = executor2;
                    if (Build.VERSION.SDK_INT >= 29) {
                        AudioManager$AudioRecordingCallback audioManager$AudioRecordingCallback = bwbVar.i;
                        if (audioManager$AudioRecordingCallback != null) {
                            bwbVar.a.unregisterAudioRecordingCallback(audioManager$AudioRecordingCallback);
                        }
                        if (bwbVar.i == null) {
                            bwbVar.i = new bwa(bwbVar);
                        }
                        bwbVar.a.registerAudioRecordingCallback(executor2, bwbVar.i);
                    }
                }
            });
            this.e = new bwo(bveVar);
            this.r = bveVar.a();
            bveVar.b();
        } catch (bvw | IllegalArgumentException e) {
            throw new bvv(e);
        }
    }

    final void a(final Throwable th) {
        Executor executor = this.i;
        final bsh bshVar = this.t;
        if (executor == null || bshVar == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: bvh
            @Override // java.lang.Runnable
            public final void run() {
                Throwable th2 = th;
                avw.d("Recorder", "Error occurred after audio source started.", th2);
                if (th2 instanceof bvv) {
                    bsh.this.a.accept(th2);
                }
            }
        });
    }

    final void b() {
        Executor executor = this.i;
        final bsh bshVar = this.t;
        if (executor == null || bshVar == null) {
            return;
        }
        final boolean z = true;
        if (!this.n && !this.k && !this.m) {
            z = false;
        }
        AtomicReference atomicReference = this.b;
        Boolean valueOf = Boolean.valueOf(z);
        if (Objects.equals(atomicReference.getAndSet(valueOf), valueOf)) {
            return;
        }
        executor.execute(new Runnable() { // from class: bvl
            @Override // java.lang.Runnable
            public final void run() {
                btb btbVar = bsh.this.b;
                boolean z2 = btbVar.S;
                boolean z3 = z;
                if (z2 == z3) {
                    avw.f("Recorder", a.q(z3, "Audio source silenced transitions to the same state "));
                } else {
                    btbVar.S = z3;
                    btbVar.v(true);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(buy buyVar) {
        buy buyVar2 = this.j;
        bux buxVar = null;
        if (buyVar2 != null) {
            bfk bfkVar = this.v;
            bfkVar.getClass();
            buyVar2.d(bfkVar);
            this.j = null;
            this.v = null;
            this.u = null;
            this.g = bux.INACTIVE;
            f();
        }
        if (buyVar != null) {
            this.j = buyVar;
            this.v = new bvq(this, buyVar);
            this.u = new bvr(this, buyVar);
            try {
                ListenableFuture b = buyVar.b();
                if (b.isDone()) {
                    buxVar = (bux) b.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (buxVar != null) {
                this.g = buxVar;
                f();
            }
            this.j.c(this.a, this.v);
        }
    }

    final void d() {
        buy buyVar = this.j;
        buyVar.getClass();
        ListenableFuture a = buyVar.a();
        bjt bjtVar = this.u;
        bjtVar.getClass();
        bkj.i(a, bjtVar, this.a);
    }

    public final void e() {
        if (this.h) {
            this.h = false;
            avw.a("AudioSource", "stopSendingAudio");
            final bwn bwnVar = (bwn) this.d;
            bwnVar.c();
            if (bwnVar.a.getAndSet(false)) {
                bwnVar.d.execute(new Runnable() { // from class: bwg
                    @Override // java.lang.Runnable
                    public final void run() {
                        bwn bwnVar2 = bwn.this;
                        bwnVar2.i.set(false);
                        bwb bwbVar = (bwb) bwnVar2.g;
                        bwbVar.e();
                        if (bwbVar.d.getAndSet(false)) {
                            bwbVar.a.stop();
                            if (bwbVar.a.getRecordingState() != 1) {
                                avw.f("AudioStreamImpl", "Failed to stop AudioRecord with state: " + bwbVar.a.getRecordingState());
                            }
                            if (bwb.g()) {
                                bwbVar.a.release();
                                bwbVar.a = bwb.c(bwbVar.f, bwbVar.b, null);
                            }
                        }
                        synchronized (bwnVar2.e) {
                            bwnVar2.f = null;
                            bwnVar2.c.clear();
                        }
                    }
                });
            }
        }
    }

    final void f() {
        if (this.s != 2) {
            e();
            return;
        }
        bux buxVar = this.g;
        bux buxVar2 = bux.ACTIVE;
        boolean z = buxVar != buxVar2;
        Executor executor = this.i;
        bsh bshVar = this.t;
        if (executor != null && bshVar != null && this.c.getAndSet(z) != z) {
            executor.execute(new Runnable() { // from class: bvp
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
        if (buxVar != buxVar2) {
            e();
            return;
        }
        if (this.h) {
            return;
        }
        try {
            avw.a("AudioSource", "startSendingAudio");
            this.d.b();
            this.k = false;
        } catch (bvw e) {
            avw.g("AudioSource", "Failed to start AudioStream", e);
            this.k = true;
            bwo bwoVar = this.e;
            bwoVar.c();
            if (!bwoVar.a.getAndSet(true)) {
                bwoVar.c = System.nanoTime();
                bvs bvsVar = bwoVar.e;
                Executor executor2 = bwoVar.d;
            }
            this.l = System.nanoTime();
            b();
        }
        this.h = true;
        d();
    }

    final void g(int i) {
        avw.a("AudioSource", "Transitioning internal state: " + ((Object) bvt.a(this.s)) + " --> " + ((Object) bvt.a(i)));
        this.s = i;
    }
}
