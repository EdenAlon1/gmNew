package com.google.android.apps.messaging.ui.mediaviewer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dcsg;
import defpackage.dctj;
import defpackage.dctk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class MediaViewerButton implements Parcelable {
    public static final Parcelable.Creator<MediaViewerButton> CREATOR = new dctj();

    public static dctk e() {
        dcsg dcsgVar = new dcsg();
        dcsgVar.e(-1);
        dcsgVar.b(-1);
        dcsgVar.d(-1);
        dcsgVar.c(new BaseMediaViewerEvent());
        return dcsgVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract BaseMediaViewerEvent d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(c());
        parcel.writeInt(a());
        parcel.writeInt(b());
        parcel.writeParcelable(d(), 0);
    }
}
