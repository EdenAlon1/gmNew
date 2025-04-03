package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asw extends aww {
    public final Size a;
    public final Rect b;
    public final bct c;
    public final int d;
    public final boolean e;

    public asw(Size size, Rect rect, bct bctVar, int i, boolean z) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.a = size;
        this.b = rect;
        this.c = bctVar;
        this.d = i;
        this.e = z;
    }

    @Override // defpackage.aww
    public final int a() {
        return this.d;
    }

    @Override // defpackage.aww
    public final Rect b() {
        return this.b;
    }

    @Override // defpackage.aww
    public final Size c() {
        return this.a;
    }

    @Override // defpackage.aww
    public final bct d() {
        return this.c;
    }

    @Override // defpackage.aww
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        bct bctVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aww) {
            aww awwVar = (aww) obj;
            if (this.a.equals(awwVar.c()) && this.b.equals(awwVar.b()) && ((bctVar = this.c) != null ? bctVar.equals(awwVar.d()) : awwVar.d() == null) && this.d == awwVar.a() && this.e == awwVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        bct bctVar = this.c;
        return (((((hashCode * 1000003) ^ (bctVar == null ? 0 : bctVar.hashCode())) * 1000003) ^ this.d) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "CameraInputInfo{inputSize=" + this.a + ", inputCropRect=" + this.b + ", cameraInternal=" + this.c + ", rotationDegrees=" + this.d + ", mirroring=" + this.e + "}";
    }
}
