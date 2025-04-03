package com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.bdgq;
import defpackage.bdgw;
import defpackage.brsg;
import defpackage.brsh;
import defpackage.brsu;
import defpackage.brsv;
import defpackage.brsw;
import defpackage.brtb;
import defpackage.brte;
import defpackage.brtf;
import defpackage.cjcm;
import defpackage.cjcn;
import defpackage.dtro;
import defpackage.dtrq;
import defpackage.dtsq;
import defpackage.dtsu;
import defpackage.dtub;
import defpackage.dtup;
import defpackage.dtve;
import defpackage.ekhw;
import defpackage.enhd;
import j$.time.Instant;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ConversationNotificationSettingsTable extends dtup {
    public static final String[] a = {"conversation_notification_settings_table.conversation_id", "conversation_notification_settings_table.muted_until_timestamp", "conversation_notification_settings_table.muted_duration", "conversation_notification_settings_table.muted_threshold"};
    public static final brsu b;
    public static final int[] c;

    static {
        new enhd().c();
        new enhd().c();
        b = new brsu();
        c = new int[]{60720};
    }

    public static dtve a() {
        return dtub.e("$primary");
    }

    public static void b(dtve dtveVar) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER PRIMARY KEY NOT NULL REFERENCES conversations(_id) ON DELETE CASCADE ON UPDATE CASCADE");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("muted_until_timestamp INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("muted_duration INT DEFAULT(4)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("muted_threshold INT DEFAULT(4)");
        sb.insert(0, "CREATE TABLE conversation_notification_settings_table (");
        sb.append(");");
        dtveVar.y(sb.toString());
        for (String str : (String[]) new ArrayList().toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    /* compiled from: PG */
    public static abstract class BindData extends dtro<brsw, brte, brtf, BindData, brsv> implements Parcelable, dtrq {
        public static final Parcelable.Creator<BindData> CREATOR = new brsg();
        public ConversationIdType a = bdgq.a;
        public Instant b = bdgw.b(0);
        public cjcm c = cjcm.e;
        public cjcn d = cjcn.e;

        protected BindData() {
        }

        @Override // defpackage.dtro
        public final String a() {
            return String.format(Locale.US, "ConversationNotificationSettingsTable [conversation_id: %s,\n  muted_until_timestamp: %s,\n  muted_duration: %s,\n  muted_threshold: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
        }

        @Override // defpackage.dtro
        public final void b(ContentValues contentValues) {
            ConversationIdType conversationIdType = this.a;
            if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
                contentValues.putNull("conversation_id");
            } else {
                contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.a)));
            }
            Instant instant = this.b;
            if (instant == null) {
                contentValues.putNull("muted_until_timestamp");
            } else {
                contentValues.put("muted_until_timestamp", Long.valueOf(bdgw.a(instant)));
            }
            cjcm cjcmVar = this.c;
            if (cjcmVar == null) {
                contentValues.putNull("muted_duration");
            } else {
                contentValues.put("muted_duration", Integer.valueOf(cjcmVar.ordinal()));
            }
            cjcn cjcnVar = this.d;
            if (cjcnVar == null) {
                contentValues.putNull("muted_threshold");
            } else {
                contentValues.put("muted_threshold", Integer.valueOf(cjcnVar.ordinal()));
            }
        }

        @Override // defpackage.dtro
        protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
            brtb brtbVar = (brtb) ((brsw) dtsuVar);
            aB();
            this.cL = brtbVar.cU();
            if (brtbVar.di(0)) {
                this.a = brtbVar.c();
                fY(0);
            }
            if (brtbVar.di(1)) {
                this.b = brtbVar.g();
                fY(1);
            }
            if (brtbVar.di(2)) {
                this.c = brtbVar.e();
                fY(2);
            }
            if (brtbVar.di(3)) {
                this.d = brtbVar.f();
                fY(3);
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
            return super.aD(bindData.cL) && Objects.equals(this.a, bindData.a) && Objects.equals(this.b, bindData.b) && this.c == bindData.c && this.d == bindData.d;
        }

        @Override // defpackage.dtrq
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_notification_settings_table", dtub.m(new String[]{"conversation_id", "muted_until_timestamp", "muted_duration", "muted_threshold"}));
        }

        @Override // defpackage.dtro
        protected final void fG(Parcel parcel) {
            this.a = new ConversationIdType(parcel.readLong());
            this.b = bdgw.b(parcel.readLong());
            cjcm[] values = cjcm.values();
            int readInt = parcel.readInt();
            if (readInt >= 0) {
                if (readInt >= values.length) {
                    throw new IllegalArgumentException();
                }
                this.c = values[readInt];
            }
            cjcn[] values2 = cjcn.values();
            int readInt2 = parcel.readInt();
            if (readInt2 >= 0) {
                if (readInt2 >= values2.length) {
                    throw new IllegalArgumentException();
                }
                this.d = values2[readInt2];
            }
        }

        @Override // defpackage.dtro
        protected final void fH(Parcel parcel) {
            parcel.writeLong(bdgq.a(this.a));
            parcel.writeLong(bdgw.a(this.b));
            cjcm cjcmVar = this.c;
            parcel.writeInt(cjcmVar == null ? -1 : cjcmVar.ordinal());
            cjcn cjcnVar = this.d;
            parcel.writeInt(cjcnVar != null ? cjcnVar.ordinal() : -1);
        }

        @Override // defpackage.dtrq
        public final String g() {
            return null;
        }

        @Override // defpackage.dtrq
        public final String h() {
            return "conversation_notification_settings_table";
        }

        public final int hashCode() {
            dtsq dtsqVar = this.cL;
            dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
            ConversationIdType conversationIdType = this.a;
            Instant instant = this.b;
            cjcm cjcmVar = this.c;
            Integer valueOf = Integer.valueOf(cjcmVar == null ? 0 : cjcmVar.ordinal());
            cjcn cjcnVar = this.d;
            return Objects.hash(dtsqVar2, conversationIdType, instant, valueOf, Integer.valueOf(cjcnVar == null ? 0 : cjcnVar.ordinal()), null);
        }

        @Override // defpackage.dtrq
        public final void i(StringBuilder sb, List list) {
            Object obj = new brsh(this).get();
            Long valueOf = Long.valueOf(bdgw.a(this.b));
            cjcm cjcmVar = this.c;
            Object valueOf2 = cjcmVar == null ? r4 : String.valueOf(cjcmVar.ordinal());
            cjcn cjcnVar = this.d;
            Object[] objArr = {obj, valueOf, valueOf2, cjcnVar != null ? String.valueOf(cjcnVar.ordinal()) : 0};
            sb.append('(');
            for (int i = 0; i < 4; i++) {
                Object obj2 = objArr[i];
                if (obj2 instanceof Number) {
                    sb.append(String.valueOf(obj2));
                } else {
                    if (obj2 instanceof String) {
                        String str = (String) obj2;
                        if (str.length() < 12) {
                            sb.append(DatabaseUtils.sqlEscapeString(str));
                        }
                    }
                    list.add(obj2);
                    sb.append('?');
                }
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
            sb.append(')');
        }

        @Override // defpackage.dtrq
        @Deprecated
        public final /* bridge */ /* synthetic */ Object j() {
            throw null;
        }

        public final String toString() {
            return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationNotificationSettingsTable -- REDACTED") : a();
        }

        protected BindData(Parcel parcel) {
            aA(parcel);
        }
    }
}
