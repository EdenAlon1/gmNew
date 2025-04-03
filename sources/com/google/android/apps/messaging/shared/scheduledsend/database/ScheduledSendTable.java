package com.google.android.apps.messaging.shared.scheduledsend.database;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.bdgq;
import defpackage.bdgw;
import defpackage.bdhb;
import defpackage.cohc;
import defpackage.cohd;
import defpackage.cohe;
import defpackage.cohi;
import defpackage.cohj;
import defpackage.cohy;
import defpackage.cohz;
import defpackage.coia;
import defpackage.coih;
import defpackage.coil;
import defpackage.coin;
import defpackage.coiu;
import defpackage.dtro;
import defpackage.dtrq;
import defpackage.dtsq;
import defpackage.dtsu;
import defpackage.dtub;
import defpackage.dtuj;
import defpackage.dtup;
import defpackage.dtve;
import defpackage.dtzf;
import defpackage.ekhw;
import defpackage.engr;
import defpackage.engw;
import defpackage.enhd;
import defpackage.enhk;
import j$.time.Instant;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ScheduledSendTable extends dtup {
    public static final String[] a = {"scheduled_send._id", "scheduled_send.message_id", "scheduled_send.conversation_id", "scheduled_send.scheduled_time", "scheduled_send.status", "scheduled_send.creation_time"};
    public static final enhk b;
    public static final cohy c;
    public static final int[] d;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("scheduled_send.creation_time", 58020);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("conversation_id", "index_scheduled_send_conversation_id");
        enhdVar2.c();
        c = new cohy();
        d = new int[]{52040, 58020, 58170, 58290};
    }

    public static cohi a() {
        cohj cohjVar = new cohj();
        cohjVar.aF();
        return cohjVar;
    }

    public static final coin b() {
        String[] strArr;
        Integer d2 = d();
        if (d2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("scheduled_send._id");
            engrVar.h("scheduled_send.message_id");
            engrVar.h("scheduled_send.conversation_id");
            engrVar.h("scheduled_send.scheduled_time");
            engrVar.h("scheduled_send.status");
            if (d2.intValue() >= 58020) {
                engrVar.h("scheduled_send.creation_time");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new coin(strArr);
    }

    public static dtve c() {
        return dtub.e("$primary");
    }

    public static Integer d() {
        return Integer.valueOf(f().a());
    }

    public static void e(dtve dtveVar, int i) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER UNIQUE REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INTEGER REFERENCES conversations(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("scheduled_time INTEGER DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("status INTEGER DEFAULT(0)");
        if (i >= 58020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("creation_time INTEGER DEFAULT(0) NOT NULL");
        }
        sb.insert(0, "CREATE TABLE scheduled_send (");
        sb.append(");");
        dtveVar.y(sb.toString());
        ArrayList arrayList = new ArrayList();
        if (i >= 58170) {
            arrayList.add("DROP INDEX IF EXISTS index_scheduled_send_conversation_id");
            arrayList.add("CREATE INDEX index_scheduled_send_conversation_id ON scheduled_send(conversation_id);");
        }
        if (i >= 58290) {
            arrayList.add("DROP INDEX IF EXISTS index_status_time");
            arrayList.add("CREATE INDEX index_status_time ON scheduled_send(status, scheduled_time);");
        }
        for (String str : (String[]) arrayList.toArray(new String[0])) {
            dtveVar.y(str);
        }
    }

    public static dtzf f() {
        return c().P();
    }

    /* compiled from: PG */
    public static abstract class BindData extends dtro<coia, coil, coin, BindData, cohz> implements Parcelable, dtrq {
        public static final Parcelable.Creator<BindData> CREATOR = new cohc();
        public String a;
        public MessageIdType b = bdhb.a;
        public ConversationIdType c = bdgq.a;
        public Instant d = bdgw.b(0);
        public coiu e = coiu.SCHEDULED;
        public Instant f = bdgw.b(0);

        protected BindData() {
        }

        @Override // defpackage.dtro
        public final String a() {
            return String.format(Locale.US, "ScheduledSendTable [_id: %s,\n  message_id: %s,\n  conversation_id: %s,\n  scheduled_time: %s,\n  status: %s,\n  creation_time: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
        }

        @Override // defpackage.dtro
        public final void b(ContentValues contentValues) {
            int intValue = ScheduledSendTable.d().intValue();
            MessageIdType messageIdType = this.b;
            if (messageIdType == null || messageIdType.equals(bdhb.a)) {
                contentValues.putNull("message_id");
            } else {
                contentValues.put("message_id", Long.valueOf(bdhb.a(this.b)));
            }
            ConversationIdType conversationIdType = this.c;
            if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
                contentValues.putNull("conversation_id");
            } else {
                contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.c)));
            }
            Instant instant = this.d;
            if (instant == null) {
                contentValues.putNull("scheduled_time");
            } else {
                contentValues.put("scheduled_time", Long.valueOf(bdgw.a(instant)));
            }
            coiu coiuVar = this.e;
            if (coiuVar == null) {
                contentValues.putNull("status");
            } else {
                contentValues.put("status", Integer.valueOf(coiuVar.ordinal()));
            }
            if (intValue >= 58020) {
                Instant instant2 = this.f;
                if (instant2 == null) {
                    contentValues.putNull("creation_time");
                } else {
                    contentValues.put("creation_time", Long.valueOf(bdgw.a(instant2)));
                }
            }
        }

        @Override // defpackage.dtro
        protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
            coih coihVar = (coih) ((coia) dtsuVar);
            aB();
            this.cL = coihVar.cU();
            if (coihVar.di(0)) {
                this.a = coihVar.i();
                super.fY(0);
            }
            if (coihVar.di(1)) {
                this.b = coihVar.e();
                super.fY(1);
            }
            if (coihVar.di(2)) {
                this.c = coihVar.c();
                super.fY(2);
            }
            if (coihVar.di(3)) {
                this.d = coihVar.h();
                super.fY(3);
            }
            if (coihVar.di(4)) {
                this.e = coihVar.f();
                super.fY(4);
            }
            if (coihVar.di(5)) {
                this.f = coihVar.g();
                super.fY(5);
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
            return super.aD(bindData.cL) && Objects.equals(this.a, bindData.a) && Objects.equals(this.b, bindData.b) && Objects.equals(this.c, bindData.c) && Objects.equals(this.d, bindData.d) && this.e == bindData.e && Objects.equals(this.f, bindData.f);
        }

        @Override // defpackage.dtrq
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "scheduled_send", dtub.m(new String[]{"message_id", "conversation_id", "scheduled_time", "status", "creation_time"}));
        }

        @Override // defpackage.dtro
        protected final void fG(Parcel parcel) {
            this.a = parcel.readString();
            this.b = new MessageIdType(parcel.readLong());
            this.c = new ConversationIdType(parcel.readLong());
            this.d = bdgw.b(parcel.readLong());
            coiu[] values = coiu.values();
            int readInt = parcel.readInt();
            if (readInt >= 0) {
                if (readInt >= values.length) {
                    throw new IllegalArgumentException();
                }
                this.e = values[readInt];
            }
            this.f = bdgw.b(parcel.readLong());
        }

        @Override // defpackage.dtro
        protected final void fH(Parcel parcel) {
            parcel.writeString(this.a);
            parcel.writeLong(bdhb.a(this.b));
            parcel.writeLong(bdgq.a(this.c));
            parcel.writeLong(bdgw.a(this.d));
            coiu coiuVar = this.e;
            parcel.writeInt(coiuVar == null ? -1 : coiuVar.ordinal());
            parcel.writeLong(bdgw.a(this.f));
        }

        @Override // defpackage.dtro
        public final void fY(int i) {
            super.fY(0);
        }

        @Override // defpackage.dtrq
        public final String g() {
            return "_id";
        }

        @Override // defpackage.dtrq
        public final String h() {
            return "scheduled_send";
        }

        public final int hashCode() {
            dtsq dtsqVar = this.cL;
            dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
            String str = this.a;
            MessageIdType messageIdType = this.b;
            ConversationIdType conversationIdType = this.c;
            Instant instant = this.d;
            coiu coiuVar = this.e;
            return Objects.hash(dtsqVar2, str, messageIdType, conversationIdType, instant, Integer.valueOf(coiuVar == null ? 0 : coiuVar.ordinal()), this.f, null);
        }

        @Override // defpackage.dtrq
        public final void i(StringBuilder sb, List list) {
            Object obj = new cohd(this).get();
            Object obj2 = new cohe(this).get();
            Long valueOf = Long.valueOf(bdgw.a(this.d));
            coiu coiuVar = this.e;
            Object[] objArr = {obj, obj2, valueOf, coiuVar == null ? 0 : String.valueOf(coiuVar.ordinal()), Long.valueOf(bdgw.a(this.f))};
            sb.append('(');
            for (int i = 0; i < 5; i++) {
                Object obj3 = objArr[i];
                if (obj3 instanceof Number) {
                    sb.append(String.valueOf(obj3));
                } else {
                    if (obj3 instanceof String) {
                        String str = (String) obj3;
                        if (str.length() < 12) {
                            sb.append(DatabaseUtils.sqlEscapeString(str));
                        }
                    }
                    list.add(obj3);
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

        public final Instant k() {
            az(5, "creation_time");
            return this.f;
        }

        public final Instant l() {
            az(3, "scheduled_time");
            return this.d;
        }

        public final String m() {
            az(0, "_id");
            return this.a;
        }

        public final /* synthetic */ void n(final Long l) {
            if (l.longValue() >= 0) {
                this.a = (String) new dtuj() { // from class: cohb
                    @Override // defpackage.dtuj
                    public final Object a() {
                        return String.valueOf(l);
                    }
                }.a();
                super.fY(0);
            }
        }

        public final String toString() {
            return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ScheduledSendTable -- REDACTED") : a();
        }

        protected BindData(Parcel parcel) {
            aA(parcel);
        }
    }
}
