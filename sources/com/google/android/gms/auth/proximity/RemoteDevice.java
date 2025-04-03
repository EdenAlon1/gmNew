package com.google.android.gms.auth.proximity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfio;
import defpackage.dfwq;
import defpackage.dfxk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RemoteDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteDevice> CREATOR = new dfio();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;
    public final String f;

    @Deprecated
    public final List g;
    public final String h;
    public final AttestationVerifier i;

    public RemoteDevice(int i, String str, String str2, String str3, byte[] bArr, String str4, List list, String str5, AttestationVerifier attestationVerifier) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
        this.f = str4 == null ? "" : str4;
        this.g = list == null ? new ArrayList() : list;
        this.i = attestationVerifier;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                RemoteDevice remoteDevice = (RemoteDevice) obj;
                if (remoteDevice.a == this.a && remoteDevice.b.equals(this.b) && remoteDevice.c.equals(this.c) && remoteDevice.d.equals(this.d) && Arrays.equals(remoteDevice.e, this.e) && remoteDevice.f.equals(this.f) && dfwq.a(this.i, remoteDevice.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b.hashCode()), Integer.valueOf(this.c.hashCode()), Integer.valueOf(this.d.hashCode()), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(this.f.hashCode()), Integer.valueOf(this.h.hashCode())});
    }

    public final String toString() {
        return String.format("RemoteDevice{id=%s, name=%s, type=%s, acc=%s, pk=%s, btaddr=%s}", this.b.trim().substring(Math.max(0, r0.length() - 8)), this.c, this.h, this.d, Integer.valueOf(Arrays.hashCode(this.e)), this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.c, false);
        dfxk.m(parcel, 3, this.d, false);
        dfxk.f(parcel, 4, this.e, false);
        dfxk.m(parcel, 5, this.f, false);
        dfxk.n(parcel, 6, this.g, false);
        dfxk.m(parcel, 7, this.h, false);
        dfxk.k(parcel, 8, this.i, i, false);
        dfxk.i(parcel, 1000, this.a);
        dfxk.c(parcel, a);
    }
}
