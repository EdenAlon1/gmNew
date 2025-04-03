package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eatf implements easy {
    public static final Parcelable.Creator<eatf> CREATOR = new eate();
    public final String a;

    public eatf(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.easy
    public final String a() {
        return this.a;
    }

    @Override // defpackage.easy
    public final /* synthetic */ boolean b() {
        return easx.a(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eatf) && ffkj.e(this.a, ((eatf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Gaia(accountName=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }
}
