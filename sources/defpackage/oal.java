package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oal {
    public static final Map a = new LinkedHashMap();
    private final Map b = new LinkedHashMap();

    public final oaj a(String str) {
        str.getClass();
        if (!oak.a(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        oaj oajVar = (oaj) this.b.get(str);
        if (oajVar != null) {
            return oajVar;
        }
        throw new IllegalStateException(a.a(str, "Could not find Navigator with name \"", "\". You must call NavController.addNavigator() for each navigation type."));
    }

    public final Map b() {
        return ffew.l(this.b);
    }

    public final void c(oaj oajVar) {
        String b = oak.b(oajVar.getClass());
        if (!oak.a(b)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        oaj oajVar2 = (oaj) this.b.get(b);
        if (ffkj.e(oajVar2, oajVar)) {
            return;
        }
        if (oajVar2 != null && oajVar2.a) {
            throw new IllegalStateException(a.j(oajVar2, oajVar, "Navigator ", " is replacing an already attached "));
        }
        if (oajVar.a) {
            throw new IllegalStateException(a.i(oajVar, "Navigator ", " is already attached to another NavController"));
        }
    }
}
