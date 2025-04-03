package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyfb {
    private final Object a;
    private final int b;

    public eyfb(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eyfb)) {
            return false;
        }
        eyfb eyfbVar = (eyfb) obj;
        return this.a == eyfbVar.a && this.b == eyfbVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
