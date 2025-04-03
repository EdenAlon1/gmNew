package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhkg implements fhir {
    public static final List a = fhhl.n("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List b = fhhl.n("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    private final fhig c;
    private final fhiu d;
    private final fhkf e;
    private volatile fhkn f;
    private final fhgt g;
    private volatile boolean h;

    public fhkg(fhgs fhgsVar, fhig fhigVar, fhiu fhiuVar, fhkf fhkfVar) {
        this.c = fhigVar;
        this.d = fhiuVar;
        this.e = fhkfVar;
        this.g = fhgsVar.s.contains(fhgt.e) ? fhgt.e : fhgt.d;
    }

    @Override // defpackage.fhir
    public final long a(fhhb fhhbVar) {
        if (fhis.b(fhhbVar)) {
            return fhhl.i(fhhbVar);
        }
        return 0L;
    }

    @Override // defpackage.fhir
    public final fhha b(boolean z) {
        fhkn fhknVar = this.f;
        if (fhknVar == null) {
            throw new IOException("stream wasn't created");
        }
        fhgt fhgtVar = this.g;
        fhgh a2 = fhknVar.a();
        fhgtVar.getClass();
        fhgf fhgfVar = new fhgf();
        int a3 = a2.a();
        fhiz fhizVar = null;
        for (int i = 0; i < a3; i++) {
            String c = a2.c(i);
            String d = a2.d(i);
            if (ffkj.e(c, ":status")) {
                fhizVar = fhiy.a("HTTP/1.1 ".concat(String.valueOf(d)));
            } else if (!b.contains(c)) {
                fhgfVar.c(c, d);
            }
        }
        if (fhizVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        fhha fhhaVar = new fhha();
        fhhaVar.d(fhgtVar);
        fhhaVar.b = fhizVar.b;
        fhhaVar.c = fhizVar.c;
        fhhaVar.c(fhgfVar.b());
        if (z && fhhaVar.b == 100) {
            return null;
        }
        return fhhaVar;
    }

    @Override // defpackage.fhir
    public final fhig c() {
        return this.c;
    }

    @Override // defpackage.fhir
    public final fhnt d(fhgv fhgvVar, long j) {
        fhkn fhknVar = this.f;
        fhknVar.getClass();
        return fhknVar.b();
    }

    @Override // defpackage.fhir
    public final fhnv e(fhhb fhhbVar) {
        fhkn fhknVar = this.f;
        fhknVar.getClass();
        return fhknVar.g;
    }

    @Override // defpackage.fhir
    public final void f() {
        this.h = true;
        fhkn fhknVar = this.f;
        if (fhknVar != null) {
            fhknVar.l(9);
        }
    }

    @Override // defpackage.fhir
    public final void g() {
        fhkn fhknVar = this.f;
        fhknVar.getClass();
        fhknVar.b().close();
    }

    @Override // defpackage.fhir
    public final void h() {
        this.e.d();
    }

    @Override // defpackage.fhir
    public final void i(fhgv fhgvVar) {
        int i;
        fhkn fhknVar;
        boolean z;
        if (this.f == null) {
            boolean z2 = fhgvVar.d != null;
            fhgh fhghVar = fhgvVar.c;
            ArrayList arrayList = new ArrayList(fhghVar.a() + 4);
            arrayList.add(new fhjl(fhjl.c, fhgvVar.b));
            arrayList.add(new fhjl(fhjl.d, fhiw.a(fhgvVar.a)));
            String a2 = fhgvVar.a("Host");
            if (a2 != null) {
                arrayList.add(new fhjl(fhjl.f, a2));
            }
            arrayList.add(new fhjl(fhjl.e, fhgvVar.a.b));
            int a3 = fhghVar.a();
            for (int i2 = 0; i2 < a3; i2++) {
                String c = fhghVar.c(i2);
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = c.toLowerCase(locale);
                lowerCase.getClass();
                if (!a.contains(lowerCase) || (ffkj.e(lowerCase, "te") && ffkj.e(fhghVar.d(i2), "trailers"))) {
                    arrayList.add(new fhjl(lowerCase, fhghVar.d(i2)));
                }
            }
            fhkf fhkfVar = this.e;
            boolean z3 = !z2;
            synchronized (fhkfVar.u) {
                synchronized (fhkfVar) {
                    if (fhkfVar.f > 1073741823) {
                        fhkfVar.l(8);
                    }
                    if (fhkfVar.g) {
                        throw new fhji();
                    }
                    i = fhkfVar.f;
                    fhkfVar.f = i + 2;
                    fhknVar = new fhkn(i, fhkfVar, z3, false, null);
                    z = !z2 || fhkfVar.s >= fhkfVar.t || fhknVar.e >= fhknVar.f;
                    if (fhknVar.i()) {
                        fhkfVar.c.put(Integer.valueOf(i), fhknVar);
                    }
                }
                fhkfVar.u.f(z3, i, arrayList);
            }
            if (z) {
                fhkfVar.u.d();
            }
            this.f = fhknVar;
            if (this.h) {
                fhkn fhknVar2 = this.f;
                fhknVar2.getClass();
                fhknVar2.l(9);
                throw new IOException("Canceled");
            }
            fhkn fhknVar3 = this.f;
            fhknVar3.getClass();
            fhknVar3.i.n(this.d.e, TimeUnit.MILLISECONDS);
            fhkn fhknVar4 = this.f;
            fhknVar4.getClass();
            fhknVar4.j.n(this.d.f, TimeUnit.MILLISECONDS);
        }
    }
}
