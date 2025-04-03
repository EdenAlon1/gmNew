package com.google.android.apps.messaging.ui.mediapicker.c2o.content;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.doxr;
import defpackage.doxs;
import defpackage.eohh;
import defpackage.uey;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class MediaContentItem implements Parcelable, doxs {
    public final Uri b;
    public final String c;
    public final eohh d;

    protected MediaContentItem(Uri uri, String str, eohh eohhVar) {
        this.b = uri;
        this.c = str;
        this.d = eohhVar == null ? eohh.UNKNOWN : eohhVar;
    }

    public int b() {
        return -1;
    }

    public int c() {
        return -1;
    }

    public long d() {
        return -1L;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Uri e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaContentItem)) {
            return false;
        }
        MediaContentItem mediaContentItem = (MediaContentItem) obj;
        return mediaContentItem.e() != null && mediaContentItem.f() != null && mediaContentItem.e().equals(e()) && mediaContentItem.f().equals(f());
    }

    public String f() {
        return this.c;
    }

    @Override // defpackage.doxs
    public final doxr fm() {
        return uey.a(this.d);
    }

    @Override // defpackage.doxs
    public final /* synthetic */ String fo() {
        return toString();
    }

    public int hashCode() {
        return Objects.hash(e(), f());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d.a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected MediaContentItem(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r3.readParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r1 = r3.readString()
            r1.getClass()
            int r3 = r3.readInt()
            eohh r3 = defpackage.eohh.b(r3)
            r2.<init>(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem.<init>(android.os.Parcel):void");
    }

    @Override // defpackage.doxx
    public final /* synthetic */ Object fn() {
        return this;
    }
}
