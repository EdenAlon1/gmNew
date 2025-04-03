package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dfyk;
import defpackage.dglc;
import defpackage.dgle;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class KeyHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyHandle> CREATOR = new dglc();
    public final int a;
    public final byte[] b;
    public final ProtocolVersion c;
    public final List d;

    public KeyHandle(int i, byte[] bArr, String str, List list) {
        this.a = i;
        this.b = bArr;
        try {
            this.c = ProtocolVersion.a(str);
            this.d = list;
        } catch (dgle e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        if (!Arrays.equals(this.b, keyHandle.b) || !this.c.equals(keyHandle.c)) {
            return false;
        }
        List list2 = this.d;
        if (list2 == null && keyHandle.d == null) {
            return true;
        }
        return list2 != null && (list = keyHandle.d) != null && list2.containsAll(list) && keyHandle.d.containsAll(this.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d});
    }

    public final String toString() {
        List list = this.d;
        return String.format("{keyHandle: %s, version: %s, transports: %s}", dfyk.a(this.b), this.c, list == null ? "null" : list.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.f(parcel, 2, this.b, false);
        dfxk.m(parcel, 3, this.c.d, false);
        dfxk.n(parcel, 4, this.d, false);
        dfxk.c(parcel, a);
    }
}
