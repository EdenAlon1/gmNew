package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediaviewer.BaseMediaViewerEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dctj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        dctk e = MediaViewerButton.e();
        e.e(parcel.readInt());
        e.b(parcel.readInt());
        e.d(parcel.readInt());
        e.c((BaseMediaViewerEvent) parcel.readParcelable(getClass().getClassLoader()));
        return e.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaViewerButton[i];
    }
}
