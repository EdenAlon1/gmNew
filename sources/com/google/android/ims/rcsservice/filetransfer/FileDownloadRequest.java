package com.google.android.ims.rcsservice.filetransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.FileInformation;
import defpackage.dfxk;
import defpackage.dknp;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class FileDownloadRequest implements Parcelable {
    public static final Parcelable.Creator<FileDownloadRequest> CREATOR = new dknp();

    public abstract PendingIntent a();

    public abstract FileInformation b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.B(parcel, a());
        dfxk.k(parcel, 2, b(), i, false);
        dfxk.c(parcel, a);
    }
}
