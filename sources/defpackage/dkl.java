package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkl {
    private final hho a;

    public dkl() {
        this(null);
    }

    public final dkk a() {
        return (dkk) this.a.a();
    }

    public final void b(dkk dkkVar) {
        this.a.b(dkkVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkl) {
            return ffkj.e(((dkl) obj).a(), a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + a() + ')';
    }

    public /* synthetic */ dkl(byte[] bArr) {
        this.a = new hic(dki.a, hla.a);
    }
}
