package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edyp {
    private final Context a;
    private final Set b;

    public edyp(Context context, Map map) {
        this.a = context;
        this.b = ((enhk) map).keySet();
    }

    public final boolean a() {
        if (!edyn.b()) {
            return false;
        }
        String a = edyn.a(this.a);
        if (a == null) {
            return true;
        }
        int size = this.b.size();
        if (size == 0) {
            return a.equals(this.a.getPackageName());
        }
        if (size != 1) {
            throw new IllegalArgumentException("More than 1 custom main process specified");
        }
        String a2 = ((edyo) enjk.l(this.b)).a();
        emxf.f(a2.startsWith(":"), "The provided @CustomMainProcess is not an app-private one, i.e. the one staring with colon(':'). @CustomMainProcess value: %s", a2);
        return a.equals(String.valueOf(this.a.getPackageName()).concat(String.valueOf(a2)));
    }
}
