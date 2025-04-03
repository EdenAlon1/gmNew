package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j$.util.Objects;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvz extends mea implements Handler.Callback {
    private IOException A;
    private final mgi B;
    public long j;
    private final lxz k;
    private mvr l;
    private final mvy m;
    private boolean n;
    private int o;
    private njx p;
    private nkc q;
    private nkd r;
    private nkd s;
    private int t;
    private final Handler u;
    private final mgz v;
    private boolean w;
    private boolean x;
    private lqc y;
    private long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvz(mgi mgiVar, Looper looper) {
        super(3);
        Handler handler;
        mvy mvyVar = mvy.b;
        lti.f(mgiVar);
        this.B = mgiVar;
        if (looper == null) {
            handler = null;
        } else {
            int i = lvf.a;
            handler = new Handler(looper, this);
        }
        this.u = handler;
        this.m = mvyVar;
        this.k = new lxz(1);
        this.v = new mgz();
        this.j = -9223372036854775807L;
        this.z = -9223372036854775807L;
    }

    private final long W() {
        if (this.t == -1) {
            return Long.MAX_VALUE;
        }
        lti.f(this.r);
        if (this.t < this.r.a()) {
            return this.r.c(this.t);
        }
        return Long.MAX_VALUE;
    }

    private final void X() {
        boolean z = true;
        if (!Objects.equals(this.y.o, "application/cea-608") && !Objects.equals(this.y.o, "application/x-mp4-cea-608") && !Objects.equals(this.y.o, "application/cea-708")) {
            z = false;
        }
        lti.d(z, "Legacy decoding is disabled, can't handle " + this.y.o + " samples (expected application/x-media3-cues).");
    }

    private final void Y() {
        int i = engw.d;
        engw engwVar = enou.a;
        ai(this.z);
        af(new lta(engwVar));
    }

    private final void Z(njy njyVar) {
        luj.d("TextRenderer", "Subtitle decoding failed. streamFormat=".concat(String.valueOf(String.valueOf(this.y))), njyVar);
        Y();
        ae();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aa() {
        /*
            r6 = this;
            r0 = 1
            r6.n = r0
            lqc r1 = r6.y
            defpackage.lti.f(r1)
            java.lang.String r2 = r1.o
            if (r2 == 0) goto L5a
            int r3 = r2.hashCode()
            r4 = 930165504(0x37713300, float:1.4376594E-5)
            r5 = 2
            if (r3 == r4) goto L35
            r4 = 1566015601(0x5d578071, float:9.7053348E17)
            if (r3 == r4) goto L2b
            r4 = 1566016562(0x5d578432, float:9.7059952E17)
            if (r3 == r4) goto L21
            goto L3f
        L21:
            java.lang.String r3 = "application/cea-708"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L3f
            r3 = r5
            goto L40
        L2b:
            java.lang.String r3 = "application/cea-608"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L3f
            r3 = 0
            goto L40
        L35:
            java.lang.String r3 = "application/x-mp4-cea-608"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L3f
            r3 = r0
            goto L40
        L3f:
            r3 = -1
        L40:
            if (r3 == 0) goto L51
            if (r3 == r0) goto L51
            if (r3 == r5) goto L47
            goto L5a
        L47:
            int r0 = r1.J
            java.util.List r1 = r1.r
            nku r2 = new nku
            r2.<init>(r0, r1)
            goto L78
        L51:
            int r0 = r1.J
            nkp r1 = new nkp
            r1.<init>(r2, r0)
            r2 = r1
            goto L78
        L5a:
            mvy r0 = r6.m
            mvx r0 = (defpackage.mvx) r0
            njs r3 = r0.a
            boolean r3 = r3.c(r1)
            if (r3 == 0) goto L80
            njs r0 = r0.a
            nkj r0 = r0.b(r1)
            mvs r2 = new mvs
            java.lang.Class r1 = r0.getClass()
            r1.getSimpleName()
            r2.<init>(r0)
        L78:
            r6.p = r2
            long r0 = r6.f
            r2.f(r0)
            return
        L80:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvz.aa():void");
    }

    private final void ab(final lta ltaVar) {
        final engw engwVar = ltaVar.b;
        this.B.a.h.f(27, new lud() { // from class: mgf
            @Override // defpackage.lud
            public final void a(Object obj) {
                int i = mgi.b;
                ((lrm) obj).e(engwVar);
            }
        });
        mgl mglVar = this.B.a;
        mglVar.x = ltaVar;
        mglVar.h.f(27, new lud() { // from class: mgb
            @Override // defpackage.lud
            public final void a(Object obj) {
                int i = mgi.b;
                ((lrm) obj).d(lta.this);
            }
        });
    }

    private final void ac() {
        this.q = null;
        this.t = -1;
        nkd nkdVar = this.r;
        if (nkdVar != null) {
            nkdVar.h();
            this.r = null;
        }
        nkd nkdVar2 = this.s;
        if (nkdVar2 != null) {
            nkdVar2.h();
            this.s = null;
        }
    }

    private final void ad() {
        ac();
        njx njxVar = this.p;
        lti.f(njxVar);
        njxVar.e();
        this.p = null;
        this.o = 0;
    }

    private final void ae() {
        ad();
        aa();
    }

    private final void af(lta ltaVar) {
        Handler handler = this.u;
        if (handler != null) {
            handler.obtainMessage(1, ltaVar).sendToTarget();
        } else {
            ab(ltaVar);
        }
    }

    private static boolean ag(njw njwVar, long j) {
        return njwVar == null || njwVar.c(njwVar.a() + (-1)) <= j;
    }

    private static boolean ah(lqc lqcVar) {
        return Objects.equals(lqcVar.o, "application/x-media3-cues");
    }

    private static final void ai(long j) {
        lti.c(j != -9223372036854775807L);
    }

    @Override // defpackage.mea
    protected final void B(lqc[] lqcVarArr, long j, long j2, mtl mtlVar) {
        lqc lqcVar = lqcVarArr[0];
        this.y = lqcVar;
        if (ah(lqcVar)) {
            this.l = this.y.K == 1 ? new mvv() : new mvw();
            return;
        }
        X();
        if (this.p != null) {
            this.o = 1;
        } else {
            aa();
        }
    }

    @Override // defpackage.mig, defpackage.mij
    public final String R() {
        return "TextRenderer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x018b, code lost:
    
        if (r11 != false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d3 A[EXC_TOP_SPLITTER, LOOP:2: B:70:0x01d3->B:90:0x01d3, LOOP_START, SYNTHETIC] */
    @Override // defpackage.mig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(long r9, long r11) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvz.S(long, long):void");
    }

    @Override // defpackage.mig
    public final boolean T() {
        return this.x;
    }

    @Override // defpackage.mig
    public final boolean U() {
        if (this.y == null) {
            return true;
        }
        if (this.A == null) {
            try {
                t();
            } catch (IOException e) {
                this.A = e;
            }
        }
        if (this.A != null) {
            lqc lqcVar = this.y;
            lti.f(lqcVar);
            if (ah(lqcVar)) {
                mvr mvrVar = this.l;
                lti.f(mvrVar);
                return mvrVar.a(this.z) != Long.MIN_VALUE;
            }
            if (this.x || (this.w && ag(this.r, this.z) && ag(this.s, this.z) && this.q != null)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.mij
    public final int V(lqc lqcVar) {
        if (!ah(lqcVar)) {
            mvy mvyVar = this.m;
            String str = lqcVar.o;
            if (!((mvx) mvyVar).a.c(lqcVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return mih.a(lre.k(lqcVar.o) ? 1 : 0);
            }
        }
        return mih.a(lqcVar.M == 0 ? 4 : 2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        ab((lta) message.obj);
        return true;
    }

    @Override // defpackage.mea
    protected final void u() {
        this.y = null;
        this.j = -9223372036854775807L;
        Y();
        this.z = -9223372036854775807L;
        if (this.p != null) {
            ad();
        }
    }

    @Override // defpackage.mea
    protected final void w(long j, boolean z) {
        this.z = j;
        mvr mvrVar = this.l;
        if (mvrVar != null) {
            mvrVar.d();
        }
        Y();
        this.w = false;
        this.x = false;
        this.j = -9223372036854775807L;
        lqc lqcVar = this.y;
        if (lqcVar == null || ah(lqcVar)) {
            return;
        }
        if (this.o != 0) {
            ae();
            return;
        }
        ac();
        njx njxVar = this.p;
        lti.f(njxVar);
        njxVar.c();
        njxVar.f(this.f);
    }
}
