package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class expx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<expx> CREATOR = new expy();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final String f;
    public final boolean g;

    public expx(String str, String str2, String str3, boolean z, int i, String str4, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.e = i;
        this.d = z;
        this.g = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.d(parcel, 4, this.d);
        dfxk.i(parcel, 5, this.e);
        dfxk.m(parcel, 6, this.f, false);
        dfxk.d(parcel, 7, this.g);
        dfxk.c(parcel, a);
    }
}
