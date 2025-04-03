package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.wearable.action.RequestMoreMessagesAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class defb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new RequestMoreMessagesAction(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RequestMoreMessagesAction[i];
    }
}
