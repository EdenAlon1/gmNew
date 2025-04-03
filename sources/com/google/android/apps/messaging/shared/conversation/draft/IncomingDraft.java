package com.google.android.apps.messaging.shared.conversation.draft;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aygq;
import defpackage.aygt;
import defpackage.aygu;
import defpackage.aygv;
import defpackage.aygx;
import defpackage.cskw;
import defpackage.ffbs;
import defpackage.ffel;
import defpackage.ffkd;
import defpackage.ffkj;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class IncomingDraft implements Parcelable {
    public static final Parcelable.Creator<IncomingDraft> CREATOR = new aygx();
    public final String a;
    public final List b;
    public final String c;
    public final boolean d;
    public final Instant e;
    public final EditingData f;
    public final boolean g;
    private final aygq h;

    /* compiled from: PG */
    public static final class Attachment implements Parcelable {
        public static final Parcelable.Creator<Attachment> CREATOR = new aygv();
        public final String a;
        public final Uri b;
        public final Long c;

        public Attachment(String str, Uri uri, Long l) {
            str.getClass();
            uri.getClass();
            this.a = str;
            this.b = uri;
            this.c = l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Attachment)) {
                return false;
            }
            Attachment attachment = (Attachment) obj;
            return ffkj.e(this.a, attachment.a) && ffkj.e(this.b, attachment.b) && ffkj.e(this.c, attachment.c);
        }

        public final int hashCode() {
            int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
            Long l = this.c;
            return (hashCode * 31) + (l == null ? 0 : l.hashCode());
        }

        public final String toString() {
            return "Attachment(type=" + this.a + ", uri=" + cskw.d(this.b) + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeParcelable(this.b, i);
            Long l = this.c;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
        }
    }

    @ffbs
    public IncomingDraft(aygq aygqVar, String str, List<Attachment> list, String str2, boolean z, Instant instant, EditingData editingData, boolean z2) {
        aygqVar.getClass();
        list.getClass();
        this.h = aygqVar;
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = z;
        this.e = instant;
        this.f = editingData;
        this.g = z2;
        if (str != null && str.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (str2 != null && str2.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (str == null && str2 == null && !z && list.isEmpty()) {
            throw new aygt();
        }
    }

    public static /* synthetic */ IncomingDraft a(IncomingDraft incomingDraft, List list, Instant instant, EditingData editingData, int i) {
        aygq aygqVar = (i & 1) != 0 ? incomingDraft.h : null;
        String str = (i & 2) != 0 ? incomingDraft.a : null;
        if ((i & 4) != 0) {
            list = incomingDraft.b;
        }
        List list2 = list;
        String str2 = (i & 8) != 0 ? incomingDraft.c : null;
        boolean z = (i & 16) != 0 ? incomingDraft.d : false;
        if ((i & 32) != 0) {
            instant = incomingDraft.e;
        }
        Instant instant2 = instant;
        if ((i & 64) != 0) {
            editingData = incomingDraft.f;
        }
        boolean z2 = incomingDraft.g;
        aygqVar.getClass();
        list2.getClass();
        return new IncomingDraft(aygqVar, str, list2, str2, z, instant2, editingData, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncomingDraft)) {
            return false;
        }
        IncomingDraft incomingDraft = (IncomingDraft) obj;
        return this.h == incomingDraft.h && ffkj.e(this.a, incomingDraft.a) && ffkj.e(this.b, incomingDraft.b) && ffkj.e(this.c, incomingDraft.c) && this.d == incomingDraft.d && ffkj.e(this.e, incomingDraft.e) && ffkj.e(this.f, incomingDraft.f) && this.g == incomingDraft.g;
    }

    public final int hashCode() {
        int hashCode = this.h.hashCode() * 31;
        String str = this.a;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.b.hashCode()) * 31;
        String str2 = this.c;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + aygu.a(this.d)) * 31;
        Instant instant = this.e;
        int hashCode4 = (hashCode3 + (instant == null ? 0 : instant.hashCode())) * 31;
        EditingData editingData = this.f;
        return ((hashCode4 + (editingData != null ? editingData.hashCode() : 0)) * 31) + aygu.a(this.g);
    }

    public final String toString() {
        String str = this.a;
        CharSequence c = str != null ? cskw.c(str) : null;
        List list = this.b;
        String str2 = this.c;
        CharSequence c2 = str2 != null ? cskw.c(str2) : null;
        boolean z = this.d;
        Instant instant = this.e;
        EditingData editingData = this.f;
        String editingData2 = editingData != null ? editingData.toString() : null;
        return "IncomingDraft(draftSource=" + this.h + ", text=" + ((Object) c) + ", attachments=" + list + ", subject=" + ((Object) c2) + ", isUrgent=" + z + ", scheduledTime=" + instant + ", editingData=" + editingData2 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.h.name());
        parcel.writeString(this.a);
        List list = this.b;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Attachment) it.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeSerializable(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public /* synthetic */ IncomingDraft(aygq aygqVar, String str, List list, String str2, boolean z, Instant instant, EditingData editingData, boolean z2, int i, ffkd ffkdVar) {
        this(aygqVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ffel.a : list, (i & 8) != 0 ? null : str2, ((i & 16) == 0) & z, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? null : editingData, ((i & 128) == 0) & z2);
    }
}
