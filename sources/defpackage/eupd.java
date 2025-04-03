package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.Thing;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<eupd> CREATOR = new eupe();
    public final int a;
    public final Thing[] b;
    public final String[] c;
    public final String[] d;
    public final euof e;
    public final String f;
    public final String g;

    public eupd(int i, Thing[] thingArr, String[] strArr, String[] strArr2, euof euofVar, String str, String str2) {
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7) {
            i = 0;
        }
        this.a = i;
        this.b = thingArr;
        this.c = strArr;
        this.d = strArr2;
        this.e = euofVar;
        this.f = str;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.E(parcel, 2, this.b, i);
        dfxk.C(parcel, 3, this.c);
        dfxk.C(parcel, 5, this.d);
        dfxk.k(parcel, 6, this.e, i, false);
        dfxk.m(parcel, 7, this.f, false);
        dfxk.m(parcel, 8, this.g, false);
        dfxk.c(parcel, a);
    }
}
