package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerSaveButtonEvent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcuv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MediaViewerSaveButtonEvent(null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaViewerSaveButtonEvent[i];
    }
}
