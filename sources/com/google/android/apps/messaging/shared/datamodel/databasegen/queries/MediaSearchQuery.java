package com.google.android.apps.messaging.shared.datamodel.databasegen.queries;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.bdgq;
import defpackage.bdhb;
import defpackage.bkwu;
import defpackage.blqu;
import defpackage.blqv;
import defpackage.blqw;
import defpackage.blqy;
import defpackage.blra;
import defpackage.byyz;
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
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class MediaSearchQuery {
    public static final String[] a = {"parts._id", "parts.message_id", "parts.uri", "parts.content_type", "parts.width", "parts.height", "parts.timestamp", "parts.conversation_id", "parts.image_display_state", "messages._id", "messages.sender_id", "messages.received_timestamp", "messages.self_id", "participants._id", "participants.sub_id", "participants.normalized_destination", "participants.full_name", "participants.lookup_key", "message_star._id", "parent_disallowed_conversations.conversation_id", "conversations.participant_normalized_destination", "conversations.has_ea2p_bot_recipient"};
    public static final blqu b;

    /* compiled from: PG */
    public static abstract class BindData extends dtro<blqw, blqy, blra, BindData, blqv> implements Parcelable {
        public static final Parcelable.Creator<BindData> CREATOR = new bkwu();
        public int a;
        public int b;
        public long c;
        public long d;
        public boolean e;
        private String f;
        private MessageIdType g;
        private Uri h;
        private String i;
        private ConversationIdType j;
        private byyz k;
        private MessageIdType l;
        private String m;
        private long n;
        private String o;
        private String p;
        private int q;
        private String r;
        private String s;
        private String t;
        private ConversationIdType u;
        private String v;

        protected BindData() {
            MessageIdType messageIdType = bdhb.a;
            this.g = messageIdType;
            this.a = -1;
            this.b = -1;
            ConversationIdType conversationIdType = bdgq.a;
            this.j = conversationIdType;
            this.k = byyz.DEFAULT_NO_VERDICT;
            this.l = messageIdType;
            this.n = 0L;
            this.q = -2;
            this.u = conversationIdType;
            this.e = false;
        }

        @Override // defpackage.dtro
        public final String a() {
            return String.format(Locale.US, "MediaSearchQuery [parts.parts__id: %s,\n  parts.parts_message_id: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_width: %s,\n  parts.parts_height: %s,\n  parts.parts_timestamp: %s,\n  parts.parts_conversation_id: %s,\n  parts.parts_image_display_state: %s,\n  messages.messages__id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_self_id: %s,\n  participants.participants__id: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_lookup_key: %s,\n  message_star.message_star__id: %s,\n  parent_disallowed_conversations.parent_disallowed_conversations_conversation_id: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s\n]\n", String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t), String.valueOf(this.d), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.e));
        }

        @Override // defpackage.dtro
        public final void b(ContentValues contentValues) {
            MediaSearchQuery.c().intValue();
        }

        @Override // defpackage.dtro
        protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
            blqw blqwVar = (blqw) dtsuVar;
            aB();
            this.cL = blqwVar.cU();
            if (blqwVar.di(0)) {
                this.f = blqwVar.getString(blqwVar.cM(0, MediaSearchQuery.a));
                fY(0);
            }
            if (blqwVar.di(1)) {
                this.g = new MessageIdType(blqwVar.getLong(blqwVar.cM(1, MediaSearchQuery.a)));
                fY(1);
            }
            if (blqwVar.di(2)) {
                String string = blqwVar.getString(blqwVar.cM(2, MediaSearchQuery.a));
                this.h = string == null ? null : Uri.parse(string);
                fY(2);
            }
            if (blqwVar.di(3)) {
                this.i = blqwVar.getString(blqwVar.cM(3, MediaSearchQuery.a));
                fY(3);
            }
            if (blqwVar.di(4)) {
                this.a = blqwVar.getInt(blqwVar.cM(4, MediaSearchQuery.a));
                fY(4);
            }
            if (blqwVar.di(5)) {
                this.b = blqwVar.getInt(blqwVar.cM(5, MediaSearchQuery.a));
                fY(5);
            }
            if (blqwVar.di(6)) {
                this.c = blqwVar.getLong(blqwVar.cM(6, MediaSearchQuery.a));
                fY(6);
            }
            if (blqwVar.di(7)) {
                this.j = new ConversationIdType(blqwVar.getLong(blqwVar.cM(7, MediaSearchQuery.a)));
                fY(7);
            }
            if (blqwVar.di(8)) {
                byyz[] values = byyz.values();
                int i = blqwVar.getInt(blqwVar.cM(8, MediaSearchQuery.a));
                if (i >= values.length) {
                    throw new IllegalArgumentException();
                }
                this.k = values[i];
                fY(8);
            }
            if (blqwVar.di(9)) {
                this.l = new MessageIdType(blqwVar.getLong(blqwVar.cM(9, MediaSearchQuery.a)));
                fY(9);
            }
            if (blqwVar.di(10)) {
                this.m = blqwVar.getString(blqwVar.cM(10, MediaSearchQuery.a));
                fY(10);
            }
            if (blqwVar.di(11)) {
                this.n = blqwVar.getLong(blqwVar.cM(11, MediaSearchQuery.a));
                fY(11);
            }
            if (blqwVar.di(12)) {
                this.o = blqwVar.getString(blqwVar.cM(12, MediaSearchQuery.a));
                fY(12);
            }
            if (blqwVar.di(13)) {
                this.p = blqwVar.getString(blqwVar.cM(13, MediaSearchQuery.a));
                fY(13);
            }
            if (blqwVar.di(14)) {
                this.q = blqwVar.getInt(blqwVar.cM(14, MediaSearchQuery.a));
                fY(14);
            }
            if (blqwVar.di(15)) {
                this.r = cuxd.a(blqwVar.getString(blqwVar.cM(15, MediaSearchQuery.a)));
                fY(15);
            }
            if (blqwVar.di(16)) {
                this.s = cuxs.a(blqwVar.getString(blqwVar.cM(16, MediaSearchQuery.a)));
                fY(16);
            }
            if (blqwVar.di(17)) {
                this.t = blqwVar.getString(blqwVar.cM(17, MediaSearchQuery.a));
                fY(17);
            }
            if (blqwVar.di(18)) {
                this.d = blqwVar.getLong(blqwVar.cM(18, MediaSearchQuery.a));
                fY(18);
            }
            if (blqwVar.di(19)) {
                this.u = new ConversationIdType(blqwVar.getLong(blqwVar.cM(19, MediaSearchQuery.a)));
                fY(19);
            }
            if (blqwVar.di(20)) {
                this.v = blqwVar.getString(blqwVar.cM(20, MediaSearchQuery.a));
                fY(20);
            }
            if (blqwVar.di(21)) {
                this.e = blqwVar.getInt(blqwVar.cM(21, MediaSearchQuery.a)) == 1;
                fY(21);
            }
        }

        @Override // android.os.Parcelable
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
            return super.aD(bindData.cL) && Objects.equals(this.f, bindData.f) && Objects.equals(this.g, bindData.g) && Objects.equals(this.h, bindData.h) && Objects.equals(this.i, bindData.i) && this.a == bindData.a && this.b == bindData.b && this.c == bindData.c && Objects.equals(this.j, bindData.j) && this.k == bindData.k && Objects.equals(this.l, bindData.l) && Objects.equals(this.m, bindData.m) && this.n == bindData.n && Objects.equals(this.o, bindData.o) && Objects.equals(this.p, bindData.p) && this.q == bindData.q && Objects.equals(this.r, bindData.r) && Objects.equals(this.s, bindData.s) && Objects.equals(this.t, bindData.t) && this.d == bindData.d && Objects.equals(this.u, bindData.u) && Objects.equals(this.v, bindData.v) && this.e == bindData.e;
        }

        public final int f() {
            az(14, "sub_id");
            return this.q;
        }

        @Override // defpackage.dtro
        protected final void fG(Parcel parcel) {
            this.f = parcel.readString();
            this.g = new MessageIdType(parcel.readLong());
            String readString = parcel.readString();
            this.h = readString == null ? null : Uri.parse(readString);
            this.i = parcel.readString();
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readLong();
            this.j = new ConversationIdType(parcel.readLong());
            byyz[] values = byyz.values();
            int readInt = parcel.readInt();
            if (readInt >= 0) {
                if (readInt >= values.length) {
                    throw new IllegalArgumentException();
                }
                this.k = values[readInt];
            }
            this.l = new MessageIdType(parcel.readLong());
            this.m = parcel.readString();
            this.n = parcel.readLong();
            this.o = parcel.readString();
            this.p = parcel.readString();
            this.q = parcel.readInt();
            this.r = parcel.readString();
            this.s = parcel.readString();
            this.t = parcel.readString();
            this.d = parcel.readLong();
            this.u = new ConversationIdType(parcel.readLong());
            this.v = parcel.readString();
            this.e = parcel.readInt() == 1;
        }

        @Override // defpackage.dtro
        protected final void fH(Parcel parcel) {
            parcel.writeString(this.f);
            parcel.writeLong(bdhb.a(this.g));
            Uri uri = this.h;
            parcel.writeString(uri == null ? null : uri.toString());
            parcel.writeString(this.i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeLong(this.c);
            parcel.writeLong(bdgq.a(this.j));
            byyz byyzVar = this.k;
            parcel.writeInt(byyzVar == null ? -1 : byyzVar.ordinal());
            parcel.writeLong(bdhb.a(this.l));
            parcel.writeString(this.m);
            parcel.writeLong(this.n);
            parcel.writeString(this.o);
            parcel.writeString(this.p);
            parcel.writeInt(this.q);
            parcel.writeString(this.r);
            parcel.writeString(this.s);
            parcel.writeString(this.t);
            parcel.writeLong(this.d);
            parcel.writeLong(bdgq.a(this.u));
            parcel.writeString(this.v);
            parcel.writeInt(this.e ? 1 : 0);
        }

        public final long g() {
            az(11, "received_timestamp");
            return this.n;
        }

        public final Uri h() {
            az(2, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            return this.h;
        }

        public final int hashCode() {
            dtsq dtsqVar = this.cL;
            dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
            String str = this.f;
            MessageIdType messageIdType = this.g;
            Uri uri = this.h;
            String str2 = this.i;
            Integer valueOf = Integer.valueOf(this.a);
            Integer valueOf2 = Integer.valueOf(this.b);
            Long valueOf3 = Long.valueOf(this.c);
            ConversationIdType conversationIdType = this.j;
            byyz byyzVar = this.k;
            return Objects.hash(dtsqVar2, str, messageIdType, uri, str2, valueOf, valueOf2, valueOf3, conversationIdType, Integer.valueOf(byyzVar == null ? 0 : byyzVar.ordinal()), this.l, this.m, Long.valueOf(this.n), this.o, this.p, Integer.valueOf(this.q), this.r, this.s, this.t, Long.valueOf(this.d), this.u, this.v, Boolean.valueOf(this.e), null);
        }

        public final ConversationIdType i() {
            az(7, "conversation_id");
            return this.j;
        }

        public final MessageIdType j() {
            az(1, "message_id");
            return this.g;
        }

        public final String k() {
            az(3, "content_type");
            return this.i;
        }

        public final String l() {
            az(16, "full_name");
            return this.s;
        }

        public final String m() {
            az(0, "_id");
            return this.f;
        }

        public final String n() {
            az(15, "normalized_destination");
            return this.r;
        }

        public final String toString() {
            return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MediaSearchQuery -- REDACTED") : a();
        }

        protected BindData(Parcel parcel) {
            MessageIdType messageIdType = bdhb.a;
            this.g = messageIdType;
            this.a = -1;
            this.b = -1;
            ConversationIdType conversationIdType = bdgq.a;
            this.j = conversationIdType;
            this.k = byyz.DEFAULT_NO_VERDICT;
            this.l = messageIdType;
            this.n = 0L;
            this.q = -2;
            this.u = conversationIdType;
            this.e = false;
            aA(parcel);
        }
    }

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("parts.timestamp", 3010);
        enhdVar.k("parts.image_display_state", 60240);
        enhdVar.k("conversations.has_ea2p_bot_recipient", 12001);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("message_id", "index_null_message_id");
        enhdVar2.k("content_type", "index_null_content_type");
        enhdVar2.k("conversation_id", "index_null_conversation_id");
        enhdVar2.c();
        b = new blqu();
    }

    public static final blra a() {
        String[] strArr;
        Integer c = c();
        if (c.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("parts._id");
            engrVar.h("parts.message_id");
            engrVar.h("parts.uri");
            engrVar.h("parts.content_type");
            engrVar.h("parts.width");
            engrVar.h("parts.height");
            if (c.intValue() >= 3010) {
                engrVar.h("parts.timestamp");
            }
            engrVar.h("parts.conversation_id");
            if (c.intValue() >= 60240) {
                engrVar.h("parts.image_display_state");
            }
            engrVar.h("messages._id");
            engrVar.h("messages.sender_id");
            engrVar.h("messages.received_timestamp");
            engrVar.h("messages.self_id");
            engrVar.h("participants._id");
            engrVar.h("participants.sub_id");
            engrVar.h("participants.normalized_destination");
            engrVar.h("participants.full_name");
            engrVar.h("participants.lookup_key");
            engrVar.h("message_star._id");
            engrVar.h("parent_disallowed_conversations.conversation_id");
            engrVar.h("conversations.participant_normalized_destination");
            if (c.intValue() >= 12001) {
                engrVar.h("conversations.has_ea2p_bot_recipient");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new blra(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(b().P().a());
    }
}
