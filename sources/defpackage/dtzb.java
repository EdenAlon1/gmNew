package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtzb {
    public static final String[] a = new String[0];
    public static final enhk b;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("NULL", "@null");
        enhdVar.k("true", "true");
        enhdVar.k("TRUE", "true");
        enhdVar.k("false", "false");
        enhdVar.k("FALSE", "false");
        b = enhdVar.c();
    }

    public static void a(List list, StringBuilder sb) {
        if (sb.length() > 0) {
            list.add(sb.toString());
        } else {
            list.add("");
        }
    }
}
