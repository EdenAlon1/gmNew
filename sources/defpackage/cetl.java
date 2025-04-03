package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cetl extends cevi {
    public final String a;
    private final String b;

    public cetl(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null workQueue");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null handler");
        }
        this.b = str2;
    }

    @Override // defpackage.cevi
    public final String a() {
        return this.b;
    }

    @Override // defpackage.cevi
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cevi) {
            cevi ceviVar = (cevi) obj;
            if (this.a.equals(ceviVar.b()) && this.b.equals(ceviVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "WorkQueueAndHandlerPair{workQueue=" + this.a + ", handler=" + this.b + "}";
    }
}
