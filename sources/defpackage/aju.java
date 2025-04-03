package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aju {
    public final Map a = new HashMap();
    private final afq b;

    public aju(Context context, afq afqVar, Object obj, Set set) {
        this.b = afqVar;
        ksw.h(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            this.a.put(str, new amp(context, str, (apu) obj, this.b));
        }
    }
}
