package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dglo extends dglq {
    private final int a;

    public dglo(int i) {
        this.a = i;
    }

    @Override // defpackage.dglq
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof dglq) && this.a == ((dglq) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }
}
