package defpackage;

import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhko implements Closeable {
    private static final Logger b = Logger.getLogger(fhjp.class.getName());
    public int a;
    private final fhmu c;
    private final fhmt d;
    private boolean e;
    private final fhjn f;

    public fhko(fhmu fhmuVar) {
        fhmuVar.getClass();
        this.c = fhmuVar;
        fhmt fhmtVar = new fhmt();
        this.d = fhmtVar;
        this.a = 16384;
        this.f = new fhjn(fhmtVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r0 = r3.f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(defpackage.fhkt r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r4.getClass()     // Catch: java.lang.Throwable -> L60
            boolean r0 = r3.e     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto L58
            int r0 = r3.a     // Catch: java.lang.Throwable -> L60
            int r1 = r4.a     // Catch: java.lang.Throwable -> L60
            r1 = r1 & 32
            if (r1 == 0) goto L15
            int[] r0 = r4.b     // Catch: java.lang.Throwable -> L60
            r1 = 5
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L60
        L15:
            r3.a = r0     // Catch: java.lang.Throwable -> L60
            int r0 = r4.b()     // Catch: java.lang.Throwable -> L60
            r1 = -1
            r2 = 1
            if (r0 == r1) goto L4c
            fhjn r0 = r3.f     // Catch: java.lang.Throwable -> L60
            int r4 = r4.b()     // Catch: java.lang.Throwable -> L60
            r1 = 16384(0x4000, float:2.2959E-41)
            int r4 = java.lang.Math.min(r4, r1)     // Catch: java.lang.Throwable -> L60
            int r1 = r0.d     // Catch: java.lang.Throwable -> L60
            if (r1 != r4) goto L30
            goto L4c
        L30:
            if (r4 >= r1) goto L3a
            int r1 = r0.b     // Catch: java.lang.Throwable -> L60
            int r1 = java.lang.Math.min(r1, r4)     // Catch: java.lang.Throwable -> L60
            r0.b = r1     // Catch: java.lang.Throwable -> L60
        L3a:
            r0.c = r2     // Catch: java.lang.Throwable -> L60
            r0.d = r4     // Catch: java.lang.Throwable -> L60
            int r1 = r0.h     // Catch: java.lang.Throwable -> L60
            if (r4 >= r1) goto L4c
            if (r4 != 0) goto L48
            r0.a()     // Catch: java.lang.Throwable -> L60
            goto L4c
        L48:
            int r1 = r1 - r4
            r0.e(r1)     // Catch: java.lang.Throwable -> L60
        L4c:
            r4 = 4
            r0 = 0
            r3.e(r0, r0, r4, r2)     // Catch: java.lang.Throwable -> L60
            fhmu r4 = r3.c     // Catch: java.lang.Throwable -> L60
            r4.flush()     // Catch: java.lang.Throwable -> L60
            monitor-exit(r3)
            return
        L58:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "closed"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L60
            throw r4     // Catch: java.lang.Throwable -> L60
        L60:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L60
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhko.a(fhkt):void");
    }

    public final synchronized void b() {
        if (this.e) {
            throw new IOException("closed");
        }
        Logger logger = b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(fhhl.k(">> CONNECTION ".concat(fhjp.a.d()), new Object[0]));
        }
        this.c.K(fhjp.a);
        this.c.flush();
    }

    public final synchronized void c(boolean z, int i, fhmt fhmtVar, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        e(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            fhmu fhmuVar = this.c;
            fhmtVar.getClass();
            fhmuVar.id(fhmtVar, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.c.close();
    }

    public final synchronized void d() {
        if (this.e) {
            throw new IOException("closed");
        }
        this.c.flush();
    }

    public final void e(int i, int i2, int i3, int i4) {
        Logger logger = b;
        if (logger.isLoggable(Level.FINE)) {
            fhmx fhmxVar = fhjp.a;
            logger.fine(fhjp.b(false, i, i2, i3, i4));
        }
        int i5 = this.a;
        if (i2 > i5) {
            throw new IllegalArgumentException(a.r(i2, i5, "FRAME_SIZE_ERROR length > ", ": "));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(a.h(i, "reserved bit set: "));
        }
        fhmu fhmuVar = this.c;
        byte[] bArr = fhhl.a;
        fhmuVar.P((i2 >>> 16) & PrivateKeyType.INVALID);
        fhmuVar.P((i2 >>> 8) & PrivateKeyType.INVALID);
        fhmuVar.P(i2 & PrivateKeyType.INVALID);
        this.c.P(i3);
        this.c.P(i4);
        this.c.R(i & Alert.DURATION_SHOW_INDEFINITELY);
    }

    public final synchronized void f(boolean z, int i, List list) {
        int i2;
        int i3;
        if (this.e) {
            throw new IOException("closed");
        }
        fhjn fhjnVar = this.f;
        if (fhjnVar.c) {
            int i4 = fhjnVar.b;
            if (i4 < fhjnVar.d) {
                fhjnVar.d(i4, 31, 32);
            }
            fhjnVar.c = false;
            fhjnVar.b = Alert.DURATION_SHOW_INDEFINITELY;
            fhjnVar.d(fhjnVar.d, 31, 32);
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            fhjl fhjlVar = (fhjl) list.get(i5);
            fhmx g = fhjlVar.g.g();
            fhmx fhmxVar = fhjlVar.h;
            fhjl[] fhjlVarArr = fhjo.a;
            Integer num = (Integer) fhjo.b.get(g);
            if (num != null) {
                int intValue = num.intValue();
                i3 = intValue + 1;
                if (i3 >= 2 && i3 < 8) {
                    if (ffkj.e(fhjo.a[intValue].h, fhmxVar)) {
                        i2 = i3;
                    } else if (ffkj.e(fhjo.a[i3].h, fhmxVar)) {
                        i3 = intValue + 2;
                        i2 = i3;
                    }
                }
                i2 = i3;
                i3 = -1;
            } else {
                i2 = -1;
                i3 = -1;
            }
            if (i3 == -1) {
                int i6 = fhjnVar.f + 1;
                int length = fhjnVar.e.length;
                while (true) {
                    if (i6 >= length) {
                        i3 = -1;
                        break;
                    }
                    fhjl fhjlVar2 = fhjnVar.e[i6];
                    fhjlVar2.getClass();
                    if (ffkj.e(fhjlVar2.g, g)) {
                        fhjl fhjlVar3 = fhjnVar.e[i6];
                        fhjlVar3.getClass();
                        if (ffkj.e(fhjlVar3.h, fhmxVar)) {
                            int i7 = i6 - fhjnVar.f;
                            int length2 = fhjo.a.length;
                            i3 = i7 + 61;
                            break;
                        } else if (i2 == -1) {
                            int i8 = i6 - fhjnVar.f;
                            int length3 = fhjo.a.length;
                            i2 = i8 + 61;
                        }
                    }
                    i6++;
                }
            }
            if (i3 != -1) {
                fhjnVar.d(i3, 127, 128);
            } else if (i2 == -1) {
                fhjnVar.a.O(64);
                fhjnVar.c(g);
                fhjnVar.c(fhmxVar);
                fhjnVar.b(fhjlVar);
            } else if (!g.i(fhjl.a) || ffkj.e(fhjl.f, g)) {
                fhjnVar.d(i2, 63, 64);
                fhjnVar.c(fhmxVar);
                fhjnVar.b(fhjlVar);
            } else {
                fhjnVar.d(i2, 15, 0);
                fhjnVar.c(fhmxVar);
            }
        }
        long j = this.d.b;
        long min = Math.min(this.a, j);
        int i9 = j == min ? 4 : 0;
        if (z) {
            i9 |= 1;
        }
        e(i, (int) min, 1, i9);
        this.c.id(this.d, min);
        if (j > min) {
            long j2 = j - min;
            while (j2 > 0) {
                long min2 = Math.min(this.a, j2);
                j2 -= min2;
                e(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                this.c.id(this.d, min2);
            }
        }
    }

    public final synchronized void g(boolean z, int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        e(0, 8, 6, z ? 1 : 0);
        this.c.R(i);
        this.c.R(i2);
        this.c.flush();
    }

    public final synchronized void h(fhkt fhktVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        int i = 0;
        e(0, Integer.bitCount(fhktVar.a) * 6, 4, 0);
        while (i < 10) {
            if (fhktVar.f(i)) {
                this.c.S(i != 4 ? i != 7 ? i : 4 : 3);
                this.c.R(fhktVar.a(i));
            }
            i++;
        }
        this.c.flush();
    }

    public final synchronized void i(int i, long j) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.s(j, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "));
        }
        e(i, 4, 8, 0);
        this.c.R((int) j);
        this.c.flush();
    }

    public final synchronized void j(int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        e(i, 4, 3, 0);
        this.c.R(i2 - 1);
        this.c.flush();
    }

    public final synchronized void k(int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        e(0, 8, 7, 0);
        this.c.R(i);
        this.c.R(i2 - 1);
        this.c.flush();
    }
}
