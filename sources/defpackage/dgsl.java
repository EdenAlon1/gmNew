package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.kids.GetParentVerificationIntentRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgsl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        PendingIntent pendingIntent2 = null;
        byte[] bArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 3:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 4:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 5:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 6:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 7:
                    pendingIntent = (PendingIntent) dfxj.n(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 8:
                    bArr2 = dfxj.E(parcel, readInt);
                    break;
                case 9:
                    pendingIntent2 = (PendingIntent) dfxj.n(parcel, readInt, PendingIntent.CREATOR);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new GetParentVerificationIntentRequest(i, i2, str, i3, bArr, pendingIntent, pendingIntent2, bArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetParentVerificationIntentRequest[i];
    }
}
