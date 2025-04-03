package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import defpackage.dfxk;
import defpackage.dhwp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new dhwp();
    final CommonWalletObject a;
    String b;
    String c;

    @Deprecated
    String d;
    long e;
    String f;
    long g;
    String h;

    GiftCardWalletObject() {
        this.a = CommonWalletObject.a().a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, this.a, i, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.m(parcel, 4, this.c, false);
        dfxk.m(parcel, 5, this.d, false);
        dfxk.j(parcel, 6, this.e);
        dfxk.m(parcel, 7, this.f, false);
        dfxk.j(parcel, 8, this.g);
        dfxk.m(parcel, 9, this.h, false);
        dfxk.c(parcel, a);
    }

    public GiftCardWalletObject(CommonWalletObject commonWalletObject, String str, String str2, String str3, long j, String str4, long j2, String str5) {
        CommonWalletObject.a();
        this.a = commonWalletObject;
        this.b = str;
        this.c = str2;
        this.e = j;
        this.f = str4;
        this.g = j2;
        this.h = str5;
        this.d = str3;
    }
}
