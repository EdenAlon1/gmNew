package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khq extends khk {
    public khq(char[] cArr) {
        super(cArr);
    }

    public static khq a(String str) {
        khq khqVar = new khq(str.toCharArray());
        khqVar.z();
        khqVar.x(str.length() - 1);
        return khqVar;
    }

    @Override // defpackage.khk
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof khq) && v().equals(((khq) obj).v())) {
            return true;
        }
        return super.equals(obj);
    }
}
