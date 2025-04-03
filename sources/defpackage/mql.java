package defpackage;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mql extends mea {
    private mqk A;
    private int B;
    private boolean C;
    private final mqe j;
    private final lxz k;
    private final ArrayDeque l;
    private boolean m;
    private boolean n;
    private mqj o;
    private long p;
    private long q;
    private int r;
    private int s;
    private lqc t;
    private mqf u;
    private lxz v;
    private ImageOutput w;
    private Bitmap x;
    private boolean y;
    private mqk z;

    public mql(mqe mqeVar) {
        super(4);
        this.j = mqeVar;
        this.w = W(null);
        this.k = new lxz(0);
        this.o = mqj.a;
        this.l = new ArrayDeque();
        this.q = -9223372036854775807L;
        this.p = -9223372036854775807L;
        this.r = 0;
        this.s = 1;
    }

    private static ImageOutput W(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.a : imageOutput;
    }

    private final void X() {
        this.v = null;
        this.r = 0;
        this.q = -9223372036854775807L;
        mqf mqfVar = this.u;
        if (mqfVar != null) {
            mqfVar.e();
            this.u = null;
        }
    }

    private final void Y() {
        this.s = Math.min(this.s, 1);
    }

    private final void Z() {
        if (this.C) {
            lqc lqcVar = this.t;
            lti.f(lqcVar);
            int a = this.j.a(lqcVar);
            if (a != mih.a(4) && a != mih.a(3)) {
                throw h(new mqg(), this.t, 4005);
            }
            mqf mqfVar = this.u;
            if (mqfVar != null) {
                mqfVar.e();
            }
            this.u = new mqd();
            this.C = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r5) goto L15;
     */
    @Override // defpackage.mea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void B(defpackage.lqc[] r5, long r6, long r8, defpackage.mtl r10) {
        /*
            r4 = this;
            mqj r5 = r4.o
            long r5 = r5.c
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L33
            java.util.ArrayDeque r5 = r4.l
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L26
            long r5 = r4.q
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L33
            long r2 = r4.p
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L26
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L26
            goto L33
        L26:
            java.util.ArrayDeque r5 = r4.l
            mqj r6 = new mqj
            long r0 = r4.q
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L33:
            mqj r5 = new mqj
            r5.<init>(r0, r8)
            r4.o = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mql.B(lqc[], long, long, mtl):void");
    }

    @Override // defpackage.mig, defpackage.mij
    public final String R() {
        return "ImageRenderer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x00df, code lost:
    
        if (r14 != 2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f3, code lost:
    
        if (r11 == false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0197 A[Catch: mqg -> 0x023f, TryCatch #0 {mqg -> 0x023f, blocks: (B:18:0x0042, B:19:0x0047, B:21:0x004e, B:26:0x0125, B:28:0x0129, B:32:0x023b, B:34:0x012f, B:36:0x0137, B:38:0x013b, B:40:0x013f, B:42:0x0143, B:45:0x014d, B:103:0x0151, B:47:0x0169, B:50:0x0174, B:52:0x017f, B:57:0x0197, B:58:0x01a6, B:60:0x01b1, B:61:0x01fb, B:74:0x0206, B:63:0x020b, B:65:0x021c, B:66:0x0227, B:72:0x021f, B:75:0x01b4, B:77:0x01c6, B:79:0x01cf, B:82:0x01d8, B:84:0x01dc, B:89:0x01e7, B:93:0x01f5, B:94:0x0188, B:100:0x022c, B:107:0x0054, B:109:0x0058, B:113:0x005e, B:115:0x006b, B:119:0x0071, B:121:0x0075, B:122:0x0082, B:124:0x008d, B:117:0x0091, B:126:0x009f, B:128:0x00a3, B:130:0x00a7, B:132:0x00ab, B:134:0x00ba, B:135:0x00c1, B:144:0x00d9, B:145:0x00de, B:146:0x00e5, B:147:0x00f8, B:149:0x0100, B:151:0x010e, B:153:0x0119), top: B:17:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b1 A[Catch: mqg -> 0x023f, TryCatch #0 {mqg -> 0x023f, blocks: (B:18:0x0042, B:19:0x0047, B:21:0x004e, B:26:0x0125, B:28:0x0129, B:32:0x023b, B:34:0x012f, B:36:0x0137, B:38:0x013b, B:40:0x013f, B:42:0x0143, B:45:0x014d, B:103:0x0151, B:47:0x0169, B:50:0x0174, B:52:0x017f, B:57:0x0197, B:58:0x01a6, B:60:0x01b1, B:61:0x01fb, B:74:0x0206, B:63:0x020b, B:65:0x021c, B:66:0x0227, B:72:0x021f, B:75:0x01b4, B:77:0x01c6, B:79:0x01cf, B:82:0x01d8, B:84:0x01dc, B:89:0x01e7, B:93:0x01f5, B:94:0x0188, B:100:0x022c, B:107:0x0054, B:109:0x0058, B:113:0x005e, B:115:0x006b, B:119:0x0071, B:121:0x0075, B:122:0x0082, B:124:0x008d, B:117:0x0091, B:126:0x009f, B:128:0x00a3, B:130:0x00a7, B:132:0x00ab, B:134:0x00ba, B:135:0x00c1, B:144:0x00d9, B:145:0x00de, B:146:0x00e5, B:147:0x00f8, B:149:0x0100, B:151:0x010e, B:153:0x0119), top: B:17:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020b A[Catch: mqg -> 0x023f, TryCatch #0 {mqg -> 0x023f, blocks: (B:18:0x0042, B:19:0x0047, B:21:0x004e, B:26:0x0125, B:28:0x0129, B:32:0x023b, B:34:0x012f, B:36:0x0137, B:38:0x013b, B:40:0x013f, B:42:0x0143, B:45:0x014d, B:103:0x0151, B:47:0x0169, B:50:0x0174, B:52:0x017f, B:57:0x0197, B:58:0x01a6, B:60:0x01b1, B:61:0x01fb, B:74:0x0206, B:63:0x020b, B:65:0x021c, B:66:0x0227, B:72:0x021f, B:75:0x01b4, B:77:0x01c6, B:79:0x01cf, B:82:0x01d8, B:84:0x01dc, B:89:0x01e7, B:93:0x01f5, B:94:0x0188, B:100:0x022c, B:107:0x0054, B:109:0x0058, B:113:0x005e, B:115:0x006b, B:119:0x0071, B:121:0x0075, B:122:0x0082, B:124:0x008d, B:117:0x0091, B:126:0x009f, B:128:0x00a3, B:130:0x00a7, B:132:0x00ab, B:134:0x00ba, B:135:0x00c1, B:144:0x00d9, B:145:0x00de, B:146:0x00e5, B:147:0x00f8, B:149:0x0100, B:151:0x010e, B:153:0x0119), top: B:17:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b4 A[Catch: mqg -> 0x023f, TryCatch #0 {mqg -> 0x023f, blocks: (B:18:0x0042, B:19:0x0047, B:21:0x004e, B:26:0x0125, B:28:0x0129, B:32:0x023b, B:34:0x012f, B:36:0x0137, B:38:0x013b, B:40:0x013f, B:42:0x0143, B:45:0x014d, B:103:0x0151, B:47:0x0169, B:50:0x0174, B:52:0x017f, B:57:0x0197, B:58:0x01a6, B:60:0x01b1, B:61:0x01fb, B:74:0x0206, B:63:0x020b, B:65:0x021c, B:66:0x0227, B:72:0x021f, B:75:0x01b4, B:77:0x01c6, B:79:0x01cf, B:82:0x01d8, B:84:0x01dc, B:89:0x01e7, B:93:0x01f5, B:94:0x0188, B:100:0x022c, B:107:0x0054, B:109:0x0058, B:113:0x005e, B:115:0x006b, B:119:0x0071, B:121:0x0075, B:122:0x0082, B:124:0x008d, B:117:0x0091, B:126:0x009f, B:128:0x00a3, B:130:0x00a7, B:132:0x00ab, B:134:0x00ba, B:135:0x00c1, B:144:0x00d9, B:145:0x00de, B:146:0x00e5, B:147:0x00f8, B:149:0x0100, B:151:0x010e, B:153:0x0119), top: B:17:0x0042 }] */
    @Override // defpackage.mig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(long r18, long r20) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mql.S(long, long):void");
    }

    @Override // defpackage.mig
    public final boolean T() {
        return this.n;
    }

    @Override // defpackage.mig
    public final boolean U() {
        int i = this.s;
        if (i != 3) {
            return i == 0 && this.y;
        }
        return true;
    }

    @Override // defpackage.mij
    public final int V(lqc lqcVar) {
        return this.j.a(lqcVar);
    }

    @Override // defpackage.mea, defpackage.mic
    public final void r(int i, Object obj) {
        if (i != 15) {
            return;
        }
        this.w = W(obj instanceof ImageOutput ? (ImageOutput) obj : null);
    }

    @Override // defpackage.mea
    protected final void u() {
        this.t = null;
        this.o = mqj.a;
        this.l.clear();
        X();
        this.w.a();
    }

    @Override // defpackage.mea
    protected final void v(boolean z, boolean z2) {
        this.s = z2 ? 1 : 0;
    }

    @Override // defpackage.mea
    protected final void w(long j, boolean z) {
        Y();
        this.n = false;
        this.m = false;
        this.x = null;
        this.z = null;
        this.A = null;
        this.y = false;
        this.v = null;
        mqf mqfVar = this.u;
        if (mqfVar != null) {
            mqfVar.c();
        }
        this.l.clear();
    }

    @Override // defpackage.mea
    protected final void x() {
        X();
    }

    @Override // defpackage.mea
    protected final void y() {
        X();
        Y();
    }
}
