package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationInteractiveTimestampAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((UpdateConversationInteractiveTimestampAction.a) ctba.a(UpdateConversationInteractiveTimestampAction.a.class)).it().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UpdateConversationInteractiveTimestampAction[i];
    }
}
