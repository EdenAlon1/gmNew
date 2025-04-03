package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfdb;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.engw;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RevokeAccessRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<RevokeAccessRequest> CREATOR = new dfdb();
    public final engw a;
    public final Account b;
    public final String c;

    public RevokeAccessRequest(List list, Account account, String str) {
        this.a = engw.n(list);
        this.b = account;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RevokeAccessRequest) {
            RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) obj;
            if (this.a.size() == revokeAccessRequest.a.size() && this.a.containsAll(revokeAccessRequest.a) && dfwq.a(this.b, revokeAccessRequest.b) && dfwq.a(this.c, revokeAccessRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        engw engwVar = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, engwVar, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.c(parcel, a);
    }
}
