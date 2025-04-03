package com.google.android.gms.auth.proximity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfip;
import defpackage.dfxk;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Role extends AbstractSafeParcelable implements Comparable<Role> {
    public static final Parcelable.Creator<Role> CREATOR = new dfip();
    public final int a;
    public final String b;
    public final int c;

    public Role(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Role role) {
        Role role2 = role;
        int compareTo = this.b.compareTo(role2.b);
        return compareTo != 0 ? compareTo : this.c - role2.c;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                Role role = (Role) obj;
                if (role.a == this.a && role.b.equals(this.b) && role.c == this.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b.hashCode()), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return String.format(Locale.US, "Role{featureName=%s, connectionMode=%d}", this.b, Integer.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.i(parcel, 2, this.c);
        dfxk.i(parcel, 1000, this.a);
        dfxk.c(parcel, a);
    }
}
