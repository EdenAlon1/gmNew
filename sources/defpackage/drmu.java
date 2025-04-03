package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drmu extends drnd {
    public static final Parcelable.Creator<drmu> CREATOR = new drmt();
    private final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drmu(String str) {
        super(str);
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.drnd, defpackage.drka
    public final String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drmu) && ffkj.e(this.a, ((drmu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UnknownVideoFormat(subType=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }
}
