package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acwm implements acus {
    private final acxa a;

    public acwm(acxa acxaVar) {
        this.a = acxaVar;
    }

    @Override // defpackage.acus
    public final elfl a(esnk esnkVar, esnl esnlVar) {
        esmd esmdVar = esnkVar.b == 106 ? (esmd) esnkVar.c : esmd.a;
        if (esmdVar.b.isEmpty()) {
            this.a.b();
        } else {
            this.a.c(esmdVar.b);
        }
        eyex eyexVar = eyex.a;
        esnlVar.copyOnWrite();
        esnn esnnVar = (esnn) esnlVar.instance;
        esnn esnnVar2 = esnn.a;
        eyexVar.getClass();
        esnnVar.c = eyexVar;
        esnnVar.b = 106;
        return elfo.e(esnlVar.build());
    }
}
