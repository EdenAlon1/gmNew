package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.AutoValue_RevokeMessageResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RevokeMessageResponse;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eicj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        MessagingResult messagingResult = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                messagingResult = (MessagingResult) dfxj.n(parcel, readInt, MessagingResult.CREATOR);
                if (messagingResult == null) {
                    throw new NullPointerException("Null result");
                }
            }
        }
        if (messagingResult != null) {
            return new AutoValue_RevokeMessageResponse(messagingResult);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RevokeMessageResponse[0];
    }
}
