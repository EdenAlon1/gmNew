package defpackage;

import com.android.vcard.VCardBuilder;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhjh implements fhir {
    public final fhgs a;
    public final fhig b;
    public final fhmv c;
    public final fhmu d;
    public int e;
    public final fhja f;
    public fhgh g;

    public fhjh(fhgs fhgsVar, fhig fhigVar, fhmv fhmvVar, fhmu fhmuVar) {
        this.a = fhgsVar;
        this.b = fhigVar;
        this.c = fhmvVar;
        this.d = fhmuVar;
        this.f = new fhja(fhmvVar);
    }

    public static final void l(fhna fhnaVar) {
        fhnx fhnxVar = fhnaVar.a;
        fhnaVar.a = fhnx.j;
        fhnxVar.k();
        fhnxVar.l();
    }

    private static final boolean m(fhhb fhhbVar) {
        return ffpc.j("chunked", fhhb.b(fhhbVar, "Transfer-Encoding"), true);
    }

    @Override // defpackage.fhir
    public final long a(fhhb fhhbVar) {
        if (!fhis.b(fhhbVar)) {
            return 0L;
        }
        if (m(fhhbVar)) {
            return -1L;
        }
        return fhhl.i(fhhbVar);
    }

    @Override // defpackage.fhir
    public final fhha b(boolean z) {
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(a.h(i, "state: "));
        }
        try {
            fhiz a = fhiy.a(this.f.a());
            fhha fhhaVar = new fhha();
            fhhaVar.d(a.a);
            fhhaVar.b = a.b;
            fhhaVar.c = a.c;
            fhhaVar.c(this.f.b());
            if (z && a.b == 100) {
                return null;
            }
            int i2 = a.b;
            if (i2 != 100 && (i2 < 102 || i2 >= 200)) {
                this.e = 4;
                return fhhaVar;
            }
            this.e = 3;
            return fhhaVar;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.a.a.i.e()), e);
        }
    }

    @Override // defpackage.fhir
    public final fhig c() {
        return this.b;
    }

    @Override // defpackage.fhir
    public final fhnt d(fhgv fhgvVar, long j) {
        if (ffpc.j("chunked", fhgvVar.a("Transfer-Encoding"), true)) {
            int i = this.e;
            if (i != 1) {
                throw new IllegalStateException(a.h(i, "state: "));
            }
            this.e = 2;
            return new fhjc(this);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        int i2 = this.e;
        if (i2 != 1) {
            throw new IllegalStateException(a.h(i2, "state: "));
        }
        this.e = 2;
        return new fhjf(this);
    }

    @Override // defpackage.fhir
    public final fhnv e(fhhb fhhbVar) {
        if (!fhis.b(fhhbVar)) {
            return j(0L);
        }
        if (m(fhhbVar)) {
            fhgv fhgvVar = fhhbVar.a;
            int i = this.e;
            if (i != 4) {
                throw new IllegalStateException(a.h(i, "state: "));
            }
            fhgk fhgkVar = fhgvVar.a;
            this.e = 5;
            return new fhjd(this, fhgkVar);
        }
        long i2 = fhhl.i(fhhbVar);
        if (i2 != -1) {
            return j(i2);
        }
        int i3 = this.e;
        if (i3 != 4) {
            throw new IllegalStateException(a.h(i3, "state: "));
        }
        this.e = 5;
        this.b.e();
        return new fhjg(this);
    }

    @Override // defpackage.fhir
    public final void f() {
        this.b.b();
    }

    @Override // defpackage.fhir
    public final void g() {
        this.d.flush();
    }

    @Override // defpackage.fhir
    public final void h() {
        this.d.flush();
    }

    @Override // defpackage.fhir
    public final void i(fhgv fhgvVar) {
        Proxy.Type type = this.b.a.b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(fhgvVar.b);
        sb.append(' ');
        if (fhgvVar.a.h || type != Proxy.Type.HTTP) {
            sb.append(fhiw.a(fhgvVar.a));
        } else {
            sb.append(fhgvVar.a);
        }
        sb.append(" HTTP/1.1");
        k(fhgvVar.c, sb.toString());
    }

    public final fhnv j(long j) {
        int i = this.e;
        if (i != 4) {
            throw new IllegalStateException(a.h(i, "state: "));
        }
        this.e = 5;
        return new fhje(this, j);
    }

    public final void k(fhgh fhghVar, String str) {
        int i = this.e;
        if (i != 0) {
            throw new IllegalStateException(a.h(i, "state: "));
        }
        fhmu fhmuVar = this.d;
        fhmuVar.aa(str);
        fhmuVar.aa(VCardBuilder.VCARD_END_OF_LINE);
        int a = fhghVar.a();
        for (int i2 = 0; i2 < a; i2++) {
            fhmu fhmuVar2 = this.d;
            fhmuVar2.aa(fhghVar.c(i2));
            fhmuVar2.aa(": ");
            fhmuVar2.aa(fhghVar.d(i2));
            fhmuVar2.aa(VCardBuilder.VCARD_END_OF_LINE);
        }
        this.d.aa(VCardBuilder.VCARD_END_OF_LINE);
        this.e = 1;
    }
}
