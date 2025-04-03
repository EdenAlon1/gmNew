package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mdisync.SyncOptions;
import defpackage.dfxk;
import defpackage.dher;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncRequest> CREATOR = new dher();
    public final byte[] a;
    public final SyncOptions b;
    public final int c;

    public SyncRequest(int i, byte[] bArr, SyncOptions syncOptions) {
        int i2;
        if (i != 0) {
            i2 = 2;
            if (i != 1) {
                if (i != 2) {
                    i2 = 4;
                    if (i != 3) {
                        i2 = i != 4 ? 0 : 5;
                    }
                } else {
                    i2 = 3;
                }
            }
        } else {
            i2 = 1;
        }
        this.c = i2 != 0 ? i2 : 1;
        this.a = bArr;
        this.b = syncOptions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.c - 1;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.f(parcel, 2, this.a, false);
        dfxk.k(parcel, 3, this.b, i, false);
        dfxk.c(parcel, a);
    }
}
