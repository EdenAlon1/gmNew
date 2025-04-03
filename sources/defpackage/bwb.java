package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecord;
import android.os.Build;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwb implements bvy {
    public static final /* synthetic */ int l = 0;
    private static final long m = TimeUnit.MILLISECONDS.toNanos(500);
    public AudioRecord a;
    public final bve b;
    public final int f;
    public Executor g;
    public long h;
    public AudioManager$AudioRecordingCallback i;
    public bvs k;
    private final int n;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicReference e = new AtomicReference(null);
    public boolean j = false;

    public bwb(bve bveVar, Context context) {
        if (!h(bveVar.e(), bveVar.d(), bveVar.a())) {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(bveVar.e()), Integer.valueOf(bveVar.d()), Integer.valueOf(bveVar.a())));
        }
        this.b = bveVar;
        this.n = bveVar.c();
        int i = i(bveVar.e(), bveVar.d(), bveVar.a());
        ksw.c(i > 0);
        int i2 = i + i;
        this.f = i2;
        AudioRecord c = c(i2, bveVar, context);
        this.a = c;
        d(c);
    }

    public static AudioRecord c(int i, bve bveVar, Context context) {
        AudioFormat build = new AudioFormat.Builder().setSampleRate(bveVar.e()).setChannelMask(bveVar.d() == 1 ? 16 : 12).setEncoding(bveVar.a()).build();
        AudioRecord.Builder builder = new AudioRecord.Builder();
        if (Build.VERSION.SDK_INT >= 31 && context != null) {
            builder.setContext(context);
        }
        builder.setAudioSource(bveVar.b());
        builder.setAudioFormat(build);
        builder.setBufferSizeInBytes(i);
        return builder.build();
    }

    public static void d(AudioRecord audioRecord) {
        if (audioRecord.getState() == 1) {
            return;
        }
        audioRecord.release();
        throw new bvw("Unable to initialize AudioRecord");
    }

    public static boolean g() {
        return bwq.a(AudioTimestampFramePositionIncorrectQuirk.class) != null;
    }

    public static boolean h(int i, int i2, int i3) {
        return i > 0 && i2 > 0 && i(i, i2, i3) > 0;
    }

    private static int i(int i, int i2, int i3) {
        return AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    @Override // defpackage.bvy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bvx a(java.nio.ByteBuffer r14) {
        /*
            r13 = this;
            r13.e()
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.d
            boolean r0 = r0.get()
            java.lang.String r1 = "AudioStream has not been started."
            defpackage.ksw.d(r0, r1)
            android.media.AudioRecord r0 = r13.a
            int r1 = r13.f
            int r0 = r0.read(r14, r1)
            r1 = 0
            if (r0 <= 0) goto L90
            r14.limit(r0)
            boolean r14 = r13.j
            r3 = -1
            if (r14 != 0) goto L7b
            android.media.AudioTimestamp r14 = new android.media.AudioTimestamp
            r14.<init>()
            android.media.AudioRecord r5 = r13.a
            r6 = 0
            int r5 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m(r5, r14, r6)
            if (r5 != 0) goto L74
            bve r5 = r13.b
            int r5 = r5.e()
            long r7 = r13.h
            long r9 = (long) r5
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r10 = 1
            if (r9 <= 0) goto L41
            r9 = r10
            goto L42
        L41:
            r9 = r6
        L42:
            java.lang.String r11 = "sampleRate must be greater than 0."
            defpackage.ksw.b(r9, r11)
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 < 0) goto L4c
            r6 = r10
        L4c:
            java.lang.String r9 = "framePosition must be no less than 0."
            defpackage.ksw.b(r6, r9)
            long r11 = r14.framePosition
            long r7 = r7 - r11
            long r5 = defpackage.bwc.a(r7, r5)
            long r7 = r14.nanoTime
            long r7 = r7 + r5
            int r14 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r14 >= 0) goto L60
            goto L61
        L60:
            r1 = r7
        L61:
            long r5 = java.lang.System.nanoTime()
            long r5 = r1 - r5
            long r5 = java.lang.Math.abs(r5)
            long r7 = defpackage.bwb.m
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 <= 0) goto L7c
            r13.j = r10
            goto L7b
        L74:
            java.lang.String r14 = "AudioStreamImpl"
            java.lang.String r1 = "Unable to get audio timestamp"
            defpackage.avw.f(r14, r1)
        L7b:
            r1 = r3
        L7c:
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 != 0) goto L84
            long r1 = java.lang.System.nanoTime()
        L84:
            long r3 = r13.h
            long r5 = (long) r0
            int r14 = r13.n
            long r5 = defpackage.bwc.b(r5, r14)
            long r3 = r3 + r5
            r13.h = r3
        L90:
            bwf r14 = new bwf
            r14.<init>(r0, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwb.a(java.nio.ByteBuffer):bvx");
    }

    @Override // defpackage.bvy
    public final void b() {
        throw null;
    }

    public final void e() {
        ksw.d(!this.c.get(), "AudioStream has been released.");
    }

    final void f(final boolean z) {
        Executor executor = this.g;
        final bvs bvsVar = this.k;
        if (executor == null || bvsVar == null) {
            return;
        }
        AtomicReference atomicReference = this.e;
        Boolean valueOf = Boolean.valueOf(z);
        if (Objects.equals(atomicReference.getAndSet(valueOf), valueOf)) {
            return;
        }
        executor.execute(new Runnable() { // from class: bvz
            @Override // java.lang.Runnable
            public final void run() {
                int i = bwb.l;
                bvu bvuVar = bvs.this.a;
                bvuVar.m = z;
                if (bvuVar.s == 2) {
                    bvuVar.b();
                }
            }
        });
    }
}
