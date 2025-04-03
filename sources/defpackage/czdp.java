package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czdp {
    private static final emye a = emye.d(" ");

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        Iterator it = a.g(str).iterator();
        while (it.hasNext()) {
            sb.appendCodePoint(Integer.parseInt((String) it.next(), 16));
        }
        return sb.toString();
    }

    public final boolean b(String str) {
        Iterator it = a.g(str).iterator();
        while (it.hasNext()) {
            if (ermn.i((String) it.next(), 16) == null) {
                return false;
            }
        }
        return true;
    }
}
