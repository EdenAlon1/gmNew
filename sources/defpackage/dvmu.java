package defpackage;

import android.text.TextUtils;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvmu {
    public static String a(evts evtsVar) {
        evub evubVar = evtsVar.c;
        if (evubVar == null) {
            evubVar = evub.a;
        }
        return b(evubVar);
    }

    public static String b(evub evubVar) {
        emxf.a(evubVar != null);
        emxf.a(evubVar.c.size() > 0);
        return TextUtils.join(",", new TreeSet(evubVar.c));
    }
}
