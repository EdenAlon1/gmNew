package com.google.android.apps.messaging.ui.mediaviewer;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dcuu;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MediaViewerPrimaryButtonEvent extends BaseMediaViewerEvent {
    public static final Parcelable.Creator<MediaViewerPrimaryButtonEvent> CREATOR = new dcuu();
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();

    public MediaViewerPrimaryButtonEvent() {
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.BaseMediaViewerEvent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public MediaViewerPrimaryButtonEvent(byte[] bArr) {
    }

    @Override // com.google.android.apps.messaging.ui.mediaviewer.BaseMediaViewerEvent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
