package com.google.android.gms.contactkeys;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgai;
import defpackage.engw;
import defpackage.enou;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class E2eeSelfKeyListParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<E2eeSelfKeyListParcelable> CREATOR = new dgai();
    public final engw a;

    private E2eeSelfKeyListParcelable() {
        int i = engw.d;
        this.a = enou.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E2eeSelfKeyListParcelable) {
            return dfwq.a(this.a, ((E2eeSelfKeyListParcelable) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        engw engwVar = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, engwVar, false);
        dfxk.c(parcel, a);
    }

    public E2eeSelfKeyListParcelable(List list) {
        if (list == null) {
            int i = engw.d;
            this.a = enou.a;
        } else {
            this.a = engw.n(list);
        }
    }
}
