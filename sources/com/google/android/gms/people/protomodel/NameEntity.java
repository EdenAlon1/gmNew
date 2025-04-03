package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dhjo;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NameEntity extends AbstractSafeParcelable implements Name {
    public static final Parcelable.Creator<NameEntity> CREATOR = new dhjo();
    public final PersonFieldMetadataEntity a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public NameEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = personFieldMetadataEntity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String c() {
        return this.e;
    }

    @Override // defpackage.dfvc
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Name)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Name name = (Name) obj;
        return dfwq.a(a(), name.a()) && dfwq.a(b(), name.b()) && dfwq.a(h(), name.h()) && dfwq.a(f(), name.f()) && dfwq.a(c(), name.c()) && dfwq.a(g(), name.g()) && dfwq.a(e(), name.e());
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String f() {
        return this.d;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String g() {
        return this.f;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), h(), f(), c(), g(), e()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PersonFieldMetadataEntity personFieldMetadataEntity = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, personFieldMetadataEntity, i, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.m(parcel, 4, this.g, false);
        dfxk.m(parcel, 5, this.d, false);
        dfxk.m(parcel, 6, this.e, false);
        dfxk.m(parcel, 7, this.f, false);
        dfxk.m(parcel, 17, this.c, false);
        dfxk.c(parcel, a);
    }
}
