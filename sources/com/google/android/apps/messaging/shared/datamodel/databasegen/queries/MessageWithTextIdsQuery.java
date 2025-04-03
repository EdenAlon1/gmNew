package com.google.android.apps.messaging.shared.datamodel.databasegen.queries;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.bdhb;
import defpackage.boap;
import defpackage.boev;
import defpackage.boew;
import defpackage.boex;
import defpackage.boez;
import defpackage.bofb;
import defpackage.dtro;
import defpackage.dtsq;
import defpackage.dtsu;
import defpackage.dtub;
import defpackage.dtve;
import defpackage.ekhw;
import defpackage.enhd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class MessageWithTextIdsQuery {
    public static final String[] a = {"parts.message_id"};
    public static final boev b;

    /* compiled from: PG */
    public static abstract class BindData extends dtro<boex, boez, bofb, BindData, boew> implements Parcelable {
        public static final Parcelable.Creator<BindData> CREATOR = new boap();
        private MessageIdType a = bdhb.a;

        protected BindData() {
        }

        @Override // defpackage.dtro
        public final String a() {
            return String.format(Locale.US, "MessageWithTextIdsQuery [parts.parts_message_id: %s\n]\n", String.valueOf(this.a));
        }

        @Override // defpackage.dtro
        protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
            boex boexVar = (boex) dtsuVar;
            aB();
            this.cL = boexVar.cU();
            if (boexVar.di(0)) {
                this.a = boexVar.c();
                super.fY(0);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BindData)) {
                return false;
            }
            BindData bindData = (BindData) obj;
            return super.aD(bindData.cL) && Objects.equals(this.a, bindData.a);
        }

        @Override // defpackage.dtro
        protected final void fG(Parcel parcel) {
            this.a = new MessageIdType(parcel.readLong());
        }

        @Override // defpackage.dtro
        protected final void fH(Parcel parcel) {
            parcel.writeLong(bdhb.a(this.a));
        }

        public final int hashCode() {
            dtsq dtsqVar = this.cL;
            return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, null);
        }

        public final String toString() {
            return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageWithTextIdsQuery -- REDACTED") : a();
        }

        protected BindData(Parcel parcel) {
            aA(parcel);
        }

        @Override // defpackage.dtro
        public final void b(ContentValues contentValues) {
        }
    }

    static {
        new enhd().c();
        enhd enhdVar = new enhd();
        enhdVar.k("message_id", "index_null_message_id");
        enhdVar.c();
        b = new boev();
    }

    public static dtve a() {
        return dtub.e("$primary");
    }
}
