package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.diba;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AccountConsentRecordParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountConsentRecordParcelable> CREATOR = new diba();
    public final String a;
    private final boolean b;

    public AccountConsentRecordParcelable(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountConsentRecordParcelable)) {
            return false;
        }
        AccountConsentRecordParcelable accountConsentRecordParcelable = (AccountConsentRecordParcelable) obj;
        return this.a.equals(accountConsentRecordParcelable.a) && this.b == accountConsentRecordParcelable.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        boolean z = this.b;
        Boolean.valueOf(z).getClass();
        dfxk.d(parcel, 2, z);
        dfxk.c(parcel, a);
    }
}
