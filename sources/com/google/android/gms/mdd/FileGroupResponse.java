package com.google.android.gms.mdd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhdj;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FileGroupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FileGroupResponse> CREATOR = new dhdj();
    public final String a;
    public final String b;
    public final List c;
    public final int d;

    public FileGroupResponse(String str, String str2, int i, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.n(parcel, 2, this.c, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.i(parcel, 4, this.d);
        dfxk.c(parcel, a);
    }
}
