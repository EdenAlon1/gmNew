package com.google.android.gms.fido.credentialstore;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dgig;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class KeyCreationRequestOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyCreationRequestOptions> CREATOR = new dgig();
    public final String a;
    public final boolean b;
    public final int c;
    public final int[] d;
    public final byte[] e;
    public final String f;
    public final String g;
    public final Account h;
    public final boolean i;
    public final boolean j;

    public KeyCreationRequestOptions(String str, boolean z, int i, int[] iArr, byte[] bArr, String str2, String str3, Account account, boolean z2, boolean z3) {
        boolean z4 = false;
        if (str != null && str.length() > 0) {
            z4 = true;
        }
        dfwv.b(z4, "rpId cannot be empty");
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = iArr;
        this.e = bArr;
        this.f = str2;
        this.g = str3;
        this.h = account;
        this.i = z2;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof KeyCreationRequestOptions)) {
            return false;
        }
        KeyCreationRequestOptions keyCreationRequestOptions = (KeyCreationRequestOptions) obj;
        return dfwq.a(this.a, keyCreationRequestOptions.a) && dfwq.a(Boolean.valueOf(this.b), Boolean.valueOf(keyCreationRequestOptions.b)) && dfwq.a(Integer.valueOf(this.c), Integer.valueOf(keyCreationRequestOptions.c)) && dfwq.a(this.d, keyCreationRequestOptions.d) && Arrays.equals(this.e, keyCreationRequestOptions.e) && dfwq.a(this.f, keyCreationRequestOptions.f) && dfwq.a(this.g, keyCreationRequestOptions.g) && dfwq.a(this.h, keyCreationRequestOptions.h) && dfwq.a(Boolean.valueOf(this.i), Boolean.valueOf(keyCreationRequestOptions.i)) && dfwq.a(Boolean.valueOf(this.j), Boolean.valueOf(keyCreationRequestOptions.j));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e, this.f, this.g, Boolean.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.d(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.v(parcel, 4, this.d);
        dfxk.f(parcel, 5, this.e, false);
        dfxk.m(parcel, 6, this.f, false);
        dfxk.m(parcel, 7, this.g, false);
        dfxk.k(parcel, 8, this.h, i, false);
        dfxk.d(parcel, 9, this.i);
        dfxk.d(parcel, 10, this.j);
        dfxk.c(parcel, a);
    }
}
