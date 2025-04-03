package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esfz implements esfx {
    final esfk a;

    public esfz(esfk esfkVar) {
        this.a = esfkVar;
    }

    @Override // defpackage.esfx
    public final String a(esfh esfhVar, esfi esfiVar) {
        if (esfhVar.a() == 52 && this.a.j(esfhVar)) {
            long b = esfhVar.b();
            esfp esfpVar = (esfp) esfhVar;
            if (esfy.a(b) + esfpVar.a.g > 10 && b > 0 && ((int) (b / esfy.b(b))) == 1 && (esfpVar.a.b & 128) == 0) {
                esfhVar.c(b % esfy.b(b));
            }
        }
        String b2 = this.a.b(esfhVar, esfiVar);
        return (!emxe.c(b2) && esfiVar == esfi.NATIONAL && b2.startsWith("01 ")) ? b2.replaceFirst("01 ", "") : b2;
    }
}
