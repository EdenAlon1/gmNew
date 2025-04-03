package com.google.android.gms.libs.identity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dgxq;
import defpackage.engq;
import defpackage.engw;
import defpackage.enou;
import defpackage.ffkj;
import defpackage.ffpc;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new dgxq();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final ClientIdentity f;

    static {
        Process.myUid();
        Process.myPid();
    }

    public ClientIdentity(int i, String str, String str2, String str3, List list, ClientIdentity clientIdentity) {
        if (clientIdentity != null && clientIdentity.a()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3 == null ? clientIdentity != null ? clientIdentity.d : null : str3;
        if (list == null) {
            list = clientIdentity != null ? clientIdentity.e : null;
            if (list == null) {
                int i2 = engw.d;
                list = enou.a;
                list.getClass();
            }
        }
        this.e = engq.a(list);
        this.f = clientIdentity;
    }

    public final boolean a() {
        return this.f != null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ClientIdentity) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            if (this.a == clientIdentity.a && ffkj.e(this.b, clientIdentity.b) && ffkj.e(this.c, clientIdentity.c) && ffkj.e(this.d, clientIdentity.d) && ffkj.e(this.f, clientIdentity.f) && ffkj.e(this.e, clientIdentity.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.f});
    }

    public final String toString() {
        String str = this.c;
        StringBuilder sb = new StringBuilder(this.b.length() + 18 + (str != null ? str.length() : 0));
        sb.append(this.a);
        sb.append("/");
        sb.append(this.b);
        String str2 = this.c;
        if (str2 != null) {
            sb.append("[");
            if (ffpc.t(str2, this.b)) {
                sb.append((CharSequence) str2, this.b.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        if (this.d != null) {
            sb.append("/");
            sb.append(Integer.toHexString(this.d.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.m(parcel, 4, this.c, false);
        dfxk.m(parcel, 6, this.d, false);
        dfxk.k(parcel, 7, this.f, i, false);
        dfxk.n(parcel, 8, this.e, false);
        dfxk.c(parcel, a);
    }
}
