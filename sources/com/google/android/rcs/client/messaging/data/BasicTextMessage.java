package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.dktx;
import defpackage.eiex;
import defpackage.eigy;
import defpackage.eihn;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class BasicTextMessage implements Parcelable, eihn {
    public static final Parcelable.Creator<BasicTextMessage> CREATOR = new eiex();

    public abstract String a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.eihn
    public final void hz(eigy eigyVar) {
        eigyVar.b(this);
    }

    public final String toString() {
        return String.format("BasicTextMessage {%s}", String.format("content=%s", dktx.MESSAGE_CONTENT.c(a())));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, a(), false);
        dfxk.c(parcel, a);
    }
}
