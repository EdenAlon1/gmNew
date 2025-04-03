package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaty implements easy {
    public static final eaty a = new eaty();
    public static final Parcelable.Creator<eaty> CREATOR = new eatx();

    private eaty() {
    }

    @Override // defpackage.easy
    public final String a() {
        return "signed_out";
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
        if (!(obj instanceof eaty)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436297177;
    }

    public final String toString() {
        return "YouTubeVisitor";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
