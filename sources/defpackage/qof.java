package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qof extends Thread {
    public volatile boolean a = false;
    private final BlockingQueue b;
    private final qnw c;
    private final qod d;
    private final qpa e;

    public qof(BlockingQueue blockingQueue, qpa qpaVar, qnw qnwVar, qod qodVar) {
        this.b = blockingQueue;
        this.e = qpaVar;
        this.c = qnwVar;
        this.d = qodVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02cf, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02d0, code lost:
    
        if (r6 == null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02d4, code lost:
    
        if (defpackage.qox.b == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02d6, code lost:
    
        r9 = new java.lang.Object[r16];
        r9[0] = java.lang.Integer.valueOf(r6.size());
        r9[r18] = r3;
        defpackage.qox.d("Releasing %d waiting requests for cacheKey=%s.", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02eb, code lost:
    
        r3 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02f3, code lost:
    
        if (r3.hasNext() == false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02f5, code lost:
    
        r5.b.b((defpackage.qol) r3.next(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0304, code lost:
    
        r5.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0311, code lost:
    
        throw new java.io.IOException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x025d, code lost:
    
        if (r0 < 200) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0261, code lost:
    
        if (r0 > 299) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0263, code lost:
    
        android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x026b, code lost:
    
        r0 = new defpackage.qoh(r0, r9, false, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x026c, code lost:
    
        r2.d("network-http-complete");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0273, code lost:
    
        if (r0.e == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0275, code lost:
    
        r3 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0277, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0278, code lost:
    
        r5 = r2.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x027a, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x027b, code lost:
    
        if (r5 == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x027d, code lost:
    
        r2.g("not-modified");
        r2.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x028a, code lost:
    
        r0 = r2.b(r0);
        r2.d("network-parse-complete");
        r3 = r2.h;
        r3 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0297, code lost:
    
        if (r3 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0299, code lost:
    
        r20.c.c(r2.b, r3);
        r2.d("network-cache-written");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02a5, code lost:
    
        r2.h();
        r20.d.b(r2, r0);
        r3 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02af, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02b0, code lost:
    
        r5 = r2.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02b2, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02b3, code lost:
    
        if (r5 == null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02b5, code lost:
    
        r3 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02b7, code lost:
    
        if (r3 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02c1, code lost:
    
        if (r3.a(java.lang.System.currentTimeMillis()) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02c4, code lost:
    
        r3 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02c6, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02c7, code lost:
    
        r6 = (java.util.List) r5.a.remove(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0341 A[Catch: Exception -> 0x0404, all -> 0x0406, qou -> 0x042b, TryCatch #4 {qou -> 0x042b, blocks: (B:4:0x0013, B:6:0x001e, B:10:0x0028, B:11:0x0033, B:14:0x0036, B:16:0x003a, B:17:0x0068, B:32:0x0111, B:34:0x0114, B:195:0x011c, B:197:0x0123, B:69:0x026c, B:71:0x0275, B:72:0x0277, B:77:0x027d, B:81:0x0289, B:82:0x028a, B:84:0x0299, B:85:0x02a5, B:86:0x02af, B:91:0x02b5, B:93:0x02b9, B:96:0x02c4, B:97:0x02c6, B:102:0x02d2, B:104:0x02d6, B:105:0x02eb, B:106:0x02ef, B:108:0x02f5, B:113:0x0303, B:114:0x0304, B:118:0x030b, B:198:0x012c, B:200:0x0139, B:201:0x013d, B:203:0x0143, B:205:0x014f, B:207:0x0158, B:209:0x015e, B:210:0x0164, B:212:0x016a, B:215:0x0178, B:220:0x01bc, B:221:0x017c, B:223:0x0184, B:224:0x018e, B:226:0x0194, B:229:0x01a4, B:36:0x01c8, B:40:0x01cf, B:52:0x01ee, B:53:0x01f9, B:56:0x0217, B:67:0x0263, B:119:0x030c, B:120:0x0311, B:121:0x022c, B:123:0x0234, B:124:0x023c, B:127:0x024b, B:131:0x033d, B:133:0x0341, B:135:0x03a3, B:139:0x03bd, B:145:0x03d7, B:146:0x03eb, B:147:0x034e, B:150:0x0354, B:152:0x036a, B:162:0x0387, B:163:0x038c, B:164:0x038d, B:165:0x0392, B:166:0x0393, B:167:0x039b, B:169:0x03ec, B:170:0x03f1, B:172:0x03f2, B:173:0x0403, B:181:0x01f2, B:186:0x0203, B:187:0x020e, B:188:0x0214, B:190:0x0207, B:193:0x0215, B:254:0x0332, B:248:0x0335, B:269:0x003d, B:271:0x0046, B:272:0x004b, B:274:0x0053), top: B:3:0x0013, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03bd A[Catch: Exception -> 0x0404, all -> 0x0406, qou -> 0x042b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {qou -> 0x042b, blocks: (B:4:0x0013, B:6:0x001e, B:10:0x0028, B:11:0x0033, B:14:0x0036, B:16:0x003a, B:17:0x0068, B:32:0x0111, B:34:0x0114, B:195:0x011c, B:197:0x0123, B:69:0x026c, B:71:0x0275, B:72:0x0277, B:77:0x027d, B:81:0x0289, B:82:0x028a, B:84:0x0299, B:85:0x02a5, B:86:0x02af, B:91:0x02b5, B:93:0x02b9, B:96:0x02c4, B:97:0x02c6, B:102:0x02d2, B:104:0x02d6, B:105:0x02eb, B:106:0x02ef, B:108:0x02f5, B:113:0x0303, B:114:0x0304, B:118:0x030b, B:198:0x012c, B:200:0x0139, B:201:0x013d, B:203:0x0143, B:205:0x014f, B:207:0x0158, B:209:0x015e, B:210:0x0164, B:212:0x016a, B:215:0x0178, B:220:0x01bc, B:221:0x017c, B:223:0x0184, B:224:0x018e, B:226:0x0194, B:229:0x01a4, B:36:0x01c8, B:40:0x01cf, B:52:0x01ee, B:53:0x01f9, B:56:0x0217, B:67:0x0263, B:119:0x030c, B:120:0x0311, B:121:0x022c, B:123:0x0234, B:124:0x023c, B:127:0x024b, B:131:0x033d, B:133:0x0341, B:135:0x03a3, B:139:0x03bd, B:145:0x03d7, B:146:0x03eb, B:147:0x034e, B:150:0x0354, B:152:0x036a, B:162:0x0387, B:163:0x038c, B:164:0x038d, B:165:0x0392, B:166:0x0393, B:167:0x039b, B:169:0x03ec, B:170:0x03f1, B:172:0x03f2, B:173:0x0403, B:181:0x01f2, B:186:0x0203, B:187:0x020e, B:188:0x0214, B:190:0x0207, B:193:0x0215, B:254:0x0332, B:248:0x0335, B:269:0x003d, B:271:0x0046, B:272:0x004b, B:274:0x0053), top: B:3:0x0013, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x034e A[Catch: Exception -> 0x0404, all -> 0x0406, qou -> 0x042b, TryCatch #4 {qou -> 0x042b, blocks: (B:4:0x0013, B:6:0x001e, B:10:0x0028, B:11:0x0033, B:14:0x0036, B:16:0x003a, B:17:0x0068, B:32:0x0111, B:34:0x0114, B:195:0x011c, B:197:0x0123, B:69:0x026c, B:71:0x0275, B:72:0x0277, B:77:0x027d, B:81:0x0289, B:82:0x028a, B:84:0x0299, B:85:0x02a5, B:86:0x02af, B:91:0x02b5, B:93:0x02b9, B:96:0x02c4, B:97:0x02c6, B:102:0x02d2, B:104:0x02d6, B:105:0x02eb, B:106:0x02ef, B:108:0x02f5, B:113:0x0303, B:114:0x0304, B:118:0x030b, B:198:0x012c, B:200:0x0139, B:201:0x013d, B:203:0x0143, B:205:0x014f, B:207:0x0158, B:209:0x015e, B:210:0x0164, B:212:0x016a, B:215:0x0178, B:220:0x01bc, B:221:0x017c, B:223:0x0184, B:224:0x018e, B:226:0x0194, B:229:0x01a4, B:36:0x01c8, B:40:0x01cf, B:52:0x01ee, B:53:0x01f9, B:56:0x0217, B:67:0x0263, B:119:0x030c, B:120:0x0311, B:121:0x022c, B:123:0x0234, B:124:0x023c, B:127:0x024b, B:131:0x033d, B:133:0x0341, B:135:0x03a3, B:139:0x03bd, B:145:0x03d7, B:146:0x03eb, B:147:0x034e, B:150:0x0354, B:152:0x036a, B:162:0x0387, B:163:0x038c, B:164:0x038d, B:165:0x0392, B:166:0x0393, B:167:0x039b, B:169:0x03ec, B:170:0x03f1, B:172:0x03f2, B:173:0x0403, B:181:0x01f2, B:186:0x0203, B:187:0x020e, B:188:0x0214, B:190:0x0207, B:193:0x0215, B:254:0x0332, B:248:0x0335, B:269:0x003d, B:271:0x0046, B:272:0x004b, B:274:0x0053), top: B:3:0x0013, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0332 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qof.a():void");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.a) {
                    Thread.currentThread().interrupt();
                    return;
                }
                qox.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
