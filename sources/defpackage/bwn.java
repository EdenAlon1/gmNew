package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwn implements bvy {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Queue c = new ConcurrentLinkedQueue();
    public final Executor d;
    public final Object e;
    public bwm f;
    public final bvy g;
    public final int h;
    public final AtomicBoolean i;
    public int j;
    private final int k;

    public bwn(bvy bvyVar, bve bveVar) {
        if (bja.a == null) {
            synchronized (bja.class) {
                if (bja.a == null) {
                    bja.a = new bja();
                }
            }
        }
        this.d = new bjp(bja.a);
        this.e = new Object();
        this.f = null;
        this.i = new AtomicBoolean(false);
        this.g = bvyVar;
        int c = bveVar.c();
        this.h = c;
        int e = bveVar.e();
        this.k = e;
        ksw.b(((long) c) > 0, "mBytesPerFrame must be greater than 0.");
        ksw.b(((long) e) > 0, "mSampleRate must be greater than 0.");
        this.j = c * 1024;
    }

    @Override // defpackage.bvy
    public final bvx a(ByteBuffer byteBuffer) {
        int remaining;
        c();
        ksw.d(this.a.get(), "AudioStream has not been started.");
        final int remaining2 = byteBuffer.remaining();
        this.d.execute(new Runnable() { // from class: bwk
            @Override // java.lang.Runnable
            public final void run() {
                bwn bwnVar = bwn.this;
                int i = bwnVar.j;
                int i2 = remaining2;
                if (i == i2) {
                    return;
                }
                int i3 = bwnVar.h;
                bwnVar.j = (i2 / i3) * i3;
                avw.a("BufferedAudioStream", "Update buffer size from " + i + " to " + bwnVar.j);
            }
        });
        bwf bwfVar = new bwf(0, 0L);
        while (true) {
            synchronized (this.e) {
                bwm bwmVar = this.f;
                this.f = null;
                if (bwmVar == null) {
                    bwmVar = (bwm) this.c.poll();
                }
                if (bwmVar != null) {
                    long j = bwmVar.d;
                    int position = bwmVar.c.position();
                    int position2 = byteBuffer.position();
                    if (bwmVar.c.remaining() > byteBuffer.remaining()) {
                        remaining = byteBuffer.remaining();
                        bwmVar.d += bwc.a(bwc.b(remaining, bwmVar.a), bwmVar.b);
                        ByteBuffer duplicate = bwmVar.c.duplicate();
                        duplicate.position(position).limit(position + remaining);
                        byteBuffer.put(duplicate).limit(position2 + remaining).position(position2);
                    } else {
                        remaining = bwmVar.c.remaining();
                        byteBuffer.put(bwmVar.c).limit(position2 + remaining).position(position2);
                    }
                    bwmVar.c.position(position + remaining);
                    bwfVar = new bwf(remaining, j);
                    if (bwmVar.c.remaining() > 0) {
                        this.f = bwmVar;
                    }
                }
            }
            if (bwfVar.a > 0 || !this.a.get() || this.b.get()) {
                break;
            }
            try {
                Thread.sleep(1L);
            } catch (InterruptedException e) {
                avw.g("BufferedAudioStream", "Interruption while waiting for audio data", e);
            }
        }
        return bwfVar;
    }

    @Override // defpackage.bvy
    public final void b() {
        c();
        if (this.a.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new Runnable() { // from class: bwi
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
            
                r0 = ((defpackage.bwb) r2).a.getActiveRecordingConfiguration();
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r9 = this;
                    java.lang.String r0 = "Unable to start AudioRecord with state: "
                    bwn r1 = defpackage.bwn.this
                    bvy r2 = r1.g     // Catch: defpackage.bvw -> L9d
                    r3 = r2
                    bwb r3 = (defpackage.bwb) r3     // Catch: defpackage.bvw -> L9d
                    r3.e()     // Catch: defpackage.bvw -> L9d
                    r3 = r2
                    bwb r3 = (defpackage.bwb) r3     // Catch: defpackage.bvw -> L9d
                    java.util.concurrent.atomic.AtomicBoolean r3 = r3.d     // Catch: defpackage.bvw -> L9d
                    r4 = 1
                    boolean r3 = r3.getAndSet(r4)     // Catch: defpackage.bvw -> L9d
                    if (r3 == 0) goto L19
                    goto L6e
                L19:
                    boolean r3 = defpackage.bwb.g()     // Catch: defpackage.bvw -> L9d
                    if (r3 == 0) goto L27
                    r3 = r2
                    bwb r3 = (defpackage.bwb) r3     // Catch: defpackage.bvw -> L9d
                    android.media.AudioRecord r3 = r3.a     // Catch: defpackage.bvw -> L9d
                    defpackage.bwb.d(r3)     // Catch: defpackage.bvw -> L9d
                L27:
                    r3 = r2
                    bwb r3 = (defpackage.bwb) r3     // Catch: defpackage.bvw -> L9d
                    android.media.AudioRecord r3 = r3.a     // Catch: defpackage.bvw -> L9d
                    r3.startRecording()     // Catch: defpackage.bvw -> L9d
                    r3 = r2
                    bwb r3 = (defpackage.bwb) r3     // Catch: defpackage.bvw -> L9d
                    android.media.AudioRecord r3 = r3.a     // Catch: defpackage.bvw -> L9d
                    int r3 = r3.getRecordingState()     // Catch: defpackage.bvw -> L9d
                    r5 = 3
                    r6 = 0
                    if (r3 != r5) goto L7b
                    r0 = r2
                    bwb r0 = (defpackage.bwb) r0     // Catch: defpackage.bvw -> L9d
                    r7 = 0
                    r0.h = r7     // Catch: defpackage.bvw -> L9d
                    r0 = r2
                    bwb r0 = (defpackage.bwb) r0     // Catch: defpackage.bvw -> L9d
                    r0.j = r6     // Catch: defpackage.bvw -> L9d
                    r0 = r2
                    bwb r0 = (defpackage.bwb) r0     // Catch: defpackage.bvw -> L9d
                    java.util.concurrent.atomic.AtomicReference r0 = r0.e     // Catch: defpackage.bvw -> L9d
                    r3 = 0
                    r0.set(r3)     // Catch: defpackage.bvw -> L9d
                    int r0 = android.os.Build.VERSION.SDK_INT     // Catch: defpackage.bvw -> L9d
                    r3 = 29
                    if (r0 < r3) goto L69
                    r0 = r2
                    bwb r0 = (defpackage.bwb) r0     // Catch: defpackage.bvw -> L9d
                    android.media.AudioRecord r0 = r0.a     // Catch: defpackage.bvw -> L9d
                    android.media.AudioRecordingConfiguration r0 = defpackage.abk$$ExternalSyntheticApiModelOutline0.m(r0)     // Catch: defpackage.bvw -> L9d
                    if (r0 == 0) goto L69
                    boolean r0 = defpackage.abk$$ExternalSyntheticApiModelOutline0.m(r0)     // Catch: defpackage.bvw -> L9d
                    if (r0 == 0) goto L69
                    r6 = r4
                L69:
                    bwb r2 = (defpackage.bwb) r2     // Catch: defpackage.bvw -> L9d
                    r2.f(r6)     // Catch: defpackage.bvw -> L9d
                L6e:
                    java.util.concurrent.atomic.AtomicBoolean r0 = r1.i     // Catch: defpackage.bvw -> L9d
                    boolean r0 = r0.getAndSet(r4)     // Catch: defpackage.bvw -> L9d
                    if (r0 == 0) goto L77
                    return
                L77:
                    r1.d()     // Catch: defpackage.bvw -> L9d
                    return
                L7b:
                    r1 = r2
                    bwb r1 = (defpackage.bwb) r1     // Catch: defpackage.bvw -> L9d
                    java.util.concurrent.atomic.AtomicBoolean r1 = r1.d     // Catch: defpackage.bvw -> L9d
                    r1.set(r6)     // Catch: defpackage.bvw -> L9d
                    bvw r1 = new bvw     // Catch: defpackage.bvw -> L9d
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: defpackage.bvw -> L9d
                    r3.<init>(r0)     // Catch: defpackage.bvw -> L9d
                    bwb r2 = (defpackage.bwb) r2     // Catch: defpackage.bvw -> L9d
                    android.media.AudioRecord r0 = r2.a     // Catch: defpackage.bvw -> L9d
                    int r0 = r0.getRecordingState()     // Catch: defpackage.bvw -> L9d
                    r3.append(r0)     // Catch: defpackage.bvw -> L9d
                    java.lang.String r0 = r3.toString()     // Catch: defpackage.bvw -> L9d
                    r1.<init>(r0)     // Catch: defpackage.bvw -> L9d
                    throw r1     // Catch: defpackage.bvw -> L9d
                L9d:
                    r0 = move-exception
                    java.lang.RuntimeException r1 = new java.lang.RuntimeException
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bwi.run():void");
            }
        }, null);
        this.d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.set(false);
            throw new bvw(e);
        }
    }

    public final void c() {
        ksw.d(!this.b.get(), "AudioStream has been released.");
    }

    public final void d() {
        if (this.i.get()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.j);
            bwm bwmVar = new bwm(allocateDirect, this.g.a(allocateDirect), this.h, this.k);
            synchronized (this.e) {
                this.c.offer(bwmVar);
                while (this.c.size() > 500) {
                    this.c.poll();
                    avw.f("BufferedAudioStream", "Drop audio data due to full of queue.");
                }
            }
            if (this.i.get()) {
                this.d.execute(new Runnable() { // from class: bwj
                    @Override // java.lang.Runnable
                    public final void run() {
                        bwn.this.d();
                    }
                });
            }
        }
    }
}
