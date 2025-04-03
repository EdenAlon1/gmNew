package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgg {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();

    public final void a(Class cls, String str, cgh cghVar) {
        this.c.put(cls, cghVar);
        if (str != null) {
            this.d.put(str, cls);
            this.e.put(cls, str);
        }
    }
}
