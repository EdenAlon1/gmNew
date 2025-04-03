package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmc extends bne {
    public final Object a;
    public final bia b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final bcd h;

    public bmc(Object obj, bia biaVar, int i, Size size, Rect rect, int i2, Matrix matrix, bcd bcdVar) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.a = obj;
        this.b = biaVar;
        this.c = i;
        this.d = size;
        this.e = rect;
        this.f = i2;
        this.g = matrix;
        this.h = bcdVar;
    }

    @Override // defpackage.bne
    public final int a() {
        return this.c;
    }

    @Override // defpackage.bne
    public final int b() {
        return this.f;
    }

    @Override // defpackage.bne
    public final Matrix c() {
        return this.g;
    }

    @Override // defpackage.bne
    public final Rect d() {
        return this.e;
    }

    @Override // defpackage.bne
    public final Size e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        bia biaVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bne) {
            bne bneVar = (bne) obj;
            if (this.a.equals(bneVar.h()) && ((biaVar = this.b) != null ? biaVar.equals(bneVar.g()) : bneVar.g() == null) && this.c == bneVar.a() && this.d.equals(bneVar.e()) && this.e.equals(bneVar.d()) && this.f == bneVar.b() && this.g.equals(bneVar.c()) && this.h.equals(bneVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bne
    public final bcd f() {
        return this.h;
    }

    @Override // defpackage.bne
    public final bia g() {
        return this.b;
    }

    @Override // defpackage.bne
    public final Object h() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        bia biaVar = this.b;
        return (((((((((((((hashCode * 1000003) ^ (biaVar == null ? 0 : biaVar.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        return "Packet{data=" + this.a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}
