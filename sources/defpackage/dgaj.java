package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contactkeys.E2eeSelfKeyParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgaj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr = null;
        long j = 0;
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
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 4:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 5:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 6:
                    i = dfxj.f(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new E2eeSelfKeyParcelable(str, str2, str3, j, bArr, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new E2eeSelfKeyParcelable[i];
    }
}
