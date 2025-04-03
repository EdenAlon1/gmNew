package defpackage;

import android.util.Size;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayd extends azd {
    public final Size a;
    public final int b;
    public final List c;
    public final boolean d;
    public final avs e;
    public final azr f;
    public final bmx g;
    public final bmx h;

    public ayd(Size size, int i, List list, boolean z, avs avsVar, azr azrVar, bmx bmxVar, bmx bmxVar2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.a = size;
        this.b = i;
        this.c = list;
        this.d = z;
        this.e = avsVar;
        this.f = azrVar;
        this.g = bmxVar;
        this.h = bmxVar2;
    }

    @Override // defpackage.azd
    public final int a() {
        return this.b;
    }

    @Override // defpackage.azd
    public final Size b() {
        return this.a;
    }

    @Override // defpackage.azd
    public final avs c() {
        return this.e;
    }

    @Override // defpackage.azd
    public final azr d() {
        return this.f;
    }

    @Override // defpackage.azd
    public final bmx e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        avs avsVar;
        azr azrVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof azd) {
            azd azdVar = (azd) obj;
            if (this.a.equals(azdVar.b()) && this.b == azdVar.a() && this.c.equals(azdVar.g()) && this.d == azdVar.h() && ((avsVar = this.e) != null ? avsVar.equals(azdVar.c()) : azdVar.c() == null) && ((azrVar = this.f) != null ? azrVar.equals(azdVar.d()) : azdVar.d() == null) && this.g.equals(azdVar.f()) && this.h.equals(azdVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.azd
    public final bmx f() {
        return this.g;
    }

    @Override // defpackage.azd
    public final List g() {
        return this.c;
    }

    @Override // defpackage.azd
    public final boolean h() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
        avs avsVar = this.e;
        int hashCode2 = ((((hashCode * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (avsVar == null ? 0 : avsVar.hashCode())) * 1000003;
        azr azrVar = this.f;
        return ((((hashCode2 ^ (azrVar != null ? azrVar.hashCode() : 0)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.a + ", inputFormat=" + this.b + ", outputFormats=" + this.c + ", virtualCamera=" + this.d + ", imageReaderProxyProvider=" + this.e + ", postviewSettings=" + this.f + ", requestEdge=" + this.g + ", errorEdge=" + this.h + "}";
    }
}
