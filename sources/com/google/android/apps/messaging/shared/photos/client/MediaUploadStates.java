package com.google.android.apps.messaging.shared.photos.client;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cjhp;
import defpackage.drso;
import defpackage.ffkj;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class MediaUploadStates implements Parcelable {
    public static final Parcelable.Creator<MediaUploadStates> CREATOR = new cjhp();
    public final Map a;

    public MediaUploadStates(Map<String, ? extends drso> map) {
        map.getClass();
        this.a = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MediaUploadStates) && ffkj.e(this.a, ((MediaUploadStates) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MediaUploadStates(states=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Map map = this.a;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }
}
