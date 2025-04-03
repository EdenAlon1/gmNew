package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpqj implements dpqk {
    public final drnn a;

    public dpqj(drnn drnnVar) {
        drnnVar.getClass();
        this.a = drnnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpqj) && ffkj.e(this.a, ((dpqj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(media=" + this.a + ")";
    }
}
