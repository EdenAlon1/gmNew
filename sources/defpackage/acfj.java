package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfj {
    public final String a;
    private final acfk b;

    public acfj(acfk acfkVar, String str) {
        this.b = acfkVar;
        this.a = str;
    }

    public final acfo a() {
        csjq csjqVar = new csjq() { // from class: acfi
            @Override // defpackage.csjq
            public final void a(StringBuilder sb) {
                sb.append(acfj.this.a);
            }
        };
        acfo acfoVar = (acfo) acfo.a.get();
        if (acfoVar == null) {
            acfo acfoVar2 = new acfo(this.b);
            acfo.a.set(acfoVar2);
            acfoVar = acfoVar2;
        } else {
            acfoVar.r();
        }
        acfoVar.t(2, "Diagnostics", csjqVar);
        return acfoVar;
    }

    public final void b(String str) {
        acfo a = a();
        a.I(str);
        a.r();
    }
}
