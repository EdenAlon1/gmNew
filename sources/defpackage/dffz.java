package defpackage;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dffz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Bundle bundle = new Bundle();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str = "null";
        String str2 = str;
        ArrayList arrayList = null;
        AppDescription appDescription = null;
        String str3 = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    arrayList = dfxj.y(parcel, readInt);
                    break;
                case 3:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 4:
                    appDescription = (AppDescription) dfxj.n(parcel, readInt, AppDescription.CREATOR);
                    break;
                case 5:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 6:
                    accountAuthenticatorResponse = (AccountAuthenticatorResponse) dfxj.n(parcel, readInt, AccountAuthenticatorResponse.CREATOR);
                    break;
                case 7:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 8:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 9:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 10:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 11:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 12:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new StartAddAccountSessionWorkflowRequest(i, arrayList, bundle, appDescription, str3, accountAuthenticatorResponse, z, z2, str, str2, z3, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StartAddAccountSessionWorkflowRequest[i];
    }
}
