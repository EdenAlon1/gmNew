package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.DataItemParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dida implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
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
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                bArr = dfxj.E(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new DataItemParcelable(uri, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataItemParcelable[i];
    }
}
