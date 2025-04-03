package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdyv {
    static final emww a = emww.d(',');
    public static final fdyv b = new fdyv(fdxw.a, false, new fdyv(new fdxv(), true, new fdyv()));
    public final byte[] c;
    private final Map d;

    public fdyv() {
        this.d = new LinkedHashMap(0);
        this.c = new byte[0];
    }

    public final fdyt a(String str) {
        fdyu fdyuVar = (fdyu) this.d.get(str);
        if (fdyuVar != null) {
            return fdyuVar.a;
        }
        return null;
    }

    private fdyv(fdyt fdytVar, boolean z, fdyv fdyvVar) {
        String c = fdytVar.c();
        emxf.b(!c.contains(","), "Comma is currently not allowed in message encoding");
        int size = fdyvVar.d.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fdyvVar.d.containsKey(fdytVar.c()) ? size : size + 1);
        for (fdyu fdyuVar : fdyvVar.d.values()) {
            String c2 = fdyuVar.a.c();
            if (!c2.equals(c)) {
                linkedHashMap.put(c2, new fdyu(fdyuVar.a, fdyuVar.b));
            }
        }
        linkedHashMap.put(c, new fdyu(fdytVar, z));
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        this.d = unmodifiableMap;
        emww emwwVar = a;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            if (((fdyu) entry.getValue()).b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.c = emwwVar.b(DesugarCollections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }
}
