package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feqv implements Closeable, fekl {
    public feqs a;
    public int b;
    public fdyt c;
    public long e;
    private final fevo h;
    private final fevw i;
    private boolean k;
    private fekf l;
    private int o;
    private int p = 1;
    private int j = 5;
    public fekf d = new fekf();
    private boolean m = false;
    private int n = -1;
    public boolean f = false;
    public volatile boolean g = false;

    public feqv(feqs feqsVar, fdyt fdytVar, int i, fevo fevoVar, fevw fevwVar) {
        this.a = feqsVar;
        this.c = fdytVar;
        this.b = i;
        this.h = fevoVar;
        this.i = fevwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x019d, code lost:
    
        if (r8.f == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a3, code lost:
    
        if (c() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01a5, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01aa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        if (r3 <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
    
        r8.a.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0062, code lost:
    
        if (r8.p != 2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        r8.h.b(r3);
        r8.o += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
    
        r3 = r8.p;
        r4 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:
    
        if (r3 == 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0076, code lost:
    
        if (r4 == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f6, code lost:
    
        r3 = r8.l.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fe, code lost:
    
        if ((r3 & 254) != 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0102, code lost:
    
        if (1 == (r3 & 1)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0104, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0107, code lost:
    
        r8.k = r3;
        r3 = r8.l;
        r3.a(4);
        r3 = r3.e() | (((r3.e() << 24) | (r3.e() << 16)) | (r3.e() << 8));
        r8.j = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012a, code lost:
    
        if (r3 < 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012e, code lost:
    
        if (r3 > r8.b) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0130, code lost:
    
        r8.n++;
        r8.h.f();
        r3 = r8.i;
        r3.h.a();
        r3.i = r3.b.a();
        r8.p = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0172, code lost:
    
        throw new defpackage.fedn(io.grpc.Status.k.withDescription(java.lang.String.format(java.util.Locale.US, "gRPC message exceeds maximum size %d: %d", java.lang.Integer.valueOf(r8.b), java.lang.Integer.valueOf(r8.j))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0106, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0180, code lost:
    
        throw new defpackage.fedn(io.grpc.Status.o.withDescription("gRPC frame header malformed: reserved bits not zero"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0078, code lost:
    
        if (r4 == 1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008d, code lost:
    
        r8.h.g();
        r8.o = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0096, code lost:
    
        if (r8.k == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0098, code lost:
    
        r2 = r8.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x009c, code lost:
    
        if (r2 == defpackage.fdxw.a) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x009e, code lost:
    
        r3 = r8.l;
        r4 = defpackage.fesg.a;
        r3 = new defpackage.fequ(r2.a(new defpackage.fesd(r3)), r8.b, r8.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00dc, code lost:
    
        r8.l = null;
        r8.a.l(new defpackage.feqt(r3));
        r8.p = 1;
        r8.j = 5;
        r8.e--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00b5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00bb, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c9, code lost:
    
        throw new defpackage.fedn(io.grpc.Status.o.withDescription("Can't decode compressed gRPC message as compression not configured"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ca, code lost:
    
        r2 = r8.h;
        r3 = r8.l.a;
        r2.h();
        r2 = r8.l;
        r3 = defpackage.fesg.a;
        r3 = new defpackage.fesd(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x007c, code lost:
    
        if (r3 == 1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x007e, code lost:
    
        r0 = "BODY";
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x008c, code lost:
    
        throw new java.lang.AssertionError(defpackage.a.t(r0, "Invalid state: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0081, code lost:
    
        r0 = "HEADER";
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0181, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feqv.a():void");
    }

    public final boolean b() {
        return this.d == null;
    }

    public final boolean c() {
        return this.d.a == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, defpackage.fekl
    public final void close() {
        if (b()) {
            return;
        }
        fekf fekfVar = this.l;
        boolean z = false;
        if (fekfVar != null && fekfVar.a > 0) {
            z = true;
        }
        try {
            fekf fekfVar2 = this.d;
            if (fekfVar2 != null) {
                fekfVar2.close();
            }
            fekf fekfVar3 = this.l;
            if (fekfVar3 != null) {
                fekfVar3.close();
            }
            this.d = null;
            this.l = null;
            this.a.i(z);
        } catch (Throwable th) {
            this.d = null;
            this.l = null;
            throw th;
        }
    }
}
