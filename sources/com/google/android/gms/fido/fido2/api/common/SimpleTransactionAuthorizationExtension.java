package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgkg;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SimpleTransactionAuthorizationExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SimpleTransactionAuthorizationExtension> CREATOR = new dgkg();
    public final String a;

    public SimpleTransactionAuthorizationExtension(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SimpleTransactionAuthorizationExtension) {
            return dfwq.a(this.a, ((SimpleTransactionAuthorizationExtension) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.c(parcel, a);
    }
}
