package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.StyleSpan;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhcv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ArrayList arrayList = null;
        Cap cap = null;
        Cap cap2 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    arrayList = dfxj.z(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    f = dfxj.c(parcel, readInt);
                    break;
                case 4:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 5:
                    f2 = dfxj.c(parcel, readInt);
                    break;
                case 6:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 7:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 8:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 9:
                    cap = (Cap) dfxj.n(parcel, readInt, Cap.CREATOR);
                    break;
                case 10:
                    cap2 = (Cap) dfxj.n(parcel, readInt, Cap.CREATOR);
                    break;
                case 11:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 12:
                    arrayList2 = dfxj.z(parcel, readInt, PatternItem.CREATOR);
                    break;
                case 13:
                    arrayList3 = dfxj.z(parcel, readInt, StyleSpan.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new PolylineOptions(arrayList, f, i, f2, z, z2, z3, cap, cap2, i2, arrayList2, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
