package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class dizd extends dizc {
    private static final Object a = new Object();
    private static volatile dizd b;
    private final ConcurrentMap e;

    private dizd() {
        super("KillSwitch__");
        this.e = new ConcurrentHashMap();
    }

    public static diyy a(int i) {
        dizd c = c();
        String format = String.format(Locale.US, "bug_%s", Integer.valueOf(i));
        diyy diyyVar = (diyy) c.e.get(format);
        if (diyyVar != null) {
            return diyyVar;
        }
        diza i2 = c().i(format, true);
        diyy diyyVar2 = (diyy) c.e.putIfAbsent(format, i2);
        return diyyVar2 == null ? i2 : diyyVar2;
    }

    public static dizd c() {
        if (b == null) {
            d();
        }
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("CsLibKillSwitch flags are not initialized!");
    }

    static void d() {
        synchronized (a) {
            if (b == null) {
                b = new dizd();
                b.l();
            }
        }
    }

    @Override // defpackage.dizc
    protected final engw b() {
        return engw.n(this.e.values());
    }
}
