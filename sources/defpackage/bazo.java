package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateCloudSyncMessageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bazo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((UpdateCloudSyncMessageAction.a) ctba.a(UpdateCloudSyncMessageAction.a.class)).ir().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UpdateCloudSyncMessageAction[i];
    }
}
