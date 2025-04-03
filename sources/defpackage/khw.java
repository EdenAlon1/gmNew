package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khw {
    final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    public final float a(Object obj) {
        if (!(obj instanceof khq)) {
            if (obj instanceof khm) {
                return ((khm) obj).t();
            }
            return 0.0f;
        }
        String v = ((khq) obj).v();
        if (this.b.containsKey(v)) {
            return ((khu) this.b.get(v)).a();
        }
        if (this.a.containsKey(v)) {
            return ((Integer) this.a.get(v)).floatValue();
        }
        return 0.0f;
    }

    public final void b(String str, int i) {
        this.a.put(str, Integer.valueOf(i));
    }

    public final void c(String str, ArrayList arrayList) {
        this.c.put(str, arrayList);
    }
}
