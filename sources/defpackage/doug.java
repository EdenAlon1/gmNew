package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doug implements doui {
    private final boolean a;
    private final float b;
    private final dotn c;

    public doug() {
        this(null);
    }

    public static /* synthetic */ doug a(doug dougVar, boolean z, float f) {
        return new doug(z, f, dougVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doug)) {
            return false;
        }
        doug dougVar = (doug) obj;
        return this.a == dougVar.a && Float.compare(this.b, dougVar.b) == 0 && ffkj.e(this.c, dougVar.c);
    }

    public final int hashCode() {
        return ((((true != this.a ? 1237 : 1231) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "LoadingInProgress(visible=" + this.a + ", loadingProgress=" + this.b + ", flags=" + this.c + ")";
    }

    public doug(boolean z, float f, dotn dotnVar) {
        this.a = z;
        this.b = f;
        this.c = dotnVar;
    }

    public /* synthetic */ doug(byte[] bArr) {
        this(true, 0.0f, new dotn(null));
    }
}
