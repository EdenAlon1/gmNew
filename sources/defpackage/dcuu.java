package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerPrimaryButtonEvent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcuu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MediaViewerPrimaryButtonEvent(null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaViewerPrimaryButtonEvent[i];
    }
}
