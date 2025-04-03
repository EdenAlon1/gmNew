package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xis {
    public final boolean a;
    public final int b;
    public final alyx c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;

    public xis(int i, boolean z, int i2, alyx alyxVar, long j, boolean z2, boolean z3, boolean z4) {
        this.h = i;
        this.a = z;
        this.b = i2;
        this.c = alyxVar;
        this.d = j;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xis)) {
            return false;
        }
        xis xisVar = (xis) obj;
        return this.h == xisVar.h && this.a == xisVar.a && this.b == xisVar.b && this.c == xisVar.c && this.d == xisVar.d && this.e == xisVar.e && this.f == xisVar.f && this.g == xisVar.g;
    }

    public final int hashCode() {
        int a = (((((this.h * 31) + xir.a(this.a)) * 31) + this.b) * 31) + this.c.hashCode();
        long j = this.d;
        boolean z = this.g;
        return (((((((a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + xir.a(this.e)) * 31) + xir.a(this.f)) * 31) + xir.a(z);
    }

    public final String toString() {
        return "ComposeConstraintsTransportData(attachmentMode=" + ((Object) alxf.a(this.h)) + ", locationSharingSupported=" + this.a + ", attachmentCountLimit=" + this.b + ", bestAvailableTransportFeatureSet=" + this.c + ", maxCharacterLimit=" + this.d + ", editSupported=" + this.e + ", remoteDeleteSupported=" + this.f + ", h265DecodingSupported=" + this.g + ")";
    }
}
