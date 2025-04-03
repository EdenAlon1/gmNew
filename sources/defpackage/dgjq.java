package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.HmacSecretExtension;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgjq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                bArr = dfxj.E(parcel, readInt);
            } else if (d == 2) {
                bArr2 = dfxj.E(parcel, readInt);
            } else if (d == 3) {
                bArr3 = dfxj.E(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                i = dfxj.f(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new HmacSecretExtension(bArr == null ? null : eyee.x(bArr), bArr2 == null ? null : eyee.x(bArr2), bArr3 != null ? eyee.x(bArr3) : null, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new HmacSecretExtension[i];
    }
}
