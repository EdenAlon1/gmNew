package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhxz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String[] strArr = null;
        int[] iArr = null;
        RemoteViews remoteViews = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                strArr = dfxj.K(parcel, readInt);
            } else if (d == 2) {
                iArr = dfxj.H(parcel, readInt);
            } else if (d == 3) {
                remoteViews = (RemoteViews) dfxj.n(parcel, readInt, RemoteViews.CREATOR);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                bArr = dfxj.E(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new GetSaveInstrumentDetailsResponse(strArr, iArr, remoteViews, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetSaveInstrumentDetailsResponse[i];
    }
}
