package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxf implements acus {
    private final acxa a;

    public acxf(acxa acxaVar) {
        this.a = acxaVar;
    }

    @Override // defpackage.acus
    public final elfl a(esnk esnkVar, esnl esnlVar) {
        esnx esnxVar = esnkVar.b == 104 ? (esnx) esnkVar.c : esnx.a;
        if (esnxVar.equals(esnx.a)) {
            throw new IllegalStateException("Request has incorrect payload");
        }
        acxa acxaVar = this.a;
        esly eslyVar = esnxVar.b;
        if (eslyVar == null) {
            eslyVar = esly.a;
        }
        String str = eslyVar.d;
        esly eslyVar2 = esnxVar.b;
        String str2 = (eslyVar2 == null ? esly.a : eslyVar2).b;
        if (eslyVar2 == null) {
            eslyVar2 = esly.a;
        }
        acxaVar.f(str, str2, eslyVar2.c);
        eyex eyexVar = eyex.a;
        esnlVar.copyOnWrite();
        esnn esnnVar = (esnn) esnlVar.instance;
        esnn esnnVar2 = esnn.a;
        eyexVar.getClass();
        esnnVar.c = eyexVar;
        esnnVar.b = 104;
        return elfo.e(esnlVar.build());
    }
}
