package defpackage;

import android.util.Range;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bbq extends bgr {
    public final Size a;
    public final Size b;
    public final aua c;
    public final Range d;
    public final bdp e;
    public final boolean f;

    public bbq(Size size, Size size2, aua auaVar, Range range, bdp bdpVar, boolean z) {
        this.a = size;
        this.b = size2;
        this.c = auaVar;
        this.d = range;
        this.e = bdpVar;
        this.f = z;
    }

    @Override // defpackage.bgr
    public final Range a() {
        return this.d;
    }

    @Override // defpackage.bgr
    public final Size b() {
        return this.b;
    }

    @Override // defpackage.bgr
    public final Size c() {
        return this.a;
    }

    @Override // defpackage.bgr
    public final aua d() {
        return this.c;
    }

    @Override // defpackage.bgr
    public final bdp e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        bdp bdpVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bgr) {
            bgr bgrVar = (bgr) obj;
            if (this.a.equals(bgrVar.c()) && this.b.equals(bgrVar.b()) && this.c.equals(bgrVar.d()) && this.d.equals(bgrVar.a()) && ((bdpVar = this.e) != null ? bdpVar.equals(bgrVar.e()) : bgrVar.e() == null) && this.f == bgrVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bgr
    public final bgq f() {
        return new bbp(this);
    }

    @Override // defpackage.bgr
    public final boolean g() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        bdp bdpVar = this.e;
        return (((hashCode * 1000003) ^ (bdpVar == null ? 0 : bdpVar.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        return "StreamSpec{resolution=" + this.a + ", originalConfiguredResolution=" + this.b + ", dynamicRange=" + this.c + ", expectedFrameRateRange=" + this.d + ", implementationOptions=" + this.e + ", zslDisabled=" + this.f + "}";
    }
}
