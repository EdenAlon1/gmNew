package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class expz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<expz> CREATOR = new exqa();
    public final String a;
    public final Rect b;
    public final List c;
    public final float d;
    public final float e;

    public expz(String str, Rect rect, List list, float f, float f2) {
        this.a = str;
        this.b = rect;
        this.c = list;
        this.d = f;
        this.e = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.n(parcel, 3, this.c, false);
        dfxk.h(parcel, 4, this.d);
        dfxk.h(parcel, 5, this.e);
        dfxk.c(parcel, a);
    }
}
