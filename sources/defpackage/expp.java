package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class expp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<expp> CREATOR = new expq();
    public final String a;
    public final Rect b;
    public final List c;
    public final String d;
    public final List e;

    public expp(String str, Rect rect, List list, String str2, List list2) {
        this.a = str;
        this.b = rect;
        this.c = list;
        this.d = str2;
        this.e = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.n(parcel, 3, this.c, false);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.n(parcel, 5, this.e, false);
        dfxk.c(parcel, a);
    }
}
