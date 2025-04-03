package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eeib extends eehy {
    public static final eehy f;

    static {
        String str;
        String str2;
        eejk eejkVar;
        eeig eeigVar;
        dktn dktnVar;
        engw engwVar;
        eehk eehkVar;
        eehn eehnVar = new eehn();
        eehnVar.a = "user";
        eehnVar.b = "domain";
        eehnVar.c = "stub";
        eehnVar.e = new eehv();
        eejk eejkVar2 = eejk.TCP;
        if (eejkVar2 == null) {
            throw new NullPointerException("Null transportProtocol");
        }
        eehnVar.d = eejkVar2;
        eehnVar.f = new dktn("test");
        int i = engw.d;
        eehnVar.g = engw.n(enou.a);
        eehnVar.h = new eehk();
        String str3 = eehnVar.a;
        if (str3 != null && (str = eehnVar.b) != null && (str2 = eehnVar.c) != null && (eejkVar = eehnVar.d) != null && (eeigVar = eehnVar.e) != null && (dktnVar = eehnVar.f) != null && (engwVar = eehnVar.g) != null && (eehkVar = eehnVar.h) != null) {
            f = new eeho(str3, str, str2, eejkVar, eeigVar, dktnVar, engwVar, eehkVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (eehnVar.a == null) {
            sb.append(" user");
        }
        if (eehnVar.b == null) {
            sb.append(" domain");
        }
        if (eehnVar.c == null) {
            sb.append(" sipInstance");
        }
        if (eehnVar.d == null) {
            sb.append(" transportProtocol");
        }
        if (eehnVar.e == null) {
            sb.append(" sipTransactionLayer");
        }
        if (eehnVar.f == null) {
            sb.append(" logTag");
        }
        if (eehnVar.g == null) {
            sb.append(" messageFilters");
        }
        if (eehnVar.h == null) {
            sb.append(" addressFactory");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static eeia x() {
        eehl eehlVar = new eehl();
        int i = engw.d;
        eehlVar.b(enou.a);
        eehlVar.d = new eehk();
        return eehlVar;
    }
}
