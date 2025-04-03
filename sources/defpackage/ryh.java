package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ryh> CREATOR = new ryi();
    public final String a;
    public final int b;
    public final float c;

    public ryh(String str, int i, float f) {
        this.a = str;
        this.b = i;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryh)) {
            return false;
        }
        ryh ryhVar = (ryh) obj;
        return this.b == ryhVar.b && Float.compare(ryhVar.c, this.c) == 0 && Objects.equals(this.a, ryhVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public final String toString() {
        return "SmartReplyReplyEntry{text='" + this.a + "', safetyClassificationResult=" + this.b + ", score=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.h(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
