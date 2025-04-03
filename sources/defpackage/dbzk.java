package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediapicker.c2o.contact.VCardContentItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbzk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        bcwz bcwzVar = (bcwz) ((VCardContentItem.a) ctba.a(VCardContentItem.a.class)).de().a.b();
        bcwzVar.getClass();
        parcel.getClass();
        return new VCardContentItem(bcwzVar, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VCardContentItem[i];
    }
}
