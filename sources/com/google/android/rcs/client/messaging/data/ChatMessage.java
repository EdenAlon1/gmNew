package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dfxk;
import defpackage.dktx;
import defpackage.eiez;
import defpackage.eigy;
import defpackage.eihn;
import defpackage.eyee;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ChatMessage implements Parcelable, eihn {
    public static final Parcelable.Creator<ChatMessage> CREATOR = new eiez();

    public abstract ContentType a();

    public abstract eyee b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.eihn
    public final void hz(eigy eigyVar) {
        eigyVar.c(this);
    }

    public final String toString() {
        return String.format("ChatMessage {%s}", TextUtils.join(",", Arrays.asList(String.format("content=%s", dktx.MESSAGE_CONTENT.c(b())), String.format("contentType=%s", a()))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, a(), i, false);
        dfxk.f(parcel, 2, b().I(), false);
        dfxk.c(parcel, a);
    }
}
