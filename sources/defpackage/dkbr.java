package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkbr {
    static String a(djti djtiVar, String str) {
        if (djtiVar == null) {
            throw new dkbs("Characteristic cannot be null.", 1);
        }
        String e = djtiVar.e(str);
        if (e != null) {
            return e;
        }
        throw new dkbs(str.concat(" parameter cannot be null."), 3);
    }

    static void b(djti djtiVar, String[] strArr) {
        if (djtiVar == null) {
            throw new dkbs("Characteristic cannot be null.", 1);
        }
        for (String str : strArr) {
            if (djtiVar.e(str) == null) {
                throw new dkbs(String.valueOf(str).concat(" parameter cannot be null."), 3);
            }
        }
    }
}
