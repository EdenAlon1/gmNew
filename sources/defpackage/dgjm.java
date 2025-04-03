package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.GoogleSessionIdExtension;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgjm implements Parcelable.Creator {
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
        return new GoogleSessionIdExtension(j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSessionIdExtension[i];
    }
}
