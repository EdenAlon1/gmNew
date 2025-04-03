package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbd extends bbc {
    private final bgu a;
    private final int b;
    private final Size c;
    private final aua d;
    private final List e;
    private final bdp f;
    private final Range g;

    public bbd(bgu bguVar, int i, Size size, aua auaVar, List list, bdp bdpVar, Range range) {
        if (bguVar == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.a = bguVar;
        this.b = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.c = size;
        if (auaVar == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.d = auaVar;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.e = list;
        this.f = bdpVar;
        this.g = range;
    }

    @Override // defpackage.bbc
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bbc
    public final Range b() {
        return this.g;
    }

    @Override // defpackage.bbc
    public final Size c() {
        return this.c;
    }

    @Override // defpackage.bbc
    public final aua d() {
        return this.d;
    }

    @Override // defpackage.bbc
    public final bdp e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        bdp bdpVar;
        Range range;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbc) {
            bbc bbcVar = (bbc) obj;
            if (this.a.equals(bbcVar.g()) && this.b == bbcVar.a() && this.c.equals(bbcVar.c()) && this.d.equals(bbcVar.d()) && this.e.equals(bbcVar.h()) && ((bdpVar = this.f) != null ? bdpVar.equals(bbcVar.e()) : bbcVar.e() == null) && ((range = this.g) != null ? range.equals(bbcVar.b()) : bbcVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bbc
    public final bgu g() {
        return this.a;
    }

    @Override // defpackage.bbc
    public final List h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        bdp bdpVar = this.f;
        int hashCode2 = ((hashCode * 1000003) ^ (bdpVar == null ? 0 : bdpVar.hashCode())) * 1000003;
        Range range = this.g;
        return hashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.a + ", imageFormat=" + this.b + ", size=" + this.c + ", dynamicRange=" + this.d + ", captureTypes=" + this.e + ", implementationOptions=" + this.f + ", targetFrameRate=" + this.g + "}";
    }
}
