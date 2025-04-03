package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgnj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Boolean bool = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        byte[][] bArr = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 3:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 4:
                    arrayList = dfxj.y(parcel, readInt);
                    break;
                case 5:
                    arrayList2 = dfxj.x(parcel, readInt);
                    break;
                case 6:
                    arrayList3 = dfxj.y(parcel, readInt);
                    break;
                case 7:
                    arrayList4 = dfxj.x(parcel, readInt);
                    break;
                case 8:
                    bArr = dfxj.L(parcel, readInt);
                    break;
                case 9:
                    bool = dfxj.o(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new FRDProductSpecificDataEntry(i, i2, arrayList, arrayList2, arrayList3, arrayList4, bArr, bool.booleanValue());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FRDProductSpecificDataEntry[i];
    }
}
