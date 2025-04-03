package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgfz;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StartCallRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StartCallRequest> CREATOR = new dgfz();
    public DuoId a;
    public int b;
    public boolean c;
    public String d;

    public StartCallRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartCallRequest) {
            StartCallRequest startCallRequest = (StartCallRequest) obj;
            if (dfwq.a(this.a, startCallRequest.a) && dfwq.a(Integer.valueOf(this.b), Integer.valueOf(startCallRequest.b)) && dfwq.a(Boolean.valueOf(this.c), Boolean.valueOf(startCallRequest.c)) && dfwq.a(this.d, startCallRequest.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.d(parcel, 3, this.c);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.c(parcel, a);
    }

    public StartCallRequest(DuoId duoId, int i, boolean z, String str) {
        this.a = duoId;
        this.b = i;
        this.c = z;
        this.d = str;
    }
}
