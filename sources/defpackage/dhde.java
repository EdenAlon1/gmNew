package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.StrokeStyle;
import com.google.android.gms.maps.model.StyleSpan;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhde implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        double d = eobe.a;
        StrokeStyle strokeStyle = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d2 = dfxj.d(readInt);
            if (d2 == 2) {
                strokeStyle = (StrokeStyle) dfxj.n(parcel, readInt, StrokeStyle.CREATOR);
            } else if (d2 != 3) {
                dfxj.C(parcel, readInt);
            } else {
                d = dfxj.b(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new StyleSpan(strokeStyle, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StyleSpan[i];
    }
}
