package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhgv;
import defpackage.emxb;
import defpackage.engw;
import defpackage.enou;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ContactsConsentsCoarseStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContactsConsentsCoarseStatus> CREATOR = new dhgv();
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    private final List e;
    private final List f;
    private final List g;

    public ContactsConsentsCoarseStatus(boolean z, boolean z2, List list, List list2, String str, boolean z3, List list3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.e = list;
        this.f = list2;
        this.d = z3;
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsCoarseStatus)) {
            return false;
        }
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = (ContactsConsentsCoarseStatus) obj;
        return this.a == contactsConsentsCoarseStatus.a && this.b == contactsConsentsCoarseStatus.b && emxb.a(this.f, contactsConsentsCoarseStatus.f) && emxb.a(this.e, contactsConsentsCoarseStatus.e) && emxb.a(this.c, contactsConsentsCoarseStatus.c) && this.d == contactsConsentsCoarseStatus.d && emxb.a(this.g, contactsConsentsCoarseStatus.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.e, this.f, this.c, Boolean.valueOf(this.d), this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        engw n;
        boolean z = this.a;
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, z);
        dfxk.d(parcel, 2, this.b);
        List list = this.e;
        if (list == null) {
            int i2 = engw.d;
            n = enou.a;
        } else {
            n = engw.n(list);
        }
        dfxk.n(parcel, 3, n, false);
        List list2 = this.f;
        dfxk.n(parcel, 4, list2 == null ? enou.a : engw.n(list2), false);
        dfxk.m(parcel, 5, this.c, false);
        dfxk.d(parcel, 6, this.d);
        List list3 = this.g;
        dfxk.n(parcel, 7, list3 == null ? enou.a : engw.n(list3), false);
        dfxk.c(parcel, a);
    }
}
