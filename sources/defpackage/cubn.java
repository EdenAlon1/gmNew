package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cubn {
    public static final cubn a = new cubn();
    public static final cfup b = cfvl.h(cfvl.b, "s_allow_list", "");
    private static final cfup c = cfvl.i(cfvl.b, "s_allow_list_ignore_case", true);

    private cubn() {
    }

    public final boolean a(aoku aokuVar) {
        if (aokuVar == null) {
            return false;
        }
        String l = aokuVar.l();
        Object e = b.e();
        e.getClass();
        List<String> V = ffpc.V((CharSequence) e, new String[]{","}, 0, 6);
        if (V.isEmpty()) {
            return false;
        }
        for (String str : V) {
            Object e2 = c.e();
            e2.getClass();
            if (ffpc.j(str, l, ((Boolean) e2).booleanValue())) {
                return true;
            }
        }
        return false;
    }
}
