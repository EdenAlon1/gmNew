package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgfr;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RemoteUserReachability extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteUserReachability> CREATOR = new dgfr();
    public DuoId a;
    public int b;
    public int c;

    public RemoteUserReachability() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemoteUserReachability) {
            RemoteUserReachability remoteUserReachability = (RemoteUserReachability) obj;
            if (dfwq.a(this.a, remoteUserReachability.a) && dfwq.a(Integer.valueOf(this.b), Integer.valueOf(remoteUserReachability.b)) && dfwq.a(Integer.valueOf(this.c), Integer.valueOf(remoteUserReachability.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, this.a, i, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }

    public RemoteUserReachability(DuoId duoId, int i, int i2) {
        this.a = duoId;
        this.b = i;
        this.c = i2;
    }
}
