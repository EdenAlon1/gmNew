package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhox {
    public static final fhow a = new fhow();

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }
}
