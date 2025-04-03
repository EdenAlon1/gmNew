package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dftn {
    private final Object a;
    private final String b;

    public dftn(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final String a() {
        return this.b + "@" + System.identityHashCode(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dftn)) {
            return false;
        }
        dftn dftnVar = (dftn) obj;
        return this.a == dftnVar.a && this.b.equals(dftnVar.b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
