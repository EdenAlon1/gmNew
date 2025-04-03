package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfcw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Account account = null;
        SignInCredential signInCredential = null;
        ArrayList arrayList = null;
        String str = null;
        Intent intent = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
                    break;
                case 2:
                    signInCredential = (SignInCredential) dfxj.n(parcel, readInt, SignInCredential.CREATOR);
                    break;
                case 3:
                    arrayList = dfxj.z(parcel, readInt, Scope.CREATOR);
                    break;
                case 4:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 5:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 6:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 7:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 8:
                    j2 = dfxj.i(parcel, readInt);
                    break;
                case 9:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 10:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                case 11:
                    intent = (Intent) dfxj.n(parcel, readInt, Intent.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new InternalSignInCredentialWrapper(account, signInCredential, arrayList, z, z2, j, z3, j2, str, z4, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InternalSignInCredentialWrapper[i];
    }
}
