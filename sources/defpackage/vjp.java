package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.conversation.screen.ConversationActivityUsageStatisticsState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ConversationActivityUsageStatisticsState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConversationActivityUsageStatisticsState[i];
    }
}
