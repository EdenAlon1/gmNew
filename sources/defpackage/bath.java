package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveWapPushSiMessageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bath implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ReceiveWapPushSiMessageAction.a) ctba.a(ReceiveWapPushSiMessageAction.a.class)).bl().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ReceiveWapPushSiMessageAction[i];
    }
}
