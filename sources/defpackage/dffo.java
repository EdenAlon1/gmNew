package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.PostSignInData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dffo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Intent intent = null;
        int i = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                intent = (Intent) dfxj.n(parcel, readInt, Intent.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) dfxj.n(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new PostSignInData(i, intent, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PostSignInData[i];
    }
}
