package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfck implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        ArrayList arrayList = null;
        String str = null;
        Account account = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    arrayList = dfxj.z(parcel, readInt, Scope.CREATOR);
                    break;
                case 2:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 4:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 5:
                    account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
                    break;
                case 6:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 7:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 8:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 9:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 10:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new AuthorizationRequest(arrayList, str, z, z2, account, str2, str3, z3, bundle, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthorizationRequest[i];
    }
}
