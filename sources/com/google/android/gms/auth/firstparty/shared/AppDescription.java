package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfgd;
import defpackage.dfwv;
import defpackage.dfxk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AppDescription extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AppDescription> CREATOR = new dfgd();
    private static final String g = "[AppDescription]";
    final int a;
    final int b;
    final String c;
    final String d;
    final String e;
    final boolean f;

    public AppDescription(int i, int i2, String str, String str2, String str3, boolean z) {
        getClass().getSimpleName();
        this.a = i;
        this.c = str;
        this.d = str2;
        dfwv.m(str3, String.valueOf(g).concat(" callingPkg cannot be null or empty!"));
        this.e = str3;
        dfwv.b(i2 != 0, "Invalid callingUid! Cannot be 0!");
        this.b = i2;
        this.f = z;
    }

    public final String toString() {
        return getClass().getSimpleName() + "<" + this.e + ", " + this.b + ">";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.i(parcel, 2, this.b);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.m(parcel, 5, this.e, false);
        dfxk.d(parcel, 6, this.f);
        dfxk.c(parcel, a);
    }
}
