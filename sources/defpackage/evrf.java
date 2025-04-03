package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class evrf {
    public abstract int a();

    public abstract evrc b();

    public final String toString() {
        int a = a();
        StringBuilder sb = new StringBuilder(a.B(a, " :: [ "));
        evrc b = b();
        while (a > 0) {
            sb.append(Integer.toHexString(b.b()));
            sb.append(", ");
            a--;
        }
        sb.setLength(sb.length() - 2);
        sb.append(" ]");
        return sb.toString();
    }
}
