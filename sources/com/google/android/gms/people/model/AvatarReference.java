package com.google.android.gms.people.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwp;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dhji;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AvatarReference extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AvatarReference> CREATOR = new dhji();
    final int a;

    @Deprecated
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final Long g;
    final Long h;

    public AvatarReference(int i, String str, String str2, String str3, String str4, String str5, Long l, Long l2) {
        dfwv.i(i != 0);
        this.a = i;
        this.b = true == TextUtils.isEmpty(str) ? null : str;
        this.c = true == TextUtils.isEmpty(str2) ? null : str2;
        this.d = true == TextUtils.isEmpty(str3) ? null : str3;
        this.e = true == TextUtils.isEmpty(str4) ? null : str4;
        this.f = true == TextUtils.isEmpty(str5) ? null : str5;
        this.g = l;
        this.h = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AvatarReference avatarReference = (AvatarReference) obj;
            if (this.a == avatarReference.a && dfwq.a(this.b, avatarReference.b) && dfwq.a(this.c, avatarReference.c) && dfwq.a(this.d, avatarReference.d) && dfwq.a(this.e, avatarReference.e) && dfwq.a(this.f, avatarReference.f) && dfwq.a(this.g, avatarReference.g) && dfwq.a(this.h, avatarReference.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.e, this.f, this.g, this.h});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dfwp.b("source", Integer.valueOf(this.a), arrayList);
        dfwp.b("location", this.b, arrayList);
        dfwp.b("url", this.c, arrayList);
        dfwp.b("email", this.d, arrayList);
        dfwp.b("account", this.e, arrayList);
        dfwp.b("focusId", this.f, arrayList);
        dfwp.b("contactId", this.g, arrayList);
        dfwp.b("rawContactId", this.h, arrayList);
        return dfwp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.m(parcel, 5, this.e, false);
        dfxk.m(parcel, 6, this.f, false);
        dfxk.A(parcel, 7, this.g);
        dfxk.A(parcel, 8, this.h);
        dfxk.c(parcel, a);
    }
}
