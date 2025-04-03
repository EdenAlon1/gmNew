package defpackage;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mlq implements miu, mlr {
    private boolean A;
    public final PlaybackSession a;
    public String b;
    public PlaybackMetrics.Builder c;
    private final Context d;
    private final mls f;
    private int l;
    private lrh o;
    private mlp p;
    private mlp q;
    private mlp r;
    private lqc s;
    private lqc t;
    private lqc u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private int z;
    private final Executor e = ltj.a();
    private final lrt h = new lrt();
    private final lrs i = new lrs();
    private final HashMap k = new HashMap();
    private final HashMap j = new HashMap();
    private final long g = SystemClock.elapsedRealtime();
    private int m = 0;
    private int n = 0;

    public mlq(Context context, PlaybackSession playbackSession) {
        this.d = context.getApplicationContext();
        this.a = playbackSession;
        mlj mljVar = new mlj();
        this.f = mljVar;
        mljVar.c = this;
    }

    private static int m(int i) {
        switch (lvf.j(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void n(int i, long j, lqc lqcVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        final TrackChangeEvent build;
        timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.g);
        if (lqcVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = lqcVar.n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = lqcVar.o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = lqcVar.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = lqcVar.j;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = lqcVar.v;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = lqcVar.w;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = lqcVar.E;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = lqcVar.F;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = lqcVar.d;
            if (str4 != null) {
                String[] ag = lvf.ag(str4, "-");
                Pair create = Pair.create(ag[0], ag.length >= 2 ? ag[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                if (create.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) create.second);
                }
            }
            float f = lqcVar.x;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        build = timeSinceCreatedMillis.build();
        this.e.execute(new Runnable() { // from class: mlk
            @Override // java.lang.Runnable
            public final void run() {
                mlq.this.a.reportTrackChangeEvent(build);
            }
        });
    }

    private final boolean o(mlp mlpVar) {
        if (mlpVar != null) {
            return mlpVar.c.equals(this.f.c());
        }
        return false;
    }

    private final void p(long j, lqc lqcVar) {
        lqc lqcVar2 = this.t;
        int i = lvf.a;
        if (Objects.equals(lqcVar2, lqcVar)) {
            return;
        }
        int i2 = this.t == null ? 1 : 0;
        this.t = lqcVar;
        n(0, j, lqcVar, i2);
    }

    private final void q(long j, lqc lqcVar) {
        lqc lqcVar2 = this.u;
        int i = lvf.a;
        if (Objects.equals(lqcVar2, lqcVar)) {
            return;
        }
        int i2 = this.u == null ? 1 : 0;
        this.u = lqcVar;
        n(2, j, lqcVar, i2);
    }

    private final void r(long j, lqc lqcVar) {
        lqc lqcVar2 = this.s;
        int i = lvf.a;
        if (Objects.equals(lqcVar2, lqcVar)) {
            return;
        }
        int i2 = this.s == null ? 1 : 0;
        this.s = lqcVar;
        n(1, j, lqcVar, i2);
    }

    @Override // defpackage.miu
    public final void a(mis misVar, mth mthVar) {
        if (misVar.d == null) {
            return;
        }
        lqc lqcVar = mthVar.b;
        lti.f(lqcVar);
        mls mlsVar = this.f;
        lru lruVar = misVar.b;
        mtl mtlVar = misVar.d;
        lti.f(mtlVar);
        mlp mlpVar = new mlp(lqcVar, mlsVar.d(lruVar, mtlVar));
        int i = mthVar.a;
        if (i != 0) {
            if (i == 1) {
                this.q = mlpVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.r = mlpVar;
                return;
            }
        }
        this.p = mlpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x01e6, code lost:
    
        if (r8 != 1) goto L137;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.miu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.lro r20, defpackage.mit r21) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mlq.b(lro, mit):void");
    }

    @Override // defpackage.miu
    public final void d(mis misVar, int i, long j) {
        mtl mtlVar = misVar.d;
        if (mtlVar != null) {
            mls mlsVar = this.f;
            lru lruVar = misVar.b;
            HashMap hashMap = this.k;
            String d = mlsVar.d(lruVar, mtlVar);
            Long l = (Long) hashMap.get(d);
            Long l2 = (Long) this.j.get(d);
            this.k.put(d, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.j.put(d, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // defpackage.miu
    public final void e(lrh lrhVar) {
        this.o = lrhVar;
    }

    @Override // defpackage.miu
    public final void f(int i) {
        if (i == 1) {
            this.v = true;
            i = 1;
        }
        this.l = i;
    }

    @Override // defpackage.miu
    public final void g(meb mebVar) {
        this.x += mebVar.g;
        this.y += mebVar.e;
    }

    @Override // defpackage.miu
    public final void h(lsl lslVar) {
        mlp mlpVar = this.p;
        if (mlpVar != null) {
            lqc lqcVar = mlpVar.a;
            if (lqcVar.w == -1) {
                lqb lqbVar = new lqb(lqcVar);
                lqbVar.t = lslVar.b;
                lqbVar.u = lslVar.c;
                this.p = new mlp(new lqc(lqbVar), mlpVar.c);
            }
        }
    }

    public final void j() {
        final PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.c;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.z);
            this.c.setVideoFramesDropped(this.x);
            this.c.setVideoFramesPlayed(this.y);
            Long l = (Long) this.j.get(this.b);
            this.c.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.k.get(this.b);
            this.c.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.c.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            build = this.c.build();
            this.e.execute(new Runnable() { // from class: mln
                @Override // java.lang.Runnable
                public final void run() {
                    mlq.this.a.reportPlaybackMetrics(build);
                }
            });
        }
        this.c = null;
        this.b = null;
        this.z = 0;
        this.x = 0;
        this.y = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.A = false;
    }

    public final void k(lru lruVar, mtl mtlVar) {
        int a;
        int i;
        PlaybackMetrics.Builder builder = this.c;
        if (mtlVar == null || (a = lruVar.a(mtlVar.a)) == -1) {
            return;
        }
        lruVar.n(a, this.i);
        lruVar.p(this.i.c, this.h);
        lqt lqtVar = this.h.d.b;
        if (lqtVar == null) {
            i = 0;
        } else {
            int o = lvf.o(lqtVar.a, lqtVar.b);
            i = o != 0 ? o != 1 ? o != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        lrt lrtVar = this.h;
        if (lrtVar.m != -9223372036854775807L && !lrtVar.k && !lrtVar.i && !lrtVar.c()) {
            builder.setMediaDurationMillis(lrtVar.b());
        }
        builder.setPlaybackType(true != this.h.c() ? 1 : 2);
        this.A = true;
    }

    @Override // defpackage.mlr
    public final void l(mis misVar, String str) {
        mtl mtlVar = misVar.d;
        if ((mtlVar == null || !mtlVar.b()) && str.equals(this.b)) {
            j();
        }
        this.j.remove(str);
        this.k.remove(str);
    }

    @Override // defpackage.miu
    public final void i(boolean z) {
    }

    @Override // defpackage.miu
    public final /* synthetic */ void c(mis misVar, boolean z) {
    }
}
