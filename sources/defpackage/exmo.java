package defpackage;

import android.media.MediaCodec;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
class exmo {
    public static final String a = "exmo";
    protected final long b;
    protected final long c;
    protected final long d;
    protected final exmn f;
    protected MediaCodec g;
    protected int h;
    protected MediaCodec.BufferInfo i;
    boolean m;
    private int n;
    protected long e = 0;
    protected boolean j = false;
    protected boolean k = false;
    protected boolean l = false;

    protected exmo(exmn exmnVar, long j, long j2, long j3) {
        this.f = exmnVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final void b() {
        int addTrack = this.f.d.addTrack(this.g.getOutputFormat());
        this.h = addTrack;
        Log.d(a, a.h(addTrack, "Added track to muxer: "));
    }

    public void c() {
        emxf.a(this.j);
        emxf.a(!this.l);
        try {
            int dequeueInputBuffer = this.g.dequeueInputBuffer(this.b);
            if (dequeueInputBuffer == -1) {
                return;
            }
            this.g.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
            this.l = true;
        } catch (IllegalStateException e) {
            Log.e(a, "Failed to signal end of stream: ".concat(String.valueOf(e.toString())));
        }
    }

    public void d() {
        try {
            if (this.g != null) {
                Log.i(a, "Encoder is not null");
                if (!this.l) {
                    c();
                }
                int i = 0;
                while (true) {
                    if (!this.k) {
                        if (i >= 200) {
                            Log.e(a, "Never received BUFFER_FLAG_END_OF_STREAM flag.");
                            break;
                        } else {
                            e();
                            i++;
                        }
                    } else {
                        break;
                    }
                }
                this.g.flush();
                this.g.stop();
                this.g.release();
                Log.i(a, "Done encoding");
            }
        } catch (IllegalStateException e) {
            Log.e(a, "Encoder/muxer was in an illegal state:".concat(String.valueOf(e.getMessage())));
        }
        this.g = null;
        this.j = false;
        this.k = false;
        this.l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0027, code lost:
    
        if (r1 >= 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean e() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exmo.e():boolean");
    }
}
