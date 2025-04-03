package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dgjf;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CableAuthenticationExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CableAuthenticationExtension> CREATOR = new dgjf();
    public final List a;

    public CableAuthenticationExtension(List list) {
        dfwv.n(list);
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CableAuthenticationExtension)) {
            return false;
        }
        CableAuthenticationExtension cableAuthenticationExtension = (CableAuthenticationExtension) obj;
        return this.a.containsAll(cableAuthenticationExtension.a) && cableAuthenticationExtension.a.containsAll(this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, list, false);
        dfxk.c(parcel, a);
    }
}
