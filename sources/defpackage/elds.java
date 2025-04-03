package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elds {
    public final elat a;

    private elds(elat elatVar) {
        this.a = elatVar;
    }

    public static elds b() {
        return new elds(ekyf.e());
    }

    public static elds c() {
        return new elds(ekyf.k);
    }

    public static Runnable d(elds eldsVar, Runnable runnable) {
        elat elatVar = eldsVar.a;
        elatVar.getClass();
        long j = eldl.a;
        elatVar.getClass();
        return new elda(elatVar, runnable);
    }

    public static void e(elds eldsVar) {
        ekyf.g(eldsVar.a);
    }

    public static elds g() {
        return new elds(ekyf.c());
    }

    public final elav a() {
        elat elatVar = this.a;
        final elat c = ekyf.c();
        ekyf.g(elatVar);
        return new elav() { // from class: eldr
            @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                ekyf.g(elat.this);
            }
        };
    }

    public final boolean f() {
        return this.a == null;
    }

    public final String toString() {
        elat elatVar = this.a;
        return elatVar == null ? "null ref" : elatVar.toString();
    }
}
