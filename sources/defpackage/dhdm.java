package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.mdd.OverrideFileGroupRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhdm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        ParcelFileDescriptor[] parcelFileDescriptorArr = null;
        Account account = null;
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
                    strArr = dfxj.K(parcel, readInt);
                    break;
                case 4:
                    strArr2 = dfxj.K(parcel, readInt);
                    break;
                case 5:
                    parcelFileDescriptorArr = (ParcelFileDescriptor[]) dfxj.J(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 6:
                    account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new OverrideFileGroupRequest(str, str2, strArr, strArr2, parcelFileDescriptorArr, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new OverrideFileGroupRequest[i];
    }
}
