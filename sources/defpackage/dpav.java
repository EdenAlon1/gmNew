package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpav {
    public final String a;
    public final dpas b;
    private final int c;

    public dpav(String str, dpas dpasVar) {
        dpasVar.getClass();
        this.a = str;
        this.c = 1;
        this.b = dpasVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpav)) {
            return false;
        }
        dpav dpavVar = (dpav) obj;
        if (!ffkj.e(this.a, dpavVar.a)) {
            return false;
        }
        int i = dpavVar.c;
        return ffkj.e(this.b, dpavVar.b);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AttachmentSerializerMetadata(name=" + this.a + ", version=1, serializer=" + this.b + ")";
    }
}
