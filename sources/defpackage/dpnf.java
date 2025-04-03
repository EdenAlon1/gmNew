package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpnf extends dpni {
    public final drje a;

    public dpnf() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpnf) && ffkj.e(this.a, ((dpnf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Full(aspectRatio=" + this.a + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dpnf(byte[] bArr) {
        super(true);
        drje drjeVar = new drje(3, 4);
        this.a = drjeVar;
    }
}
