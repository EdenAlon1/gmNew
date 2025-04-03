package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doxm implements doxr<doxs> {
    public static final Parcelable.Creator<doxm> CREATOR = new doxk();
    public final String a;
    public final int b;

    public doxm(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doxm)) {
            return false;
        }
        doxm doxmVar = (doxm) obj;
        return ffkj.e(this.a, doxmVar.a) && this.b == doxmVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b;
    }

    public final String toString() {
        return "External(authority=" + this.a + ", entryPoint=" + ((Object) doxl.a(this.b)) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(doxl.a(this.b));
    }
}
