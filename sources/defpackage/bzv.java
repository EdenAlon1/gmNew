package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzv extends MediaCodec.Callback {
    public static final /* synthetic */ int c = 0;
    final /* synthetic */ bzy b;
    private final caw d;
    private boolean e;
    private boolean m;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private long i = 0;
    private long j = 0;
    private boolean k = false;
    private boolean l = false;
    public boolean a = false;

    public bzv(bzy bzyVar) {
        this.b = bzyVar;
        this.e = true;
        this.m = bzyVar.c;
        if (bzyVar.c) {
            this.d = new caw(bzyVar.z, (CameraUseInconsistentTimebaseQuirk) bwq.a(CameraUseInconsistentTimebaseQuirk.class));
        } else {
            this.d = null;
        }
        if (((CodecStuckOnFlushQuirk) bwq.a(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(bzyVar.d.getString("mime"))) {
            return;
        }
        this.e = false;
    }

    private final void e(final bxv bxvVar, final byb bybVar, Executor executor) {
        this.b.m.add(bxvVar);
        bkj.i(bxvVar.f(), new bzu(this, bxvVar), this.b.h);
        try {
            executor.execute(new Runnable() { // from class: bzp
                @Override // java.lang.Runnable
                public final void run() {
                    int i = bzv.c;
                    byb.this.c(bxvVar);
                }
            });
        } catch (RejectedExecutionException e) {
            avw.d(this.b.a, "Unable to post to the supplied executor.", e);
            bxvVar.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0343 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ void a(android.media.MediaCodec.BufferInfo r29, android.media.MediaCodec r30, int r31) {
        /*
            Method dump skipped, instructions count: 1194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzv.a(android.media.MediaCodec$BufferInfo, android.media.MediaCodec, int):void");
    }

    final /* synthetic */ void b(final MediaFormat mediaFormat) {
        final byb bybVar;
        Executor executor;
        if (this.a) {
            avw.f(this.b.a, "Receives onOutputFormatChanged after codec is reset.");
            return;
        }
        bzy bzyVar = this.b;
        int i = bzyVar.A;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
            case 7:
            case 8:
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                synchronized (bzyVar.b) {
                    bzy bzyVar2 = this.b;
                    bybVar = bzyVar2.o;
                    executor = bzyVar2.p;
                }
                try {
                    executor.execute(new Runnable() { // from class: bzr
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = bzv.c;
                            byb.this.d(new bzq(mediaFormat));
                        }
                    });
                    return;
                } catch (RejectedExecutionException e) {
                    avw.d(this.b.a, "Unable to post to the supplied executor.", e);
                    return;
                }
            default:
                int i3 = this.b.A;
                Objects.toString(bzi.a(i3));
                throw new IllegalStateException("Unknown state: ".concat(bzi.a(i3)));
        }
    }

    final /* synthetic */ void c(Executor executor, final byb bybVar) {
        if (this.b.A == 8) {
            return;
        }
        try {
            bybVar.getClass();
            executor.execute(new Runnable() { // from class: bzm
                @Override // java.lang.Runnable
                public final void run() {
                    byb.this.b();
                }
            });
        } catch (RejectedExecutionException e) {
            avw.d(this.b.a, "Unable to post to the supplied executor.", e);
        }
    }

    final void d() {
        final byb bybVar;
        final Executor executor;
        if (this.h) {
            return;
        }
        this.h = true;
        Future future = this.b.y;
        if (future != null) {
            future.cancel(false);
            this.b.y = null;
        }
        synchronized (this.b.b) {
            bzy bzyVar = this.b;
            bybVar = bzyVar.o;
            executor = bzyVar.p;
        }
        this.b.q(new Runnable() { // from class: bzo
            @Override // java.lang.Runnable
            public final void run() {
                bzv.this.c(executor, bybVar);
            }
        });
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
        this.b.h.execute(new Runnable() { // from class: bzt
            @Override // java.lang.Runnable
            public final void run() {
                bzv bzvVar = bzv.this;
                bzy bzyVar = bzvVar.b;
                int i = bzyVar.A;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                switch (i2) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        bzyVar.h(codecException);
                        return;
                    default:
                        int i3 = bzvVar.b.A;
                        Objects.toString(bzi.a(i3));
                        throw new IllegalStateException("Unknown state: ".concat(bzi.a(i3)));
                }
            }
        });
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, final int i) {
        this.b.h.execute(new Runnable() { // from class: bzj
            @Override // java.lang.Runnable
            public final void run() {
                bzv bzvVar = bzv.this;
                if (bzvVar.a) {
                    avw.f(bzvVar.b.a, "Receives input frame after codec is reset.");
                    return;
                }
                bzy bzyVar = bzvVar.b;
                int i2 = bzyVar.A;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                switch (i3) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        bzyVar.j.offer(Integer.valueOf(i));
                        bzvVar.b.k();
                        return;
                    default:
                        int i4 = bzvVar.b.A;
                        Objects.toString(bzi.a(i4));
                        throw new IllegalStateException("Unknown state: ".concat(bzi.a(i4)));
                }
            }
        });
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i, final MediaCodec.BufferInfo bufferInfo) {
        this.b.h.execute(new Runnable() { // from class: bzl
            @Override // java.lang.Runnable
            public final void run() {
                bzv.this.a(bufferInfo, mediaCodec, i);
            }
        });
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
        this.b.h.execute(new Runnable() { // from class: bzk
            @Override // java.lang.Runnable
            public final void run() {
                bzv.this.b(mediaFormat);
            }
        });
    }
}
