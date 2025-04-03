package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feyc implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ CyclicBarrier b;
    final /* synthetic */ fexk c;
    final /* synthetic */ CountDownLatch d;
    final /* synthetic */ feyg e;

    public feyc(feyg feygVar, CountDownLatch countDownLatch, CyclicBarrier cyclicBarrier, fexk fexkVar, CountDownLatch countDownLatch2) {
        this.a = countDownLatch;
        this.b = cyclicBarrier;
        this.c = fexkVar;
        this.d = countDownLatch2;
        this.e = feygVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x00d9, code lost:
    
        r8 = new defpackage.fhmt();
        r8.T(r14, 0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00e1, code lost:
    
        if (r7 >= r15) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00e3, code lost:
    
        r2 = r14.codePointAt(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00e7, code lost:
    
        if (r2 != r6) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00e9, code lost:
    
        r2 = r7 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00eb, code lost:
    
        if (r2 >= r15) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00ed, code lost:
    
        r6 = defpackage.ffab.a(r14.charAt(r7 + 1));
        r2 = defpackage.ffab.a(r14.charAt(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0101, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0104, code lost:
    
        if (r6 == (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0106, code lost:
    
        if (r2 == (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x010b, code lost:
    
        r8.O((r6 << 4) + r2);
        r7 = r2;
        r2 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x011d, code lost:
    
        r7 = r7 + java.lang.Character.charCount(r2);
        r3 = r20;
        r6 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0113, code lost:
    
        r2 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x011a, code lost:
    
        r8.U(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0116, code lost:
    
        r2 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0118, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0128, code lost:
    
        r2 = r8.m();
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feyc.run():void");
    }
}
