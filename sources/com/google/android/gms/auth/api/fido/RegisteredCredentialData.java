package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfch;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.eyee;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RegisteredCredentialData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisteredCredentialData> CREATOR = new dfch();
    final String a;
    final eyee b;
    final boolean c;

    public RegisteredCredentialData(String str, eyee eyeeVar, boolean z) {
        dfwv.o(str, "storage ID shouldn't be null");
        this.a = str;
        this.b = eyeeVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisteredCredentialData)) {
            return false;
        }
        RegisteredCredentialData registeredCredentialData = (RegisteredCredentialData) obj;
        return this.c == registeredCredentialData.c && Objects.equals(this.a, registeredCredentialData.a) && Objects.equals(this.b, registeredCredentialData.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.c), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        eyee eyeeVar = this.b;
        dfxk.f(parcel, 2, eyeeVar == null ? null : eyeeVar.I(), false);
        dfxk.d(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
