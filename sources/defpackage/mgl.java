package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgl extends lpm implements ExoPlayer {
    public static final /* synthetic */ int D = 0;
    public mhz A;
    public int B;
    public long C;
    private final ltq E = new ltq();
    private final mig[] F;
    private final mig[] G;
    private final mxl H;
    private final CopyOnWriteArraySet I;
    private final lrs J;
    private final boolean K;
    private final mtk L;
    private final mxs M;
    private final long N;
    private final long O;
    private final long P;
    private final mgi Q;
    private final mgj R;
    private final mip S;
    private final miq T;
    private final long U;
    private int V;
    private boolean W;
    private min X;
    private mey Y;
    private Surface Z;
    private SurfaceHolder aa;
    private nbk ab;
    private TextureView ac;
    private int ad;
    private lux ae;
    private lpk af;
    private boolean ag;
    private boolean ah;
    private int ai;
    private boolean aj;
    private final mfk ak;
    private mvf al;
    final mxm b;
    final lrk c;
    public final Context d;
    public final lro e;
    public final lua f;
    public final mgx g;
    public final lug h;
    public final List i;
    public final mir j;
    public final Looper k;
    public final ltn l;
    public final mdz m;
    public final ltl n;
    public int o;
    public int p;
    public boolean q;
    public lrk r;
    public lqz s;
    public Object t;
    public boolean u;
    public float v;
    public boolean w;
    public lta x;
    public lsl y;
    public lqz z;

    static {
        lqx.b("media3.exoplayer");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0274 A[Catch: all -> 0x0336, TryCatch #0 {all -> 0x0336, blocks: (B:3:0x0010, B:6:0x008b, B:7:0x0094, B:9:0x009a, B:11:0x00a6, B:13:0x012b, B:15:0x0133, B:17:0x0199, B:21:0x01aa, B:23:0x0274, B:24:0x0289), top: B:2:0x0010 }] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, mir] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, mxs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mgl(defpackage.mex r31) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgl.<init>(mex):void");
    }

    private final Pair aA(lru lruVar, int i, long j) {
        if (lruVar.q()) {
            this.B = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.C = j;
            return null;
        }
        if (i == -1 || i >= lruVar.c()) {
            i = lruVar.g(this.W);
            j = lruVar.p(i, this.a).a();
        }
        return lruVar.l(this.a, this.J, i, lvf.u(j));
    }

    private final mhz aB(mhz mhzVar, lru lruVar, Pair pair) {
        List list;
        lti.a(lruVar.q() || pair != null);
        lru lruVar2 = mhzVar.b;
        long ax = ax(mhzVar);
        mhz g = mhzVar.g(lruVar);
        if (lruVar.q()) {
            mtl mtlVar = mhz.a;
            long u = lvf.u(this.C);
            mxm mxmVar = this.b;
            mvo mvoVar = mvo.a;
            int i = engw.d;
            mhz a = g.b(mtlVar, u, u, u, 0L, mvoVar, mxmVar, enou.a).a(mtlVar);
            a.r = a.t;
            return a;
        }
        Object obj = g.c.a;
        int i2 = lvf.a;
        boolean equals = obj.equals(pair.first);
        mtl mtlVar2 = !equals ? new mtl(pair.first) : g.c;
        long longValue = ((Long) pair.second).longValue();
        long u2 = lvf.u(ax);
        if (!lruVar2.q()) {
            u2 -= lruVar2.o(obj, this.J).e;
        }
        if (!equals || longValue < u2) {
            mtl mtlVar3 = mtlVar2;
            lti.c(!mtlVar3.b());
            mvo mvoVar2 = !equals ? mvo.a : g.i;
            mxm mxmVar2 = !equals ? this.b : g.j;
            if (equals) {
                list = g.k;
            } else {
                int i3 = engw.d;
                list = enou.a;
            }
            mhz a2 = g.b(mtlVar3, longValue, longValue, longValue, 0L, mvoVar2, mxmVar2, list).a(mtlVar3);
            a2.r = longValue;
            return a2;
        }
        if (longValue != u2) {
            mtl mtlVar4 = mtlVar2;
            lti.c(!mtlVar4.b());
            long max = Math.max(0L, g.s - (longValue - u2));
            long j = g.r;
            if (g.l.equals(g.c)) {
                j = longValue + max;
            }
            mhz b = g.b(mtlVar4, longValue, longValue, longValue, max, g.i, g.j, g.k);
            b.r = j;
            return b;
        }
        int a3 = lruVar.a(g.l.a);
        if (a3 != -1 && lruVar.n(a3, this.J).c == lruVar.o(mtlVar2.a, this.J).c) {
            return g;
        }
        lruVar.o(mtlVar2.a, this.J);
        long e = mtlVar2.b() ? this.J.e(mtlVar2.b, mtlVar2.c) : this.J.d;
        mtl mtlVar5 = mtlVar2;
        mhz a4 = g.b(mtlVar5, g.t, g.t, g.e, e - g.t, g.i, g.j, g.k).a(mtlVar5);
        a4.r = e;
        return a4;
    }

    private final mid aC(mic micVar) {
        aw(this.A);
        lru lruVar = this.A.b;
        mgx mgxVar = this.g;
        return new mid(mgxVar, micVar, mgxVar.f);
    }

    private final void aD() {
        if (this.ab != null) {
            mid aC = aC(this.R);
            aC.e(10000);
            aC.d(null);
            aC.c();
            nbk nbkVar = this.ab;
            nbkVar.a.remove(this.Q);
            this.ab = null;
        }
        TextureView textureView = this.ac;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.Q) {
                luj.f("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.ac.setSurfaceTextureListener(null);
            }
            this.ac = null;
        }
        SurfaceHolder surfaceHolder = this.aa;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.Q);
            this.aa = null;
        }
    }

    private final void aE(SurfaceHolder surfaceHolder) {
        this.u = false;
        this.aa = surfaceHolder;
        surfaceHolder.addCallback(this.Q);
        Surface surface = this.aa.getSurface();
        if (surface == null || !surface.isValid()) {
            am(0, 0);
        } else {
            Rect surfaceFrame = this.aa.getSurfaceFrame();
            am(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    private final void aF() {
        lrk lrkVar = this.r;
        int i = lvf.a;
        lro lroVar = this.e;
        boolean aa = lroVar.aa();
        boolean q = lroVar.q();
        boolean m = lroVar.m();
        boolean l = lroVar.l();
        boolean p = lroVar.p();
        boolean o = lroVar.o();
        boolean q2 = lroVar.I().q();
        lpy lpyVar = new lpy();
        lrj.b(this.c, lpyVar);
        boolean z = !aa;
        lrj.c(4, z, lpyVar);
        boolean z2 = false;
        lrj.c(5, q && !aa, lpyVar);
        lrj.c(6, m && !aa, lpyVar);
        lrj.c(7, !q2 && (m || !p || q) && !aa, lpyVar);
        lrj.c(8, l && !aa, lpyVar);
        lrj.c(9, !q2 && (l || (p && o)) && !aa, lpyVar);
        lrj.c(10, z, lpyVar);
        lrj.c(11, q && !aa, lpyVar);
        if (q && !aa) {
            z2 = true;
        }
        lrj.c(12, z2, lpyVar);
        lrk a = lrj.a(lpyVar);
        this.r = a;
        if (a.equals(lrkVar)) {
            return;
        }
        this.h.d(13, new lud() { // from class: mfs
            @Override // defpackage.lud
            public final void a(Object obj) {
                ((lrm) obj).c(mgl.this.r);
            }
        });
    }

    public static int ag(int i) {
        return i == -1 ? 2 : 1;
    }

    private final int aw(mhz mhzVar) {
        return mhzVar.b.q() ? this.B : mhzVar.b.o(mhzVar.c.a, this.J).c;
    }

    private final long ax(mhz mhzVar) {
        if (!mhzVar.c.b()) {
            return lvf.z(ay(mhzVar));
        }
        mhzVar.b.o(mhzVar.c.a, this.J);
        return mhzVar.d == -9223372036854775807L ? mhzVar.b.p(aw(mhzVar), this.a).a() : this.J.f() + lvf.z(mhzVar.d);
    }

    private final long ay(mhz mhzVar) {
        if (mhzVar.b.q()) {
            return lvf.u(this.C);
        }
        boolean z = mhzVar.q;
        long j = mhzVar.t;
        return mhzVar.c.b() ? j : ah(mhzVar.b, mhzVar.c, j);
    }

    private static long az(mhz mhzVar) {
        lrt lrtVar = new lrt();
        lrs lrsVar = new lrs();
        mhzVar.b.o(mhzVar.c.a, lrsVar);
        long j = mhzVar.d;
        return j == -9223372036854775807L ? mhzVar.b.p(lrsVar.c, lrtVar).l : lrsVar.e + j;
    }

    @Override // defpackage.lro
    public final long A() {
        au();
        if (!aa()) {
            return c();
        }
        mhz mhzVar = this.A;
        mtl mtlVar = mhzVar.c;
        mhzVar.b.o(mtlVar.a, this.J);
        return lvf.z(this.J.e(mtlVar.b, mtlVar.c));
    }

    @Override // defpackage.lro
    public final long B() {
        au();
        return this.P;
    }

    @Override // defpackage.lro
    public final long C() {
        au();
        return this.N;
    }

    @Override // defpackage.lro
    public final long D() {
        au();
        return this.O;
    }

    @Override // defpackage.lro
    public final Looper E() {
        return this.k;
    }

    @Override // defpackage.lro
    public final lqz F() {
        au();
        return this.s;
    }

    @Override // defpackage.lro
    public final lri G() {
        au();
        return this.A.p;
    }

    @Override // defpackage.lro
    public final lrk H() {
        au();
        return this.r;
    }

    @Override // defpackage.lro
    public final lru I() {
        au();
        return this.A.b;
    }

    @Override // defpackage.lro
    public final lrz J() {
        au();
        return this.H.c();
    }

    @Override // defpackage.lro
    public final lsb K() {
        au();
        return this.A.j.d;
    }

    @Override // defpackage.lro
    public final lsl L() {
        au();
        return this.y;
    }

    @Override // defpackage.lro
    public final lta M() {
        au();
        return this.x;
    }

    @Override // defpackage.lro
    public final void N(lrm lrmVar) {
        lti.f(lrmVar);
        this.h.b(lrmVar);
    }

    @Override // defpackage.lro
    public final void O(SurfaceView surfaceView) {
        au();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        au();
        if (holder == null || holder != this.aa) {
            return;
        }
        al();
    }

    @Override // defpackage.lro
    public final void P(TextureView textureView) {
        au();
        if (textureView == null || textureView != this.ac) {
            return;
        }
        al();
    }

    @Override // defpackage.lro
    public final void Q() {
        au();
        mdz mdzVar = this.m;
        boolean Y = Y();
        int a = mdzVar.a(Y, 2);
        ar(Y, a, ag(a));
        mhz mhzVar = this.A;
        if (mhzVar.f != 1) {
            return;
        }
        mhz d = mhzVar.d(null);
        mhz f = d.f(true == d.b.q() ? 4 : 2);
        this.o++;
        this.g.e.c(29).b();
        as(f, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.lro
    public final void R(lrm lrmVar) {
        au();
        lti.f(lrmVar);
        lug lugVar = this.h;
        lugVar.g();
        Iterator it = lugVar.c.iterator();
        while (it.hasNext()) {
            luf lufVar = (luf) it.next();
            if (lufVar.a.equals(lrmVar)) {
                lufVar.a(lugVar.b);
                lugVar.c.remove(lufVar);
            }
        }
    }

    @Override // defpackage.lro
    public final void S(boolean z) {
        au();
        int a = this.m.a(z, u());
        ar(z, a, ag(a));
    }

    @Override // defpackage.lro
    public final void T(final int i) {
        au();
        if (this.V != i) {
            this.V = i;
            this.g.e.e(11, i, 0).b();
            this.h.d(8, new lud() { // from class: mfh
                @Override // defpackage.lud
                public final void a(Object obj) {
                    int i2 = mgl.D;
                    ((lrm) obj).v(i);
                }
            });
            aF();
            this.h.c();
        }
    }

    @Override // defpackage.lro
    public final void U(final boolean z) {
        au();
        if (this.W != z) {
            this.W = z;
            this.g.e.e(12, z ? 1 : 0, 0).b();
            this.h.d(9, new lud() { // from class: mfi
                @Override // defpackage.lud
                public final void a(Object obj) {
                    int i = mgl.D;
                    ((lrm) obj).w(z);
                }
            });
            aF();
            this.h.c();
        }
    }

    @Override // defpackage.lro
    public final void V(final lrz lrzVar) {
        au();
        this.H.l();
        if (lrzVar.equals(this.H.c())) {
            return;
        }
        this.H.j(lrzVar);
        this.h.f(19, new lud() { // from class: mfq
            @Override // defpackage.lud
            public final void a(Object obj) {
                int i = mgl.D;
                ((lrm) obj).A(lrz.this);
            }
        });
    }

    @Override // defpackage.lro
    public final void W(SurfaceView surfaceView) {
        au();
        if (surfaceView instanceof mzu) {
            aD();
            aq(surfaceView);
            aE(surfaceView.getHolder());
            return;
        }
        if (surfaceView instanceof nbk) {
            aD();
            this.ab = (nbk) surfaceView;
            mid aC = aC(this.R);
            aC.e(10000);
            aC.d(this.ab);
            aC.c();
            this.ab.a.add(this.Q);
            aq(this.ab.e);
            aE(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        au();
        if (holder == null) {
            al();
            return;
        }
        aD();
        this.u = true;
        this.aa = holder;
        holder.addCallback(this.Q);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            aq(null);
            am(0, 0);
        } else {
            aq(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            am(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // defpackage.lro
    public final void X(TextureView textureView) {
        au();
        if (textureView == null) {
            al();
            return;
        }
        aD();
        this.ac = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            luj.f("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.Q);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            aq(null);
            am(0, 0);
        } else {
            ap(surfaceTexture);
            am(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // defpackage.lro
    public final boolean Y() {
        au();
        return this.A.m;
    }

    @Override // defpackage.lro
    public final boolean Z() {
        au();
        return this.W;
    }

    @Override // defpackage.lro
    public final int aG() {
        au();
        if (aa()) {
            return this.A.c.b;
        }
        return -1;
    }

    @Override // defpackage.lro
    public final int aH() {
        au();
        if (aa()) {
            return this.A.c.c;
        }
        return -1;
    }

    @Override // defpackage.lro
    public final int aI() {
        au();
        int aw = aw(this.A);
        if (aw == -1) {
            return 0;
        }
        return aw;
    }

    @Override // defpackage.lro
    public final int aJ() {
        au();
        if (this.A.b.q()) {
            return 0;
        }
        mhz mhzVar = this.A;
        return mhzVar.b.a(mhzVar.c.a);
    }

    @Override // defpackage.lro
    public final boolean aa() {
        au();
        return this.A.c.b();
    }

    @Override // defpackage.lro
    public final void ac(final lpk lpkVar) {
        au();
        if (this.aj) {
            return;
        }
        lpk lpkVar2 = this.af;
        int i = lvf.a;
        if (!Objects.equals(lpkVar2, lpkVar)) {
            this.af = lpkVar;
            an(1, 3, lpkVar);
            this.h.d(20, new lud() { // from class: mfo
                @Override // defpackage.lud
                public final void a(Object obj) {
                    int i2 = mgl.D;
                    ((lrm) obj).a(lpk.this);
                }
            });
        }
        this.g.e(this.af);
        this.m.d(lpkVar);
        boolean Y = Y();
        int a = this.m.a(Y, u());
        ar(Y, a, ag(a));
        this.h.c();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void ad(miu miuVar) {
        ((mlh) this.j).d.b(miuVar);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void ae() {
        luj.e("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.0-beta01] [" + lvf.b + "] [" + lqx.a() + "]");
        au();
        this.S.a(false);
        this.T.a(false);
        mdz mdzVar = this.m;
        mdzVar.b = null;
        mdzVar.b();
        mdzVar.e(0);
        if (!this.g.f()) {
            this.h.f(10, new lud() { // from class: mff
                @Override // defpackage.lud
                public final void a(Object obj) {
                    int i = mgl.D;
                    ((lrm) obj).p(new mel(2, new mgy(1), 1003));
                }
            });
        }
        this.h.e();
        this.f.h();
        ((mxv) this.M).g.a(this.j);
        boolean z = this.A.q;
        mhz f = this.A.f(1);
        this.A = f;
        mhz a = f.a(f.c);
        this.A = a;
        a.r = a.t;
        this.A.s = 0L;
        final mlh mlhVar = (mlh) this.j;
        lua luaVar = mlhVar.f;
        lti.g(luaVar);
        luaVar.b(new Runnable() { // from class: mkt
            @Override // java.lang.Runnable
            public final void run() {
                mlh mlhVar2 = mlh.this;
                mlhVar2.J(mlhVar2.E(), 1028, new lud() { // from class: mix
                    @Override // defpackage.lud
                    public final void a(Object obj) {
                    }
                });
                mlhVar2.d.e();
            }
        });
        aD();
        Surface surface = this.Z;
        if (surface != null) {
            surface.release();
            this.Z = null;
        }
        this.x = lta.a;
        this.aj = true;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void af(mtn mtnVar, long j) {
        au();
        av(Collections.singletonList(mtnVar), j);
    }

    public final long ah(lru lruVar, mtl mtlVar, long j) {
        lruVar.o(mtlVar.a, this.J);
        return j + this.J.e;
    }

    public final lqz ai() {
        lru I = I();
        if (I.q()) {
            return this.z;
        }
        lqw lqwVar = I.p(aI(), this.a).d;
        lqy lqyVar = new lqy(this.z);
        lqz lqzVar = lqwVar.d;
        if (lqzVar != null) {
            CharSequence charSequence = lqzVar.b;
            if (charSequence != null) {
                lqyVar.a = charSequence;
            }
            CharSequence charSequence2 = lqzVar.c;
            if (charSequence2 != null) {
                lqyVar.b = charSequence2;
            }
            CharSequence charSequence3 = lqzVar.d;
            if (charSequence3 != null) {
                lqyVar.c = charSequence3;
            }
            CharSequence charSequence4 = lqzVar.e;
            if (charSequence4 != null) {
                lqyVar.d = charSequence4;
            }
            CharSequence charSequence5 = lqzVar.f;
            if (charSequence5 != null) {
                lqyVar.e = charSequence5;
            }
            byte[] bArr = lqzVar.g;
            if (bArr != null) {
                Integer num = lqzVar.h;
                lqyVar.f = (byte[]) bArr.clone();
                lqyVar.g = num;
            }
            Integer num2 = lqzVar.i;
            if (num2 != null) {
                lqyVar.h = num2;
            }
            Integer num3 = lqzVar.j;
            if (num3 != null) {
                lqyVar.i = num3;
            }
            Integer num4 = lqzVar.k;
            if (num4 != null) {
                lqyVar.j = num4;
            }
            Boolean bool = lqzVar.l;
            if (bool != null) {
                lqyVar.k = bool;
            }
            Integer num5 = lqzVar.m;
            if (num5 != null) {
                lqyVar.l = num5;
            }
            Integer num6 = lqzVar.n;
            if (num6 != null) {
                lqyVar.l = num6;
            }
            Integer num7 = lqzVar.o;
            if (num7 != null) {
                lqyVar.m = num7;
            }
            Integer num8 = lqzVar.p;
            if (num8 != null) {
                lqyVar.n = num8;
            }
            Integer num9 = lqzVar.q;
            if (num9 != null) {
                lqyVar.o = num9;
            }
            Integer num10 = lqzVar.r;
            if (num10 != null) {
                lqyVar.p = num10;
            }
            Integer num11 = lqzVar.s;
            if (num11 != null) {
                lqyVar.q = num11;
            }
            CharSequence charSequence6 = lqzVar.t;
            if (charSequence6 != null) {
                lqyVar.r = charSequence6;
            }
            CharSequence charSequence7 = lqzVar.u;
            if (charSequence7 != null) {
                lqyVar.s = charSequence7;
            }
            CharSequence charSequence8 = lqzVar.v;
            if (charSequence8 != null) {
                lqyVar.t = charSequence8;
            }
            Integer num12 = lqzVar.w;
            if (num12 != null) {
                lqyVar.u = num12;
            }
            Integer num13 = lqzVar.x;
            if (num13 != null) {
                lqyVar.v = num13;
            }
            CharSequence charSequence9 = lqzVar.y;
            if (charSequence9 != null) {
                lqyVar.w = charSequence9;
            }
            CharSequence charSequence10 = lqzVar.z;
            if (charSequence10 != null) {
                lqyVar.x = charSequence10;
            }
            Integer num14 = lqzVar.A;
            if (num14 != null) {
                lqyVar.y = num14;
            }
            if (!lqzVar.B.isEmpty()) {
                lqyVar.z = engw.n(lqzVar.B);
            }
        }
        return new lqz(lqyVar);
    }

    @Override // defpackage.lro
    /* renamed from: aj, reason: merged with bridge method [inline-methods] */
    public final mel ab() {
        au();
        return this.A.g;
    }

    public final List ak(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((enou) list).c; i++) {
            arrayList.add(this.L.b((lqw) list.get(i)));
        }
        return arrayList;
    }

    public final void al() {
        au();
        aD();
        aq(null);
        am(0, 0);
    }

    public final void am(final int i, final int i2) {
        lux luxVar = this.ae;
        if (i == luxVar.c && i2 == luxVar.d) {
            return;
        }
        this.ae = new lux(i, i2);
        this.h.f(24, new lud() { // from class: mfe
            @Override // defpackage.lud
            public final void a(Object obj) {
                int i3 = mgl.D;
                ((lrm) obj).y(i, i2);
            }
        });
        an(2, 14, new lux(i, i2));
    }

    public final void an(int i, int i2, Object obj) {
        for (mig migVar : this.F) {
            if (i == -1 || migVar.eL() == i) {
                mid aC = aC(migVar);
                aC.e(i2);
                aC.d(obj);
                aC.c();
            }
        }
        for (mig migVar2 : this.G) {
            if (migVar2 != null && (i == -1 || migVar2.eL() == i)) {
                mid aC2 = aC(migVar2);
                aC2.e(i2);
                aC2.d(obj);
                aC2.c();
            }
        }
    }

    public final void ao(List list, int i, long j, boolean z) {
        long j2;
        int i2 = i;
        int aw = aw(this.A);
        long z2 = z();
        this.o++;
        if (!this.i.isEmpty()) {
            int size = this.i.size();
            for (int i3 = size - 1; i3 >= 0; i3--) {
                this.i.remove(i3);
            }
            mvf mvfVar = this.al;
            int[] iArr = new int[mvfVar.b.length - size];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = mvfVar.b;
                if (i4 >= iArr2.length) {
                    break;
                }
                int i6 = iArr2[i4];
                if (i6 < 0 || i6 >= size) {
                    int i7 = i4 - i5;
                    if (i6 >= 0) {
                        i6 -= size;
                    }
                    iArr[i7] = i6;
                } else {
                    i5++;
                }
                i4++;
            }
            this.al = new mvf(iArr, new Random(mvfVar.a.nextLong()));
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            mhw mhwVar = new mhw((mtn) list.get(i8), this.K);
            arrayList.add(mhwVar);
            this.i.add(i8, new mgk(mhwVar.b, mhwVar.a));
        }
        this.al = this.al.b(arrayList.size());
        mif mifVar = new mif(this.i, this.al);
        if (!mifVar.q() && i2 >= mifVar.b) {
            throw new lqi();
        }
        if (z) {
            i2 = mifVar.g(this.W);
            j2 = -9223372036854775807L;
        } else if (i2 == -1) {
            i2 = aw;
            j2 = z2;
        } else {
            j2 = j;
        }
        mhz aB = aB(this.A, mifVar, aA(mifVar, i2, j2));
        int i9 = aB.f;
        if (i2 != -1 && i9 != 1) {
            i9 = 4;
            if (!mifVar.q() && i2 < mifVar.b) {
                i9 = 2;
            }
        }
        mhz f = aB.f(i9);
        this.g.e.d(17, new mgs(arrayList, this.al, i2, lvf.u(j2))).b();
        as(f, 0, (this.A.c.a.equals(f.c.a) || this.A.b.q()) ? false : true, 4, ay(f), -1, false);
    }

    public final void ap(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        aq(surface);
        this.Z = surface;
    }

    public final void aq(Object obj) {
        Object obj2 = this.t;
        boolean z = false;
        if (obj2 != null && obj2 != obj) {
            z = true;
        }
        boolean g = this.g.g(obj, z ? this.U : -9223372036854775807L);
        if (z) {
            Object obj3 = this.t;
            Surface surface = this.Z;
            if (obj3 == surface) {
                surface.release();
                this.Z = null;
            }
        }
        this.t = obj;
        if (g) {
            return;
        }
        mel melVar = new mel(2, new mgy(3), 1003);
        mhz mhzVar = this.A;
        mhz a = mhzVar.a(mhzVar.c);
        a.r = a.t;
        a.s = 0L;
        mhz d = a.f(1).d(melVar);
        this.o++;
        this.g.e.c(6).b();
        as(d, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    public final void ar(boolean z, int i, int i2) {
        ?? r13 = (!z || i == -1) ? 0 : 1;
        int i3 = i == 0 ? 1 : 0;
        mhz mhzVar = this.A;
        if (mhzVar.m == r13 && mhzVar.o == i3 && mhzVar.n == i2) {
            return;
        }
        this.o++;
        boolean z2 = mhzVar.q;
        mhz c = mhzVar.c(r13, i2, i3);
        this.g.e.e(1, r13, i2 | (i3 << 4)).b();
        as(c, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void as(final defpackage.mhz r30, final int r31, boolean r32, int r33, long r34, int r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgl.as(mhz, int, boolean, int, long, int, boolean):void");
    }

    public final void at() {
        int u = u();
        if (u != 2 && u != 3) {
            this.S.a(false);
            this.T.a(false);
        } else {
            au();
            boolean z = this.A.q;
            this.S.a(Y());
            this.T.a(Y());
        }
    }

    public final void au() {
        this.E.b();
        if (Thread.currentThread() != this.k.getThread()) {
            String G = lvf.G("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.k.getThread().getName());
            if (this.ag) {
                throw new IllegalStateException(G);
            }
            luj.g("ExoPlayerImpl", G, this.ah ? null : new IllegalStateException());
            this.ah = true;
        }
    }

    public final void av(List list, long j) {
        au();
        ao(list, 0, j, false);
    }

    @Override // defpackage.lpm
    protected final void s(int i, long j, boolean z) {
        au();
        if (i == -1) {
            return;
        }
        lti.a(i >= 0);
        lru lruVar = this.A.b;
        if (lruVar.q() || i < lruVar.c()) {
            mlh mlhVar = (mlh) this.j;
            if (!mlhVar.g) {
                mis E = mlhVar.E();
                mlhVar.g = true;
                mlhVar.J(E, -1, new lud() { // from class: mko
                    @Override // defpackage.lud
                    public final void a(Object obj) {
                    }
                });
            }
            this.o++;
            if (aa()) {
                luj.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                mgv mgvVar = new mgv(this.A);
                mgvVar.a(1);
                this.ak.a(mgvVar);
                return;
            }
            mhz mhzVar = this.A;
            int i2 = mhzVar.f;
            if (i2 == 3 || (i2 == 4 && !lruVar.q())) {
                mhzVar = this.A.f(2);
            }
            int aI = aI();
            mhz aB = aB(mhzVar, lruVar, aA(lruVar, i, j));
            this.g.e.d(3, new mgw(lruVar, i, lvf.u(j))).b();
            as(aB, 0, true, 1, ay(aB), aI, z);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        au();
        an(4, 15, imageOutput);
    }

    @Override // defpackage.lro
    public final int u() {
        au();
        return this.A.f;
    }

    @Override // defpackage.lro
    public final int v() {
        au();
        return this.A.o;
    }

    @Override // defpackage.lro
    public final int w() {
        au();
        return this.V;
    }

    @Override // defpackage.lro
    public final long x() {
        au();
        if (this.A.b.q()) {
            return this.C;
        }
        mhz mhzVar = this.A;
        if (mhzVar.l.d != mhzVar.c.d) {
            return mhzVar.b.p(aI(), this.a).b();
        }
        long j = mhzVar.r;
        if (this.A.l.b()) {
            mhz mhzVar2 = this.A;
            mhzVar2.b.o(mhzVar2.l.a, this.J).h(this.A.l.b);
            j = 0;
        }
        mhz mhzVar3 = this.A;
        return lvf.z(ah(mhzVar3.b, mhzVar3.l, j));
    }

    @Override // defpackage.lro
    public final long y() {
        au();
        return ax(this.A);
    }

    @Override // defpackage.lro
    public final long z() {
        au();
        return lvf.z(ay(this.A));
    }
}
