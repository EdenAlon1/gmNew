package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class ceyr {
    /* JADX WARN: Type inference failed for: r6v3, types: [eyhs, java.lang.Object] */
    public static ceyr e(ceun ceunVar, ceww cewwVar) {
        ceve c = cewwVar.c(ceunVar.c);
        String str = ceunVar.c;
        ?? f = c.d().f(ceunVar.d);
        ceup ceupVar = ceunVar.e;
        if (ceupVar == null) {
            ceupVar = ceup.a;
        }
        cetp cetpVar = new cetp();
        if (!cfkj.a(ceupVar.c)) {
            cetpVar.a = ceupVar.c;
        }
        if (!cfkj.a(ceupVar.d)) {
            cetpVar.b = ceupVar.d;
        }
        if ((ceupVar.b & 1) != 0) {
            eyev eyevVar = ceupVar.e;
            if (eyevVar == null) {
                eyevVar = eyev.a;
            }
            eyev eyevVar2 = ceupVar.e;
            if (eyevVar2 == null) {
                eyevVar2 = eyev.a;
            }
            if (!eyevVar.equals(eyevVar2.getDefaultInstanceForType())) {
                eyev eyevVar3 = ceupVar.e;
                if (eyevVar3 == null) {
                    eyevVar3 = eyev.a;
                }
                cetpVar.c = eykj.c(eyevVar3);
            }
        }
        if (!cfkj.a(ceupVar.f)) {
            cetpVar.d = ceupVar.f;
        }
        return new cetm(str, f, cetpVar.a(), new cqoq("Deserialized WorkQueueRequest"));
    }

    public static ceyr f(String str) {
        return g(str, cetw.a);
    }

    public static ceyr g(String str, eyhs eyhsVar) {
        return h(str, eyhsVar, new cetp().a());
    }

    public static ceyr h(String str, eyhs eyhsVar, cfkl cfklVar) {
        return new cetm(str, eyhsVar, cfklVar, new cqoq(str));
    }

    public abstract cfkl a();

    public abstract cqor b();

    public abstract eyhs c();

    public abstract String d();
}
