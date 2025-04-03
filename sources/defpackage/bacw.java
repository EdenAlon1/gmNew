package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ClearCloudSyncMessagesAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bacw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ClearCloudSyncMessagesAction.a) ctba.a(ClearCloudSyncMessagesAction.a.class)).hF().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ClearCloudSyncMessagesAction[i];
    }
}
