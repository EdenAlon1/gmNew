package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfdj;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.engw;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VerifyWithGoogleRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<VerifyWithGoogleRequest> CREATOR = new dfdj();
    public final engw a;
    public final String b;
    public final boolean c;
    public final String d;

    public VerifyWithGoogleRequest(List list, String str, boolean z, String str2) {
        dfwv.b((list == null || list.isEmpty()) ? false : true, "requestedScopes cannot be null or empty");
        if (z) {
            dfwv.b(str != null, "If offline access is requested, server client id must be provided.");
        } else {
            dfwv.b(str == null, "If offline access is not requested, server client id must not be provided.");
        }
        this.a = engw.n(list);
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VerifyWithGoogleRequest)) {
            return false;
        }
        VerifyWithGoogleRequest verifyWithGoogleRequest = (VerifyWithGoogleRequest) obj;
        return this.a.size() == verifyWithGoogleRequest.a.size() && this.a.containsAll(verifyWithGoogleRequest.a) && this.c == verifyWithGoogleRequest.c && dfwq.a(this.b, verifyWithGoogleRequest.b) && dfwq.a(this.d, verifyWithGoogleRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        engw engwVar = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, engwVar, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.d(parcel, 3, this.c);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.c(parcel, a);
    }
}
