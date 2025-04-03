package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfp implements lra {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public nfp(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static nfp d(luv luvVar) {
        int e = luvVar.e();
        String f = lre.f(luvVar.z(luvVar.e(), StandardCharsets.US_ASCII));
        String y = luvVar.y(luvVar.e());
        int e2 = luvVar.e();
        int e3 = luvVar.e();
        int e4 = luvVar.e();
        int e5 = luvVar.e();
        int e6 = luvVar.e();
        byte[] bArr = new byte[e6];
        luvVar.F(bArr, 0, e6);
        return new nfp(e, f, y, e2, e3, e4, e5, bArr);
    }

    @Override // defpackage.lra
    public final /* synthetic */ lqc a() {
        return null;
    }

    @Override // defpackage.lra
    public final void b(lqy lqyVar) {
        lqyVar.a(this.h, this.a);
    }

    @Override // defpackage.lra
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nfp nfpVar = (nfp) obj;
            if (this.a == nfpVar.a && this.b.equals(nfpVar.b) && this.c.equals(nfpVar.c) && this.d == nfpVar.d && this.e == nfpVar.e && this.f == nfpVar.f && this.g == nfpVar.g && Arrays.equals(this.h, nfpVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + Arrays.hashCode(this.h);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
