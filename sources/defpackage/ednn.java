package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ednn extends edli {
    public static final Parcelable.Creator<ednn> CREATOR = new ednm();

    public ednn(String str, Long l, Integer num) {
        super(str, l, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b.longValue());
        parcel.writeInt(this.c.intValue());
    }
}
