package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.PinConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhcs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        PinConfig.Glyph glyph = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 3) {
                i2 = dfxj.f(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                glyph = (PinConfig.Glyph) dfxj.n(parcel, readInt, PinConfig.Glyph.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new PinConfig(i, i2, glyph);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PinConfig[i];
    }
}
