package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dktx;
import defpackage.ehys;
import defpackage.eiax;
import defpackage.eiay;
import defpackage.eica;
import defpackage.eiiv;
import defpackage.eijb;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class GroupMember implements Parcelable {
    public static final Parcelable.Creator<GroupMember> CREATOR = new eiax();

    public static eiay e() {
        ehys ehysVar = new ehys();
        ehysVar.b("");
        ehysVar.c(false);
        return ehysVar;
    }

    public abstract eica a();

    public abstract Optional b();

    public abstract String c();

    public abstract boolean d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("GroupMember {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", dktx.PHONE_NUMBER.c(a())), String.format("displayName=%s", dktx.USER_ID.c(c())), String.format("referrer=%s", dktx.PHONE_NUMBER.c(b())), String.format("isOwnUser=%s", Boolean.valueOf(d())))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        eijb.p(parcel, 1, a(), new eiiv() { // from class: eiaw
            @Override // defpackage.eiiv
            public final void a(Parcel parcel2, Object obj, int i2) {
                eijd.a(parcel2, (eica) obj);
            }
        }, i);
        eijb.r(parcel, 2, c());
        if (b().isPresent()) {
            eijb.p(parcel, 3, (eica) b().get(), new eiiv() { // from class: eiaw
                @Override // defpackage.eiiv
                public final void a(Parcel parcel2, Object obj, int i2) {
                    eijd.a(parcel2, (eica) obj);
                }
            }, i);
        }
        eijb.o(parcel, 4, d() ? 1 : 0);
        eijb.l(parcel);
    }
}
