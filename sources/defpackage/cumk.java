package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cumk {
    private final fbcx a;

    public cumk(fbcx fbcxVar) {
        fbcxVar.getClass();
        this.a = fbcxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cumk) && this.a == ((cumk) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerdictEnforcementResult(action=" + this.a + ")";
    }
}
