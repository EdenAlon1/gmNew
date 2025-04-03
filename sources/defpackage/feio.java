package defpackage;

import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class feio implements fevp {
    public static final Logger t = Logger.getLogger(feio.class.getName());

    @Override // defpackage.fevp
    public final void d() {
        feqz feqzVar;
        fevx fevxVar;
        if (((feqz) u()).i || (fevxVar = (feqzVar = (feqz) u()).b) == null || fevxVar.a() <= 0) {
            return;
        }
        feqzVar.b(false, true);
    }

    @Override // defpackage.fevp
    public final void f() {
        fein r = r();
        feqv feqvVar = r.r;
        feqvVar.a = r;
        r.o = feqvVar;
    }

    @Override // defpackage.fevp
    public final void g(int i) {
        fein r = r();
        fekl feklVar = r.o;
        int i2 = ffbo.a;
        r.e(new feim(r, i));
    }

    @Override // defpackage.fevp
    public final void h(fdxy fdxyVar) {
        femu u = u();
        fdxyVar.getClass();
        ((feqz) u).d = fdxyVar;
    }

    @Override // defpackage.fevp
    public final void n(InputStream inputStream) {
        int a;
        try {
            if (!((feqz) u()).i) {
                femu u = u();
                if (((feqz) u).i) {
                    throw new IllegalStateException("Framer already closed");
                }
                ((feqz) u).j++;
                ((feqz) u).k++;
                ((feqz) u).l = 0L;
                ((feqz) u).h.i();
                fdxy fdxyVar = ((feqz) u).d;
                fdxx fdxxVar = fdxw.a;
                try {
                    try {
                        int available = inputStream.available();
                        if (available != 0 && fdxyVar != fdxxVar) {
                            feqw feqwVar = new feqw((feqz) u);
                            OutputStream b = ((feqz) u).d.b(feqwVar);
                            try {
                                a = feqz.a(inputStream, b);
                                b.close();
                                int i = ((feqz) u).a;
                                if (i >= 0 && a > i) {
                                    throw new fedn(Status.k.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(a), Integer.valueOf(((feqz) u).a))));
                                }
                                ((feqz) u).c(feqwVar, true);
                            } catch (Throwable th) {
                                b.close();
                                throw th;
                            }
                        } else if (available != -1) {
                            ((feqz) u).l = available;
                            int i2 = ((feqz) u).a;
                            if (i2 >= 0 && available > i2) {
                                throw new fedn(Status.k.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(available), Integer.valueOf(((feqz) u).a))));
                            }
                            ((feqz) u).f.clear();
                            ((feqz) u).f.put((byte) 0).putInt(available);
                            ((feqz) u).c = available + 5;
                            ((feqz) u).d(((feqz) u).f.array(), 0, ((feqz) u).f.position());
                            a = feqz.a(inputStream, ((feqz) u).e);
                        } else {
                            feqw feqwVar2 = new feqw((feqz) u);
                            a = feqz.a(inputStream, feqwVar2);
                            ((feqz) u).c(feqwVar2, false);
                        }
                        if (available != -1 && a != available) {
                            throw new fedn(Status.o.withDescription(String.format("Message length inaccurate %s != %s", Integer.valueOf(a), Integer.valueOf(available))));
                        }
                        ((feqz) u).h.k();
                        ((feqz) u).h.c(((feqz) u).l);
                        ((feqz) u).h.j();
                    } catch (RuntimeException e) {
                        throw new fedn(Status.o.withDescription("Failed to frame message").d(e));
                    }
                } catch (fedn e2) {
                    throw e2;
                } catch (IOException e3) {
                    throw new fedn(Status.o.withDescription("Failed to frame message").d(e3));
                }
            }
        } finally {
            fend.h(inputStream);
        }
    }

    @Override // defpackage.fevp
    public boolean o() {
        throw null;
    }

    protected abstract fein r();

    protected abstract femu u();

    public final void w(int i) {
        fein r = r();
        synchronized (r.p) {
            r.s += i;
        }
    }
}
