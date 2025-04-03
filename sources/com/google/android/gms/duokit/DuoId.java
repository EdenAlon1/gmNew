package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgdw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DuoId extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DuoId> CREATOR = new dgdw();
    public int a;
    public String b;

    public DuoId() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DuoId) {
            DuoId duoId = (DuoId) obj;
            if (dfwq.a(Integer.valueOf(this.a), Integer.valueOf(duoId.a)) && dfwq.a(this.b, duoId.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.c(parcel, a);
    }

    public DuoId(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
