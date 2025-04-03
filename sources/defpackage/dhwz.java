package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhwz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) dfxj.n(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new PaymentCardRecognitionIntentResponse(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PaymentCardRecognitionIntentResponse[i];
    }
}
