package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpta {
    public static fcej a() {
        fcej fcejVar = (fcej) fcek.a.createBuilder();
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).d = "RCS";
        return fcejVar;
    }

    public static fcek b(awui awuiVar) {
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        int ordinal = b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                fcej a = a();
                String str = awuiVar.d;
                a.copyOnWrite();
                fcek fcekVar = (fcek) a.instance;
                fcek fcekVar2 = fcek.a;
                str.getClass();
                fcekVar.c = str;
                fgtg fgtgVar = fgtg.PHONE_NUMBER;
                a.copyOnWrite();
                ((fcek) a.instance).b = fgtgVar.a();
                return (fcek) a.build();
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    fcej a2 = a();
                    String str2 = awuiVar.d;
                    a2.copyOnWrite();
                    fcek fcekVar3 = (fcek) a2.instance;
                    fcek fcekVar4 = fcek.a;
                    str2.getClass();
                    fcekVar3.c = str2;
                    fgtg fgtgVar2 = fgtg.RCS_BOT;
                    a2.copyOnWrite();
                    ((fcek) a2.instance).b = fgtgVar2.a();
                    return (fcek) a2.build();
                }
                if (ordinal != 4) {
                    throw new IllegalArgumentException("Invalid ChatEndpoint Type.");
                }
                fcej a3 = a();
                String str3 = awuiVar.d;
                a3.copyOnWrite();
                fcek fcekVar5 = (fcek) a3.instance;
                fcek fcekVar6 = fcek.a;
                str3.getClass();
                fcekVar5.c = str3;
                fgtg fgtgVar3 = fgtg.EMERGENCY;
                a3.copyOnWrite();
                ((fcek) a3.instance).b = fgtgVar3.a();
                return (fcek) a3.build();
            }
        }
        throw new IllegalArgumentException("Endpoint type is not supported.");
    }
}
