package defpackage;

import io.grpc.Status;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class feng extends feij {
    private static final fdzw a;
    private static final febj b;
    private Status c;
    private febo d;
    private Charset e;
    private boolean f;

    static {
        fenf fenfVar = new fenf();
        a = fenfVar;
        b = fdzx.a(":status", fenfVar);
    }

    protected feng(int i, fevo fevoVar, fevw fevwVar) {
        super(i, fevoVar, fevwVar);
        this.e = StandardCharsets.UTF_8;
    }

    private static Charset f(febo feboVar) {
        String str = (String) feboVar.b(fend.h);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.UTF_8;
    }

    private static void r(febo feboVar) {
        feboVar.e(b);
        feboVar.e(fdzz.b);
        feboVar.e(fdzz.a);
    }

    private static final Status s(febo feboVar) {
        char charAt;
        Integer num = (Integer) feboVar.b(b);
        if (num == null) {
            return Status.o.withDescription("Missing HTTP status code");
        }
        String str = (String) feboVar.b(fend.h);
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';')) {
                return null;
            }
        }
        return fend.a(num.intValue()).b("invalid content-type: ".concat(String.valueOf(str)));
    }

    protected abstract void c(Status status, boolean z, febo feboVar);

    protected final void o(fesc fescVar, boolean z) {
        Status status = this.c;
        boolean z2 = false;
        if (status != null) {
            Charset charset = this.e;
            fesc fescVar2 = fesg.a;
            charset.getClass();
            int f = fescVar.f();
            byte[] bArr = new byte[f];
            fescVar.k(bArr, 0, f);
            this.c = status.b("DATA-----------------------------\n".concat(new String(bArr, charset)));
            fescVar.close();
            if (this.c.getDescription().length() > 1000 || z) {
                c(this.c, false, this.d);
                return;
            }
            return;
        }
        if (!this.f) {
            fescVar.close();
            c(Status.o.withDescription("headers not received before payload"), false, new febo());
            return;
        }
        int f2 = fescVar.f();
        boolean z3 = true;
        try {
            if (this.n) {
                feik.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                fescVar.close();
            } else {
                try {
                    fekl feklVar = this.o;
                    try {
                        if (!((feqv) feklVar).b() && !((feqv) feklVar).f) {
                            ((feqv) feklVar).d.h(fescVar);
                            try {
                                ((feqv) feklVar).a();
                            } catch (Throwable th) {
                                th = th;
                                z3 = false;
                                if (z3) {
                                    fescVar.close();
                                }
                                throw th;
                            }
                        }
                        fescVar.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        b(th3);
                    } catch (Throwable th4) {
                        th = th4;
                        if (z2) {
                            fescVar.close();
                        }
                        throw th;
                    }
                }
            }
            if (z) {
                if (f2 > 0) {
                    this.c = Status.o.withDescription("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.c = Status.o.withDescription("Received unexpected EOS on empty DATA frame from server");
                }
                febo feboVar = new febo();
                this.d = feboVar;
                j(this.c, false, feboVar);
            }
        } catch (Throwable th5) {
            th = th5;
            z2 = true;
        }
    }

    public final void p(febo feboVar) {
        Status status = this.c;
        if (status != null) {
            this.c = status.b("headers: ".concat(feboVar.toString()));
            return;
        }
        try {
            if (this.f) {
                this.c = Status.o.withDescription("Received headers twice");
            } else {
                Integer num = (Integer) feboVar.b(b);
                if (num == null || num.intValue() < 100 || num.intValue() >= 200) {
                    this.f = true;
                    Status s = s(feboVar);
                    this.c = s;
                    if (s != null) {
                        this.c = s.b("headers: ".concat(feboVar.toString()));
                        this.d = feboVar;
                        this.e = f(feboVar);
                        return;
                    }
                    r(feboVar);
                    emxf.m(!this.n, "Received headers on closed stream");
                    this.j.d();
                    String str = (String) feboVar.b(fend.c);
                    if (str != null) {
                        fdyt a2 = this.l.a(str);
                        if (a2 == null) {
                            b(new fedn(Status.o.withDescription(String.format("Can't find decompressor for %s", str))));
                        } else if (a2 != fdxw.a) {
                            fekl feklVar = this.o;
                            emxf.m(true, "Already set full stream decompressor");
                            ((feqv) feklVar).c = a2;
                        }
                    }
                    this.k.c(feboVar);
                }
            }
            Status status2 = this.c;
            if (status2 != null) {
                this.c = status2.b("headers: ".concat(feboVar.toString()));
                this.d = feboVar;
                this.e = f(feboVar);
            }
        } catch (Throwable th) {
            Status status3 = this.c;
            if (status3 != null) {
                this.c = status3.b("headers: ".concat(feboVar.toString()));
                this.d = feboVar;
                this.e = f(feboVar);
            }
            throw th;
        }
    }

    public final void q(febo feboVar) {
        Status b2;
        Status status = this.c;
        if (status == null && !this.f) {
            status = s(feboVar);
            this.c = status;
            if (status != null) {
                this.d = feboVar;
            }
        }
        if (status != null) {
            Status b3 = status.b("trailers: ".concat(feboVar.toString()));
            this.c = b3;
            c(b3, false, this.d);
            return;
        }
        Status status2 = (Status) feboVar.b(fdzz.b);
        if (status2 != null) {
            b2 = status2.withDescription((String) feboVar.b(fdzz.a));
        } else if (this.f) {
            b2 = Status.d.withDescription("missing GRPC status in response");
        } else {
            Integer num = (Integer) feboVar.b(b);
            b2 = (num != null ? fend.a(num.intValue()) : Status.o.withDescription("missing HTTP status code")).b("missing GRPC status, inferred error from HTTP status code");
        }
        r(feboVar);
        if (this.n) {
            feik.q.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{b2, feboVar});
        } else {
            this.j.e();
            j(b2, false, feboVar);
        }
    }
}
