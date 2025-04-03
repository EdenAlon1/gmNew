package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebrz {
    public final eayr a;
    public String b;
    private final eave c;

    public ebrz(eayr eayrVar, eave eaveVar) {
        this.a = eayrVar;
        this.c = eaveVar;
    }

    public final void a(engw engwVar) {
        Object obj;
        this.a.g(engwVar);
        if (!engwVar.isEmpty() && this.a.a() == null) {
            String str = this.b;
            if (str != null) {
                int i = ((enou) engwVar).c;
                int i2 = 0;
                while (i2 < i) {
                    obj = engwVar.get(i2);
                    i2++;
                    if (str.equals(this.c.b(obj))) {
                        break;
                    }
                }
            }
            obj = null;
            if (obj == null || !engwVar.contains(obj)) {
                obj = engwVar.get(0);
            }
            this.a.h(obj);
        }
        if (engwVar.isEmpty()) {
            return;
        }
        this.b = null;
    }
}
