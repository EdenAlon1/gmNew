package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhxl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ExecuteBuyFlowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ExecuteBuyFlowRequest> CREATOR = new dhxl();
    final byte[] a;
    final byte[] b;
    final WalletCustomTheme c;

    public ExecuteBuyFlowRequest(byte[] bArr, byte[] bArr2, WalletCustomTheme walletCustomTheme) {
        this.a = bArr;
        this.b = bArr2;
        this.c = walletCustomTheme;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 2, bArr, false);
        dfxk.f(parcel, 3, this.b, false);
        dfxk.k(parcel, 4, this.c, i, false);
        dfxk.c(parcel, a);
    }
}
