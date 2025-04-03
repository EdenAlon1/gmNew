package com.google.android.apps.messaging.shared.datamodel.databasegen.queries;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.bdgq;
import defpackage.beco;
import defpackage.beiu;
import defpackage.beiv;
import defpackage.beiw;
import defpackage.beix;
import defpackage.beiy;
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
public final class ConversationIdsQuery {
    public static final String[] a = {"conversations._id"};
    public static final beiu b;

    /* compiled from: PG */
    public static abstract class BindData extends dtro<beiw, beix, beiy, BindData, beiv> implements Parcelable {
        public static final Parcelable.Creator<BindData> CREATOR = new beco();
        private ConversationIdType a = bdgq.a;

        protected BindData() {
        }

        @Override // defpackage.dtro
        public final String a() {
            return String.format(Locale.US, "ConversationIdsQuery [conversations.conversations__id: %s\n]\n", String.valueOf(this.a));
        }

        @Override // defpackage.dtro
        protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
            beiw beiwVar = (beiw) dtsuVar;
            aB();
            this.cL = beiwVar.cU();
            if (beiwVar.di(0)) {
                this.a = beiwVar.c();
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
            this.a = new ConversationIdType(parcel.readLong());
        }

        @Override // defpackage.dtro
        protected final void fH(Parcel parcel) {
            parcel.writeLong(bdgq.a(this.a));
        }

        public final int hashCode() {
            dtsq dtsqVar = this.cL;
            return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, null);
        }

        public final String toString() {
            return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationIdsQuery -- REDACTED") : a();
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
        new enhd().c();
        b = new beiu();
    }

    public static dtve a() {
        return dtub.e("$primary");
    }
}
