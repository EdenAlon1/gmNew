package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ParticipantFullRefreshAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baiu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ParticipantFullRefreshAction.a) ctba.a(ParticipantFullRefreshAction.a.class)).hU().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ParticipantFullRefreshAction[i];
    }
}
