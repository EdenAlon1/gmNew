package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Response;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhne implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Status status = null;
        RegisterCorpusInfo registerCorpusInfo = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                status = (Status) dfxj.n(parcel, readInt, Status.CREATOR);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                registerCorpusInfo = (RegisterCorpusInfo) dfxj.n(parcel, readInt, RegisterCorpusInfo.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new GetCorpusInfoCall$Response(status, registerCorpusInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetCorpusInfoCall$Response[i];
    }
}
