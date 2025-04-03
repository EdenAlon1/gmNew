package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class oqd {
    public abstract int a();

    public abstract Object b();

    public final boolean c() {
        return b() != null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oqd) {
            oqd oqdVar = (oqd) obj;
            Object b = b();
            if ((b == null ? oqdVar.b() == null : b.equals(oqdVar.b())) && a() == oqdVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a() >>> 8;
    }
}
