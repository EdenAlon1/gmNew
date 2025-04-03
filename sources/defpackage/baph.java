package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveCloudSyncMessageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baph implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((bapi) ((ReceiveCloudSyncMessageAction.a) ctba.a(ReceiveCloudSyncMessageAction.a.class)).bk()).c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ReceiveCloudSyncMessageAction[i];
    }
}
