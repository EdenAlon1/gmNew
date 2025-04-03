package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PrivacyRecordOptinRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PrivacyRecordOptinRequest> CREATOR = new dier();
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;

    public PrivacyRecordOptinRequest(String str, int i, boolean z, String str2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.d(parcel, 3, this.c);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.c(parcel, a);
    }
}
