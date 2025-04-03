package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fbck extends fbch {
    private final engw b;

    public fbck(engw engwVar) {
        this.b = engwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fbch
    public final fbcc a(fbcd fbcdVar) {
        int i = engw.d;
        engr engrVar = new engr();
        int i2 = 0;
        while (true) {
            engw engwVar = this.b;
            if (i2 >= ((enou) engwVar).c) {
                break;
            }
            fbch fbchVar = (fbch) engwVar.get(i2);
            try {
                engrVar.h(fbchVar.a(fbcdVar));
            } catch (RuntimeException e) {
                fbco.d(e, fbchVar, fbcdVar);
            }
            i2++;
        }
        engw g = engrVar.g();
        return !g.isEmpty() ? ((enou) g).c == 1 ? new fbcl((fbcc) enjk.l(g)) : new fbci(g) : fbcc.a;
    }
}
