package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzec {
    public static dzpg a(fbik fbikVar) {
        dzil dzilVar = new dzil();
        dzpf dzpfVar = dzpf.UNKNOWN;
        int b = fbjw.b(fbikVar.b);
        if (b == 0) {
            b = 1;
        }
        int i = b - 2;
        if (i == 1) {
            dzilVar.e(dzpf.PHONE_NUMBER);
        } else if (i == 2) {
            dzilVar.e(dzpf.EMAIL);
        } else if (i == 3) {
            dzilVar.e(dzpf.HANDLER);
            dzilVar.b(fbikVar.d);
        } else if (i != 5) {
            dzilVar.e(dzpf.UNKNOWN);
        } else {
            dzilVar.e(dzpf.DEVICE_ID);
        }
        dzilVar.c(fbikVar.c);
        dzilVar.d(fbikVar.e);
        return dzilVar.a();
    }

    public static fbik b(dzpg dzpgVar) {
        fbij fbijVar = (fbij) fbik.a.createBuilder();
        String d = dzpgVar.d();
        fbijVar.copyOnWrite();
        ((fbik) fbijVar.instance).c = d;
        String e = dzpgVar.e();
        fbijVar.copyOnWrite();
        ((fbik) fbijVar.instance).e = e;
        dzpf dzpfVar = dzpf.UNKNOWN;
        int ordinal = dzpgVar.b().ordinal();
        if (ordinal == 0) {
            fbijVar.copyOnWrite();
            ((fbik) fbijVar.instance).b = fbjw.a(2);
        } else if (ordinal == 1) {
            fbijVar.copyOnWrite();
            ((fbik) fbijVar.instance).b = fbjw.a(3);
        } else if (ordinal == 2) {
            fbijVar.copyOnWrite();
            ((fbik) fbijVar.instance).b = fbjw.a(4);
        } else if (ordinal != 3) {
            if (ordinal == 4) {
                fbijVar.copyOnWrite();
                ((fbik) fbijVar.instance).b = fbjw.a(7);
            }
        } else if (dzpgVar.c().g()) {
            fbijVar.copyOnWrite();
            ((fbik) fbijVar.instance).b = fbjw.a(5);
            String str = (String) dzpgVar.c().c();
            fbijVar.copyOnWrite();
            ((fbik) fbijVar.instance).d = str;
        }
        return (fbik) fbijVar.build();
    }

    public static fbik c(dzjh dzjhVar) {
        dzpf dzpfVar = dzpf.UNKNOWN;
        int c = dzjhVar.c() - 1;
        if (c == 1) {
            return b(dzjhVar.a());
        }
        if (c != 2) {
            fbij fbijVar = (fbij) fbik.a.createBuilder();
            fbijVar.copyOnWrite();
            ((fbik) fbijVar.instance).b = fbjw.a(2);
            return (fbik) fbijVar.build();
        }
        fbij fbijVar2 = (fbij) fbik.a.createBuilder();
        fbijVar2.copyOnWrite();
        ((fbik) fbijVar2.instance).b = fbjw.a(6);
        String str = ((dziq) dzjhVar.b()).b;
        fbijVar2.copyOnWrite();
        ((fbik) fbijVar2.instance).e = str;
        String str2 = ((dziq) dzjhVar.b()).a;
        fbijVar2.copyOnWrite();
        ((fbik) fbijVar2.instance).c = str2;
        return (fbik) fbijVar2.build();
    }
}
