package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.GetHubTokenInternalResponse;
import com.google.android.gms.auth.TokenData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dezs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        TokenData tokenData = null;
        String str = null;
        Intent intent = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                tokenData = (TokenData) dfxj.n(parcel, readInt, TokenData.CREATOR);
            } else if (d == 2) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 3) {
                intent = (Intent) dfxj.n(parcel, readInt, Intent.CREATOR);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) dfxj.n(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new GetHubTokenInternalResponse(tokenData, str, intent, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetHubTokenInternalResponse[i];
    }
}
