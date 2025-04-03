package com.google.android.gms.mdd;

import android.accounts.Account;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhdm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class OverrideFileGroupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OverrideFileGroupRequest> CREATOR = new dhdm();
    public final String a;
    public final String b;
    public final String[] c;
    public final String[] d;
    public final ParcelFileDescriptor[] e;
    public final Account f;

    public OverrideFileGroupRequest(String str, String str2, String[] strArr, String[] strArr2, ParcelFileDescriptor[] parcelFileDescriptorArr, Account account) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = strArr2;
        this.e = parcelFileDescriptorArr;
        this.f = account;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.C(parcel, 3, this.c);
        dfxk.C(parcel, 4, this.d);
        dfxk.E(parcel, 5, this.e, i);
        dfxk.k(parcel, 6, this.f, i, false);
        dfxk.c(parcel, a);
    }
}
