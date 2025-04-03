package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drsy {
    public final boolean a;
    public final int b = 3;

    public drsy(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drsy)) {
            return false;
        }
        drsy drsyVar = (drsy) obj;
        if (this.a != drsyVar.a) {
            return false;
        }
        int i = drsyVar.b;
        return true;
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + 3;
    }

    public final String toString() {
        return "PhotosApiConfiguration(usePrimesInterceptor=" + this.a + ", requestSource=" + ((Object) Integer.toString(1)) + ")";
    }
}
