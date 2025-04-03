package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mmz {
    private Method A;
    private long B;
    private int C;
    private int D;
    private long E;
    private long F;
    private boolean G;
    private long H;
    private long I;
    public AudioTrack a;
    public int b;
    public mmy c;
    public int d;
    public boolean e;
    public long f;
    public float g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public boolean s;
    public long t;
    public ltn u;
    public final mnq v;
    private final long[] w;
    private boolean x;
    private long y;
    private long z;

    public mmz(mnq mnqVar) {
        this.v = mnqVar;
        try {
            this.A = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.w = new long[10];
        this.u = ltn.a;
    }

    private final long e() {
        return lvf.v(b(), this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00c9, code lost:
    
        if (r6 != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r28) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mmz.a(boolean):long");
    }

    public final long b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.o != -9223372036854775807L) {
            AudioTrack audioTrack = this.a;
            lti.f(audioTrack);
            if (audioTrack.getPlayState() == 2) {
                return this.q;
            }
            return Math.min(this.r, this.q + lvf.r(lvf.s(lvf.u(elapsedRealtime) - this.o, this.g), this.d));
        }
        if (elapsedRealtime - this.B >= 5) {
            AudioTrack audioTrack2 = this.a;
            lti.f(audioTrack2);
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                if (lvf.a <= 29) {
                    if (playbackHeadPosition == 0) {
                        if (this.l <= 0 || playState != 3) {
                            playbackHeadPosition = 0;
                        } else if (this.p == -9223372036854775807L) {
                            this.p = elapsedRealtime;
                        }
                    }
                    this.p = -9223372036854775807L;
                }
                if (this.l > playbackHeadPosition) {
                    this.m++;
                }
                this.l = playbackHeadPosition;
            }
            this.B = elapsedRealtime;
        }
        return this.l + this.t + (this.m << 32);
    }

    public final void c() {
        this.y = 0L;
        this.D = 0;
        this.C = 0;
        this.z = 0L;
        this.F = 0L;
        this.I = 0L;
        this.x = false;
    }

    public final boolean d(long j) {
        return this.o != -9223372036854775807L ? j > b() : j > lvf.r(a(false), this.d);
    }
}
