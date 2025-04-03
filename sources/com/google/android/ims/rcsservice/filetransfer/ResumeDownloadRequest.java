package com.google.android.ims.rcsservice.filetransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.FileInformation;
import defpackage.dfxk;
import defpackage.dkoe;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ResumeDownloadRequest implements Parcelable {
    public static final Parcelable.Creator<ResumeDownloadRequest> CREATOR = new dkoe();

    public abstract PendingIntent a();

    public abstract FileInformation b();

    public abstract String c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.B(parcel, a());
        dfxk.m(parcel, 2, c(), false);
        dfxk.k(parcel, 3, b(), i, false);
        dfxk.c(parcel, a);
    }
}
