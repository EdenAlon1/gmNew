package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhyj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        ArrayList arrayList6 = arrayList3;
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        int i = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        TimeInterval timeInterval = null;
        String str9 = null;
        String str10 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 4:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                case 6:
                    str5 = dfxj.t(parcel, readInt);
                    break;
                case 7:
                    str6 = dfxj.t(parcel, readInt);
                    break;
                case 8:
                    str7 = dfxj.t(parcel, readInt);
                    break;
                case 9:
                    str8 = dfxj.t(parcel, readInt);
                    break;
                case 10:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 11:
                    arrayList4 = dfxj.z(parcel, readInt, WalletObjectMessage.CREATOR);
                    break;
                case 12:
                    timeInterval = (TimeInterval) dfxj.n(parcel, readInt, TimeInterval.CREATOR);
                    break;
                case 13:
                    arrayList5 = dfxj.z(parcel, readInt, LatLng.CREATOR);
                    break;
                case 14:
                    str9 = dfxj.t(parcel, readInt);
                    break;
                case 15:
                    str10 = dfxj.t(parcel, readInt);
                    break;
                case 16:
                    arrayList6 = dfxj.z(parcel, readInt, LabelValueRow.CREATOR);
                    break;
                case 17:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 18:
                    arrayList7 = dfxj.z(parcel, readInt, UriData.CREATOR);
                    break;
                case 19:
                    arrayList8 = dfxj.z(parcel, readInt, TextModuleData.CREATOR);
                    break;
                case 20:
                    arrayList9 = dfxj.z(parcel, readInt, UriData.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new CommonWalletObject(str, str2, str3, str4, str5, str6, str7, str8, i, arrayList4, timeInterval, arrayList5, str9, str10, arrayList6, z, arrayList7, arrayList8, arrayList9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CommonWalletObject[i];
    }
}
