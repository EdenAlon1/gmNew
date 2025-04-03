package com.google.android.apps.messaging.ui.search.presenter;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cbmd;
import defpackage.cbpb;
import defpackage.ddpp;
import defpackage.ddpq;
import defpackage.ddqj;
import defpackage.ddqk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class SelectedSearchResult implements Parcelable {
    public static final Parcelable.Creator<SelectedSearchResult> CREATOR = new ddqk();

    public abstract int a();

    public abstract int b();

    public final SelectedSearchResult c(ddqj ddqjVar) {
        int count;
        ddpp ddppVar = (ddpp) ddqjVar;
        int i = ddppVar.b;
        if (i == 2 || i == 1) {
            return null;
        }
        cbpb cbpbVar = ddppVar.a;
        int b = b();
        if (b == 1) {
            count = ((cbmd) cbpbVar.a()).a.getCount();
        } else if (b == 2) {
            count = cbpbVar.d().size();
        } else if (b == 3) {
            count = cbpbVar.h().size();
        } else if (b == 4) {
            count = cbpbVar.e().size();
        } else {
            if (b != 5) {
                return null;
            }
            count = cbpbVar.f().size();
        }
        if (count != 0) {
            return new ddpq(b(), a() < count ? a() : count - 1);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(b());
        parcel.writeInt(a());
    }
}
