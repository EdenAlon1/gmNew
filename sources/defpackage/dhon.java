package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Response;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhon implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Status status = null;
        PhraseAffinityResponse phraseAffinityResponse = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                status = (Status) dfxj.n(parcel, readInt, Status.CREATOR);
            } else if (d == 2) {
                phraseAffinityResponse = (PhraseAffinityResponse) dfxj.n(parcel, readInt, PhraseAffinityResponse.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                bundle = dfxj.k(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new GetPhraseAffinityCall$Response(status, phraseAffinityResponse, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetPhraseAffinityCall$Response[i];
    }
}
