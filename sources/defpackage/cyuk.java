package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyuk {
    public final int a;

    public cyuk(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cyuk) && this.a == ((cyuk) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "ActionsArguments(callerSource=" + ((Object) cyvn.a(this.a)) + ")";
    }

    public cyuk() {
        this(2);
    }
}
