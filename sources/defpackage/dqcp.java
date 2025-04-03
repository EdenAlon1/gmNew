package defpackage;

import android.util.Size;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqcp {
    public final dpnf a;
    public Size b;
    public int c;
    public int d;
    public final Map e = new LinkedHashMap();

    public dqcp(dpnf dpnfVar) {
        this.a = dpnfVar;
    }

    public final void a(boolean z, boolean z2) {
        int i;
        this.e.clear();
        if (z) {
            this.e.put(0, new eirs(6, 1));
            i = 1;
        } else {
            i = 0;
        }
        if (z2) {
            this.e.put(Integer.valueOf(i), new eirs(6, 1));
            i++;
        }
        this.e.putAll(ffew.h(new ffcf(Integer.valueOf(i), new eirs(3, 2)), new ffcf(Integer.valueOf(i + 1), new eirs(3, 1)), new ffcf(Integer.valueOf(i + 2), new eirs(3, 1))));
    }
}
