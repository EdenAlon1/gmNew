package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clbi {
    private static final Pattern a = Pattern.compile("^[a-zA-Z0-9\\x21\\x23-\\x27\\x2a-\\x2b\\x2d\\x5e-\\x60\\x7c\\x7e]+$");
    private static final Pattern b = Pattern.compile("^[^\\p{Cntrl}]*$");
    private final Map c;

    private clbi(Map map) {
        this.c = map;
    }

    public static clbi a() {
        return new clbi(new TreeMap(String.CASE_INSENSITIVE_ORDER));
    }

    public static clbi b(fayv fayvVar) {
        clbi a2 = a();
        if (fayvVar != null) {
            for (Map.Entry entry : DesugarCollections.unmodifiableMap(fayvVar.b).entrySet()) {
                String str = (String) entry.getKey();
                for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((fayz) entry.getValue()).b).entrySet()) {
                    a2.e(str, (String) entry2.getKey(), (String) entry2.getValue());
                }
            }
        }
        return a2;
    }

    private final void e(String str, String str2, String str3) {
        emxf.b(a.matcher(str2).matches(), "The headerName has not allowed characters.");
        emxf.b(b.matcher(str3).matches(), "The headerValue has not allowed characters.");
        if (!this.c.containsKey(str)) {
            this.c.put(str, new TreeMap(String.CASE_INSENSITIVE_ORDER));
        }
        Map map = (Map) this.c.get(str);
        if (map == null) {
            throw new IllegalStateException("Could not add a new custom header due to null map.");
        }
        map.put(str2, str3);
    }

    public final fayv c() {
        fayt faytVar = (fayt) fayv.a.createBuilder();
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            fayx fayxVar = (fayx) fayz.a.createBuilder();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                fayxVar.b((String) entry2.getKey(), (String) entry2.getValue());
            }
            faytVar.a(str, (fayz) fayxVar.build());
        }
        return (fayv) faytVar.build();
    }

    public final void d(clbg clbgVar, String str, String str2) {
        e(clbgVar.o, str, str2);
    }
}
