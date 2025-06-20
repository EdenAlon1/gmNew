package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dhjr;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PhoneEntity extends AbstractSafeParcelable implements Phone {
    public static final Parcelable.Creator<PhoneEntity> CREATOR = new dhjr();
    public final PersonFieldMetadataEntity a;
    public final String b;
    public final String c;

    public PhoneEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str, String str2) {
        this.a = personFieldMetadataEntity;
        this.b = str;
        this.c = str2;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final String b() {
        return this.c;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final String c() {
        return this.b;
    }

    @Override // defpackage.dfvc
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Phone)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Phone phone = (Phone) obj;
        return dfwq.a(a(), phone.a()) && dfwq.a(c(), phone.c()) && dfwq.a(b(), phone.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), c(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PersonFieldMetadataEntity personFieldMetadataEntity = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, personFieldMetadataEntity, i, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.m(parcel, 4, this.c, false);
        dfxk.c(parcel, a);
    }
}
