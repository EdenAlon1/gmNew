package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dewd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        CorpusId[] corpusIdArr = null;
        int[] iArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                corpusIdArr = (CorpusId[]) dfxj.J(parcel, readInt, CorpusId.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                iArr = dfxj.H(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new PhraseAffinityResponse(str, corpusIdArr, iArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PhraseAffinityResponse[i];
    }
}
