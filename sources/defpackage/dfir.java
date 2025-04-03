package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.proximity.firstparty.DeviceFilter;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfir implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        ArrayList arrayList = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    bool = dfxj.o(parcel, readInt);
                    break;
                case 2:
                    bool2 = dfxj.o(parcel, readInt);
                    break;
                case 3:
                    bool3 = dfxj.o(parcel, readInt);
                    break;
                case 4:
                    arrayList = dfxj.y(parcel, readInt);
                    break;
                case 5:
                    bool4 = dfxj.o(parcel, readInt);
                    break;
                case 6:
                    bool5 = dfxj.o(parcel, readInt);
                    break;
                case 7:
                    arrayList2 = dfxj.y(parcel, readInt);
                    break;
                case 8:
                    arrayList3 = dfxj.y(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new DeviceFilter(bool, bool2, bool3, arrayList, bool4, bool5, arrayList2, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceFilter[i];
    }
}
