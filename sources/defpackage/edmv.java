package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edmv extends edky {
    public static final Parcelable.Creator<edmv> CREATOR = new edmu();

    public edmv(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        if (this.b == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.b);
        }
        if (this.c == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.c);
        }
    }
}
