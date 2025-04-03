package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhxv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        long j = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                j = dfxj.i(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new WarmUpUiProcessRequest(j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WarmUpUiProcessRequest[i];
    }
}
