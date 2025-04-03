package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebkp {
    public static Object a(eave eaveVar, Object obj, enhk enhkVar, Object obj2) {
        if (obj == null || !eaveVar.g(obj)) {
            return null;
        }
        Object obj3 = enhkVar.get(b(eaveVar, obj));
        return obj3 != null ? obj3 : obj2;
    }

    public static String b(eave eaveVar, Object obj) {
        return eaveVar.c(obj);
    }
}
