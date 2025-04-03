package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dgjp;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GoogleTunnelServerIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleTunnelServerIdExtension> CREATOR = new dgjp();
    public final String a;

    public GoogleTunnelServerIdExtension(String str) {
        dfwv.n(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GoogleTunnelServerIdExtension) {
            return this.a.equals(((GoogleTunnelServerIdExtension) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.c(parcel, a);
    }
}
