package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeix {
    public String a;
    public int b;

    public eeix() {
        this.b = 1;
    }

    public static boolean a(String str) {
        return str.charAt(0) == '[' && str.charAt(str.length() + (-1)) == ']';
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof eeix)) {
            return emxb.a(this.a, ((eeix) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public eeix(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null host name");
        }
        this.a = str;
        this.b = str.indexOf(58) != -1 ? 3 : 2;
    }
}
