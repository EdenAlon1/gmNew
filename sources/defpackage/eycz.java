package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eycz {
    public static int a(String str, int i) {
        while (i < str.length() && str.charAt(i) != '-') {
            i++;
        }
        return i;
    }

    public static int b(eycy eycyVar) {
        return eycyVar.d - eycyVar.c;
    }

    public static String c(String str, eycy eycyVar) {
        int i = eycyVar.b;
        return str.substring(eycyVar.c + i, i + eycyVar.d);
    }
}
