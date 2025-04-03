package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class expr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<expr> CREATOR = new exps();
    public final String a;
    public final Rect b;
    public final List c;
    public final String d;
    public final float e;
    public final float f;
    public final List g;

    public expr(String str, Rect rect, List list, String str2, float f, float f2, List list2) {
        this.a = str;
        this.b = rect;
        this.c = list;
        this.d = str2;
        this.e = f;
        this.f = f2;
        this.g = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.n(parcel, 3, this.c, false);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.h(parcel, 5, this.e);
        dfxk.h(parcel, 6, this.f);
        dfxk.n(parcel, 7, this.g, false);
        dfxk.c(parcel, a);
    }
}
