package com.google.android.gms.mdh;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dhdp;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MdhBroadcastListenerKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MdhBroadcastListenerKey> CREATOR = new dhdp();
    public final String a;
    public final Account b;
    public final byte[] c;

    public MdhBroadcastListenerKey(String str, Account account, byte[] bArr) {
        this.a = str;
        this.b = account;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdhBroadcastListenerKey)) {
            return false;
        }
        MdhBroadcastListenerKey mdhBroadcastListenerKey = (MdhBroadcastListenerKey) obj;
        return dfwq.a(this.a, mdhBroadcastListenerKey.a) && dfwq.a(this.b, mdhBroadcastListenerKey.b) && dfwq.a(this.c, mdhBroadcastListenerKey.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        byte[] bArr = this.c;
        return "MdhBroadcastListenerKey{action='" + this.a + "', account=" + String.valueOf(this.b) + ", channelId=" + Arrays.toString(bArr) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.f(parcel, 3, this.c, false);
        dfxk.c(parcel, a);
    }
}
