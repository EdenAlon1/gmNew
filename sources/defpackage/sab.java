package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sab extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<sab> CREATOR = new sac();
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public sab(String str, int i, int i2, int i3, int i4) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.i(parcel, 4, this.d);
        dfxk.i(parcel, 5, this.e);
        dfxk.c(parcel, a);
    }
}
