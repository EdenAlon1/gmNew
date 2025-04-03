package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.learning.Example;
import com.google.android.gms.learning.Features;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgtr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Features features = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                features = (Features) dfxj.n(parcel, readInt, Features.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new Example(features);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Example[i];
    }
}
