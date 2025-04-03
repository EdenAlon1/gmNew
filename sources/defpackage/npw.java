package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Trace;
import android.view.Surface;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npw implements npo {
    public final lqc a;
    public final MediaCodec b;
    public final Surface c;
    public final int d;
    public final boolean e;
    public final AtomicBoolean f;
    private final MediaCodec.BufferInfo g;
    private final MediaFormat h;
    private final boolean i;
    private lqc j;
    private ByteBuffer k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;

    public npw(Context context, lqc lqcVar, MediaFormat mediaFormat, String str, boolean z, Surface surface) {
        Exception exc;
        MediaCodec mediaCodec;
        this.a = lqcVar;
        this.h = mediaFormat;
        this.e = z;
        String str2 = lqcVar.o;
        lti.f(str2);
        boolean l = lre.l(str2);
        this.i = l;
        this.g = new MediaCodec.BufferInfo();
        this.l = -1;
        this.m = -1;
        this.f = new AtomicBoolean();
        int i = lyt.a;
        boolean n = n(mediaFormat);
        Surface surface2 = null;
        try {
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                Trace.beginSection("configureCodec");
                mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, !z ? 1 : 0);
                Trace.endSection();
                if (n) {
                    lti.b(n(mediaCodec.getInputFormat()), "Tone-mapping requested but not supported by the decoder.");
                }
                if (l && !z) {
                    surface2 = mediaCodec.createInputSurface();
                }
                Trace.beginSection("startCodec");
                mediaCodec.start();
                Trace.endSection();
                this.b = mediaCodec;
                this.c = surface2;
                this.d = lvf.l(context);
            } catch (Exception e) {
                exc = e;
                luj.h(exc);
                if (surface2 != null) {
                    surface2.release();
                }
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw m(mediaFormat, this.i, z, exc, ((exc instanceof IOException) || (exc instanceof MediaCodec.CodecException)) ? true != z ? 4001 : 3001 : exc instanceof IllegalArgumentException ? true != z ? 4003 : 3003 : 1001, str);
            }
        } catch (Exception e2) {
            exc = e2;
            mediaCodec = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a1 A[LOOP:0: B:53:0x0169->B:55:0x01a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0175 A[EDGE_INSN: B:56:0x0175->B:57:0x0175 BREAK  A[LOOP:0: B:53:0x0169->B:55:0x01a1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.lqc j(android.media.MediaFormat r19, boolean r20, defpackage.lrb r21) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npw.j(android.media.MediaFormat, boolean, lrb):lqc");
    }

    private static nrd m(MediaFormat mediaFormat, boolean z, boolean z2, Exception exc, int i, String str) {
        return nrd.b(exc, i, new nrc(mediaFormat.toString(), z, z2, str));
    }

    private static boolean n(MediaFormat mediaFormat) {
        return lvf.a >= 31 && lum.a(mediaFormat, "color-transfer-request", 0) == 3;
    }

    private final boolean o(boolean z) {
        if (this.m >= 0) {
            return true;
        }
        if (this.o) {
            return false;
        }
        try {
            int dequeueOutputBuffer = this.b.dequeueOutputBuffer(this.g, 0L);
            this.m = dequeueOutputBuffer;
            if (dequeueOutputBuffer < 0) {
                if (dequeueOutputBuffer == -2) {
                    this.j = j(this.b.getOutputFormat(), this.e, this.a.l);
                    if (this.e && Objects.equals(this.a.o, "audio/raw")) {
                        lqb lqbVar = new lqb(this.j);
                        lqc lqcVar = this.a;
                        lqbVar.C = lqcVar.E;
                        lqbVar.E = lqcVar.G;
                        this.j = new lqc(lqbVar);
                    }
                    if (!this.e && this.i) {
                        this.f.set(true);
                    }
                    long j = this.g.presentationTimeUs;
                    int i = lyt.a;
                }
                return false;
            }
            if ((this.g.flags & 4) != 0) {
                this.o = true;
                int i2 = lyt.a;
                if (this.g.size == 0) {
                    i();
                    return false;
                }
                this.g.flags &= -5;
            }
            if ((this.g.flags & 2) != 0) {
                i();
                return false;
            }
            if (z) {
                try {
                    ByteBuffer outputBuffer = this.b.getOutputBuffer(this.m);
                    lti.f(outputBuffer);
                    this.k = outputBuffer;
                    outputBuffer.position(this.g.offset);
                    ByteBuffer byteBuffer = this.k;
                    MediaCodec.BufferInfo bufferInfo = this.g;
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                } catch (RuntimeException e) {
                    luj.h(e);
                    throw k(e);
                }
            }
            return true;
        } catch (RuntimeException e2) {
            luj.h(e2);
            throw k(e2);
        }
    }

    @Override // defpackage.npo
    public final MediaCodec.BufferInfo a() {
        if (o(false)) {
            return this.g;
        }
        return null;
    }

    @Override // defpackage.npo
    public final lqc b() {
        o(false);
        return this.j;
    }

    @Override // defpackage.npo
    public final String c() {
        String canonicalName;
        if (lvf.a < 29) {
            return this.b.getName();
        }
        canonicalName = this.b.getCanonicalName();
        return canonicalName;
    }

    @Override // defpackage.npo
    public final ByteBuffer d() {
        if (!o(true)) {
            return null;
        }
        long j = this.g.presentationTimeUs;
        int i = this.g.size;
        int i2 = lyt.a;
        return this.k;
    }

    @Override // defpackage.npo
    public final void e(lxz lxzVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        boolean z = true;
        lti.d(!this.n, "Input buffer can not be queued after the input stream has ended.");
        ByteBuffer byteBuffer = lxzVar.d;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            i = 0;
            i2 = 0;
        } else {
            i = lxzVar.d.position();
            i2 = lxzVar.d.remaining();
        }
        long j2 = lxzVar.f;
        if (lxzVar.eR()) {
            this.n = true;
            int i6 = lyt.a;
            if (this.e) {
                ByteBuffer byteBuffer2 = lxzVar.d;
                if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
                    z = false;
                }
                lti.c(z);
                j2 = 0;
                i3 = 0;
                i5 = 0;
            } else {
                i3 = i;
                i5 = i2;
            }
            j = j2;
            i4 = 4;
        } else {
            i3 = i;
            i4 = 0;
            i5 = i2;
            j = j2;
        }
        try {
            this.b.queueInputBuffer(this.l, i3, i5, j, i4);
            int i7 = lyt.a;
            this.l = -1;
            lxzVar.d = null;
        } catch (RuntimeException e) {
            luj.h(e);
            throw k(e);
        }
    }

    @Override // defpackage.npo
    public final void f() {
        this.k = null;
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
        }
        this.b.release();
    }

    @Override // defpackage.npo
    public final boolean g() {
        return this.o && this.m == -1;
    }

    @Override // defpackage.npo
    public final boolean h(lxz lxzVar) {
        if (this.n) {
            return false;
        }
        if (this.l < 0) {
            try {
                int dequeueInputBuffer = this.b.dequeueInputBuffer(0L);
                this.l = dequeueInputBuffer;
                if (dequeueInputBuffer < 0) {
                    return false;
                }
                try {
                    lxzVar.d = this.b.getInputBuffer(dequeueInputBuffer);
                    lxzVar.eO();
                } catch (RuntimeException e) {
                    luj.h(e);
                    throw k(e);
                }
            } catch (RuntimeException e2) {
                luj.h(e2);
                throw k(e2);
            }
        }
        lti.f(lxzVar.d);
        return true;
    }

    @Override // defpackage.npo
    public final void i() {
        l(false, this.g.presentationTimeUs);
    }

    public final nrd k(Exception exc) {
        boolean z = this.e;
        return m(this.h, this.i, z, exc, true != z ? 4002 : 3002, c());
    }

    protected final void l(boolean z, long j) {
        this.k = null;
        try {
            if (z) {
                this.b.releaseOutputBuffer(this.m, j * 1000);
                int i = lyt.a;
            } else {
                this.b.releaseOutputBuffer(this.m, false);
            }
            this.m = -1;
        } catch (RuntimeException e) {
            luj.h(e);
            throw k(e);
        }
    }
}
