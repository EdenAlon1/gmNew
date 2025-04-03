package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhhy {
    public final fhid a;
    public final fhhz b;
    public final fhir c;
    public boolean d;
    public final fhig e;

    public fhhy(fhid fhidVar, fhhz fhhzVar, fhir fhirVar) {
        this.a = fhidVar;
        this.b = fhhzVar;
        this.c = fhirVar;
        this.e = fhirVar.c();
    }

    public final fhha a(boolean z) {
        try {
            fhha b = this.c.b(z);
            if (b != null) {
                b.l = this;
            }
            return b;
        } catch (IOException e) {
            d(e);
            throw e;
        }
    }

    public final void b() {
        this.c.c().e();
    }

    public final void c() {
        this.a.d(this, true, false, null);
    }

    public final void d(IOException iOException) {
        this.d = true;
        this.b.a(iOException);
        this.c.c().g(this.a, iOException);
    }

    public final IOException e(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        return this.a.d(this, z2, z, iOException);
    }
}
