package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhyh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BuyFlowConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BuyFlowConfig> CREATOR = new dhyh();
    String a;
    ApplicationParameters b;
    String c;
    String d;
    String e;
    String f;
    int g;

    BuyFlowConfig() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, this.a, false);
        dfxk.k(parcel, 3, this.b, i, false);
        dfxk.m(parcel, 4, this.c, false);
        dfxk.m(parcel, 5, this.d, false);
        dfxk.m(parcel, 6, TextUtils.isEmpty(this.e) ? this.c : this.e, false);
        dfxk.m(parcel, 7, this.f, false);
        dfxk.i(parcel, 8, this.g);
        dfxk.c(parcel, a);
    }

    public BuyFlowConfig(String str, ApplicationParameters applicationParameters, String str2, String str3, String str4, String str5, int i) {
        this.a = str;
        this.b = applicationParameters;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
    }
}
