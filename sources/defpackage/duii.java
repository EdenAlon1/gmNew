package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duii implements Parcelable, qtp {
    public static final Parcelable.Creator<duii> CREATOR = new duih();
    public final String b;

    public duii(Parcel parcel) {
        this.b = parcel.readString();
    }

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        if (obj instanceof duii) {
            return this.b.equals(((duii) obj).b);
        }
        return false;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ProvidedFifeUrl{baseUrl='" + this.b + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }

    public duii(String str) {
        if (!eera.a(str)) {
            throw new IllegalArgumentException("baseUrl is not a fife Url: ".concat(String.valueOf(str)));
        }
        this.b = str;
    }
}
