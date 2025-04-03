package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rig extends rhx {
    private static rig A;
    public static rig a;
    public static rig x;
    private static rig y;
    private static rig z;

    public static rig a() {
        if (z == null) {
            z = (rig) ((rig) new rig().y()).x();
        }
        return z;
    }

    public static rig b() {
        if (A == null) {
            A = (rig) ((rig) new rig().A()).x();
        }
        return A;
    }

    public static rig c(Class cls) {
        return (rig) new rig().B(cls);
    }

    public static rig d(qvx qvxVar) {
        return (rig) new rig().D(qvxVar);
    }

    public static rig e() {
        if (y == null) {
            y = (rig) ((rig) new rig().J()).x();
        }
        return y;
    }

    @Override // defpackage.rhx
    public final boolean equals(Object obj) {
        return (obj instanceof rig) && super.equals(obj);
    }
}
