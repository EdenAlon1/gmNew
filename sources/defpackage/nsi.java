package defpackage;

import android.os.Looper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nsi implements npd, npc {
    public final List a;
    public final npb b;
    public final npa c;
    public final lua d;
    public final Map e;
    public final engr f;
    public final AtomicInteger g;
    public boolean h;
    public int i;
    public npd j;
    public boolean k;
    public int l;
    public volatile boolean m;
    public volatile long n;
    public volatile long o;
    public volatile boolean p;
    private final npc q;
    private final Map r;
    private final AtomicInteger s;
    private boolean t;
    private boolean u;
    private int v;
    private volatile long w;

    static {
        lqb lqbVar = new lqb();
        lqbVar.c("audio/mp4a-latm");
        lqbVar.D = 44100;
        lqbVar.C = 2;
        new lqc(lqbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nsi(nqn nqnVar, npb npbVar, npa npaVar, npc npcVar, ltn ltnVar, Looper looper) {
        engw engwVar = nqnVar.a;
        this.a = engwVar;
        boolean z = nqnVar.b;
        nsd nsdVar = new nsd(this, npbVar);
        this.b = nsdVar;
        this.c = npaVar;
        this.q = npcVar;
        this.d = ltnVar.b(looper, null);
        this.r = new HashMap();
        this.e = new HashMap();
        this.f = new engr();
        this.s = new AtomicInteger();
        this.g = new AtomicInteger();
        this.h = true;
        this.j = nsdVar.a((nql) engwVar.get(0), looper, this, npaVar);
    }

    private final void l(int i, lqc lqcVar) {
        nry nryVar = (nry) this.e.get(Integer.valueOf(i));
        if (nryVar == null) {
            return;
        }
        nql nqlVar = (nql) this.a.get(this.i);
        long j = this.w;
        if (true == nqlVar.b()) {
            lqcVar = null;
        }
        nryVar.e(nqlVar, j, lqcVar, k());
    }

    @Override // defpackage.npc
    public final void a(long j) {
        if (j == -9223372036854775807L) {
            r3 = k();
            j = -9223372036854775807L;
        }
        lti.b(r3, "Could not retrieve required duration for EditedMediaItem " + this.i);
        this.n = ((nql) this.a.get(this.i)).a(j);
        this.w = j;
        int i = ((enou) this.a).c;
    }

    @Override // defpackage.npc
    public final void b(nrd nrdVar) {
        this.q.b(nrdVar);
    }

    @Override // defpackage.npc
    public final void c(int i) {
        this.s.set(i);
        this.g.set(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02f4 A[Catch: all -> 0x0319, TryCatch #0 {, blocks: (B:42:0x00a4, B:44:0x00d8, B:45:0x00e2, B:47:0x00ea, B:49:0x0101, B:52:0x0114, B:54:0x0125, B:57:0x0296, B:59:0x029b, B:61:0x02a3, B:67:0x02c9, B:69:0x02d7, B:73:0x02df, B:75:0x02e6, B:77:0x02f4, B:80:0x0303, B:81:0x0310, B:88:0x0307, B:90:0x0136, B:92:0x0156, B:95:0x0167, B:98:0x016e, B:101:0x017d, B:103:0x0181, B:106:0x018a, B:108:0x018e, B:111:0x0197, B:114:0x01b3, B:118:0x01bf, B:120:0x01cb, B:122:0x01eb, B:125:0x01fd, B:128:0x020d, B:131:0x0213, B:133:0x0217, B:135:0x021f, B:138:0x022b, B:140:0x0233, B:143:0x023f, B:146:0x0249, B:148:0x0276, B:151:0x0282), top: B:41:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0307 A[Catch: all -> 0x0319, TryCatch #0 {, blocks: (B:42:0x00a4, B:44:0x00d8, B:45:0x00e2, B:47:0x00ea, B:49:0x0101, B:52:0x0114, B:54:0x0125, B:57:0x0296, B:59:0x029b, B:61:0x02a3, B:67:0x02c9, B:69:0x02d7, B:73:0x02df, B:75:0x02e6, B:77:0x02f4, B:80:0x0303, B:81:0x0310, B:88:0x0307, B:90:0x0136, B:92:0x0156, B:95:0x0167, B:98:0x016e, B:101:0x017d, B:103:0x0181, B:106:0x018a, B:108:0x018e, B:111:0x0197, B:114:0x01b3, B:118:0x01bf, B:120:0x01cb, B:122:0x01eb, B:125:0x01fd, B:128:0x020d, B:131:0x0213, B:133:0x0217, B:135:0x021f, B:138:0x022b, B:140:0x0233, B:143:0x023f, B:146:0x0249, B:148:0x0276, B:151:0x0282), top: B:41:0x00a4 }] */
    @Override // defpackage.npc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.lqc r14, int r15) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsi.d(lqc, int):boolean");
    }

    @Override // defpackage.npd
    public final int e(nrz nrzVar) {
        int e = this.j.e(nrzVar);
        int i = ((enou) this.a).c;
        if (i == 1 || e == 0) {
            return e;
        }
        int i2 = (this.i * 100) / i;
        if (e == 2) {
            i2 += nrzVar.a / i;
        }
        nrzVar.a = i2;
        return 2;
    }

    @Override // defpackage.npd
    public final enhk f() {
        return this.j.f();
    }

    @Override // defpackage.npd
    public final void g() {
        this.j.g();
        this.m = true;
    }

    @Override // defpackage.npd
    public final void h() {
        this.j.h();
        int i = ((enou) this.a).c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0361 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f8 A[Catch: all -> 0x0376, TryCatch #3 {all -> 0x0376, blocks: (B:56:0x00f9, B:58:0x0285, B:60:0x0292, B:62:0x0297, B:68:0x02ce, B:71:0x02e1, B:73:0x02f8, B:74:0x030a, B:75:0x031d, B:77:0x0325, B:79:0x0335, B:81:0x0337, B:84:0x033a, B:86:0x0348, B:87:0x035e, B:95:0x0374, B:100:0x0109, B:102:0x0118, B:105:0x0125, B:106:0x015a, B:110:0x01ed, B:112:0x01bc, B:114:0x01c4, B:116:0x01d7, B:118:0x01d9, B:125:0x013e, B:127:0x0146, B:128:0x01f7, B:129:0x0207, B:134:0x0211, B:137:0x0228, B:139:0x022e, B:143:0x024f), top: B:5:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0325 A[Catch: all -> 0x0376, TryCatch #3 {all -> 0x0376, blocks: (B:56:0x00f9, B:58:0x0285, B:60:0x0292, B:62:0x0297, B:68:0x02ce, B:71:0x02e1, B:73:0x02f8, B:74:0x030a, B:75:0x031d, B:77:0x0325, B:79:0x0335, B:81:0x0337, B:84:0x033a, B:86:0x0348, B:87:0x035e, B:95:0x0374, B:100:0x0109, B:102:0x0118, B:105:0x0125, B:106:0x015a, B:110:0x01ed, B:112:0x01bc, B:114:0x01c4, B:116:0x01d7, B:118:0x01d9, B:125:0x013e, B:127:0x0146, B:128:0x01f7, B:129:0x0207, B:134:0x0211, B:137:0x0228, B:139:0x022e, B:143:0x024f), top: B:5:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0348 A[Catch: all -> 0x0376, TryCatch #3 {all -> 0x0376, blocks: (B:56:0x00f9, B:58:0x0285, B:60:0x0292, B:62:0x0297, B:68:0x02ce, B:71:0x02e1, B:73:0x02f8, B:74:0x030a, B:75:0x031d, B:77:0x0325, B:79:0x0335, B:81:0x0337, B:84:0x033a, B:86:0x0348, B:87:0x035e, B:95:0x0374, B:100:0x0109, B:102:0x0118, B:105:0x0125, B:106:0x015a, B:110:0x01ed, B:112:0x01bc, B:114:0x01c4, B:116:0x01d7, B:118:0x01d9, B:125:0x013e, B:127:0x0146, B:128:0x01f7, B:129:0x0207, B:134:0x0211, B:137:0x0228, B:139:0x022e, B:143:0x024f), top: B:5:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02df  */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7, types: [nsh] */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r6v19, types: [int] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [int] */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v64 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nsh i(defpackage.lqc r34) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsi.i(lqc):nsh");
    }

    public final void j() {
        List list = this.a;
        int i = this.l * ((enou) list).c;
        int i2 = this.i;
        if (i + i2 >= this.v) {
            lqw lqwVar = ((nql) list.get(i2)).a;
            enhk f = f();
            this.f.h(new nrf((String) f.get(1), (String) f.get(2)));
            this.v++;
        }
    }

    public final boolean k() {
        return this.i == ((enou) this.a).c + (-1);
    }
}
