package defpackage;

import android.content.pm.Signature;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SigningInfoCompat;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfdi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Signature[] signatureArr = null;
        boolean z = false;
        boolean z2 = false;
        Signature[] signatureArr2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                z = dfxj.D(parcel, readInt);
            } else if (d == 2) {
                z2 = dfxj.D(parcel, readInt);
            } else if (d == 3) {
                signatureArr = (Signature[]) dfxj.J(parcel, readInt, Signature.CREATOR);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                signatureArr2 = (Signature[]) dfxj.J(parcel, readInt, Signature.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new SigningInfoCompat(z, z2, signatureArr, signatureArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SigningInfoCompat[i];
    }
}
