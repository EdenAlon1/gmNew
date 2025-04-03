package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dhdw;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SyncStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncStatus> CREATOR = new dhdw();
    public final long a;
    public final long b;
    public final long c;

    public SyncStatus(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SyncStatus syncStatus = (SyncStatus) obj;
            if (dfwq.a(Long.valueOf(this.a), Long.valueOf(syncStatus.a))) {
                if (dfwq.a(Long.valueOf(this.b), Long.valueOf(syncStatus.b))) {
                    if (dfwq.a(Long.valueOf(this.c), Long.valueOf(syncStatus.c))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = dfxk.a(parcel);
        dfxk.j(parcel, 1, j);
        dfxk.j(parcel, 2, this.b);
        dfxk.j(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
