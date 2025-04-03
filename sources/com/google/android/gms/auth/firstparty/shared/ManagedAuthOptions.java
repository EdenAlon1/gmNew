package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfgi;
import defpackage.dfxk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ManagedAuthOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ManagedAuthOptions> CREATOR = new dfgi();
    final int a;
    int b;
    int c;

    @Deprecated
    long d;

    public ManagedAuthOptions(int i, int i2, int i3, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ManagedAuthOptions)) {
            return false;
        }
        ManagedAuthOptions managedAuthOptions = (ManagedAuthOptions) obj;
        return this.b == managedAuthOptions.b && this.c == managedAuthOptions.c && this.d == managedAuthOptions.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.i(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.j(parcel, 4, this.d);
        dfxk.c(parcel, a);
    }

    public ManagedAuthOptions() {
        this(1, 0, 0, -1L);
    }
}
