package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfvz implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, getServiceRequest.c);
        dfxk.i(parcel, 2, getServiceRequest.d);
        dfxk.i(parcel, 3, getServiceRequest.e);
        dfxk.m(parcel, 4, getServiceRequest.f, false);
        dfxk.u(parcel, 5, getServiceRequest.g);
        dfxk.E(parcel, 6, getServiceRequest.h, i);
        dfxk.p(parcel, 7, getServiceRequest.i);
        dfxk.k(parcel, 8, getServiceRequest.j, i, false);
        dfxk.E(parcel, 10, getServiceRequest.k, i);
        dfxk.E(parcel, 11, getServiceRequest.l, i);
        dfxk.d(parcel, 12, getServiceRequest.m);
        dfxk.i(parcel, 13, getServiceRequest.n);
        dfxk.d(parcel, 14, getServiceRequest.o);
        dfxk.m(parcel, 15, getServiceRequest.p, false);
        dfxk.c(parcel, a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Scope[] scopeArr = GetServiceRequest.a;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.b;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
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
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 4:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    iBinder = dfxj.l(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) dfxj.J(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 8:
                    account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
                    break;
                case 9:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 10:
                    featureArr = (Feature[]) dfxj.J(parcel, readInt, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) dfxj.J(parcel, readInt, Feature.CREATOR);
                    break;
                case 12:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 13:
                    i4 = dfxj.f(parcel, readInt);
                    break;
                case 14:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 15:
                    str2 = dfxj.t(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
