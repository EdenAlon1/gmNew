package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhpi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                bundle = dfxj.k(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new RecordConsentByConsentResultRequest(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RecordConsentByConsentResultRequest[i];
    }
}
