package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgkw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        SignRequestParams signRequestParams = null;
        Uri uri = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                signRequestParams = (SignRequestParams) dfxj.n(parcel, readInt, SignRequestParams.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                uri = (Uri) dfxj.n(parcel, readInt, Uri.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new BrowserSignRequestParams(signRequestParams, uri);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BrowserSignRequestParams[i];
    }
}
