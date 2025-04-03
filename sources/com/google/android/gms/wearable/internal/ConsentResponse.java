package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dicd;
import j$.time.Instant;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConsentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConsentResponse> CREATOR = new dicd();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final String g;
    public final Long h;

    public ConsentResponse(int i, boolean z, boolean z2, boolean z3, boolean z4, List list, String str, Long l) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = list;
        this.g = str;
        this.h = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentResponse)) {
            return false;
        }
        ConsentResponse consentResponse = (ConsentResponse) obj;
        if (this.a == consentResponse.a && this.b == consentResponse.b && this.c == consentResponse.c && this.d == consentResponse.d && this.e == consentResponse.e) {
            List list = consentResponse.f;
            List list2 = this.f;
            if (list2 == null || list == null ? list2 == list : !(!list2.containsAll(list) || this.f.size() != list.size())) {
                if (dfwq.a(this.g, consentResponse.g) && dfwq.a(this.h, consentResponse.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g, this.h});
    }

    public final String toString() {
        Long l = this.h;
        String valueOf = String.valueOf(this.f);
        Instant ofEpochMilli = l != null ? Instant.ofEpochMilli(l.longValue()) : null;
        String str = this.g;
        boolean z = this.e;
        boolean z2 = this.d;
        boolean z3 = this.c;
        boolean z4 = this.b;
        return "ConsentResponse {statusCode =" + this.a + ", hasTosConsent =" + z4 + ", hasLoggingConsent =" + z3 + ", hasCloudSyncConsent =" + z2 + ", hasLocationConsent =" + z + ", accountConsentRecords =" + valueOf + ", nodeId =" + str + ", lastUpdateRequestedTime =" + String.valueOf(ofEpochMilli) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.d(parcel, 2, this.b);
        dfxk.d(parcel, 3, this.c);
        dfxk.d(parcel, 4, this.d);
        dfxk.d(parcel, 5, this.e);
        dfxk.n(parcel, 6, this.f, false);
        dfxk.m(parcel, 7, this.g, false);
        dfxk.A(parcel, 8, this.h);
        dfxk.c(parcel, a);
    }
}
