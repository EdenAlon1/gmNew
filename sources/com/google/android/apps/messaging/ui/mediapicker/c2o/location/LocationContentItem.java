package com.google.android.apps.messaging.ui.mediapicker.c2o.location;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import defpackage.dcjy;
import defpackage.eohh;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LocationContentItem extends MediaContentItem {
    public static final Parcelable.Creator<LocationContentItem> CREATOR = new dcjy();
    public final MessagePartCoreData a;

    public LocationContentItem(Uri uri, MessagePartCoreData messagePartCoreData) {
        super(uri, "image/jpeg", messagePartCoreData != null ? messagePartCoreData.N() : eohh.LOCATION_CURRENT);
        this.a = messagePartCoreData;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final int b() {
        return 400;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final int c() {
        return 800;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final boolean equals(Object obj) {
        return (obj instanceof LocationContentItem) && this.a.K().equals(((LocationContentItem) obj).a.K());
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.a.K());
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, i);
    }

    public LocationContentItem(Parcel parcel) {
        super(parcel);
        this.a = (MessagePartCoreData) parcel.readParcelable(MessagePartData.class.getClassLoader());
    }
}
