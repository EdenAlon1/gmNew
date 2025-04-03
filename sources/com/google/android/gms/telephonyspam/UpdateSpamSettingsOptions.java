package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhsd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UpdateSpamSettingsOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UpdateSpamSettingsOptions> CREATOR = new dhsd();
    public final int a;
    public final String b;

    public UpdateSpamSettingsOptions(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.c(parcel, a);
    }
}
