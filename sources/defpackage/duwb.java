package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duwb {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/flag/FlagFactory");
    public static final a b;

    /* compiled from: PG */
    class a extends duxx {
    }

    static {
        a aVar = new a();
        b = aVar;
        duyb.c("FlagFactory_UserUnlocked", aVar);
    }

    public static duvz a(String str, long j) {
        return duwe.a.a(Long.class, str, Long.valueOf(j));
    }

    public static duvz b(String str, String str2) {
        return duwe.a.a(String.class, str, str2);
    }

    public static void c(duwa duwaVar, duvz... duvzVarArr) {
        duwe duweVar = duwe.a;
        synchronized (duweVar.c) {
            enip enipVar = (enip) duweVar.c.get(duwaVar);
            if (enipVar == null) {
                duweVar.c.put(duwaVar, enip.p(duvzVarArr));
            } else {
                enin eninVar = new enin();
                eninVar.j(enipVar);
                eninVar.i(duvzVarArr);
                duweVar.c.put(duwaVar, eninVar.g());
            }
        }
    }

    public static duvz d(String str) {
        return duwe.a.a(Boolean.class, str, false);
    }
}
