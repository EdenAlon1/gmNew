package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brb extends brg {
    public final bra a;

    public brb(bra braVar) {
        super(braVar);
        this.a = braVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof brb) {
            return this.a.equals(((brb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().replaceFirst("FileDescriptorOutputOptionsInternal", "FileDescriptorOutputOptions");
    }
}
