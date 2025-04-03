package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dfxk;
import defpackage.dhzp;
import defpackage.emwz;
import defpackage.emxa;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DataItemFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DataItemFilter> CREATOR = new dhzp();
    public final Uri a;
    public final int b;

    public DataItemFilter(Uri uri, int i) {
        this.a = uri;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DataItemFilter)) {
            return false;
        }
        DataItemFilter dataItemFilter = (DataItemFilter) obj;
        return Objects.equals(this.a, dataItemFilter.a) && this.b == dataItemFilter.b;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, this.a);
        b.f("filterType", this.b);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, uri, i, false);
        dfxk.i(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
