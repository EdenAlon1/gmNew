package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiov implements Parcelable {
    public static final Parcelable.Creator<eiov> CREATOR = new eiou();
    private final int a;
    private Bundle b;

    protected eiov(Parcel parcel) {
        int readInt = parcel.readInt();
        this.b = new Bundle();
        this.a = readInt;
        this.b = parcel.readBundle(Bundle.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeBundle(this.b);
    }
}
