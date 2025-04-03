package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dkiz {
    public String f;
    protected final LinkedHashMap g = new LinkedHashMap();
    protected final LinkedHashMap h = new LinkedHashMap();

    public static final String d(LinkedHashMap linkedHashMap) {
        Iterator it = linkedHashMap.keySet().iterator();
        return it.hasNext() ? (String) linkedHashMap.get((String) it.next()) : "";
    }

    public final String b() {
        return d(this.g);
    }

    public final String c() {
        return d(this.h);
    }
}
