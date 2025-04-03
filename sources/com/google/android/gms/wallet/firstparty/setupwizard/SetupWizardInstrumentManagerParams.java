package com.google.android.gms.wallet.firstparty.setupwizard;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.dfxk;
import defpackage.dhyc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SetupWizardInstrumentManagerParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetupWizardInstrumentManagerParams> CREATOR = new dhyc();
    final Account a;
    final byte[] b;
    final BuyFlowConfig c;
    final String d;
    final byte[] e;
    final boolean f;
    final boolean g;

    public SetupWizardInstrumentManagerParams(Account account, byte[] bArr, BuyFlowConfig buyFlowConfig, String str, byte[] bArr2, boolean z, boolean z2) {
        this.a = account;
        this.b = bArr;
        this.c = buyFlowConfig;
        this.d = str;
        this.e = bArr2;
        this.f = z;
        this.g = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.f(parcel, 2, this.b, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.f(parcel, 5, this.e, false);
        dfxk.d(parcel, 6, this.f);
        dfxk.d(parcel, 7, this.g);
        dfxk.c(parcel, a);
    }
}
