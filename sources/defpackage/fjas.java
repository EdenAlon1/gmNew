package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.net.SocketAddress;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fjas {
    public SocketAddress a;
    public SocketAddress b;
    public fizw c;
    public long d = 900000;
    public fjaq e;
    private fiyt f;
    private int g;
    private int h;
    private int i;
    private long j;
    private long k;
    private fizg l;

    private fjas() {
    }

    public static long a(fizg fizgVar) {
        return ((fizn) fizgVar).a;
    }

    private final void d() {
        g("server doesn't support IXFR");
        e("falling back to AXFR");
        this.g = 252;
        this.i = 0;
    }

    private final void e(String str) {
        if (fiyy.a("verbose")) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f);
            stringBuffer.append(": ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
    }

    private final void f(fizg fizgVar) {
        int i = fizgVar.g;
        switch (this.i) {
            case 0:
                if (i != 6) {
                    g("missing initial SOA");
                }
                this.l = fizgVar;
                long a = a(fizgVar);
                this.j = a;
                if (this.g == 251) {
                    if (a >= 4294967295L) {
                        a = -1;
                    }
                    if (((int) a) <= 0) {
                        e("up to date");
                        this.i = 7;
                        break;
                    }
                }
                this.i = 1;
                break;
            case 1:
                if (this.g == 251 && i == 6 && a(fizgVar) == 0) {
                    this.e.b = new ArrayList();
                    e("got incremental response");
                    this.i = 2;
                } else {
                    this.e.a = new ArrayList();
                    this.e.a(this.l);
                    e("got nonincremental response");
                    this.i = 6;
                }
                f(fizgVar);
                break;
            case 2:
                fjaq fjaqVar = this.e;
                fjar fjarVar = new fjar();
                fjarVar.c.add(fizgVar);
                a(fizgVar);
                fjaqVar.b.add(fjarVar);
                this.i = 3;
                break;
            case 3:
                if (i != 6) {
                    this.e.a(fizgVar);
                    break;
                } else {
                    this.k = a(fizgVar);
                    this.i = 4;
                    f(fizgVar);
                    break;
                }
            case 4:
                fjar fjarVar2 = (fjar) this.e.b.get(r0.size() - 1);
                fjarVar2.b.add(fizgVar);
                fjarVar2.a = a(fizgVar);
                this.i = 5;
                break;
            case 5:
                if (i == 6) {
                    long a2 = a(fizgVar);
                    if (a2 != this.j) {
                        if (a2 == this.k) {
                            this.i = 2;
                            f(fizgVar);
                            break;
                        } else {
                            StringBuffer stringBuffer = new StringBuffer("IXFR out of sync: expected serial ");
                            stringBuffer.append(this.k);
                            stringBuffer.append(" , got ");
                            stringBuffer.append(a2);
                            g(stringBuffer.toString());
                        }
                    } else {
                        this.i = 7;
                        break;
                    }
                }
                this.e.a(fizgVar);
                break;
            case 6:
                if (i == 1) {
                    if (fizgVar.h == this.h) {
                        i = 1;
                    }
                }
                this.e.a(fizgVar);
                if (i == 6) {
                    this.i = 7;
                    break;
                }
                break;
            default:
                g("extra data");
                break;
        }
    }

    private static final void g(String str) {
        throw new fjap(str);
    }

    public final void b() {
        try {
            fizw fizwVar = this.c;
            if (fizwVar != null) {
                fizwVar.b();
            }
        } catch (IOException unused) {
        }
    }

    public final void c() {
        fizg l = fizg.l(this.f, this.g, this.h);
        fiyh fiyhVar = new fiyh();
        fiyhVar.a.i();
        fiyhVar.d(l, 0);
        if (this.g == 251) {
            fiyhVar.d(new fizn(this.f, this.h, fiyt.a, fiyt.a), 2);
        }
        this.c.f(fiyhVar.g());
        while (this.i != 7) {
            try {
                fiyh fiyhVar2 = new fiyh(this.c.g());
                fiyhVar2.a.d();
                fizg[] f = fiyhVar2.f(1);
                if (this.i == 0) {
                    int a = fiyhVar2.a();
                    if (a != 0) {
                        if (this.g == 251 && a == 4) {
                            d();
                            c();
                            return;
                        }
                        g(fizf.b(a));
                    }
                    fizg c = fiyhVar2.c();
                    if (c != null && c.g != this.g) {
                        g("invalid question section");
                    }
                    if (f.length == 0 && this.g == 251) {
                        d();
                        c();
                        return;
                    }
                }
                for (fizg fizgVar : f) {
                    f(fizgVar);
                }
            } catch (IOException e) {
                if (!(e instanceof fjan)) {
                    throw new fjan("Error parsing message");
                }
                throw ((fjan) e);
            }
        }
    }

    public fjas(fiyt fiytVar, SocketAddress socketAddress) {
        this.b = socketAddress;
        if (fiytVar.j()) {
            this.f = fiytVar;
        } else {
            try {
                this.f = fiyt.c(fiytVar, fiyt.a);
            } catch (fiyu unused) {
                throw new IllegalArgumentException("ZoneTransferIn: name too long");
            }
        }
        this.g = 252;
        this.h = 1;
        this.i = 0;
    }
}
