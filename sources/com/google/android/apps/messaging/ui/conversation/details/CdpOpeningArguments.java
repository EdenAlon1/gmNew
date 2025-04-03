package com.google.android.apps.messaging.ui.conversation.details;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cynh;
import defpackage.ffkd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CdpOpeningArguments implements Parcelable {
    public static final Parcelable.Creator<CdpOpeningArguments> CREATOR = new cynh();
    public final int a;

    public CdpOpeningArguments() {
        this(0, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
    }

    public CdpOpeningArguments(int i) {
        this.a = i;
    }

    public /* synthetic */ CdpOpeningArguments(int i, int i2, ffkd ffkdVar) {
        this(1 == (i2 & 1) ? 0 : i);
    }
}
