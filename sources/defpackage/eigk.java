package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.android.rcs.client.messaging.data.Message;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eigk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        eigl eiglVar = eigl.CHAT;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                eiglVar = (eigl) eihh.b(parcel, readInt, eigl.class);
            } else {
                if (d == 2) {
                    int ordinal = eiglVar.ordinal();
                    if (ordinal == 0) {
                        return AutoOneOf_Message_MessageContent.a((ChatMessage) dfxj.n(parcel, readInt, ChatMessage.CREATOR));
                    }
                    if (ordinal != 1) {
                        throw new IllegalArgumentException("No valid content type found.");
                    }
                    IsComposingMessage isComposingMessage = (IsComposingMessage) dfxj.n(parcel, readInt, IsComposingMessage.CREATOR);
                    isComposingMessage.getClass();
                    return new AutoOneOf_Message_MessageContent.Impl_isComposing(isComposingMessage);
                }
                dfxj.C(parcel, readInt);
            }
        }
        throw new IllegalArgumentException("Invalid contentType");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Message.MessageContent[i];
    }
}
