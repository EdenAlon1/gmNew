package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dhau;
import defpackage.dhav;
import defpackage.dhaw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ReportingState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ReportingState> CREATOR = new dhaw();
    public final boolean a;
    public final boolean b;
    public final Integer c;
    public final boolean d;
    public final boolean e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    public ReportingState(int i, int i2, boolean z, boolean z2, int i3, int i4, Integer num, boolean z3, boolean z4) {
        this.f = i;
        this.g = i2;
        this.a = z;
        this.b = z2;
        this.h = i3;
        this.i = i4;
        this.c = num;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ReportingState)) {
            return false;
        }
        ReportingState reportingState = (ReportingState) obj;
        return this.f == reportingState.f && this.g == reportingState.g && this.a == reportingState.a && this.b == reportingState.b && this.h == reportingState.h && this.i == reportingState.i && dfwq.a(this.c, reportingState.c) && this.d == reportingState.d && this.e == reportingState.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.h), Integer.valueOf(this.i), this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    public final String toString() {
        String str;
        Integer num = this.c;
        if (num == null) {
            str = "(hidden-from-unauthorized-caller)";
        } else if (Log.isLoggable("GCoreUlr", 2)) {
            str = num.toString();
        } else {
            str = "tag#" + (num.intValue() % 20);
        }
        return "ReportingState{reportingEnabled=" + this.f + ", historyEnabled=" + this.g + ", allowed=" + this.a + ", active=" + this.b + ", expectedOptInResult=" + this.h + ", expectedOptInResultAssumingLocationEnabled=" + this.i + ", deviceTag=" + str + ", canAccessSettings=" + this.d + ", hasMigratedToOdlh=" + this.e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, dhav.a(this.f));
        dfxk.i(parcel, 3, dhav.a(this.g));
        dfxk.d(parcel, 4, this.a);
        dfxk.d(parcel, 5, this.b);
        dfxk.i(parcel, 7, dhau.a(this.h));
        dfxk.x(parcel, 8, this.c);
        dfxk.i(parcel, 9, dhau.a(this.i));
        dfxk.d(parcel, 10, this.d);
        dfxk.d(parcel, 11, this.e);
        dfxk.c(parcel, a);
    }
}
