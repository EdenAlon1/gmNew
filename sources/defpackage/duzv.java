package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class duzv implements AutoCloseable {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/restrictionmanagers/FlagRestrictionManager");
    public final emxc b;
    private final duzw e;
    public final AtomicReference d = new AtomicReference(null);
    private final int f = 3;
    public final boolean c = true;

    public duzv(emxc emxcVar, duzw duzwVar) {
        this.b = emxcVar;
        this.e = duzwVar;
    }

    private static boolean b(String str) {
        return str.length() == 1 && str.charAt(0) == '-';
    }

    private static boolean d(String str) {
        return str.length() == 1 && str.charAt(0) == '*';
    }

    public abstract Object a(String str);

    public final void c(String str) {
        duzu duzuVar;
        List<String> i = this.e.b.i(str);
        if (i.isEmpty()) {
            duzuVar = duzu.b;
        } else {
            if (i.size() == 1) {
                String str2 = (String) enjk.l(i);
                if (d(str2)) {
                    duzuVar = duzu.a;
                } else if (b(str2)) {
                    duzuVar = duzu.b;
                }
            }
            enin eninVar = new enin();
            enin eninVar2 = new enin();
            for (String str3 : i) {
                if (!d(str3) && !b(str3)) {
                    boolean z = false;
                    if (str3.charAt(0) == '-') {
                        str3 = str3.substring(1);
                    } else {
                        z = true;
                    }
                    try {
                        (true != z ? eninVar2 : eninVar).c(a(str3));
                    } catch (Exception e) {
                        ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/inputmethod/restrictionmanagers/FlagRestrictionManager", "processFlag", 267, "FlagRestrictionManager.java")).t("failed to parse %s", str3);
                    }
                } else if (duzy.a) {
                    ((enrr) ((enrr) a.i()).h("com/google/android/libraries/inputmethod/restrictionmanagers/FlagRestrictionManager", "processFlag", PrivateKeyType.INVALID, "FlagRestrictionManager.java")).D("Dropped invalid item '%s' from '%s'", str3, str);
                }
            }
            enip g = eninVar.g();
            enip g2 = eninVar2.g();
            if (duzy.a) {
                if (g.isEmpty() && g2.isEmpty()) {
                    ((enrr) ((enrr) a.i()).h("com/google/android/libraries/inputmethod/restrictionmanagers/FlagRestrictionManager", "processFlag", 274, "FlagRestrictionManager.java")).t("All items are invalid in '%s'", str);
                } else if (!g.isEmpty() && !g2.isEmpty()) {
                    ((enrr) ((enrr) a.g()).h("com/google/android/libraries/inputmethod/restrictionmanagers/FlagRestrictionManager", "processFlag", 276, "FlagRestrictionManager.java")).D("Allowlisted and blocklisted items can be reduced to only allowlisted: '%s' -> '%s'", str, emww.d(',').b(g));
                }
            }
            duzuVar = new duzu();
        }
        this.d.set(duzuVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
