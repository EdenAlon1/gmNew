package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.MarkConversationNotYetDeliveredAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baij implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((MarkConversationNotYetDeliveredAction.a) ctba.a(MarkConversationNotYetDeliveredAction.a.class)).hT().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MarkConversationNotYetDeliveredAction[i];
    }
}
