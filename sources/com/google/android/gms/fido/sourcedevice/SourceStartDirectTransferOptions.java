package com.google.android.gms.fido.sourcedevice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dgkq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SourceStartDirectTransferOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SourceStartDirectTransferOptions> CREATOR = new dgkq();
    public final int a;
    public final boolean b;
    public final List c;
    public final boolean d;
    public final String e;

    public SourceStartDirectTransferOptions(int i, boolean z, List list, boolean z2, String str) {
        this.a = i;
        this.b = z;
        this.c = list;
        this.d = z2;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.d(parcel, 2, this.b);
        dfxk.n(parcel, 3, this.c, false);
        dfxk.d(parcel, 4, this.d);
        dfxk.m(parcel, 5, this.e, false);
        dfxk.c(parcel, a);
    }
}
