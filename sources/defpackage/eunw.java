package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eunw extends AbstractSafeParcelable implements Iterable<eunt> {
    public static final Parcelable.Creator<eunw> CREATOR = new eunx();
    final List a;

    public eunw(List list) {
        this.a = list;
    }

    @Override // java.lang.Iterable
    public final Iterator<eunt> iterator() {
        return this.a.iterator();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, list, false);
        dfxk.c(parcel, a);
    }
}
