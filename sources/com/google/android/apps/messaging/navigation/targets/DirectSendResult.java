package com.google.android.apps.messaging.navigation.targets;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aikh;
import defpackage.aiki;
import defpackage.aikj;
import defpackage.ffkd;
import defpackage.ffkj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface DirectSendResult extends Parcelable {

    /* compiled from: PG */
    public static final class Add implements DirectSendResult {
        public static final Parcelable.Creator<Add> CREATOR = new aikh();
        public final EditedMedia a;
        public final String b;

        /* JADX WARN: Multi-variable type inference failed */
        public Add() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Add)) {
                return false;
            }
            Add add = (Add) obj;
            return ffkj.e(this.a, add.a) && ffkj.e(this.b, add.b);
        }

        public final int hashCode() {
            EditedMedia editedMedia = this.a;
            int hashCode = editedMedia == null ? 0 : editedMedia.hashCode();
            String str = this.b;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "Add(edit=" + this.a + ", textCaption=" + this.b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            EditedMedia editedMedia = this.a;
            if (editedMedia == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                editedMedia.writeToParcel(parcel, i);
            }
            parcel.writeString(this.b);
        }

        public Add(EditedMedia editedMedia, String str) {
            this.a = editedMedia;
            this.b = str;
        }

        public /* synthetic */ Add(EditedMedia editedMedia, String str, int i, ffkd ffkdVar) {
            this(1 == (i & 1) ? null : editedMedia, (i & 2) != 0 ? null : str);
        }
    }

    /* compiled from: PG */
    public static final class Discard implements DirectSendResult {
        public static final Parcelable.Creator<Discard> CREATOR = new aiki();
        public final String a;

        /* JADX WARN: Multi-variable type inference failed */
        public Discard() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Discard) && ffkj.e(this.a, ((Discard) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return "Discard(textCaption=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
        }

        public Discard(String str) {
            this.a = str;
        }

        public /* synthetic */ Discard(String str, int i, ffkd ffkdVar) {
            this(1 == (i & 1) ? null : str);
        }
    }

    /* compiled from: PG */
    public static final class Send implements DirectSendResult {
        public static final Parcelable.Creator<Send> CREATOR = new aikj();
        public final EditedMedia a;
        public final String b;

        /* JADX WARN: Multi-variable type inference failed */
        public Send() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Send)) {
                return false;
            }
            Send send = (Send) obj;
            return ffkj.e(this.a, send.a) && ffkj.e(this.b, send.b);
        }

        public final int hashCode() {
            EditedMedia editedMedia = this.a;
            int hashCode = editedMedia == null ? 0 : editedMedia.hashCode();
            String str = this.b;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "Send(edit=" + this.a + ", textCaption=" + this.b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            EditedMedia editedMedia = this.a;
            if (editedMedia == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                editedMedia.writeToParcel(parcel, i);
            }
            parcel.writeString(this.b);
        }

        public Send(EditedMedia editedMedia, String str) {
            this.a = editedMedia;
            this.b = str;
        }

        public /* synthetic */ Send(EditedMedia editedMedia, String str, int i, ffkd ffkdVar) {
            this(1 == (i & 1) ? null : editedMedia, (i & 2) != 0 ? null : str);
        }
    }
}
