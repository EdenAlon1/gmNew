package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkux {
    private final ctvb a;

    public dkux(ctvb ctvbVar) {
        this.a = ctvbVar;
    }

    public final String a(String str) {
        if (str.startsWith("\"")) {
            str = str.substring(str.indexOf(34, 1) + 2);
        }
        if (str.startsWith("<")) {
            str = str.substring(1, str.length() - 1);
        }
        if (str.startsWith("sip:") || str.startsWith("tel:")) {
            str = str.substring(4);
        } else if (str.startsWith("sips:")) {
            str = str.substring(5);
        }
        int indexOf = str.indexOf(64);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return (!dkut.w(str) || dizg.w()) ? str : this.a.x(str);
    }
}
