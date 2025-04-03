package com.google.android.gms.people.account.categories;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhgt;
import defpackage.emxb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClassifyAccountTypeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClassifyAccountTypeRequest> CREATOR = new dhgt();
    public final String a;
    public final String b;
    public final int c;

    public ClassifyAccountTypeRequest(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ClassifyAccountTypeRequest classifyAccountTypeRequest = (ClassifyAccountTypeRequest) obj;
            if (emxb.a(this.a, classifyAccountTypeRequest.a) && emxb.a(this.b, classifyAccountTypeRequest.b) && this.c == classifyAccountTypeRequest.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.i(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }
}
