package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationXmsLatchAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbah implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new UpdateConversationXmsLatchAction(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UpdateConversationXmsLatchAction[i];
    }
}
