package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem;
import defpackage.dcek;
import defpackage.eohh;
import defpackage.epsw;
import defpackage.eyfc;
import defpackage.eyfy;
import defpackage.eygu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CameraContentItem extends VisualContentItem {
    public static final Parcelable.Creator<CameraContentItem> CREATOR = new dcek();
    public final epsw a;
    public final long e;
    public final long f;

    public CameraContentItem(Uri uri, String str, int i, int i2, long j, eohh eohhVar, long j2, epsw epswVar) {
        super(uri, str, eohhVar, i, i2);
        this.e = j;
        this.f = j2;
        this.a = epswVar;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final long d() {
        return this.f;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem, com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        byte[] byteArray = this.a.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }

    public CameraContentItem(Parcel parcel) {
        super(parcel);
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        try {
            this.a = (epsw) eyfy.parseFrom(epsw.a, bArr, eyfc.a());
        } catch (eygu e) {
            throw new IllegalArgumentException("Unable to parse CameraCaptureInformation", e);
        }
    }
}
