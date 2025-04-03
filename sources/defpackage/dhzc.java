package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.ConnectionDelayFilters;
import com.google.android.gms.wearable.ConnectionRestrictions;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        int i4 = 0;
        int i5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        ConnectionRestrictions connectionRestrictions = null;
        ConnectionDelayFilters connectionDelayFilters = null;
        boolean z5 = true;
        boolean z6 = true;
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
                    i = dfxj.f(parcel, readInt);
                    break;
                case 5:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 6:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 7:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 8:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 9:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 10:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                case 11:
                    str5 = dfxj.t(parcel, readInt);
                    break;
                case 12:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 13:
                    arrayList = dfxj.y(parcel, readInt);
                    break;
                case 14:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                case 15:
                    z5 = dfxj.D(parcel, readInt);
                    break;
                case 16:
                    connectionRestrictions = (ConnectionRestrictions) dfxj.n(parcel, readInt, ConnectionRestrictions.CREATOR);
                    break;
                case 17:
                    z6 = dfxj.D(parcel, readInt);
                    break;
                case 18:
                    connectionDelayFilters = (ConnectionDelayFilters) dfxj.n(parcel, readInt, ConnectionDelayFilters.CREATOR);
                    break;
                case 19:
                    i4 = dfxj.f(parcel, readInt);
                    break;
                case 20:
                    i5 = dfxj.f(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new ConnectionConfiguration(str, str2, i, i2, z, z2, str3, z3, str4, str5, i3, arrayList, z4, z5, connectionRestrictions, z6, connectionDelayFilters, i4, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }
}
