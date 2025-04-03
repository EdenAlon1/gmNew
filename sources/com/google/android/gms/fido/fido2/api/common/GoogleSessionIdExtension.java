package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dgjm;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GoogleSessionIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSessionIdExtension> CREATOR = new dgjm();
    public final long a;

    public GoogleSessionIdExtension(long j) {
        Long.valueOf(j).getClass();
        this.a = j;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GoogleSessionIdExtension) && this.a == ((GoogleSessionIdExtension) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = dfxk.a(parcel);
        dfxk.j(parcel, 1, j);
        dfxk.c(parcel, a);
    }
}
