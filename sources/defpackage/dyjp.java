package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyjp {
    public static dzig a(dzqs dzqsVar) {
        dzhz dzhzVar = new dzhz();
        char c = 65535;
        int a = dzqsVar.h().a() - 1;
        if (a == 1) {
            dzhzVar.c(2);
        } else if (a == 2) {
            String str = ((dznp) dzqsVar.h().b()).a;
            int hashCode = str.hashCode();
            if (hashCode != -989034367) {
                if (hashCode == -843123565 && str.equals("rich_card")) {
                    c = 1;
                }
            } else if (str.equals("photos")) {
                c = 0;
            }
            if (c == 0) {
                dzhzVar.c(3);
            } else if (c != 1) {
                dzhzVar.c(0);
            } else {
                dzhzVar.c(9);
            }
        } else if (a == 3) {
            dzhzVar.c(7);
        } else if (a != 4) {
            dzhzVar.c(0);
        } else {
            dzhzVar.c(8);
        }
        dzhzVar.d(dzqsVar.c());
        dzhzVar.b(dzqsVar.j().a().f);
        return dzhzVar.a();
    }
}
