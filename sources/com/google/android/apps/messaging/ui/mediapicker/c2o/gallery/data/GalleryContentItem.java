package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem;
import defpackage.byza;
import defpackage.dchd;
import defpackage.eohh;
import defpackage.le;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GalleryContentItem extends VisualContentItem {
    public static final Parcelable.Creator<GalleryContentItem> CREATOR = new dchd();
    public final long a;
    public final long e;
    public final byza f;

    public GalleryContentItem(Uri uri, String str, int i, int i2, long j, eohh eohhVar, long j2) {
        this(uri, true == le.x(str) ? "application/txt" : str, i, i2, j, eohhVar, j2, byza.STANDARD);
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem
    public final long d() {
        return this.e;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.content.VisualContentItem, com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.a);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f.ordinal());
    }

    public GalleryContentItem(Uri uri, String str, int i, int i2, long j, eohh eohhVar, long j2, byza byzaVar) {
        super(uri, str, eohhVar, i, i2);
        this.a = j;
        this.e = j2;
        this.f = byzaVar;
    }

    public GalleryContentItem(Uri uri, String str, int i, int i2, eohh eohhVar, long j) {
        this(uri, true == le.x(str) ? "application/txt" : str, i, i2, -1L, eohhVar, j);
    }

    public GalleryContentItem(Parcel parcel) {
        super(parcel);
        this.a = parcel.readLong();
        this.e = parcel.readLong();
        this.f = byza.values()[parcel.readInt()];
    }
}
