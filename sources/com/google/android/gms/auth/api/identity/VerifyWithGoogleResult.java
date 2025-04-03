package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfdk;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VerifyWithGoogleResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VerifyWithGoogleResult> CREATOR = new dfdk();
    public final String a;
    public final String b;
    public final List c;
    public final PendingIntent d;

    public VerifyWithGoogleResult(String str, String str2, List list, PendingIntent pendingIntent) {
        this.a = str;
        this.b = str2;
        dfwv.n(list);
        this.c = list;
        this.d = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VerifyWithGoogleResult)) {
            return false;
        }
        VerifyWithGoogleResult verifyWithGoogleResult = (VerifyWithGoogleResult) obj;
        return dfwq.a(this.a, verifyWithGoogleResult.a) && dfwq.a(this.b, verifyWithGoogleResult.b) && dfwq.a(this.c, verifyWithGoogleResult.c) && dfwq.a(this.d, verifyWithGoogleResult.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.D(parcel, 3, this.c);
        dfxk.k(parcel, 4, this.d, i, false);
        dfxk.c(parcel, a);
    }
}
