package defpackage;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dffy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Bundle bundle = new Bundle();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i2 = 0;
        boolean z11 = false;
        ArrayList arrayList = null;
        AppDescription appDescription = null;
        String str = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        String str2 = null;
        String str3 = null;
        ManagedAuthOptions managedAuthOptions = null;
        String str4 = null;
        String str5 = "null";
        String str6 = str5;
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
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 4:
                    arrayList = dfxj.y(parcel, readInt);
                    break;
                case 5:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 6:
                    appDescription = (AppDescription) dfxj.n(parcel, readInt, AppDescription.CREATOR);
                    break;
                case 7:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 8:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 9:
                    accountAuthenticatorResponse = (AccountAuthenticatorResponse) dfxj.n(parcel, readInt, AccountAuthenticatorResponse.CREATOR);
                    break;
                case 10:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                case 11:
                    z5 = dfxj.D(parcel, readInt);
                    break;
                case 12:
                    str5 = dfxj.t(parcel, readInt);
                    break;
                case 13:
                    str6 = dfxj.t(parcel, readInt);
                    break;
                case 14:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 15:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 16:
                    z6 = dfxj.D(parcel, readInt);
                    break;
                case 17:
                    z7 = dfxj.D(parcel, readInt);
                    break;
                case 18:
                    z8 = dfxj.D(parcel, readInt);
                    break;
                case 19:
                    z9 = dfxj.D(parcel, readInt);
                    break;
                case 20:
                    managedAuthOptions = (ManagedAuthOptions) dfxj.n(parcel, readInt, ManagedAuthOptions.CREATOR);
                    break;
                case 21:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                case 22:
                    z10 = dfxj.D(parcel, readInt);
                    break;
                case 23:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 24:
                    z11 = dfxj.D(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new SetupAccountWorkflowRequest(i, z, z2, arrayList, bundle, appDescription, z3, str, accountAuthenticatorResponse, z4, z5, str5, str6, str2, str3, z6, z7, z8, z9, managedAuthOptions, str4, z10, i2, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SetupAccountWorkflowRequest[i];
    }
}
