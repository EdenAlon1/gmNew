package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.auth.api.identity.SigningInfoCompat;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfco implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        SigningInfoCompat signingInfoCompat = null;
        String str2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                signingInfoCompat = (SigningInfoCompat) dfxj.n(parcel, readInt, SigningInfoCompat.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                str2 = dfxj.t(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new CallingAppInfoCompat(str, signingInfoCompat, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CallingAppInfoCompat[i];
    }
}
