package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audit.LogAuditRecordsRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        byte[][] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 3:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 4:
                    bArr = dfxj.L(parcel, readInt);
                    break;
                case 5:
                    bArr2 = dfxj.E(parcel, readInt);
                    break;
                case 6:
                    bArr3 = dfxj.E(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new LogAuditRecordsRequest(i, i2, str, bArr, bArr2, bArr3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LogAuditRecordsRequest[i];
    }
}
