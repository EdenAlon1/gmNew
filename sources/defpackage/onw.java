package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class onw extends onf {
    public static final Parcelable.Creator<onw> CREATOR = new onv();
    public final int a;

    public onw(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    public onw(Parcelable parcelable, int i) {
        super(parcelable);
        this.a = i;
    }
}
