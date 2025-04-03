package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhjd extends fhjb {
    final /* synthetic */ fhjh c;
    private final fhgk d;
    private long e;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhjd(fhjh fhjhVar, fhgk fhgkVar) {
        super(fhjhVar);
        this.c = fhjhVar;
        this.d = fhgkVar;
        this.e = -1L;
        this.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0078, code lost:
    
        r2 = java.lang.Integer.toString(r3, 16);
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x008a, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r5 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0141, code lost:
    
        r0.b -= r3;
        r23.e = r5;
        r0 = defpackage.ffpc.x(r23.c.c.o()).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015d, code lost:
    
        if (r23.e < r16) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0163, code lost:
    
        if (r0.length() <= 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016b, code lost:
    
        if (defpackage.ffpc.t(r0, ";") == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0171, code lost:
    
        if (r23.e != r16) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0173, code lost:
    
        r23.f = false;
        r0 = r23.c;
        r0.g = r0.f.b();
        r0 = r23.c;
        r2 = r0.a;
        r2.getClass();
        r3 = r23.d;
        r0 = r0.g;
        r0.getClass();
        defpackage.fhis.a(r2.j, r3, r0);
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0199, code lost:
    
        if (r23.f == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e6, code lost:
    
        throw new java.net.ProtocolException("expected chunk size and optional extensions but was \"" + r23.e + r0 + "\"");
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce A[Catch: NumberFormatException -> 0x01ed, LOOP:2: B:46:0x00a6->B:54:0x00ce, LOOP_END, TryCatch #0 {NumberFormatException -> 0x01ed, blocks: (B:24:0x002d, B:25:0x003a, B:28:0x0056, B:42:0x008d, B:45:0x009b, B:47:0x00a8, B:50:0x00b0, B:52:0x00c6, B:54:0x00ce, B:56:0x00df, B:57:0x00f9, B:60:0x00b9, B:64:0x00c2, B:94:0x00fe, B:95:0x0121, B:70:0x0124, B:72:0x0132, B:77:0x0141, B:79:0x015f, B:81:0x0165, B:89:0x01c6, B:90:0x01e6, B:92:0x012e, B:98:0x01e7, B:99:0x01ec, B:100:0x0078, B:101:0x008a), top: B:23:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124 A[Catch: NumberFormatException -> 0x01ed, TryCatch #0 {NumberFormatException -> 0x01ed, blocks: (B:24:0x002d, B:25:0x003a, B:28:0x0056, B:42:0x008d, B:45:0x009b, B:47:0x00a8, B:50:0x00b0, B:52:0x00c6, B:54:0x00ce, B:56:0x00df, B:57:0x00f9, B:60:0x00b9, B:64:0x00c2, B:94:0x00fe, B:95:0x0121, B:70:0x0124, B:72:0x0132, B:77:0x0141, B:79:0x015f, B:81:0x0165, B:89:0x01c6, B:90:0x01e6, B:92:0x012e, B:98:0x01e7, B:99:0x01ec, B:100:0x0078, B:101:0x008a), top: B:23:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e A[Catch: NumberFormatException -> 0x01ed, TryCatch #0 {NumberFormatException -> 0x01ed, blocks: (B:24:0x002d, B:25:0x003a, B:28:0x0056, B:42:0x008d, B:45:0x009b, B:47:0x00a8, B:50:0x00b0, B:52:0x00c6, B:54:0x00ce, B:56:0x00df, B:57:0x00f9, B:60:0x00b9, B:64:0x00c2, B:94:0x00fe, B:95:0x0121, B:70:0x0124, B:72:0x0132, B:77:0x0141, B:79:0x015f, B:81:0x0165, B:89:0x01c6, B:90:0x01e6, B:92:0x012e, B:98:0x01e7, B:99:0x01ec, B:100:0x0078, B:101:0x008a), top: B:23:0x002d }] */
    @Override // defpackage.fhjb, defpackage.fhnv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(defpackage.fhmt r24, long r25) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhjd.b(fhmt, long):long");
    }

    @Override // defpackage.fhnv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (this.f && !fhhl.D(this, TimeUnit.MILLISECONDS)) {
            this.c.b.e();
            c();
        }
        d();
    }
}
