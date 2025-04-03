package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.learning.BrellaInvocationOptions;
import com.google.android.gms.learning.InAppTrainingConstraints;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgto implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        InAppTrainingConstraints inAppTrainingConstraints = null;
        byte[] bArr = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                str2 = dfxj.t(parcel, readInt);
            } else if (d == 3) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 4) {
                inAppTrainingConstraints = (InAppTrainingConstraints) dfxj.n(parcel, readInt, InAppTrainingConstraints.CREATOR);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                bArr = dfxj.E(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new BrellaInvocationOptions(str, str2, i, inAppTrainingConstraints, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BrellaInvocationOptions[i];
    }
}
