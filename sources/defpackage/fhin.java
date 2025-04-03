package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhin implements fhgl {
    private final fhft a;

    public fhin(fhft fhftVar) {
        this.a = fhftVar;
    }

    @Override // defpackage.fhgl
    public final fhhb a(fhiu fhiuVar) {
        fhhe fhheVar;
        fhgv fhgvVar = fhiuVar.c;
        fhgu fhguVar = new fhgu(fhgvVar);
        fhgz fhgzVar = fhgvVar.d;
        if (fhgzVar != null) {
            fhgn b = fhgzVar.b();
            if (b != null) {
                fhguVar.b(fhpi.a, b.c);
            }
            long a = fhgzVar.a();
            if (a != -1) {
                fhguVar.b("Content-Length", String.valueOf(a));
                fhguVar.e("Transfer-Encoding");
            } else {
                fhguVar.b("Transfer-Encoding", "chunked");
                fhguVar.e("Content-Length");
            }
        }
        boolean z = false;
        if (fhgvVar.a("Host") == null) {
            fhguVar.b("Host", fhhl.l(fhgvVar.a, false));
        }
        if (fhgvVar.a("Connection") == null) {
            fhguVar.b("Connection", "Keep-Alive");
        }
        if (fhgvVar.a("Accept-Encoding") == null && fhgvVar.a("Range") == null) {
            fhguVar.b("Accept-Encoding", "gzip");
            z = true;
        }
        if (fhgvVar.a("User-Agent") == null) {
            fhguVar.b("User-Agent", "okhttp/4.12.0");
        }
        fhhb b2 = fhiuVar.b(fhguVar.a());
        fhis.a(this.a, fhgvVar.a, b2.f);
        fhha fhhaVar = new fhha(b2);
        fhhaVar.a = fhgvVar;
        if (z && ffpc.j("gzip", fhhb.b(b2, "Content-Encoding"), true) && fhis.b(b2) && (fhheVar = b2.g) != null) {
            fhnb fhnbVar = new fhnb(fhheVar.c());
            fhgf e = b2.f.e();
            e.f("Content-Encoding");
            e.f("Content-Length");
            fhhaVar.c(e.b());
            fhhaVar.f = new fhiv(fhhb.b(b2, fhpi.a), -1L, new fhnp(fhnbVar));
        }
        return fhhaVar.a();
    }
}
