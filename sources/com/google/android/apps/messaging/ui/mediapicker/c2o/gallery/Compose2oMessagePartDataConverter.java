package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.audio.AudioContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MessagePartDataConverter;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.file.FileContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem;
import defpackage.dcen;
import defpackage.le;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Compose2oMessagePartDataConverter implements MessagePartDataConverter {
    public static final Parcelable.Creator<Compose2oMessagePartDataConverter> CREATOR = new dcen();

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MessagePartDataConverter
    public final MediaContentItem a(MessagePartCoreData messagePartCoreData) {
        Uri v = messagePartCoreData.v();
        if (v == null) {
            return null;
        }
        if (messagePartCoreData.K() != null) {
            return new LocationContentItem(v, messagePartCoreData);
        }
        if (le.f(messagePartCoreData.V())) {
            return new AudioContentItem(v, messagePartCoreData.k());
        }
        if (messagePartCoreData.bj()) {
            String V = messagePartCoreData.V();
            V.getClass();
            int c = messagePartCoreData.c();
            int b = messagePartCoreData.b();
            String X = messagePartCoreData.X();
            X.getClass();
            return new ExpressiveStickerContentItem(v, V, c, b, X, messagePartCoreData.N());
        }
        if (messagePartCoreData.bk()) {
            String V2 = messagePartCoreData.V();
            V2.getClass();
            String Y = messagePartCoreData.Y();
            Y.getClass();
            return new FileContentItem(v, V2, Y, messagePartCoreData.p());
        }
        if (messagePartCoreData.bl()) {
            return new GifContentItem(v, v, v, "", "", "", messagePartCoreData.c(), messagePartCoreData.b());
        }
        String V3 = messagePartCoreData.V();
        V3.getClass();
        return new GalleryContentItem(v, V3, messagePartCoreData.c(), messagePartCoreData.b(), messagePartCoreData.k(), messagePartCoreData.N(), messagePartCoreData.m(), messagePartCoreData.I());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
