package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateParticipantRcsAvailableAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbam implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new UpdateParticipantRcsAvailableAction(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UpdateParticipantRcsAvailableAction[i];
    }
}
