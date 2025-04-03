package com.google.android.apps.messaging.ui.mediapicker.audio;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import defpackage.dbxi;
import defpackage.eohh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AudioContentItem extends MediaContentItem {
    public static final Parcelable.Creator<AudioContentItem> CREATOR = new dbxi();
    public final long a;

    public AudioContentItem(Uri uri, long j) {
        super(uri, "audio/amr", eohh.AUDIO_CHOOSER);
        this.a = j;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.a);
    }

    public AudioContentItem(Parcel parcel) {
        super(parcel);
        this.a = parcel.readLong();
    }
}
