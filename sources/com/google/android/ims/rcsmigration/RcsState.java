package com.google.android.ims.rcsmigration;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkmk;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RcsState implements Parcelable {
    public static final Parcelable.Creator<RcsState> CREATOR = new dkmk();
    private final int a;
    private final LegacyData b;

    public RcsState(int i, LegacyData legacyData) {
        this.a = i;
        this.b = legacyData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        int i = this.a;
        return i != 1 ? i != 2 ? "Operation mode UNKNOWN" : "Operation mode FULL STACK" : "Operation mode NETWORK ONLY";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, 0);
    }

    public RcsState(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = (LegacyData) parcel.readParcelable(LegacyData.class.getClassLoader());
    }
}
