package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.frp.UnlockForWearRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfhu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                z = dfxj.D(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new UnlockForWearRequest(z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UnlockForWearRequest[i];
    }
}
