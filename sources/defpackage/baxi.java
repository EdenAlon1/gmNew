package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageToConversationOrParticipantsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baxi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((baxj) ((SendMessageToConversationOrParticipantsAction.a) ctba.a(SendMessageToConversationOrParticipantsAction.a.class)).bt()).c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SendMessageToConversationOrParticipantsAction[i];
    }
}
