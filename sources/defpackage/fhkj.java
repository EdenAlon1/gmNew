package defpackage;

import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhkj implements Closeable {
    public static final Logger a;
    public final fhmv b;
    private final fhki c;
    private final fhjm d;

    static {
        Logger logger = Logger.getLogger(fhjp.class.getName());
        logger.getClass();
        a = logger;
    }

    public fhkj(fhmv fhmvVar) {
        fhmvVar.getClass();
        this.b = fhmvVar;
        fhki fhkiVar = new fhki(fhmvVar);
        this.c = fhkiVar;
        this.d = new fhjm(fhkiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dc, code lost:
    
        throw new java.io.IOException(defpackage.a.h(r3, "Invalid dynamic table size update "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List b(int r2, int r3, int r4, int r5) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhkj.b(int, int, int, int):java.util.List");
    }

    private final void c() {
        this.b.f();
        this.b.d();
        byte[] bArr = fhhl.a;
    }

    public final boolean a(boolean z, fhjx fhjxVar) {
        boolean z2;
        long j;
        long j2;
        Object[] array;
        int f;
        try {
            this.b.B(9L);
            int g = fhhl.g(this.b);
            if (g > 16384) {
                throw new IOException(a.h(g, "FRAME_SIZE_ERROR: "));
            }
            int z3 = fhhl.z(this.b.d());
            int z4 = fhhl.z(this.b.d());
            int f2 = this.b.f();
            int i = f2 & Alert.DURATION_SHOW_INDEFINITELY;
            Logger logger = a;
            if (logger.isLoggable(Level.FINE)) {
                fhmx fhmxVar = fhjp.a;
                logger.fine(fhjp.b(true, i, g, z3, z4));
            }
            if (!z) {
                switch (z3) {
                    case 0:
                        if (i == 0) {
                            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                        }
                        int i2 = z4 & 1;
                        if ((z4 & 32) != 0) {
                            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                        }
                        r2 = (z4 & 8) != 0 ? fhhl.z(this.b.d()) : 0;
                        int a2 = fhkh.a(g, z4, r2);
                        long j3 = a2;
                        fhmv fhmvVar = this.b;
                        fhkf fhkfVar = fhjxVar.a;
                        if (fhkf.j(i)) {
                            fhmt fhmtVar = new fhmt();
                            fhmvVar.B(j3);
                            fhmvVar.b(fhmtVar, j3);
                            fhkfVar.j.f(new fhjy(fhkfVar.d + "[" + i + "] onData", fhkfVar, i, fhmtVar, a2));
                        } else {
                            fhkn a3 = fhkfVar.a(i);
                            if (a3 == null) {
                                fhjxVar.a.n(i, 2);
                                fhjxVar.a.e(j3);
                                fhmvVar.C(j3);
                            } else {
                                fhkl fhklVar = a3.g;
                                fhkn fhknVar = fhklVar.f;
                                long j4 = j3;
                                while (true) {
                                    if (j4 > 0) {
                                        synchronized (fhklVar.f) {
                                            z2 = fhklVar.b;
                                            j = fhklVar.d.b + j4;
                                            j2 = fhklVar.a;
                                        }
                                        if (j > j2) {
                                            fhmvVar.C(j4);
                                            fhklVar.f.l(4);
                                        } else if (z2) {
                                            fhmvVar.C(j4);
                                        } else {
                                            long b = fhmvVar.b(fhklVar.c, j4);
                                            if (b == -1) {
                                                throw new EOFException();
                                            }
                                            j4 -= b;
                                            fhkn fhknVar2 = fhklVar.f;
                                            synchronized (fhknVar2) {
                                                if (fhklVar.e) {
                                                    fhklVar.c.A();
                                                } else {
                                                    fhmt fhmtVar2 = fhklVar.d;
                                                    long j5 = fhmtVar2.b;
                                                    fhmtVar2.N(fhklVar.c);
                                                    if (j5 == 0) {
                                                        fhknVar2.notifyAll();
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        fhklVar.c(j3);
                                    }
                                }
                                if (i2 != 0) {
                                    a3.f(fhhl.b, true);
                                }
                            }
                        }
                        this.b.C(r2);
                        return true;
                    case 1:
                        if (i == 0) {
                            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                        }
                        int i3 = z4 & 1;
                        int i4 = z4 & 32;
                        int z5 = (z4 & 8) != 0 ? fhhl.z(this.b.d()) : 0;
                        if (i4 != 0) {
                            c();
                            g -= 5;
                        }
                        List b2 = b(fhkh.a(g, z4, z5), z5, z4, i);
                        fhkf fhkfVar2 = fhjxVar.a;
                        if (fhkf.j(i)) {
                            fhkfVar2.j.f(new fhjz(fhkfVar2.d + "[" + i + "] onHeaders", fhkfVar2, i));
                        } else {
                            synchronized (fhkfVar2) {
                                fhkn a4 = fhkfVar2.a(i);
                                boolean z6 = 1 == i3;
                                if (a4 != null) {
                                    a4.f(fhhl.p(b2), z6);
                                } else if (!fhkfVar2.g) {
                                    if (i > fhkfVar2.e) {
                                        if ((f2 & 1) != fhkfVar2.f % 2) {
                                            fhkn fhknVar3 = new fhkn(i, fhkfVar2, false, z6, fhhl.p(b2));
                                            fhkfVar2.e = i;
                                            fhkfVar2.c.put(Integer.valueOf(i), fhknVar3);
                                            fhkfVar2.h.a().f(new fhju(fhkfVar2.d + "[" + i + "] onStream", fhkfVar2, fhknVar3));
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    case 2:
                        if (g != 5) {
                            throw new IOException(a.f(g, "TYPE_PRIORITY length: ", " != 5"));
                        }
                        if (i == 0) {
                            throw new IOException("TYPE_PRIORITY streamId == 0");
                        }
                        c();
                        return true;
                    case 3:
                        if (g != 4) {
                            throw new IOException(a.f(g, "TYPE_RST_STREAM length: ", " != 4"));
                        }
                        if (i == 0) {
                            throw new IOException("TYPE_RST_STREAM streamId == 0");
                        }
                        int f3 = this.b.f();
                        int a5 = fhjj.a(f3);
                        if (a5 == 0) {
                            throw new IOException(a.h(f3, "TYPE_RST_STREAM unexpected error code: "));
                        }
                        fhkf fhkfVar3 = fhjxVar.a;
                        if (fhkf.j(i)) {
                            fhkfVar3.j.f(new fhkb(fhkfVar3.d + "[" + i + "] onReset", fhkfVar3, i));
                        } else {
                            fhkn b3 = fhkfVar3.b(i);
                            if (b3 != null) {
                                b3.m(a5);
                            }
                        }
                        return true;
                    case 4:
                        break;
                    case 5:
                        if (i == 0) {
                            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                        }
                        r2 = (z4 & 8) != 0 ? fhhl.z(this.b.d()) : 0;
                        int f4 = this.b.f() & Alert.DURATION_SHOW_INDEFINITELY;
                        b(fhkh.a(g - 4, z4, r2), r2, z4, i);
                        fhkf fhkfVar4 = fhjxVar.a;
                        synchronized (fhkfVar4) {
                            Set set = fhkfVar4.w;
                            Integer valueOf = Integer.valueOf(f4);
                            if (set.contains(valueOf)) {
                                fhkfVar4.n(f4, 2);
                            } else {
                                fhkfVar4.w.add(valueOf);
                                fhkfVar4.j.f(new fhka(fhkfVar4.d + "[" + f4 + "] onRequest", fhkfVar4, f4));
                            }
                        }
                        return true;
                    case 6:
                        if (g != 8) {
                            throw new IOException(a.h(g, "TYPE_PING length != 8: "));
                        }
                        if (i != 0) {
                            throw new IOException("TYPE_PING streamId != 0");
                        }
                        int i5 = z4 & 1;
                        fhmv fhmvVar2 = this.b;
                        int f5 = fhmvVar2.f();
                        int f6 = fhmvVar2.f();
                        if (i5 != 0) {
                            fhkf fhkfVar5 = fhjxVar.a;
                            synchronized (fhkfVar5) {
                                if (f5 == 1) {
                                    fhkfVar5.l++;
                                } else if (f5 == 2) {
                                    fhkfVar5.n++;
                                } else if (f5 == 3) {
                                    fhkfVar5.o++;
                                    fhkfVar5.notifyAll();
                                }
                            }
                        } else {
                            fhkf fhkfVar6 = fhjxVar.a;
                            fhkfVar6.i.f(new fhjv(String.valueOf(fhkfVar6.d).concat(" ping"), fhkfVar6, f5, f6));
                        }
                        return true;
                    case 7:
                        if (g < 8) {
                            throw new IOException(a.h(g, "TYPE_GOAWAY length < 8: "));
                        }
                        if (i != 0) {
                            throw new IOException("TYPE_GOAWAY streamId != 0");
                        }
                        fhmv fhmvVar3 = this.b;
                        int i6 = g - 8;
                        int f7 = fhmvVar3.f();
                        int f8 = fhmvVar3.f();
                        if (fhjj.a(f8) == 0) {
                            throw new IOException(a.h(f8, "TYPE_GOAWAY unexpected error code: "));
                        }
                        fhmx fhmxVar2 = fhmx.a;
                        if (i6 > 0) {
                            fhmxVar2 = this.b.u(i6);
                        }
                        fhmxVar2.b();
                        fhkf fhkfVar7 = fhjxVar.a;
                        synchronized (fhkfVar7) {
                            array = fhkfVar7.c.values().toArray(new fhkn[0]);
                            fhkfVar7.g = true;
                        }
                        fhkn[] fhknVarArr = (fhkn[]) array;
                        int length = fhknVarArr.length;
                        while (r2 < length) {
                            fhkn fhknVar4 = fhknVarArr[r2];
                            if (fhknVar4.a > f7 && fhknVar4.h()) {
                                fhknVar4.m(8);
                                fhjxVar.a.b(fhknVar4.a);
                            }
                            r2++;
                        }
                        return true;
                    case 8:
                        if (g != 4) {
                            throw new IOException(a.h(g, "TYPE_WINDOW_UPDATE length !=4: "));
                        }
                        long f9 = this.b.f() & 2147483647L;
                        if (f9 == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        if (i == 0) {
                            fhkf fhkfVar8 = fhjxVar.a;
                            synchronized (fhkfVar8) {
                                fhkfVar8.t += f9;
                                fhkfVar8.notifyAll();
                            }
                        } else {
                            fhkn a6 = fhjxVar.a.a(i);
                            if (a6 != null) {
                                synchronized (a6) {
                                    a6.c(f9);
                                }
                            }
                        }
                        return true;
                    default:
                        this.b.C(g);
                        return true;
                }
            } else if (z3 != 4) {
                fhmx fhmxVar3 = fhjp.a;
                throw new IOException("Expected a SETTINGS frame but was ".concat(String.valueOf(fhjp.a(z3))));
            }
            if (i != 0) {
                throw new IOException("TYPE_SETTINGS streamId != 0");
            }
            if ((z4 & 1) != 0) {
                if (g != 0) {
                    throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                }
            } else {
                if (g % 6 != 0) {
                    throw new IOException(a.h(g, "TYPE_SETTINGS length % 6 != 0: "));
                }
                fhkt fhktVar = new fhkt();
                ffmh p = ffmk.p(ffmk.q(0, g), 6);
                int i7 = p.a;
                int i8 = p.b;
                int i9 = p.c;
                if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                    while (true) {
                        char y = (char) this.b.y();
                        f = this.b.f();
                        if (y != 2) {
                            if (y == 3) {
                                y = 4;
                            } else if (y != 4) {
                                if (y == 5 && (f < 16384 || f > 16777215)) {
                                }
                            } else {
                                if (f < 0) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                                y = 7;
                            }
                        } else if (f != 0 && f != 1) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                        }
                        fhktVar.g(y, f);
                        if (i7 != i8) {
                            i7 += i9;
                        }
                    }
                    throw new IOException(a.h(f, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                }
                fhkf fhkfVar9 = fhjxVar.a;
                fhkfVar9.i.f(new fhjw(String.valueOf(fhkfVar9.d).concat(" applyAndAckSettings"), fhjxVar, fhktVar));
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
