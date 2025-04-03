package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardVideoOverlayView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czpq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Context context = (Context) ((RichCardVideoOverlayView.GetMediaDurationAction.a) ctba.a(RichCardVideoOverlayView.GetMediaDurationAction.a.class)).dc().a.b();
        context.getClass();
        parcel.getClass();
        return new RichCardVideoOverlayView.GetMediaDurationAction(context, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RichCardVideoOverlayView.GetMediaDurationAction[i];
    }
}
