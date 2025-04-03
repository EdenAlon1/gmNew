package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.folsom.RecoveryRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfgq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 2:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 4:
                    bArr2 = dfxj.E(parcel, readInt);
                    break;
                case 5:
                    bArr3 = dfxj.E(parcel, readInt);
                    break;
                case 6:
                    bArr4 = dfxj.E(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new RecoveryRequest(str, str2, bArr, bArr2, bArr3, bArr4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RecoveryRequest[i];
    }
}
