package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esfw implements esfx {
    private final esfk a;

    public esfw(esfk esfkVar) {
        this.a = esfkVar;
    }

    @Override // defpackage.esfx
    public final String a(esfh esfhVar, esfi esfiVar) {
        if (esfy.a(esfhVar.b()) == 10) {
            long b = esfhVar.b();
            esfhVar.c(b + (esfy.b(b) * 90));
        }
        esfi esfiVar2 = esfi.E164;
        return esfiVar == esfiVar2 ? this.a.b(esfhVar, esfiVar2) : this.a.b(esfhVar, esfi.INTERNATIONAL);
    }
}
