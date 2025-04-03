package com.google.android.gms.auth.proximity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.cmj;
import defpackage.dfim;
import defpackage.dfxk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConnectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionInfo> CREATOR = new dfim();
    public final int a;
    public final RemoteDevice b;
    public final Role[] c;
    public final int d;
    public final byte[] e;

    public ConnectionInfo(int i, RemoteDevice remoteDevice, Role[] roleArr, int i2, byte[] bArr) {
        this.a = i;
        this.b = remoteDevice;
        this.c = roleArr;
        this.d = i2;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                ConnectionInfo connectionInfo = (ConnectionInfo) obj;
                boolean equals = new cmj(Arrays.asList(this.c)).equals(new cmj(Arrays.asList(connectionInfo.c)));
                if (connectionInfo.b.equals(this.b) && equals && connectionInfo.d == this.d && Arrays.equals(connectionInfo.e, this.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Role[] roleArr = this.c;
        Role[] roleArr2 = (Role[]) Arrays.copyOf(roleArr, roleArr.length);
        Arrays.sort(roleArr2);
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b.hashCode()), Integer.valueOf(Arrays.hashCode(roleArr2)), Integer.valueOf(this.d), this.e});
    }

    public final String toString() {
        String remoteDevice = this.b.toString();
        String arrays = Arrays.toString(this.c);
        int i = this.d;
        String str = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "[unknown]" : "[connecting]" : "[authenticated]" : "[authenticating]" : "[connected]" : "[disconnected]";
        byte[] bArr = this.e;
        return String.format("(%s, %s, %s, len(cbd)=%s)", remoteDevice, arrays, str, bArr == null ? "<null>" : Integer.valueOf(bArr.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RemoteDevice remoteDevice = this.b;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, remoteDevice, i, false);
        dfxk.E(parcel, 2, this.c, i);
        dfxk.i(parcel, 3, this.d);
        dfxk.f(parcel, 4, this.e, false);
        dfxk.i(parcel, 1000, this.a);
        dfxk.c(parcel, a);
    }
}
