package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.LruCache;
import android.util.Range;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzy implements bxz {
    public static final /* synthetic */ int B = 0;
    private static final Range C = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    int A;
    private final kfb D;
    final String a;
    final boolean c;
    public final MediaFormat d;
    final MediaCodec e;
    public final bxx f;
    public final bzz g;
    public final Executor h;
    public final ListenableFuture i;
    public Future y;
    final int z;
    final Object b = new Object();
    final Queue j = new ArrayDeque();
    public final Queue k = new ArrayDeque();
    public final Set l = new HashSet();
    final Set m = new HashSet();
    final Deque n = new ArrayDeque();
    byb o = byb.e;
    Executor p = bjb.a();
    Range q = C;
    long r = 0;
    boolean s = false;
    Long t = null;
    Future u = null;
    private bzv E = null;
    public boolean v = false;
    public boolean w = false;
    boolean x = false;

    public bzy(Executor executor, byc bycVar) {
        ksw.h(executor);
        ksw.h(bycVar);
        LruCache lruCache = can.a;
        MediaCodec a = can.a(bycVar.g());
        this.e = a;
        MediaCodecInfo codecInfo = a.getCodecInfo();
        this.h = new bjp(executor);
        MediaFormat e = bycVar.e();
        this.d = e;
        int h = bycVar.h();
        this.z = h;
        if (bycVar instanceof bxj) {
            this.a = "AudioEncoder";
            this.c = false;
            this.f = new bzh(this);
            this.g = new bxk(codecInfo, bycVar.g());
        } else {
            if (!(bycVar instanceof cah)) {
                throw new cad();
            }
            this.a = "VideoEncoder";
            this.c = true;
            this.f = new bzx(this);
            cam camVar = new cam(codecInfo, bycVar.g());
            ksw.c(true);
            if (e.containsKey("bitrate")) {
                int integer = e.getInteger("bitrate");
                int intValue = ((Integer) camVar.c().clamp(Integer.valueOf(integer))).intValue();
                if (integer != intValue) {
                    e.setInteger("bitrate", intValue);
                    avw.a("VideoEncoder", a.r(intValue, integer, "updated bitrate from ", " to "));
                }
            }
            this.g = camVar;
        }
        String str = this.a;
        Objects.toString(bgx.a(h));
        avw.a(str, "mInputTimebase = ".concat(bgx.a(h)));
        String str2 = this.a;
        Objects.toString(e);
        avw.a(str2, "mMediaFormat = ".concat(String.valueOf(e)));
        try {
            n();
            final AtomicReference atomicReference = new AtomicReference();
            this.i = bkj.d(kfg.a(new kfd() { // from class: byl
                @Override // defpackage.kfd
                public final Object a(kfb kfbVar) {
                    int i = bzy.B;
                    atomicReference.set(kfbVar);
                    return "mReleasedFuture";
                }
            }));
            kfb kfbVar = (kfb) atomicReference.get();
            ksw.h(kfbVar);
            this.D = kfbVar;
            s(1);
        } catch (MediaCodec.CodecException e2) {
            throw new cad(e2);
        }
    }

    static boolean r(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    @Override // defpackage.bxz
    public final void a() {
        final long b = caf.b();
        this.h.execute(new Runnable() { // from class: bym
            @Override // java.lang.Runnable
            public final void run() {
                bzy bzyVar = bzy.this;
                int i = bzyVar.A;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                switch (i2) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        return;
                    case 1:
                        long j = b;
                        avw.a(bzyVar.a, "Pause on ".concat(String.valueOf(buz.a(j))));
                        bzyVar.n.addLast(Range.create(Long.valueOf(j), Long.MAX_VALUE));
                        bzyVar.s(3);
                        return;
                    case 4:
                        bzyVar.s(6);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        int i3 = bzyVar.A;
                        Objects.toString(bzi.a(i3));
                        throw new IllegalStateException("Unknown state: ".concat(bzi.a(i3)));
                }
            }
        });
    }

    @Override // defpackage.bxz
    public final void b() {
        this.h.execute(new Runnable() { // from class: byo
            @Override // java.lang.Runnable
            public final void run() {
                bzy bzyVar = bzy.this;
                int i = bzyVar.A;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        bzyVar.l();
                        return;
                    case 3:
                    case 4:
                    case 5:
                        bzyVar.s(7);
                        return;
                    case 6:
                    case 8:
                        return;
                    default:
                        int i3 = bzyVar.A;
                        Objects.toString(bzi.a(i3));
                        throw new IllegalStateException("Unknown state: ".concat(bzi.a(i3)));
                }
            }
        });
    }

    @Override // defpackage.bxz
    public final void c(byb bybVar, Executor executor) {
        synchronized (this.b) {
            this.o = bybVar;
            this.p = executor;
        }
    }

    @Override // defpackage.bxz
    public final void d() {
        final long b = caf.b();
        this.h.execute(new Runnable() { // from class: bye
            @Override // java.lang.Runnable
            public final void run() {
                bzy.this.j(b);
            }
        });
    }

    @Override // defpackage.bxz
    public final void e(final long j) {
        final long b = caf.b();
        this.h.execute(new Runnable() { // from class: byf
            @Override // java.lang.Runnable
            public final void run() {
                final bzy bzyVar = bzy.this;
                int i = bzyVar.A;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                switch (i2) {
                    case 0:
                    case 3:
                    case 7:
                        return;
                    case 1:
                    case 2:
                        bzyVar.s(4);
                        Long l = (Long) bzyVar.q.getLower();
                        long longValue = l.longValue();
                        if (longValue == Long.MAX_VALUE) {
                            throw new AssertionError("There should be a \"start\" before \"stop\"");
                        }
                        long j2 = b;
                        long j3 = j;
                        if (j3 != -1) {
                            if (j3 < longValue) {
                                avw.f(bzyVar.a, "The expected stop time is less than the start time. Use current time as stop time.");
                            } else {
                                j2 = j3;
                            }
                        }
                        if (j2 < longValue) {
                            throw new AssertionError("The start time should be before the stop time.");
                        }
                        bzyVar.q = Range.create(l, Long.valueOf(j2));
                        avw.a(bzyVar.a, "Stop on ".concat(String.valueOf(buz.a(j2))));
                        if (i == 3 && bzyVar.t != null) {
                            bzyVar.p();
                            return;
                        } else {
                            bzyVar.s = true;
                            bzyVar.u = bjm.a().schedule(new Runnable() { // from class: byu
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final bzy bzyVar2 = bzy.this;
                                    bzyVar2.h.execute(new Runnable() { // from class: byn
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            bzy bzyVar3 = bzy.this;
                                            if (bzyVar3.s) {
                                                avw.f(bzyVar3.a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                                                bzyVar3.t = null;
                                                bzyVar3.p();
                                                bzyVar3.s = false;
                                            }
                                        }
                                    });
                                }
                            }, 1000L, TimeUnit.MILLISECONDS);
                            return;
                        }
                    case 4:
                    case 5:
                        bzyVar.s(1);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        int i3 = bzyVar.A;
                        Objects.toString(bzi.a(i3));
                        throw new IllegalStateException("Unknown state: ".concat(bzi.a(i3)));
                }
            }
        });
    }

    final long f(MediaCodec.BufferInfo bufferInfo) {
        return this.r > 0 ? bufferInfo.presentationTimeUs - this.r : bufferInfo.presentationTimeUs;
    }

    final ListenableFuture g() {
        int i = this.A;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                return new bkk(new IllegalStateException("Encoder is not started yet."));
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                final AtomicReference atomicReference = new AtomicReference();
                ListenableFuture a = kfg.a(new kfd() { // from class: byi
                    @Override // defpackage.kfd
                    public final Object a(kfb kfbVar) {
                        int i3 = bzy.B;
                        atomicReference.set(kfbVar);
                        return "acquireInputBuffer";
                    }
                });
                final kfb kfbVar = (kfb) atomicReference.get();
                ksw.h(kfbVar);
                this.k.offer(kfbVar);
                kfbVar.a(new Runnable() { // from class: byj
                    @Override // java.lang.Runnable
                    public final void run() {
                        bzy.this.k.remove(kfbVar);
                    }
                }, this.h);
                k();
                return a;
            case 7:
                return new bkk(new IllegalStateException("Encoder is in error state."));
            case 8:
                return new bkk(new IllegalStateException("Encoder is released."));
            default:
                int i3 = this.A;
                Objects.toString(bzi.a(i3));
                throw new IllegalStateException("Unknown state: ".concat(bzi.a(i3)));
        }
    }

    final void h(MediaCodec.CodecException codecException) {
        i(1, codecException.getMessage(), codecException);
    }

    final void i(final int i, final String str, final Throwable th) {
        int i2 = this.A;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        switch (i3) {
            case 0:
                t(str, th);
                n();
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                s(8);
                q(new Runnable() { // from class: bys
                    @Override // java.lang.Runnable
                    public final void run() {
                        bzy.this.t(str, th);
                    }
                });
                return;
            case 7:
                avw.g(this.a, "Get more than one error: " + str + "(" + i + ")", th);
                return;
            default:
                return;
        }
    }

    final /* synthetic */ void j(long j) {
        int i = this.A;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                this.t = null;
                avw.a(this.a, "Start on ".concat(String.valueOf(buz.a(j))));
                try {
                    if (this.v) {
                        n();
                    }
                    this.q = Range.create(Long.valueOf(j), Long.MAX_VALUE);
                    this.e.start();
                    bxx bxxVar = this.f;
                    if (bxxVar instanceof bzh) {
                        ((bzh) bxxVar).f(true);
                    }
                    s(2);
                    return;
                } catch (MediaCodec.CodecException e) {
                    h(e);
                    return;
                }
            case 1:
            case 4:
            case 7:
                return;
            case 2:
                this.t = null;
                Range range = (Range) this.n.removeLast();
                ksw.d(range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                Long l = (Long) range.getLower();
                long longValue = l.longValue();
                this.n.addLast(Range.create(l, Long.valueOf(j)));
                avw.a(this.a, "Resume on " + buz.a(j) + "\nPaused duration = " + buz.a(j - longValue));
                if ((this.c || bwq.a(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!this.c || bwq.a(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    o(false);
                    bxx bxxVar2 = this.f;
                    if (bxxVar2 instanceof bzh) {
                        ((bzh) bxxVar2).f(true);
                    }
                }
                if (this.c) {
                    m();
                }
                s(2);
                return;
            case 3:
            case 5:
                s(5);
                return;
            case 6:
            case 8:
                throw new IllegalStateException("Encoder is released");
            default:
                int i3 = this.A;
                Objects.toString(bzi.a(i3));
                throw new IllegalStateException("Unknown state: ".concat(bzi.a(i3)));
        }
    }

    final void k() {
        while (!this.k.isEmpty() && !this.j.isEmpty()) {
            kfb kfbVar = (kfb) this.k.poll();
            kfbVar.getClass();
            Integer num = (Integer) this.j.poll();
            num.getClass();
            try {
                final cac cacVar = new cac(this.e, num.intValue());
                if (kfbVar.b(cacVar)) {
                    this.l.add(cacVar);
                    cacVar.a().b(new Runnable() { // from class: byk
                        @Override // java.lang.Runnable
                        public final void run() {
                            bzy.this.l.remove(cacVar);
                        }
                    }, this.h);
                } else {
                    cacVar.d();
                }
            } catch (MediaCodec.CodecException e) {
                h(e);
                return;
            }
        }
    }

    public final void l() {
        Surface surface;
        HashSet hashSet;
        if (this.v) {
            this.e.stop();
            this.v = false;
        }
        this.e.release();
        bxx bxxVar = this.f;
        if (bxxVar instanceof bzx) {
            bzx bzxVar = (bzx) bxxVar;
            synchronized (bzxVar.a) {
                surface = bzxVar.b;
                bzxVar.b = null;
                hashSet = new HashSet(bzxVar.c);
                bzxVar.c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        s(9);
        this.D.b(null);
    }

    final void m() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.e.setParameters(bundle);
    }

    public final void n() {
        bxy bxyVar;
        Executor executor;
        this.q = C;
        this.r = 0L;
        this.n.clear();
        this.j.clear();
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((kfb) it.next()).d();
        }
        this.k.clear();
        this.e.reset();
        this.v = false;
        this.w = false;
        this.x = false;
        this.s = false;
        Future future = this.u;
        Surface surface = null;
        if (future != null) {
            future.cancel(true);
            this.u = null;
        }
        Future future2 = this.y;
        if (future2 != null) {
            future2.cancel(false);
            this.y = null;
        }
        bzv bzvVar = this.E;
        if (bzvVar != null) {
            bzvVar.a = true;
        }
        bzv bzvVar2 = new bzv(this);
        this.E = bzvVar2;
        this.e.setCallback(bzvVar2);
        this.e.configure(this.d, (Surface) null, (MediaCrypto) null, 1);
        bxx bxxVar = this.f;
        if (bxxVar instanceof bzx) {
            bzx bzxVar = (bzx) bxxVar;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) bwq.a(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (bzxVar.a) {
                if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                    Surface surface2 = bzxVar.b;
                    if (surface2 == null) {
                        bzxVar.b = MediaCodec.createPersistentInputSurface();
                        surface = bzxVar.b;
                        surface2 = surface;
                    }
                    bzxVar.f.e.setInputSurface(surface2);
                } else {
                    Surface surface3 = bzxVar.b;
                    if (surface3 != null) {
                        bzxVar.c.add(surface3);
                    }
                    bzxVar.b = bzxVar.f.e.createInputSurface();
                    surface = bzxVar.b;
                }
                bxyVar = bzxVar.d;
                executor = bzxVar.e;
            }
            if (surface == null || bxyVar == null || executor == null) {
                return;
            }
            bzxVar.a(executor, bxyVar, surface);
        }
    }

    final void o(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z ? 1 : 0);
        this.e.setParameters(bundle);
    }

    final void p() {
        avw.a(this.a, "signalCodecStop");
        bxx bxxVar = this.f;
        if (bxxVar instanceof bzh) {
            ((bzh) bxxVar).f(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                arrayList.add(((cac) it.next()).a());
            }
            bkj.e(arrayList).b(new Runnable() { // from class: byt
                @Override // java.lang.Runnable
                public final void run() {
                    bzy bzyVar = bzy.this;
                    bkj.i(bzyVar.g(), new byw(bzyVar), bzyVar.h);
                }
            }, this.h);
            return;
        }
        if (bxxVar instanceof bzx) {
            try {
                if (bwq.a(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    final bzv bzvVar = this.E;
                    final Executor executor = this.h;
                    Future future = this.y;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.y = bjm.a().schedule(new Runnable() { // from class: byg
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i = bzy.B;
                            final bzv bzvVar2 = bzvVar;
                            bzvVar2.getClass();
                            executor.execute(new Runnable() { // from class: byh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    bzv.this.d();
                                }
                            });
                        }
                    }, 1000L, TimeUnit.MILLISECONDS);
                }
                this.e.signalEndOfInputStream();
                this.x = true;
            } catch (MediaCodec.CodecException e) {
                h(e);
            }
        }
    }

    final void q(final Runnable runnable) {
        avw.a(this.a, "stopMediaCodec");
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            arrayList.add(((bxv) it.next()).f());
        }
        Iterator it2 = this.l.iterator();
        while (it2.hasNext()) {
            arrayList.add(((cac) it2.next()).a());
        }
        if (!arrayList.isEmpty()) {
            avw.a(this.a, "Waiting for resources to return. encoded data = " + this.m.size() + ", input buffers = " + this.l.size());
        }
        bkj.e(arrayList).b(new Runnable() { // from class: byr
            @Override // java.lang.Runnable
            public final void run() {
                bzy bzyVar = bzy.this;
                if (bzyVar.A != 8) {
                    if (!arrayList.isEmpty()) {
                        avw.a(bzyVar.a, "encoded data and input buffers are returned");
                    }
                    if ((bzyVar.f instanceof bzx) && !bzyVar.w && bwq.a(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) == null) {
                        bzyVar.e.flush();
                        bzyVar.v = true;
                    } else {
                        bzyVar.e.stop();
                    }
                }
                runnable.run();
                int i = bzyVar.A;
                if (i == 7) {
                    bzyVar.l();
                    return;
                }
                if (!bzyVar.v) {
                    bzyVar.n();
                }
                bzyVar.s(1);
                if (i != 5) {
                    if (i != 6) {
                        return;
                    } else {
                        i = 6;
                    }
                }
                bzyVar.d();
                if (i == 6) {
                    bzyVar.a();
                }
            }
        }, this.h);
    }

    public final void s(int i) {
        if (this.A == i) {
            return;
        }
        avw.a(this.a, "Transitioning encoder internal state: " + ((Object) bzi.a(this.A)) + " --> " + ((Object) bzi.a(i)));
        this.A = i;
    }

    final void t(final String str, final Throwable th) {
        final byb bybVar;
        Executor executor;
        synchronized (this.b) {
            bybVar = this.o;
            executor = this.p;
        }
        try {
            executor.execute(new Runnable() { // from class: byd
                @Override // java.lang.Runnable
                public final void run() {
                    int i = bzy.B;
                    byb.this.a(new bxs(str, th));
                }
            });
        } catch (RejectedExecutionException e) {
            avw.d(this.a, "Unable to post to the supplied executor.", e);
        }
    }
}
