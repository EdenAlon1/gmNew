package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.devp;
import defpackage.devy;
import defpackage.dfwv;
import defpackage.dfxk;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DocumentSection extends AbstractSafeParcelable {
    public final String b;
    final RegisterSectionInfo c;
    public final int d;
    public final byte[] e;
    public static final int a = Integer.parseInt("-1");
    public static final Parcelable.Creator<DocumentSection> CREATOR = new devp();

    static {
        ArrayList arrayList = new ArrayList();
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo, int i, byte[] bArr) {
        String str2;
        int i2 = a;
        boolean z = true;
        if (i != i2 && devy.a(i) == null) {
            z = false;
        }
        dfwv.b(z, a.h(i, "Invalid section type "));
        this.b = str;
        this.c = registerSectionInfo;
        this.d = i;
        this.e = bArr;
        if (i == i2 || devy.a(i) != null) {
            str2 = (str == null || bArr == null) ? null : "Both content and blobContent set";
        } else {
            str2 = "Invalid section type " + i;
        }
        if (str2 != null) {
            throw new IllegalArgumentException(str2);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a2 = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.i(parcel, 4, this.d);
        dfxk.f(parcel, 5, this.e, false);
        dfxk.c(parcel, a2);
    }
}
