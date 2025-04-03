package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oak {
    public static final boolean a(String str) {
        return str != null && str.length() > 0;
    }

    public static final String b(Class cls) {
        cls.getClass();
        String str = (String) oal.a.get(cls);
        if (str == null) {
            oag oagVar = (oag) cls.getAnnotation(oag.class);
            str = oagVar != null ? oagVar.a() : null;
            if (!a(str)) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(String.valueOf(cls.getSimpleName())));
            }
            oal.a.put(cls, str);
        }
        str.getClass();
        return str;
    }
}
