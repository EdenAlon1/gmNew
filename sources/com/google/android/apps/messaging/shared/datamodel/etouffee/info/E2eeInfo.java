package com.google.android.apps.messaging.shared.datamodel.etouffee.info;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.capm;
import defpackage.capn;
import defpackage.ffkj;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class E2eeInfo implements Parcelable {
    public static final Parcelable.Creator<E2eeInfo> CREATOR = new capn();
    public final List a;

    public E2eeInfo(List<? extends capm> list) {
        list.getClass();
        this.a = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E2eeInfo) && ffkj.e(this.a, ((E2eeInfo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "E2eeInfo(e2eeCapabilities=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List list = this.a;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(((capm) it.next()).name());
        }
    }
}
