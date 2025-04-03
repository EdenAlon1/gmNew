package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CacheSpec;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.CorpusScoringInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.STSortSpec;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class devx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        CorpusId[] corpusIdArr = null;
        CorpusScoringInfo[] corpusScoringInfoArr = null;
        String str = null;
        byte[] bArr = null;
        int[] iArr = null;
        byte[] bArr2 = null;
        STSortSpec sTSortSpec = null;
        String str2 = null;
        CacheSpec cacheSpec = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = true;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    corpusIdArr = (CorpusId[]) dfxj.J(parcel, readInt, CorpusId.CREATOR);
                    break;
                case 2:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 3:
                    corpusScoringInfoArr = (CorpusScoringInfo[]) dfxj.J(parcel, readInt, CorpusScoringInfo.CREATOR);
                    break;
                case 4:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 5:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 6:
                    i4 = dfxj.f(parcel, readInt);
                    break;
                case 7:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 8:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 9:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 10:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 11:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                case 12:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 13:
                    iArr = dfxj.H(parcel, readInt);
                    break;
                case 14:
                    bArr2 = dfxj.E(parcel, readInt);
                    break;
                case 15:
                    sTSortSpec = (STSortSpec) dfxj.n(parcel, readInt, STSortSpec.CREATOR);
                    break;
                case 16:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 17:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 18:
                    cacheSpec = (CacheSpec) dfxj.n(parcel, readInt, CacheSpec.CREATOR);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new GlobalSearchQuerySpecification(corpusIdArr, i, corpusScoringInfoArr, i2, i3, i4, str, z, bArr, z3, z4, z2, iArr, bArr2, sTSortSpec, str2, cacheSpec);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchQuerySpecification[i];
    }
}
