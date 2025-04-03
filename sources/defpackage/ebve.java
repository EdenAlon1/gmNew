package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ebve {
    public static ebve d(eave eaveVar, Object obj) {
        if (obj != null) {
            if (!eaveVar.g(obj)) {
                return new ebvf(3, null);
            }
            String c = eaveVar.c(obj);
            if (c != null && c.contains("@")) {
                return new ebvf(1, c);
            }
        }
        return new ebvf(2, null);
    }

    public final dvxc a() {
        int c = c() - 1;
        if (c == 0) {
            String b = b();
            b.getClass();
            return dvyd.a(b);
        }
        if (c != 1) {
            return dvyd.b();
        }
        eyfw eyfwVar = dvyj.a;
        dvyf dvyfVar = (dvyf) dvyi.a.createBuilder();
        dvyfVar.copyOnWrite();
        dvyi dvyiVar = (dvyi) dvyfVar.instance;
        dvyiVar.d = 2;
        dvyiVar.b = 2 | dvyiVar.b;
        return new dvxc(eyfwVar, (dvyi) dvyfVar.build());
    }

    public abstract String b();

    public abstract int c();
}
