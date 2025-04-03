package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amew implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        throw new UnsupportedOperationException("InvalidConversationId should never be serialized.");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InvalidConversationId[i];
    }
}
