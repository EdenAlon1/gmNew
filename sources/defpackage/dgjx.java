package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgjx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        Integer num = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                str = dfxj.t(parcel, readInt);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                num = dfxj.r(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new PublicKeyCredentialParameters(str, num.intValue());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialParameters[i];
    }
}
