package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.multishare.chip.ChipId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahup implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        Bundle readBundle = parcel.readBundle(ahuo.class.getClassLoader());
        if (readBundle == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object a = ih.a(readBundle, "conversation_id", ConversationId.class);
        if (a != null) {
            return new ChipId.Conversation((ConversationId) a);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChipId.Conversation[i];
    }
}
