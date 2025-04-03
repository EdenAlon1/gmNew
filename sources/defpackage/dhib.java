package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.CpgDocumentRequest;
import com.google.android.gms.people.cpg.PreferenceDocumentRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhib implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        PreferenceDocumentRequest preferenceDocumentRequest = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                preferenceDocumentRequest = (PreferenceDocumentRequest) dfxj.n(parcel, readInt, PreferenceDocumentRequest.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new CpgDocumentRequest(i, preferenceDocumentRequest);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CpgDocumentRequest[i];
    }
}
