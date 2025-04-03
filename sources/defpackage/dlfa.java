package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlfa extends dlaf {
    public final boolean a;

    public dlfa(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlfa) && this.a == ((dlfa) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }
}
