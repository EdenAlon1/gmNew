package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.credentialstore.KeyData;
import com.google.android.gms.fido.credentialstore.KeyMetadata;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgih implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long j = 0;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String str = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        Account account = null;
        KeyMetadata keyMetadata = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    z = dfxj.D(parcel, readInt);
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
                    str = dfxj.t(parcel, readInt);
                    break;
                case 7:
                    bArr4 = dfxj.E(parcel, readInt);
                    break;
                case 8:
                    bArr5 = dfxj.E(parcel, readInt);
                    break;
                case 9:
                    account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
                    break;
                case 10:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 11:
                    keyMetadata = (KeyMetadata) dfxj.n(parcel, readInt, KeyMetadata.CREATOR);
                    break;
                case 12:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 13:
                    bArr6 = dfxj.E(parcel, readInt);
                    break;
                case 14:
                    bArr7 = dfxj.E(parcel, readInt);
                    break;
                case 15:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 16:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new KeyData(i, z, bArr, bArr2, bArr3, str, bArr4, bArr5, account, z2, keyMetadata, z3, bArr6, bArr7, j, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new KeyData[i];
    }
}
