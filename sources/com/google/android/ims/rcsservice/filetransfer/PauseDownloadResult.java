package com.google.android.ims.rcsservice.filetransfer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.dkoc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class PauseDownloadResult implements Parcelable {
    public static final Parcelable.Creator<PauseDownloadResult> CREATOR = new dkoc();

    public abstract FileTransferResult a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, a(), i, false);
        dfxk.c(parcel, a);
    }
}
