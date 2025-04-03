package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.sampler.SamplerConfigParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfnj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        double d = 0.0d;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d2 = dfxj.d(readInt);
            if (d2 == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d2 == 2) {
                d = dfxj.b(parcel, readInt);
            } else if (d2 == 3) {
                i2 = dfxj.f(parcel, readInt);
            } else if (d2 == 4) {
                i3 = dfxj.f(parcel, readInt);
            } else if (d2 != 5) {
                dfxj.C(parcel, readInt);
            } else {
                str = dfxj.t(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new SamplerConfigParcelable(i, d, i2, i3, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SamplerConfigParcelable[i];
    }
}
