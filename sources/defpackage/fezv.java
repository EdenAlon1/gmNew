package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezv implements fezn {
    public int a;
    private final fhmu b;
    private final fhmt c;
    private final fezq d;
    private boolean e;

    public fezv(fhmu fhmuVar) {
        this.b = fhmuVar;
        fhmt fhmtVar = new fhmt();
        this.c = fhmtVar;
        this.d = new fezq(fhmtVar);
        this.a = 16384;
    }

    @Override // defpackage.fezn
    public final synchronized void a(fezz fezzVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        int i = this.a;
        if ((fezzVar.a & 32) != 0) {
            i = fezzVar.b[5];
        }
        this.a = i;
        k(0, 0, (byte) 4, (byte) 1);
        this.b.flush();
    }

    @Override // defpackage.fezn
    public final synchronized void b() {
        if (this.e) {
            throw new IOException("closed");
        }
        if (fezw.a.isLoggable(Level.FINE)) {
            fezw.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", fezw.b.d()));
        }
        this.b.Y(fezw.b.k());
        this.b.flush();
    }

    @Override // defpackage.fezn
    public final synchronized void c(boolean z, int i, fhmt fhmtVar, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        k(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.b.id(fhmtVar, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.b.close();
    }

    @Override // defpackage.fezn
    public final synchronized void d() {
        if (this.e) {
            throw new IOException("closed");
        }
        this.b.flush();
    }

    @Override // defpackage.fezn
    public final synchronized void e(boolean z, int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        k(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.b.R(i);
        this.b.R(i2);
        this.b.flush();
    }

    @Override // defpackage.fezn
    public final synchronized void f(int i, fezm fezmVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (fezmVar.s == -1) {
            throw new IllegalArgumentException();
        }
        k(i, 4, (byte) 3, (byte) 0);
        this.b.R(fezmVar.s);
        this.b.flush();
    }

    @Override // defpackage.fezn
    public final synchronized void g(fezz fezzVar) {
        int i;
        if (this.e) {
            throw new IOException("closed");
        }
        int i2 = 0;
        k(0, Integer.bitCount(fezzVar.a) * 6, (byte) 4, (byte) 0);
        while (i2 < 10) {
            if (fezzVar.c(i2)) {
                if (i2 == 4) {
                    int i3 = i2;
                    i2 = 3;
                    i = i3;
                } else {
                    i = 7;
                    if (i2 == 7) {
                        i2 = 4;
                    } else {
                        i = i2;
                    }
                }
                this.b.S(i2);
                this.b.R(fezzVar.a(i));
                i2 = i;
            }
            i2++;
        }
        this.b.flush();
    }

    @Override // defpackage.fezn
    public final synchronized void h(int i, long j) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j == 0) {
            throw fezw.d("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", 0L);
        }
        k(i, 4, (byte) 8, (byte) 0);
        this.b.R((int) j);
        this.b.flush();
    }

    @Override // defpackage.fezn
    public final synchronized void i(fezm fezmVar, byte[] bArr) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (fezmVar.s == -1) {
            throw fezw.d("errorCode.httpCode == -1", new Object[0]);
        }
        k(0, 8, (byte) 7, (byte) 0);
        this.b.R(0);
        this.b.R(fezmVar.s);
        this.b.flush();
    }

    @Override // defpackage.fezn
    public final synchronized void j(boolean z, int i, List list) {
        int i2;
        int i3;
        if (this.e) {
            throw new IOException("closed");
        }
        fezq fezqVar = this.d;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            fezo fezoVar = (fezo) list.get(i4);
            fhmx g = fezoVar.f.g();
            fhmx fhmxVar = fezoVar.g;
            Integer num = (Integer) fezr.c.get(g);
            if (num != null) {
                int intValue = num.intValue();
                i3 = intValue + 1;
                if (i3 >= 2 && i3 <= 7) {
                    if (fezr.b[intValue].g.equals(fhmxVar)) {
                        i2 = i3;
                    } else if (fezr.b[i3].g.equals(fhmxVar)) {
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
                int i5 = fezqVar.d + 1;
                while (true) {
                    fezo[] fezoVarArr = fezqVar.b;
                    if (i5 >= fezoVarArr.length) {
                        i3 = -1;
                        break;
                    }
                    if (fezoVarArr[i5].f.equals(g)) {
                        if (fezqVar.b[i5].g.equals(fhmxVar)) {
                            int i6 = i5 - fezqVar.d;
                            int length = fezr.b.length;
                            i3 = i6 + 61;
                            break;
                        } else if (i2 == -1) {
                            int i7 = i5 - fezqVar.d;
                            int length2 = fezr.b.length;
                            i2 = i7 + 61;
                        }
                    }
                    i5++;
                }
            }
            if (i3 != -1) {
                fezqVar.c(i3, 127, 128);
            } else if (i2 == -1) {
                fezqVar.a.O(64);
                fezqVar.b(g);
                fezqVar.b(fhmxVar);
                fezqVar.a(fezoVar);
            } else if (!g.i(fezr.a) || fezo.e.equals(g)) {
                fezqVar.c(i2, 63, 64);
                fezqVar.b(fhmxVar);
                fezqVar.a(fezoVar);
            } else {
                fezqVar.c(i2, 15, 0);
                fezqVar.b(fhmxVar);
            }
        }
        long j = this.c.b;
        int min = (int) Math.min(this.a, j);
        long j2 = min;
        k(i, min, (byte) 1, j == j2 ? (byte) 4 : (byte) 0);
        this.b.id(this.c, j2);
        if (j > j2) {
            long j3 = j - j2;
            while (j3 > 0) {
                int min2 = (int) Math.min(this.a, j3);
                long j4 = min2;
                j3 -= j4;
                k(i, min2, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                this.b.id(this.c, j4);
            }
        }
    }

    final void k(int i, int i2, byte b, byte b2) {
        if (fezw.a.isLoggable(Level.FINE)) {
            fezw.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", fezt.a(false, i, i2, b, b2));
        }
        int i3 = this.a;
        if (i2 > i3) {
            throw fezw.d("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw fezw.d("reserved bit set: %s", Integer.valueOf(i));
        }
        fhmu fhmuVar = this.b;
        fhmuVar.P((i2 >>> 16) & PrivateKeyType.INVALID);
        fhmuVar.P((i2 >>> 8) & PrivateKeyType.INVALID);
        fhmuVar.P(i2 & PrivateKeyType.INVALID);
        this.b.P(b);
        this.b.P(b2);
        this.b.R(i & Alert.DURATION_SHOW_INDEFINITELY);
    }
}
