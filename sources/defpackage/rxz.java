package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<rxz> CREATOR = new rya();
    public final String a;
    public final int b;
    public final int c;
    public final float d;

    public rxz(String str, int i, int i2, float f) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxz)) {
            return false;
        }
        rxz rxzVar = (rxz) obj;
        return this.b == rxzVar.b && this.c == rxzVar.c && Objects.equals(this.a, rxzVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return "Rewrite{text='" + this.a + "', tone=" + this.b + ", safetyClassificationResult=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.h(parcel, 4, this.d);
        dfxk.c(parcel, a);
    }
}
