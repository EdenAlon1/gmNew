package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ednh extends edlf {
    public static final Parcelable.Creator<ednh> CREATOR = new edng();

    public ednh(Duration duration, int i) {
        super(duration, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeInt(this.b);
    }
}
