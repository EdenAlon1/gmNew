package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjco implements fhff {
    final /* synthetic */ fjbm a;
    final /* synthetic */ fjcs b;

    public fjco(fjcs fjcsVar, fjbm fjbmVar) {
        this.a = fjbmVar;
        this.b = fjcsVar;
    }

    private final void c(Throwable th) {
        try {
            this.a.onFailure(this.b, th);
        } catch (Throwable th2) {
            fjee.m(th2);
            th2.printStackTrace();
        }
    }

    @Override // defpackage.fhff
    public final void a(IOException iOException) {
        c(iOException);
    }

    @Override // defpackage.fhff
    public final void b(fhhb fhhbVar) {
        fjdu fjduVar;
        try {
            fjcs fjcsVar = this.b;
            fhhe fhheVar = fhhbVar.g;
            fhha fhhaVar = new fhha(fhhbVar);
            fhhaVar.f = new fjcr(fhheVar.b(), fhheVar.a());
            fhhb a = fhhaVar.a();
            int i = a.d;
            try {
                if (i >= 200 && i < 300) {
                    try {
                        if (i != 204 && i != 205) {
                            fjcq fjcqVar = new fjcq(fhheVar);
                            try {
                                fjduVar = fjdu.b(fjcsVar.a.a(fjcqVar), a);
                                this.a.onResponse(this.b, fjduVar);
                            } catch (RuntimeException e) {
                                IOException iOException = fjcqVar.a;
                                if (iOException == null) {
                                    throw e;
                                }
                                throw iOException;
                            }
                        }
                        this.a.onResponse(this.b, fjduVar);
                    } catch (Throwable th) {
                        fjee.m(th);
                        th.printStackTrace();
                        return;
                    }
                    fhheVar.close();
                    fjduVar = fjdu.b(null, a);
                }
                fjee.k(fhheVar);
                if (a.a()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                fjduVar = new fjdu(a, null);
                this.a.onResponse(this.b, fjduVar);
            } finally {
                fhheVar.close();
            }
        } catch (Throwable th2) {
            fjee.m(th2);
            c(th2);
        }
    }
}
