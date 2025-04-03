package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elgo implements fecw {
    private final elbx a;

    public elgo(elbx elbxVar) {
        this.a = elbxVar;
    }

    @Override // defpackage.fecw
    public final fect a(fecu fecuVar, febo feboVar, fecv fecvVar) {
        elas g = this.a.g(fecuVar.d().b, elad.a);
        try {
            ekzz f = eleg.f(fecuVar.d().b);
            try {
                elgl elglVar = new elgl(fecvVar.a(new elgm(fecuVar, f), feboVar), elds.b());
                f.close();
                g.close();
                return elglVar;
            } finally {
            }
        } catch (Throwable th) {
            try {
                g.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
