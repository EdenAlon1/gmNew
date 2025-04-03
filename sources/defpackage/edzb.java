package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edzb {
    public static void a(Map map) {
        for (Map.Entry entry : ((enhk) map).entrySet()) {
            ekzz f = eleg.f((String) entry.getKey());
            try {
                ((edyz) ((ffbr) entry.getValue()).b()).a();
                f.close();
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
