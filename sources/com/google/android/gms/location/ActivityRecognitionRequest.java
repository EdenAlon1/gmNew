package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dgyb;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ActivityRecognitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityRecognitionRequest> CREATOR = new dgyb();
    public final long a;
    public final boolean b;
    public final WorkSource c;
    public final String d;
    public final int[] e;
    public final boolean f;
    public final String g;
    public final long h;
    public final String i;

    public ActivityRecognitionRequest(long j, boolean z, WorkSource workSource, String str, int[] iArr, boolean z2, String str2, long j2, String str3) {
        this.a = j;
        this.b = z;
        this.c = workSource;
        this.d = str;
        this.e = iArr;
        this.f = z2;
        this.g = str2;
        this.h = j2;
        this.i = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dfwv.n(parcel);
        int a = dfxk.a(parcel);
        dfxk.j(parcel, 1, this.a);
        dfxk.d(parcel, 2, this.b);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.v(parcel, 5, this.e);
        dfxk.d(parcel, 6, this.f);
        dfxk.m(parcel, 7, this.g, false);
        dfxk.j(parcel, 8, this.h);
        dfxk.m(parcel, 9, this.i, false);
        dfxk.c(parcel, a);
    }
}
