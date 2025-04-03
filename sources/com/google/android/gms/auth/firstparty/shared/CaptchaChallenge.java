package com.google.android.gms.auth.firstparty.shared;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfge;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CaptchaChallenge extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CaptchaChallenge> CREATOR = new dfge();
    final String a;
    final String b;
    final Bitmap c;

    public CaptchaChallenge(String str, String str2, Bitmap bitmap) {
        this.a = str;
        this.b = str2;
        this.c = bitmap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, str, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.k(parcel, 4, this.c, i, false);
        dfxk.c(parcel, a);
    }
}
