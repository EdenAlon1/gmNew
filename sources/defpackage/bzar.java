package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzar {
    public static final fcek a(String str) {
        fcej fcejVar = (fcej) fcek.a.createBuilder();
        fgtg fgtgVar = fgtg.DITTO;
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).b = fgtgVar.a();
        fcejVar.copyOnWrite();
        fcek fcekVar = (fcek) fcejVar.instance;
        str.getClass();
        fcekVar.c = str;
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).d = "Bugle";
        return (fcek) fcejVar.build();
    }

    public static final fcek b(String str, byzd byzdVar) {
        fgtg fgtgVar = fgtg.DITTO;
        if (byzdVar.equals(byzd.GAIA)) {
            fgtgVar = fgtg.EMAIL;
        }
        if (!fgtgVar.equals(fgtg.EMAIL)) {
            return a(str);
        }
        fcej fcejVar = (fcej) fcek.a.createBuilder();
        fgtg fgtgVar2 = fgtg.EMAIL;
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).b = fgtgVar2.a();
        fcejVar.copyOnWrite();
        fcek fcekVar = (fcek) fcejVar.instance;
        str.getClass();
        fcekVar.c = str;
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).d = "GDitto";
        return (fcek) fcejVar.build();
    }
}
