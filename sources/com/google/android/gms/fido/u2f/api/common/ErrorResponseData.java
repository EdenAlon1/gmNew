package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dglb;
import defpackage.emwz;
import defpackage.emxa;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new dglb();
    public final String a;
    private final ErrorCode b;

    public ErrorResponseData(int i, String str) {
        this.b = ErrorCode.a(i);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        return dfwq.a(this.b, errorResponseData.b) && dfwq.a(this.a, errorResponseData.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.f("errorCode", this.b.g);
        String str = this.a;
        if (str != null) {
            b.b("errorMessage", str);
        }
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, this.b.g);
        dfxk.m(parcel, 3, this.a, false);
        dfxk.c(parcel, a);
    }
}
