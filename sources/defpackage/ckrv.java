package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckrv {
    public static final boolean a(String str, String str2, byyy byyyVar) {
        if (str.isEmpty() && byyyVar == byyy.NAME_IS_AUTOMATIC) {
            return false;
        }
        return (!str.isEmpty() && byyyVar == byyy.NAME_IS_MANUAL && str.equals(str2)) ? false : true;
    }
}
