package com.google.android.apps.messaging.shared.datamodel.databasegen.queries;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.bdgq;
import defpackage.bdhb;
import defpackage.bpgv;
import defpackage.bpxz;
import defpackage.bpya;
import defpackage.bpyb;
import defpackage.bpyd;
import defpackage.bpyf;
import defpackage.cuxd;
import defpackage.cuxs;
import defpackage.dtro;
import defpackage.dtsq;
import defpackage.dtsu;
import defpackage.dtub;
import defpackage.dtve;
import defpackage.dtzf;
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
public final class UrlSearchQuery {
    public static final String[] a = {"messages_annotations._id", "messages_annotations.message_id", "messages_annotations.annotation_details", "messages.conversation_id", "messages.received_timestamp", "participants.sub_id", "participants.normalized_destination", "participants.full_name", "link_preview._id", "link_preview.trigger_url", "link_preview.expiration_time_millis", "link_preview.link_title", "link_preview.link_description", "link_preview.link_image_url", "link_preview.link_domain", "link_preview.link_canonical_url", "link_preview.link_preview_prevented", "link_preview.link_preview_failed", "message_star._id", "parent_disallowed_conversations.conversation_id", "conversations.participant_normalized_destination", "conversations.has_ea2p_bot_recipient"};
    public static final bpxz b;

    /* compiled from: PG */
    public static abstract class BindData extends dtro<bpyb, bpyd, bpyf, BindData, bpya> implements Parcelable {
        public static final Parcelable.Creator<BindData> CREATOR = new bpgv();
        public String a;
        public MessageIdType b = bdhb.a;
        public fbuk c;
        public ConversationIdType d;
        public long e;
        public int f;
        public String g;
        public String h;
        public long i;
        public String j;
        public long k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public boolean q;
        public boolean r;
        public long s;
        public ConversationIdType t;
        public String u;
        public boolean v;

        protected BindData() {
            ConversationIdType conversationIdType = bdgq.a;
            this.d = conversationIdType;
            this.e = 0L;
            this.f = -2;
            this.k = 0L;
            this.q = false;
            this.r = false;
            this.t = conversationIdType;
            this.v = false;
        }

        @Override // defpackage.dtro
        public final String a() {
            return String.format(Locale.US, "UrlSearchQuery [messages_annotations.messages_annotations__id: %s,\n  messages_annotations.messages_annotations_message_id: %s,\n  messages_annotations.messages_annotations_annotation_details: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_received_timestamp: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_full_name: %s,\n  link_preview.link_preview__id: %s,\n  link_preview.link_preview_trigger_url: %s,\n  link_preview.link_preview_expiration_time_millis: %s,\n  link_preview.link_preview_link_title: %s,\n  link_preview.link_preview_link_description: %s,\n  link_preview.link_preview_link_image_url: %s,\n  link_preview.link_preview_link_domain: %s,\n  link_preview.link_preview_link_canonical_url: %s,\n  link_preview.link_preview_link_preview_prevented: %s,\n  link_preview.link_preview_link_preview_failed: %s,\n  message_star.message_star__id: %s,\n  parent_disallowed_conversations.parent_disallowed_conversations_conversation_id: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v));
        }

        @Override // defpackage.dtro
        public final void b(ContentValues contentValues) {
            UrlSearchQuery.c().intValue();
        }

        @Override // defpackage.dtro
        protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
            fbuk fbukVar;
            bpyb bpybVar = (bpyb) dtsuVar;
            aB();
            this.cL = bpybVar.cU();
            if (bpybVar.di(0)) {
                this.a = bpybVar.getString(bpybVar.cM(0, UrlSearchQuery.a));
                fY(0);
            }
            if (bpybVar.di(1)) {
                this.b = new MessageIdType(bpybVar.getLong(bpybVar.cM(1, UrlSearchQuery.a)));
                fY(1);
            }
            if (bpybVar.di(2)) {
                byte[] blob = bpybVar.getBlob(bpybVar.cM(2, UrlSearchQuery.a));
                if (blob == null) {
                    fbukVar = null;
                } else {
                    try {
                        fbukVar = (fbuk) eyfy.parseFrom(fbuk.a, blob, eyfc.a());
                    } catch (Throwable unused) {
                        fbukVar = fbuk.a;
                    }
                }
                this.c = fbukVar;
                fY(2);
            }
            if (bpybVar.di(3)) {
                this.d = new ConversationIdType(bpybVar.getLong(bpybVar.cM(3, UrlSearchQuery.a)));
                fY(3);
            }
            if (bpybVar.di(4)) {
                this.e = bpybVar.getLong(bpybVar.cM(4, UrlSearchQuery.a));
                fY(4);
            }
            if (bpybVar.di(5)) {
                this.f = bpybVar.getInt(bpybVar.cM(5, UrlSearchQuery.a));
                fY(5);
            }
            if (bpybVar.di(6)) {
                this.g = cuxd.a(bpybVar.getString(bpybVar.cM(6, UrlSearchQuery.a)));
                fY(6);
            }
            if (bpybVar.di(7)) {
                this.h = cuxs.a(bpybVar.getString(bpybVar.cM(7, UrlSearchQuery.a)));
                fY(7);
            }
            if (bpybVar.di(8)) {
                this.i = bpybVar.getLong(bpybVar.cM(8, UrlSearchQuery.a));
                fY(8);
            }
            if (bpybVar.di(9)) {
                this.j = bpybVar.getString(bpybVar.cM(9, UrlSearchQuery.a));
                fY(9);
            }
            if (bpybVar.di(10)) {
                this.k = bpybVar.getLong(bpybVar.cM(10, UrlSearchQuery.a));
                fY(10);
            }
            if (bpybVar.di(11)) {
                this.l = cuxs.a(bpybVar.getString(bpybVar.cM(11, UrlSearchQuery.a)));
                fY(11);
            }
            if (bpybVar.di(12)) {
                this.m = cuxs.a(bpybVar.getString(bpybVar.cM(12, UrlSearchQuery.a)));
                fY(12);
            }
            if (bpybVar.di(13)) {
                this.n = bpybVar.getString(bpybVar.cM(13, UrlSearchQuery.a));
                fY(13);
            }
            if (bpybVar.di(14)) {
                this.o = bpybVar.getString(bpybVar.cM(14, UrlSearchQuery.a));
                fY(14);
            }
            if (bpybVar.di(15)) {
                this.p = bpybVar.getString(bpybVar.cM(15, UrlSearchQuery.a));
                fY(15);
            }
            if (bpybVar.di(16)) {
                this.q = bpybVar.getInt(bpybVar.cM(16, UrlSearchQuery.a)) == 1;
                fY(16);
            }
            if (bpybVar.di(17)) {
                this.r = bpybVar.getInt(bpybVar.cM(17, UrlSearchQuery.a)) == 1;
                fY(17);
            }
            if (bpybVar.di(18)) {
                this.s = bpybVar.getLong(bpybVar.cM(18, UrlSearchQuery.a));
                fY(18);
            }
            if (bpybVar.di(19)) {
                this.t = new ConversationIdType(bpybVar.getLong(bpybVar.cM(19, UrlSearchQuery.a)));
                fY(19);
            }
            if (bpybVar.di(20)) {
                this.u = bpybVar.getString(bpybVar.cM(20, UrlSearchQuery.a));
                fY(20);
            }
            if (bpybVar.di(21)) {
                this.v = bpybVar.getInt(bpybVar.cM(21, UrlSearchQuery.a)) == 1;
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
            return super.aD(bindData.cL) && Objects.equals(this.a, bindData.a) && Objects.equals(this.b, bindData.b) && Objects.equals(this.c, bindData.c) && Objects.equals(this.d, bindData.d) && this.e == bindData.e && this.f == bindData.f && Objects.equals(this.g, bindData.g) && Objects.equals(this.h, bindData.h) && this.i == bindData.i && Objects.equals(this.j, bindData.j) && this.k == bindData.k && Objects.equals(this.l, bindData.l) && Objects.equals(this.m, bindData.m) && Objects.equals(this.n, bindData.n) && Objects.equals(this.o, bindData.o) && Objects.equals(this.p, bindData.p) && this.q == bindData.q && this.r == bindData.r && this.s == bindData.s && Objects.equals(this.t, bindData.t) && Objects.equals(this.u, bindData.u) && this.v == bindData.v;
        }

        public final int f() {
            az(5, "sub_id");
            return this.f;
        }

        @Override // defpackage.dtro
        protected final void fG(Parcel parcel) {
            fbuk fbukVar;
            this.a = parcel.readString();
            this.b = new MessageIdType(parcel.readLong());
            byte[] createByteArray = parcel.createByteArray();
            if (createByteArray == null) {
                fbukVar = null;
            } else {
                try {
                    fbukVar = (fbuk) eyfy.parseFrom(fbuk.a, createByteArray, eyfc.a());
                } catch (Throwable unused) {
                    this.c = null;
                }
            }
            this.c = fbukVar;
            this.d = new ConversationIdType(parcel.readLong());
            this.e = parcel.readLong();
            this.f = parcel.readInt();
            this.g = parcel.readString();
            this.h = parcel.readString();
            this.i = parcel.readLong();
            this.j = parcel.readString();
            this.k = parcel.readLong();
            this.l = parcel.readString();
            this.m = parcel.readString();
            this.n = parcel.readString();
            this.o = parcel.readString();
            this.p = parcel.readString();
            this.q = parcel.readInt() == 1;
            this.r = parcel.readInt() == 1;
            this.s = parcel.readLong();
            this.t = new ConversationIdType(parcel.readLong());
            this.u = parcel.readString();
            this.v = parcel.readInt() == 1;
        }

        @Override // defpackage.dtro
        protected final void fH(Parcel parcel) {
            parcel.writeString(this.a);
            parcel.writeLong(bdhb.a(this.b));
            fbuk fbukVar = this.c;
            parcel.writeByteArray(fbukVar == null ? null : fbukVar.toByteArray());
            parcel.writeLong(bdgq.a(this.d));
            parcel.writeLong(this.e);
            parcel.writeInt(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeLong(this.i);
            parcel.writeString(this.j);
            parcel.writeLong(this.k);
            parcel.writeString(this.l);
            parcel.writeString(this.m);
            parcel.writeString(this.n);
            parcel.writeString(this.o);
            parcel.writeString(this.p);
            parcel.writeInt(this.q ? 1 : 0);
            parcel.writeInt(this.r ? 1 : 0);
            parcel.writeLong(this.s);
            parcel.writeLong(bdgq.a(this.t));
            parcel.writeString(this.u);
            parcel.writeInt(this.v ? 1 : 0);
        }

        public final long g() {
            az(10, "expiration_time_millis");
            return this.k;
        }

        public final long h() {
            az(18, "_id");
            return this.s;
        }

        public final int hashCode() {
            dtsq dtsqVar = this.cL;
            return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, this.d, Long.valueOf(this.e), Integer.valueOf(this.f), this.g, this.h, Long.valueOf(this.i), this.j, Long.valueOf(this.k), this.l, this.m, this.n, this.o, this.p, Boolean.valueOf(this.q), Boolean.valueOf(this.r), Long.valueOf(this.s), this.t, this.u, Boolean.valueOf(this.v), null);
        }

        public final long i() {
            az(4, "received_timestamp");
            return this.e;
        }

        public final ConversationIdType j() {
            az(3, "conversation_id");
            return this.d;
        }

        public final MessageIdType k() {
            az(1, "message_id");
            return this.b;
        }

        public final fbuk l() {
            az(2, "annotation_details");
            return this.c;
        }

        public final String m() {
            az(7, "full_name");
            return this.h;
        }

        public final String n() {
            az(0, "_id");
            return this.a;
        }

        public final String o() {
            az(15, "link_canonical_url");
            return this.p;
        }

        public final String p() {
            az(13, "link_image_url");
            return this.n;
        }

        public final String q() {
            az(11, "link_title");
            return this.l;
        }

        public final String r() {
            az(6, "normalized_destination");
            return this.g;
        }

        public final String s() {
            az(9, "trigger_url");
            return this.j;
        }

        public final boolean t() {
            az(21, "has_ea2p_bot_recipient");
            return this.v;
        }

        public final String toString() {
            return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "UrlSearchQuery -- REDACTED") : a();
        }

        protected BindData(Parcel parcel) {
            ConversationIdType conversationIdType = bdgq.a;
            this.d = conversationIdType;
            this.e = 0L;
            this.f = -2;
            this.k = 0L;
            this.q = false;
            this.r = false;
            this.t = conversationIdType;
            this.v = false;
            aA(parcel);
        }
    }

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("messages_annotations.message_id", 20040);
        enhdVar.k("link_preview.link_preview_prevented", 21010);
        enhdVar.k("link_preview.link_preview_failed", 22020);
        enhdVar.k("conversations.has_ea2p_bot_recipient", 12001);
        enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("message_id", "index_null_message_id");
        enhdVar2.c();
        b = new bpxz();
    }

    public static final bpyf a() {
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
            engrVar.h("messages.conversation_id");
            engrVar.h("messages.received_timestamp");
            engrVar.h("participants.sub_id");
            engrVar.h("participants.normalized_destination");
            engrVar.h("participants.full_name");
            engrVar.h("link_preview._id");
            engrVar.h("link_preview.trigger_url");
            engrVar.h("link_preview.expiration_time_millis");
            engrVar.h("link_preview.link_title");
            engrVar.h("link_preview.link_description");
            engrVar.h("link_preview.link_image_url");
            engrVar.h("link_preview.link_domain");
            engrVar.h("link_preview.link_canonical_url");
            if (c.intValue() >= 21010) {
                engrVar.h("link_preview.link_preview_prevented");
            }
            if (c.intValue() >= 22020) {
                engrVar.h("link_preview.link_preview_failed");
            }
            engrVar.h("message_star._id");
            engrVar.h("parent_disallowed_conversations.conversation_id");
            engrVar.h("conversations.participant_normalized_destination");
            if (c.intValue() >= 12001) {
                engrVar.h("conversations.has_ea2p_bot_recipient");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bpyf(strArr);
    }

    public static dtve b() {
        return dtub.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(d().a());
    }

    public static dtzf d() {
        return b().P();
    }
}
