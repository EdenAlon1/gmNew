package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.PutDataRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class diab implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        long j = 0;
        Uri uri = null;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                uri = (Uri) dfxj.n(parcel, readInt, Uri.CREATOR);
            } else if (d == 4) {
                bundle = dfxj.k(parcel, readInt);
            } else if (d == 5) {
                bArr = dfxj.E(parcel, readInt);
            } else if (d != 6) {
                dfxj.C(parcel, readInt);
            } else {
                j = dfxj.i(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new PutDataRequest(uri, bundle, bArr, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PutDataRequest[i];
    }
}
