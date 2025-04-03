package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PIMEUpdate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dewa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        Account account = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 2:
                    bArr2 = dfxj.E(parcel, readInt);
                    break;
                case 3:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 4:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 6:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 7:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 8:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 9:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 10:
                    j2 = dfxj.i(parcel, readInt);
                    break;
                case 11:
                    account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new PIMEUpdate(bArr, bArr2, i, str, str2, z, bundle, j, j2, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PIMEUpdate[i];
    }
}
