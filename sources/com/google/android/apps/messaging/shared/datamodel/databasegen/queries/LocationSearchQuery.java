package com.google.android.apps.messaging.shared.datamodel.databasegen.queries;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.bdgq;
import defpackage.bdhb;
import defpackage.bkge;
import defpackage.bkwl;
import defpackage.bkwm;
import defpackage.bkwn;
import defpackage.bkwp;
import defpackage.bkwr;
import defpackage.cuxd;
import defpackage.cuxs;
import defpackage.dtro;
import defpackage.dtsq;
import defpackage.dtsu;
import defpackage.dtub;
import defpackage.dtve;
import defpackage.ekhw;
import defpackage.engr;
import defpackage.engw;
import defpackage.enhd;
import defpackage.eyfc;
import defpackage.eyfy;
import defpackage.fbuk;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class LocationSearchQuery {
    public static final String[] a = {"messages_annotations._id", "messages_annotations.message_id", "messages_annotations.annotation_details", "messages._id", "messages.conversation_id", "messages.received_timestamp", "participants.sub_id", "participants.normalized_destination", "participants.full_name", "message_star._id", "parent_disallowed_conversations.conversation_id", "conversations.participant_normalized_destination", "conversations.has_ea2p_bot_recipient"};
    public static final bkwl b;

    /* compiled from: PG */
    public static abstract class BindData extends dtro<bkwn, bkwp, bkwr, BindData, bkwm> implements Parcelable {
        public static final Parcelable.Creator<BindData> CREATOR = new bkge();
        public String a;
        public ConversationIdType b;
        public long c;
        public int d;
        public String e;
        public long f;
        public boolean g;
        private MessageIdType h;
        private fbuk i;
        private MessageIdType j;
        private String k;
        private ConversationIdType l;
        private String m;

        protected BindData() {
            MessageIdType messageIdType = bdhb.a;
            this.h = messageIdType;
            this.j = messageIdType;
            ConversationIdType conversationIdType = bdgq.a;
            this.b = conversationIdType;
            this.c = 0L;
            this.d = -2;
            this.l = conversationIdType;
            this.g = false;
        }

        @Override // defpackage.dtro
        public final String a() {
            return String.format(Locale.US, "LocationSearchQuery [messages_annotations.messages_annotations__id: %s,\n  messages_annotations.messages_annotations_message_id: %s,\n  messages_annotations.messages_annotations_annotation_details: %s,\n  messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_received_timestamp: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_full_name: %s,\n  message_star.message_star__id: %s,\n  parent_disallowed_conversations.parent_disallowed_conversations_conversation_id: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s\n]\n", String.valueOf(this.a), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.k), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.g));
        }

        @Override // defpackage.dtro
        public final void b(ContentValues contentValues) {
            LocationSearchQuery.c().intValue();
        }

        @Override // defpackage.dtro
        protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
            fbuk fbukVar;
            bkwn bkwnVar = (bkwn) dtsuVar;
            aB();
            this.cL = bkwnVar.cU();
            if (bkwnVar.di(0)) {
                this.a = bkwnVar.getString(bkwnVar.cM(0, LocationSearchQuery.a));
                fY(0);
            }
            if (bkwnVar.di(1)) {
                this.h = new MessageIdType(bkwnVar.getLong(bkwnVar.cM(1, LocationSearchQuery.a)));
                fY(1);
            }
            if (bkwnVar.di(2)) {
                byte[] blob = bkwnVar.getBlob(bkwnVar.cM(2, LocationSearchQuery.a));
                if (blob == null) {
                    fbukVar = null;
                } else {
                    try {
                        fbukVar = (fbuk) eyfy.parseFrom(fbuk.a, blob, eyfc.a());
                    } catch (Throwable unused) {
                        fbukVar = fbuk.a;
                    }
                }
                this.i = fbukVar;
                fY(2);
            }
            if (bkwnVar.di(3)) {
                this.j = new MessageIdType(bkwnVar.getLong(bkwnVar.cM(3, LocationSearchQuery.a)));
                fY(3);
            }
            if (bkwnVar.di(4)) {
                this.b = new ConversationIdType(bkwnVar.getLong(bkwnVar.cM(4, LocationSearchQuery.a)));
                fY(4);
            }
            if (bkwnVar.di(5)) {
                this.c = bkwnVar.getLong(bkwnVar.cM(5, LocationSearchQuery.a));
                fY(5);
            }
            if (bkwnVar.di(6)) {
                this.d = bkwnVar.getInt(bkwnVar.cM(6, LocationSearchQuery.a));
                fY(6);
            }
            if (bkwnVar.di(7)) {
                this.k = cuxd.a(bkwnVar.getString(bkwnVar.cM(7, LocationSearchQuery.a)));
                fY(7);
            }
            if (bkwnVar.di(8)) {
                this.e = cuxs.a(bkwnVar.getString(bkwnVar.cM(8, LocationSearchQuery.a)));
                fY(8);
            }
            if (bkwnVar.di(9)) {
                this.f = bkwnVar.getLong(bkwnVar.cM(9, LocationSearchQuery.a));
                fY(9);
            }
            if (bkwnVar.di(10)) {
                this.l = new ConversationIdType(bkwnVar.getLong(bkwnVar.cM(10, LocationSearchQuery.a)));
                fY(10);
            }
            if (bkwnVar.di(11)) {
                this.m = bkwnVar.getString(bkwnVar.cM(11, LocationSearchQuery.a));
                fY(11);
            }
            if (bkwnVar.di(12)) {
                this.g = bkwnVar.getInt(bkwnVar.cM(12, LocationSearchQuery.a)) == 1;
                fY(12);
            }
        }

        public int describeContents() {
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
            return super.aD(bindData.cL) && Objects.equals(this.a, bindData.a) && Objects.equals(this.h, bindData.h) && Objects.equals(this.i, bindData.i) && Objects.equals(this.j, bindData.j) && Objects.equals(this.b, bindData.b) && this.c == bindData.c && this.d == bindData.d && Objects.equals(this.k, bindData.k) && Objects.equals(this.e, bindData.e) && this.f == bindData.f && Objects.equals(this.l, bindData.l) && Objects.equals(this.m, bindData.m) && this.g == bindData.g;
        }

        public final MessageIdType f() {
            az(1, "message_id");
            return this.h;
        }

        @Override // defpackage.dtro
        protected final void fG(Parcel parcel) {
            fbuk fbukVar;
            this.a = parcel.readString();
            this.h = new MessageIdType(parcel.readLong());
            byte[] createByteArray = parcel.createByteArray();
            if (createByteArray == null) {
                fbukVar = null;
            } else {
                try {
                    fbukVar = (fbuk) eyfy.parseFrom(fbuk.a, createByteArray, eyfc.a());
                } catch (Throwable unused) {
                    this.i = null;
                }
            }
            this.i = fbukVar;
            this.j = new MessageIdType(parcel.readLong());
            this.b = new ConversationIdType(parcel.readLong());
            this.c = parcel.readLong();
            this.d = parcel.readInt();
            this.k = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readLong();
            this.l = new ConversationIdType(parcel.readLong());
            this.m = parcel.readString();
            this.g = parcel.readInt() == 1;
        }

        @Override // defpackage.dtro
        protected final void fH(Parcel parcel) {
            parcel.writeString(this.a);
            parcel.writeLong(bdhb.a(this.h));
            fbuk fbukVar = this.i;
            parcel.writeByteArray(fbukVar == null ? null : fbukVar.toByteArray());
            parcel.writeLong(bdhb.a(this.j));
            parcel.writeLong(bdgq.a(this.b));
            parcel.writeLong(this.c);
            parcel.writeInt(this.d);
            parcel.writeString(this.k);
            parcel.writeString(this.e);
            parcel.writeLong(this.f);
            parcel.writeLong(bdgq.a(this.l));
            parcel.writeString(this.m);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public final fbuk g() {
            az(2, "annotation_details");
            return this.i;
        }

        public final String h() {
            az(7, "normalized_destination");
            return this.k;
        }

        public final int hashCode() {
            dtsq dtsqVar = this.cL;
            return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.h, this.i, this.j, this.b, Long.valueOf(this.c), Integer.valueOf(this.d), this.k, this.e, Long.valueOf(this.f), this.l, this.m, Boolean.valueOf(this.g), null);
        }

        public final String toString() {
            return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "LocationSearchQuery -- REDACTED") : a();
        }

        protected BindData(Parcel parcel) {
            MessageIdType messageIdType = bdhb.a;
            this.h = messageIdType;
            this.j = messageIdType;
            ConversationIdType conversationIdType = bdgq.a;
            this.b = conversationIdType;
            this.c = 0L;
            this.d = -2;
            this.l = conversationIdType;
            this.g = false;
            aA(parcel);
        }
    }

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("messages_annotations.message_id", 20040);
        enhdVar.k("conversations.has_ea2p_bot_recipient", 12001);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("message_id", "index_null_message_id");
        enhdVar2.c();
        b = new bkwl();
    }

    public static final bkwr a() {
        String[] strArr;
        Integer c = c();
        if (c.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("messages_annotations._id");
            if (c.intValue() >= 20040) {
                engrVar.h("messages_annotations.message_id");
            }
            engrVar.h("messages_annotations.annotation_details");
            engrVar.h("messages._id");
            engrVar.h("messages.conversation_id");
            engrVar.h("messages.received_timestamp");
            engrVar.h("participants.sub_id");
            engrVar.h("participants.normalized_destination");
            engrVar.h("participants.full_name");
            engrVar.h("message_star._id");
            engrVar.h("parent_disallowed_conversations.conversation_id");
            engrVar.h("conversations.participant_normalized_destination");
            if (c.intValue() >= 12001) {
                engrVar.h("conversations.has_ea2p_bot_recipient");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bkwr(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().P().a());
    }
}
