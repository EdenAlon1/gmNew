package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fguk {
    private final Map a = new HashMap();
    private final Map b = new HashMap();

    protected static final boolean c() {
        return fhel.b("ical4j.parsing.relaxed");
    }

    protected final void b(String str, Object obj) {
        this.a.put(str, obj);
    }

    protected final Object ic(String str) {
        Object obj = this.a.get(str);
        return obj == null ? this.b.get(str) : obj;
    }
}
