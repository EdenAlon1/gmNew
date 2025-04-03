package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.video.VideoOverlayView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deab implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Context context = (Context) ((VideoOverlayView.GetMediaDurationAction.a) ctba.a(VideoOverlayView.GetMediaDurationAction.a.class)).dh().a.b();
        context.getClass();
        parcel.getClass();
        return new VideoOverlayView.GetMediaDurationAction(context, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VideoOverlayView.GetMediaDurationAction[i];
    }
}
