package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dhdo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LatestFootprintFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LatestFootprintFilter> CREATOR;
    private static final byte[] b;
    public final List a;

    static {
        byte[] bArr = new byte[0];
        b = bArr;
        new ArrayList().add(new SecondaryIdMatcher((byte[]) bArr.clone(), 2));
        new ArrayList();
        CREATOR = new dhdo();
    }

    public LatestFootprintFilter(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return dfwq.a(this.a, ((LatestFootprintFilter) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, list, false);
        dfxk.c(parcel, a);
    }
}
