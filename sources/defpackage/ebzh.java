package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ebzh extends ebzv {
    public final boolean a;
    public final Parcelable b;

    public ebzh(boolean z, Parcelable parcelable) {
        this.a = z;
        if (parcelable == null) {
            throw new NullPointerException("Null parentState");
        }
        this.b = parcelable;
    }

    @Override // defpackage.ebzv
    public final Parcelable a() {
        return this.b;
    }

    @Override // defpackage.ebzv
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebzv) {
            ebzv ebzvVar = (ebzv) obj;
            if (this.a == ebzvVar.b() && this.b.equals(ebzvVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "State{isPortraitInFullScreen=" + this.a + ", parentState=" + this.b.toString() + "}";
    }
}
