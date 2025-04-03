package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateParticipantColorAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbak implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((bbal) ((UpdateParticipantColorAction.a) ctba.a(UpdateParticipantColorAction.a.class)).bc()).c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UpdateParticipantColorAction[i];
    }
}
