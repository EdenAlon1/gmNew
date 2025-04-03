package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhnh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        RegisterCorpusInfo registerCorpusInfo = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 2) {
                str2 = dfxj.t(parcel, readInt);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                registerCorpusInfo = (RegisterCorpusInfo) dfxj.n(parcel, readInt, RegisterCorpusInfo.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new RegisterCorpusInfoCall$Request(str, str2, registerCorpusInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterCorpusInfoCall$Request[i];
    }
}
