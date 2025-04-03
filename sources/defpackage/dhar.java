package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.SetGoogleLocationAccuracyRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhar implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = ewfw.SOURCE_UNKNOWN.m;
        byte[] bArr = null;
        boolean z = false;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                z = dfxj.D(parcel, readInt);
            } else if (d == 2) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 3) {
                bArr = dfxj.E(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                bArr2 = dfxj.E(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new SetGoogleLocationAccuracyRequest(z, i, bArr, bArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SetGoogleLocationAccuracyRequest[i];
    }
}
