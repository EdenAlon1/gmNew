package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CacheSpec;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.Section;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dewg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int[] iArr = null;
        byte[] bArr = null;
        STSortSpec sTSortSpec = null;
        String str = null;
        CacheSpec cacheSpec = null;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        boolean z4 = false;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 2:
                    arrayList = dfxj.y(parcel, readInt);
                    break;
                case 3:
                    arrayList2 = dfxj.z(parcel, readInt, Section.CREATOR);
                    break;
                case 4:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 5:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 6:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 7:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                case 8:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 9:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 10:
                    iArr = dfxj.H(parcel, readInt);
                    break;
                case 11:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 12:
                    sTSortSpec = (STSortSpec) dfxj.n(parcel, readInt, STSortSpec.CREATOR);
                    break;
                case 13:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 14:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 15:
                    cacheSpec = (CacheSpec) dfxj.n(parcel, readInt, CacheSpec.CREATOR);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new QuerySpecification(z2, arrayList, arrayList2, z3, i, i2, z4, i3, z, iArr, bArr, sTSortSpec, str, cacheSpec);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new QuerySpecification[i];
    }
}
