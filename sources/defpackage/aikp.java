package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.navigation.targets.EditedMedia;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aikp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new EditedMedia(parcel.readString(), (Uri) parcel.readParcelable(EditedMedia.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new EditedMedia[i];
    }
}
