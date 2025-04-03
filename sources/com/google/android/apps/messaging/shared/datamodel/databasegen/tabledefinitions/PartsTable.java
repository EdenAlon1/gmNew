package com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.awao;
import defpackage.awap;
import defpackage.bdgq;
import defpackage.bdhb;
import defpackage.bvwi;
import defpackage.bvwj;
import defpackage.bvwk;
import defpackage.bvwp;
import defpackage.bvwq;
import defpackage.bwat;
import defpackage.bwau;
import defpackage.bwav;
import defpackage.bwcw;
import defpackage.bwdd;
import defpackage.bwdf;
import defpackage.bwdm;
import defpackage.byyo;
import defpackage.byyp;
import defpackage.byyu;
import defpackage.byyz;
import defpackage.byza;
import defpackage.byzc;
import defpackage.byzh;
import defpackage.byzo;
import defpackage.dteh;
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
import defpackage.eobe;
import defpackage.eyfc;
import defpackage.eyfy;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class PartsTable extends dtup {
    public static final String[] a = {"parts._id", "parts.message_id", "parts.text", "parts.uri", "parts.content_type", "parts.original_uri", "parts.storage_uri", "parts.width", "parts.height", "parts.timestamp", "parts.output_uri", "parts.target_size", "parts.processing_status", "parts.cms_attachment_processing_status", "parts.conversation_id", "parts.sticker_set_id", "parts.sticker_id", "parts.media_modified_timestamp", "parts.longitude", "parts.latitude", "parts.preview_content_uri", "parts.preview_content_type", "parts.fallback_uri", "parts.source", "parts.bundle_index", "parts.blob_id", "parts.blob_gaia_email", "parts.cms_full_size_blob_id", "parts.cms_media_encryption_key", "parts.cms_compressed_media_encryption_key", "parts.blob_upload_permanent_failure", "parts.blob_upload_timestamp", "parts.expressive_sticker_name", "parts.file_name", "parts.duration", "parts.compressed_blob_id", "parts.cms_compressed_blob_id", "parts.compressed_blob_upload_permanent_failure", "parts.compressed_blob_upload_timestamp", "parts.media_encryption_key", "parts.compressed_media_encryption_key", "parts.missing_entry_in_telephony", "parts.awaiting_reverse_sync", "parts.file_size_bytes", "parts.local_cache_path", "parts.media_send_type", "parts.voice_metadata", "parts.validation_status", "parts.processing_id", "parts.rich_card_media_download_failure_reason", "parts.image_display_state", "parts.preserve_size"};
    public static final enhk b;
    public static final enhk c;
    public static final bwat d;
    public static final int[] e;

    /* compiled from: PG */
    public static abstract class BindData extends dtro<bwav, bwdd, bwdf, BindData, bwau> implements Parcelable, dtrq {
        public static final Parcelable.Creator<BindData> CREATOR = new bvwi();
        public String A;
        public String B;
        public byte[] C;
        public byte[] D;
        public String G;
        public String H;
        public long I;
        public String J;
        public String K;
        public byte[] N;
        public byte[] O;
        public boolean P;
        public long R;
        public String S;
        public dteh U;
        public String a;
        public String c;
        public Uri d;
        public String e;
        public Uri f;
        public Uri g;
        public long j;
        public Uri k;
        public Uri u;
        public String v;
        public Uri w;
        public String z;
        public MessageIdType b = bdhb.a;
        public int h = -1;
        public int i = -1;
        public long l = 0;
        public byzc m = byzc.SUCCEEDED;
        public byyu n = byyu.NOT_FROM_CMS;
        public ConversationIdType o = bdgq.a;
        public byyp p = new byyp(-1);
        public byyp q = new byyp(-1);
        public long r = -1;
        public double s = eobe.a;
        public double t = eobe.a;
        public int x = 13;
        public int y = 0;
        public boolean E = false;
        public long F = 0;
        public boolean L = false;
        public long M = 0;
        public boolean Q = false;
        public byza T = byza.STANDARD;
        public byzo V = byzo.UNKNOWN;
        public awap W = null;
        public byzh X = byzh.NONE;
        public byyz Y = byyz.DEFAULT_NO_VERDICT;
        public boolean Z = false;

        protected BindData() {
        }

        @Deprecated
        public final Long A() {
            final dtve d = PartsTable.d();
            return Long.valueOf(dtub.b(PartsTable.d(), "parts", this, new Function() { // from class: bvwc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dtve.this.R("parts", (ContentValues) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: bvwd
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PartsTable.BindData.this.L((Long) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }));
        }

        public final Long B() {
            final dtve d = PartsTable.d();
            return Long.valueOf(dtub.b(PartsTable.d(), "parts", this, new Function() { // from class: bvwe
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(dtve.this.S("parts", (ContentValues) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Consumer() { // from class: bvwf
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PartsTable.BindData.this.M((Long) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }));
        }

        public final String C() {
            az(26, "blob_gaia_email");
            return this.A;
        }

        public final String D() {
            az(25, "blob_id");
            return this.z;
        }

        public final String E() {
            az(36, "cms_compressed_blob_id");
            return this.K;
        }

        public final String F() {
            az(27, "cms_full_size_blob_id");
            return this.B;
        }

        public final String G() {
            az(35, "compressed_blob_id");
            return this.J;
        }

        public final String H() {
            az(4, "content_type");
            return this.e;
        }

        public final String I() {
            az(33, "file_name");
            return this.H;
        }

        public final String J() {
            az(0, "_id");
            return this.a;
        }

        public final String K() {
            az(2, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
            return this.c;
        }

        public final /* synthetic */ void L(final Long l) {
            if (l.longValue() >= 0) {
                this.a = (String) new dtuj() { // from class: bvwh
                    @Override // defpackage.dtuj
                    public final Object a() {
                        return String.valueOf(l);
                    }
                }.a();
                super.fY(0);
            }
        }

        public final /* synthetic */ void M(final Long l) {
            if (l.longValue() >= 0) {
                this.a = (String) new dtuj() { // from class: bvwg
                    @Override // defpackage.dtuj
                    public final Object a() {
                        return String.valueOf(l);
                    }
                }.a();
                super.fY(0);
            }
        }

        public final boolean N() {
            az(30, "blob_upload_permanent_failure");
            return this.E;
        }

        public final boolean O() {
            az(37, "compressed_blob_upload_permanent_failure");
            return this.L;
        }

        public final byte[] P() {
            az(28, "cms_media_encryption_key");
            return this.C;
        }

        public final byte[] Q() {
            az(40, "compressed_media_encryption_key");
            return this.O;
        }

        public final byte[] R() {
            az(39, "media_encryption_key");
            return this.N;
        }

        @Override // defpackage.dtro
        public final String a() {
            Locale locale = Locale.US;
            String valueOf = String.valueOf(this.a);
            String valueOf2 = String.valueOf(this.b);
            String valueOf3 = String.valueOf(this.c);
            String valueOf4 = String.valueOf(this.d);
            String valueOf5 = String.valueOf(this.e);
            String valueOf6 = String.valueOf(this.f);
            String valueOf7 = String.valueOf(this.g);
            String valueOf8 = String.valueOf(this.h);
            String valueOf9 = String.valueOf(this.i);
            String valueOf10 = String.valueOf(this.j);
            String valueOf11 = String.valueOf(this.k);
            String valueOf12 = String.valueOf(this.l);
            String valueOf13 = String.valueOf(this.m);
            String valueOf14 = String.valueOf(this.n);
            String valueOf15 = String.valueOf(this.o);
            String valueOf16 = String.valueOf(this.p);
            String valueOf17 = String.valueOf(this.q);
            String valueOf18 = String.valueOf(this.r);
            String valueOf19 = String.valueOf(this.s);
            String valueOf20 = String.valueOf(this.t);
            String valueOf21 = String.valueOf(this.u);
            String valueOf22 = String.valueOf(this.v);
            String valueOf23 = String.valueOf(this.w);
            String valueOf24 = String.valueOf(this.x);
            String valueOf25 = String.valueOf(this.y);
            String valueOf26 = String.valueOf(this.z);
            String valueOf27 = String.valueOf(this.B);
            byte[] bArr = this.C;
            String concat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
            byte[] bArr2 = this.D;
            String concat2 = "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL"));
            String valueOf28 = String.valueOf(this.E);
            String valueOf29 = String.valueOf(this.F);
            String valueOf30 = String.valueOf(this.G);
            String valueOf31 = String.valueOf(this.H);
            String valueOf32 = String.valueOf(this.I);
            String valueOf33 = String.valueOf(this.J);
            String valueOf34 = String.valueOf(this.K);
            String valueOf35 = String.valueOf(this.L);
            String valueOf36 = String.valueOf(this.M);
            byte[] bArr3 = this.N;
            String concat3 = "BLOB".concat(String.valueOf(bArr3 != null ? String.valueOf(bArr3.length) : "NULL"));
            byte[] bArr4 = this.O;
            return String.format(locale, "PartsTable [_id: %s,\n  message_id: %s,\n  text: %s,\n  uri: %s,\n  content_type: %s,\n  original_uri: %s,\n  storage_uri: %s,\n  width: %s,\n  height: %s,\n  timestamp: %s,\n  output_uri: %s,\n  target_size: %s,\n  processing_status: %s,\n  cms_attachment_processing_status: %s,\n  conversation_id: %s,\n  sticker_set_id: %s,\n  sticker_id: %s,\n  media_modified_timestamp: %s,\n  longitude: %s,\n  latitude: %s,\n  preview_content_uri: %s,\n  preview_content_type: %s,\n  fallback_uri: %s,\n  source: %s,\n  bundle_index: %s,\n  blob_id: %s,\n  blob_gaia_email: %s,\n  cms_full_size_blob_id: %s,\n  cms_media_encryption_key: %s,\n  cms_compressed_media_encryption_key: %s,\n  blob_upload_permanent_failure: %s,\n  blob_upload_timestamp: %s,\n  expressive_sticker_name: %s,\n  file_name: %s,\n  duration: %s,\n  compressed_blob_id: %s,\n  cms_compressed_blob_id: %s,\n  compressed_blob_upload_permanent_failure: %s,\n  compressed_blob_upload_timestamp: %s,\n  media_encryption_key: %s,\n  compressed_media_encryption_key: %s,\n  missing_entry_in_telephony: %s,\n  awaiting_reverse_sync: %s,\n  file_size_bytes: %s,\n  local_cache_path: %s,\n  media_send_type: %s,\n  voice_metadata: %s,\n  validation_status: %s,\n  processing_id: %s,\n  rich_card_media_download_failure_reason: %s,\n  image_display_state: %s,\n  preserve_size: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, "REDACTED", valueOf27, concat, concat2, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, concat3, "BLOB".concat(String.valueOf(bArr4 != null ? String.valueOf(bArr4.length) : "NULL")), String.valueOf(this.P), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S), String.valueOf(this.T), String.valueOf(this.U), String.valueOf(this.V), String.valueOf(this.W), String.valueOf(this.X), String.valueOf(this.Y), String.valueOf(this.Z));
        }

        @Override // defpackage.dtro
        public final void b(ContentValues contentValues) {
            int intValue = PartsTable.e().intValue();
            MessageIdType messageIdType = this.b;
            if (messageIdType == null || messageIdType.equals(bdhb.a)) {
                contentValues.putNull("message_id");
            } else {
                contentValues.put("message_id", Long.valueOf(bdhb.a(this.b)));
            }
            dtub.u(contentValues, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, this.c);
            Uri uri = this.d;
            if (uri == null) {
                contentValues.putNull(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            } else {
                contentValues.put(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri.toString());
            }
            dtub.u(contentValues, "content_type", this.e);
            if (intValue >= 10021) {
                Uri uri2 = this.f;
                if (uri2 == null) {
                    contentValues.putNull("original_uri");
                } else {
                    contentValues.put("original_uri", uri2.toString());
                }
            }
            if (intValue >= 29060) {
                Uri uri3 = this.g;
                if (uri3 == null) {
                    contentValues.putNull("storage_uri");
                } else {
                    contentValues.put("storage_uri", uri3.toString());
                }
            }
            contentValues.put("width", Integer.valueOf(this.h));
            contentValues.put("height", Integer.valueOf(this.i));
            if (intValue >= 3010) {
                contentValues.put("timestamp", Long.valueOf(this.j));
            }
            if (intValue >= 4020) {
                Uri uri4 = this.k;
                if (uri4 == null) {
                    contentValues.putNull("output_uri");
                } else {
                    contentValues.put("output_uri", uri4.toString());
                }
            }
            if (intValue >= 4020) {
                contentValues.put("target_size", Long.valueOf(this.l));
            }
            if (intValue >= 4020) {
                byzc byzcVar = this.m;
                if (byzcVar == null) {
                    contentValues.putNull("processing_status");
                } else {
                    contentValues.put("processing_status", Integer.valueOf(byzcVar.ordinal()));
                }
            }
            if (intValue >= 44010) {
                byyu byyuVar = this.n;
                if (byyuVar == null) {
                    contentValues.putNull("cms_attachment_processing_status");
                } else {
                    contentValues.put("cms_attachment_processing_status", Integer.valueOf(byyuVar.ordinal()));
                }
            }
            ConversationIdType conversationIdType = this.o;
            if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
                contentValues.putNull("conversation_id");
            } else {
                contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.o)));
            }
            if (intValue >= 5020) {
                byyp byypVar = this.p;
                if (byypVar == null) {
                    contentValues.putNull("sticker_set_id");
                } else {
                    contentValues.put("sticker_set_id", byyo.b(byypVar));
                }
            }
            if (intValue >= 5020) {
                byyp byypVar2 = this.q;
                if (byypVar2 == null) {
                    contentValues.putNull("sticker_id");
                } else {
                    contentValues.put("sticker_id", byyo.b(byypVar2));
                }
            }
            if (intValue >= 7000) {
                contentValues.put("media_modified_timestamp", Long.valueOf(this.r));
            }
            if (intValue >= 10005) {
                contentValues.put("longitude", Double.valueOf(this.s));
            }
            if (intValue >= 10005) {
                contentValues.put("latitude", Double.valueOf(this.t));
            }
            if (intValue >= 10017) {
                Uri uri5 = this.u;
                if (uri5 == null) {
                    contentValues.putNull("preview_content_uri");
                } else {
                    contentValues.put("preview_content_uri", uri5.toString());
                }
            }
            if (intValue >= 10017) {
                dtub.u(contentValues, "preview_content_type", this.v);
            }
            if (intValue >= 13000) {
                Uri uri6 = this.w;
                if (uri6 == null) {
                    contentValues.putNull("fallback_uri");
                } else {
                    contentValues.put("fallback_uri", uri6.toString());
                }
            }
            if (intValue >= 14010) {
                contentValues.put("source", Integer.valueOf(this.x));
            }
            if (intValue >= 17010) {
                contentValues.put("bundle_index", Integer.valueOf(this.y));
            }
            if (intValue >= 17020) {
                dtub.u(contentValues, "blob_id", this.z);
            }
            if (intValue >= 59570) {
                dtub.u(contentValues, "blob_gaia_email", this.A);
            }
            if (intValue >= 40040) {
                dtub.u(contentValues, "cms_full_size_blob_id", this.B);
            }
            if (intValue >= 42010) {
                contentValues.put("cms_media_encryption_key", this.C);
            }
            if (intValue >= 42070) {
                contentValues.put("cms_compressed_media_encryption_key", this.D);
            }
            if (intValue >= 18000) {
                contentValues.put("blob_upload_permanent_failure", Boolean.valueOf(this.E));
            }
            if (intValue >= 19030) {
                contentValues.put("blob_upload_timestamp", Long.valueOf(this.F));
            }
            if (intValue >= 22060) {
                dtub.u(contentValues, "expressive_sticker_name", this.G);
            }
            if (intValue >= 26000) {
                dtub.u(contentValues, "file_name", this.H);
            }
            if (intValue >= 26040) {
                contentValues.put("duration", Long.valueOf(this.I));
            }
            if (intValue >= 27000) {
                dtub.u(contentValues, "compressed_blob_id", this.J);
            }
            if (intValue >= 40040) {
                dtub.u(contentValues, "cms_compressed_blob_id", this.K);
            }
            if (intValue >= 27000) {
                contentValues.put("compressed_blob_upload_permanent_failure", Boolean.valueOf(this.L));
            }
            if (intValue >= 27000) {
                contentValues.put("compressed_blob_upload_timestamp", Long.valueOf(this.M));
            }
            if (intValue >= 30040) {
                contentValues.put("media_encryption_key", this.N);
            }
            if (intValue >= 30040) {
                contentValues.put("compressed_media_encryption_key", this.O);
            }
            if (intValue >= 52030) {
                contentValues.put("missing_entry_in_telephony", Boolean.valueOf(this.P));
            }
            if (intValue >= 53040) {
                contentValues.put("awaiting_reverse_sync", Boolean.valueOf(this.Q));
            }
            if (intValue >= 52050) {
                contentValues.put("file_size_bytes", Long.valueOf(this.R));
            }
            if (intValue >= 52050) {
                dtub.u(contentValues, "local_cache_path", this.S);
            }
            if (intValue >= 58150) {
                byza byzaVar = this.T;
                if (byzaVar == null) {
                    contentValues.putNull("media_send_type");
                } else {
                    contentValues.put("media_send_type", Integer.valueOf(byzaVar.ordinal()));
                }
            }
            if (intValue >= 59470) {
                dteh dtehVar = this.U;
                if (dtehVar == null) {
                    contentValues.putNull("voice_metadata");
                } else {
                    contentValues.put("voice_metadata", dtehVar.toByteArray());
                }
            }
            if (intValue >= 58770) {
                byzo byzoVar = this.V;
                if (byzoVar == null) {
                    contentValues.putNull("validation_status");
                } else {
                    contentValues.put("validation_status", Integer.valueOf(byzoVar.ordinal()));
                }
            }
            if (intValue >= 60080) {
                awap awapVar = this.W;
                if (awapVar == null) {
                    contentValues.putNull("processing_id");
                } else {
                    contentValues.put("processing_id", awao.b(awapVar));
                }
            }
            if (intValue >= 60230) {
                byzh byzhVar = this.X;
                if (byzhVar == null) {
                    contentValues.putNull("rich_card_media_download_failure_reason");
                } else {
                    contentValues.put("rich_card_media_download_failure_reason", Integer.valueOf(byzhVar.ordinal()));
                }
            }
            if (intValue >= 60240) {
                byyz byyzVar = this.Y;
                if (byyzVar == null) {
                    contentValues.putNull("image_display_state");
                } else {
                    contentValues.put("image_display_state", Integer.valueOf(byyzVar.ordinal()));
                }
            }
            if (intValue >= 60680) {
                contentValues.put("preserve_size", Boolean.valueOf(this.Z));
            }
        }

        @Override // defpackage.dtro
        protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
            bwcw bwcwVar = (bwcw) ((bwav) dtsuVar);
            aB();
            this.cL = bwcwVar.cU();
            if (bwcwVar.di(0)) {
                this.a = bwcwVar.q();
                super.fY(0);
            }
            if (bwcwVar.di(1)) {
                this.b = bwcwVar.k();
                super.fY(1);
            }
            if (bwcwVar.di(2)) {
                this.c = bwcwVar.U();
                super.fY(2);
            }
            if (bwcwVar.di(3)) {
                this.d = bwcwVar.i();
                super.fY(3);
            }
            if (bwcwVar.di(4)) {
                this.e = bwcwVar.Q();
                super.fY(4);
            }
            if (bwcwVar.di(5)) {
                this.f = bwcwVar.D();
                super.fY(5);
            }
            if (bwcwVar.di(6)) {
                this.g = bwcwVar.E();
                super.fY(6);
            }
            if (bwcwVar.di(7)) {
                this.h = bwcwVar.w();
                super.fY(7);
            }
            if (bwcwVar.di(8)) {
                this.i = bwcwVar.v();
                super.fY(8);
            }
            if (bwcwVar.di(9)) {
                this.j = bwcwVar.C();
                super.fY(9);
            }
            if (bwcwVar.di(10)) {
                this.k = bwcwVar.h();
                super.fY(10);
            }
            if (bwcwVar.di(11)) {
                this.l = bwcwVar.B();
                super.fY(11);
            }
            if (bwcwVar.di(12)) {
                this.m = bwcwVar.L();
                super.fY(12);
            }
            if (bwcwVar.di(13)) {
                this.n = bwcwVar.I();
                super.fY(13);
            }
            if (bwcwVar.di(14)) {
                this.o = bwcwVar.F();
                super.fY(14);
            }
            if (bwcwVar.di(15)) {
                this.p = bwcwVar.H();
                super.fY(15);
            }
            if (bwcwVar.di(16)) {
                this.q = bwcwVar.G();
                super.fY(16);
            }
            if (bwcwVar.di(17)) {
                this.r = bwcwVar.A();
                super.fY(17);
            }
            if (bwcwVar.di(18)) {
                this.s = bwcwVar.t();
                super.fY(18);
            }
            if (bwcwVar.di(19)) {
                this.t = bwcwVar.s();
                super.fY(19);
            }
            if (bwcwVar.di(20)) {
                this.u = bwcwVar.g();
                super.fY(20);
            }
            if (bwcwVar.di(21)) {
                this.v = bwcwVar.T();
                super.fY(21);
            }
            if (bwcwVar.di(22)) {
                this.w = bwcwVar.f();
                super.fY(22);
            }
            if (bwcwVar.di(23)) {
                this.x = bwcwVar.c();
                super.fY(23);
            }
            if (bwcwVar.di(24)) {
                this.y = bwcwVar.u();
                super.fY(24);
            }
            if (bwcwVar.di(25)) {
                this.z = bwcwVar.m();
                super.fY(25);
            }
            if (bwcwVar.di(26)) {
                this.A = bwcwVar.P();
                super.fY(26);
            }
            if (bwcwVar.di(27)) {
                this.B = bwcwVar.o();
                super.fY(27);
            }
            if (bwcwVar.di(28)) {
                this.C = bwcwVar.ab();
                super.fY(28);
            }
            if (bwcwVar.di(29)) {
                this.D = bwcwVar.aa();
                super.fY(29);
            }
            if (bwcwVar.di(30)) {
                this.E = bwcwVar.W();
                super.fY(30);
            }
            if (bwcwVar.di(31)) {
                this.F = bwcwVar.x();
                super.fY(31);
            }
            if (bwcwVar.di(32)) {
                this.G = bwcwVar.R();
                super.fY(32);
            }
            if (bwcwVar.di(33)) {
                this.H = bwcwVar.S();
                super.fY(33);
            }
            if (bwcwVar.di(34)) {
                this.I = bwcwVar.z();
                super.fY(34);
            }
            if (bwcwVar.di(35)) {
                this.J = bwcwVar.p();
                super.fY(35);
            }
            if (bwcwVar.di(36)) {
                this.K = bwcwVar.n();
                super.fY(36);
            }
            if (bwcwVar.di(37)) {
                this.L = bwcwVar.X();
                super.fY(37);
            }
            if (bwcwVar.di(38)) {
                this.M = bwcwVar.y();
                super.fY(38);
            }
            if (bwcwVar.di(39)) {
                this.N = bwcwVar.ad();
                super.fY(39);
            }
            if (bwcwVar.di(40)) {
                this.O = bwcwVar.ac();
                super.fY(40);
            }
            if (bwcwVar.di(41)) {
                this.P = bwcwVar.Y();
                super.fY(41);
            }
            if (bwcwVar.di(42)) {
                this.Q = bwcwVar.V();
                super.fY(42);
            }
            if (bwcwVar.di(43)) {
                this.R = bwcwVar.e();
                super.fY(43);
            }
            if (bwcwVar.di(44)) {
                this.S = bwcwVar.r();
                super.fY(44);
            }
            if (bwcwVar.di(45)) {
                this.T = bwcwVar.K();
                super.fY(45);
            }
            if (bwcwVar.di(46)) {
                this.U = bwcwVar.O();
                super.fY(46);
            }
            if (bwcwVar.di(47)) {
                this.V = bwcwVar.N();
                super.fY(47);
            }
            if (bwcwVar.di(48)) {
                this.W = bwcwVar.j();
                super.fY(48);
            }
            if (bwcwVar.di(49)) {
                this.X = bwcwVar.M();
                super.fY(49);
            }
            if (bwcwVar.di(50)) {
                this.Y = bwcwVar.J();
                super.fY(50);
            }
            if (bwcwVar.di(51)) {
                this.Z = bwcwVar.Z();
                super.fY(51);
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
            return super.aD(bindData.cL) && Objects.equals(this.a, bindData.a) && Objects.equals(this.b, bindData.b) && Objects.equals(this.c, bindData.c) && Objects.equals(this.d, bindData.d) && Objects.equals(this.e, bindData.e) && Objects.equals(this.f, bindData.f) && Objects.equals(this.g, bindData.g) && this.h == bindData.h && this.i == bindData.i && this.j == bindData.j && Objects.equals(this.k, bindData.k) && this.l == bindData.l && this.m == bindData.m && this.n == bindData.n && Objects.equals(this.o, bindData.o) && Objects.equals(this.p, bindData.p) && Objects.equals(this.q, bindData.q) && this.r == bindData.r && this.s == bindData.s && this.t == bindData.t && Objects.equals(this.u, bindData.u) && Objects.equals(this.v, bindData.v) && Objects.equals(this.w, bindData.w) && this.x == bindData.x && this.y == bindData.y && Objects.equals(this.z, bindData.z) && Objects.equals(this.A, bindData.A) && Objects.equals(this.B, bindData.B) && Arrays.equals(this.C, bindData.C) && Arrays.equals(this.D, bindData.D) && this.E == bindData.E && this.F == bindData.F && Objects.equals(this.G, bindData.G) && Objects.equals(this.H, bindData.H) && this.I == bindData.I && Objects.equals(this.J, bindData.J) && Objects.equals(this.K, bindData.K) && this.L == bindData.L && this.M == bindData.M && Arrays.equals(this.N, bindData.N) && Arrays.equals(this.O, bindData.O) && this.P == bindData.P && this.Q == bindData.Q && this.R == bindData.R && Objects.equals(this.S, bindData.S) && this.T == bindData.T && Objects.equals(this.U, bindData.U) && this.V == bindData.V && Objects.equals(this.W, bindData.W) && this.X == bindData.X && this.Y == bindData.Y && this.Z == bindData.Z;
        }

        @Override // defpackage.dtrq
        public final String f() {
            return String.format(Locale.US, "INTO %s (%s) VALUES ", "parts", dtub.m(new String[]{"message_id", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, "content_type", "original_uri", "storage_uri", "width", "height", "timestamp", "output_uri", "target_size", "processing_status", "cms_attachment_processing_status", "conversation_id", "sticker_set_id", "sticker_id", "media_modified_timestamp", "longitude", "latitude", "preview_content_uri", "preview_content_type", "fallback_uri", "source", "bundle_index", "blob_id", "blob_gaia_email", "cms_full_size_blob_id", "cms_media_encryption_key", "cms_compressed_media_encryption_key", "blob_upload_permanent_failure", "blob_upload_timestamp", "expressive_sticker_name", "file_name", "duration", "compressed_blob_id", "cms_compressed_blob_id", "compressed_blob_upload_permanent_failure", "compressed_blob_upload_timestamp", "media_encryption_key", "compressed_media_encryption_key", "missing_entry_in_telephony", "awaiting_reverse_sync", "file_size_bytes", "local_cache_path", "media_send_type", "voice_metadata", "validation_status", "processing_id", "rich_card_media_download_failure_reason", "image_display_state", "preserve_size"}));
        }

        @Override // defpackage.dtro
        protected final void fG(Parcel parcel) {
            dteh dtehVar;
            this.a = parcel.readString();
            this.b = new MessageIdType(parcel.readLong());
            this.c = parcel.readString();
            String readString = parcel.readString();
            this.d = readString == null ? null : Uri.parse(readString);
            this.e = parcel.readString();
            String readString2 = parcel.readString();
            this.f = readString2 == null ? null : Uri.parse(readString2);
            String readString3 = parcel.readString();
            this.g = readString3 == null ? null : Uri.parse(readString3);
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readLong();
            String readString4 = parcel.readString();
            this.k = readString4 == null ? null : Uri.parse(readString4);
            this.l = parcel.readLong();
            byzc[] values = byzc.values();
            int readInt = parcel.readInt();
            if (readInt >= 0) {
                if (readInt >= values.length) {
                    throw new IllegalArgumentException();
                }
                this.m = values[readInt];
            }
            byyu[] values2 = byyu.values();
            int readInt2 = parcel.readInt();
            if (readInt2 >= 0) {
                if (readInt2 >= values2.length) {
                    throw new IllegalArgumentException();
                }
                this.n = values2[readInt2];
            }
            this.o = new ConversationIdType(parcel.readLong());
            this.p = byyo.a(parcel.readString());
            this.q = byyo.a(parcel.readString());
            this.r = parcel.readLong();
            this.s = parcel.readDouble();
            this.t = parcel.readDouble();
            String readString5 = parcel.readString();
            this.u = readString5 == null ? null : Uri.parse(readString5);
            this.v = parcel.readString();
            String readString6 = parcel.readString();
            this.w = readString6 == null ? null : Uri.parse(readString6);
            this.x = parcel.readInt();
            this.y = parcel.readInt();
            this.z = parcel.readString();
            this.A = parcel.readString();
            this.B = parcel.readString();
            this.C = parcel.createByteArray();
            this.D = parcel.createByteArray();
            this.E = parcel.readInt() == 1;
            this.F = parcel.readLong();
            this.G = parcel.readString();
            this.H = parcel.readString();
            this.I = parcel.readLong();
            this.J = parcel.readString();
            this.K = parcel.readString();
            this.L = parcel.readInt() == 1;
            this.M = parcel.readLong();
            this.N = parcel.createByteArray();
            this.O = parcel.createByteArray();
            this.P = parcel.readInt() == 1;
            this.Q = parcel.readInt() == 1;
            this.R = parcel.readLong();
            this.S = parcel.readString();
            byza[] values3 = byza.values();
            int readInt3 = parcel.readInt();
            if (readInt3 >= 0) {
                if (readInt3 >= values3.length) {
                    throw new IllegalArgumentException();
                }
                this.T = values3[readInt3];
            }
            byte[] createByteArray = parcel.createByteArray();
            if (createByteArray == null) {
                dtehVar = null;
            } else {
                try {
                    dtehVar = (dteh) eyfy.parseFrom(dteh.a, createByteArray, eyfc.a());
                } catch (Throwable unused) {
                    this.U = null;
                }
            }
            this.U = dtehVar;
            byzo[] values4 = byzo.values();
            int readInt4 = parcel.readInt();
            if (readInt4 >= 0) {
                if (readInt4 >= values4.length) {
                    throw new IllegalArgumentException();
                }
                this.V = values4[readInt4];
            }
            this.W = awao.a(parcel.readString());
            byzh[] values5 = byzh.values();
            int readInt5 = parcel.readInt();
            if (readInt5 >= 0) {
                if (readInt5 >= values5.length) {
                    throw new IllegalArgumentException();
                }
                this.X = values5[readInt5];
            }
            byyz[] values6 = byyz.values();
            int readInt6 = parcel.readInt();
            if (readInt6 >= 0) {
                if (readInt6 >= values6.length) {
                    throw new IllegalArgumentException();
                }
                this.Y = values6[readInt6];
            }
            this.Z = parcel.readInt() == 1;
        }

        @Override // defpackage.dtro
        protected final void fH(Parcel parcel) {
            parcel.writeString(this.a);
            parcel.writeLong(bdhb.a(this.b));
            parcel.writeString(this.c);
            Uri uri = this.d;
            parcel.writeString(uri == null ? null : uri.toString());
            parcel.writeString(this.e);
            Uri uri2 = this.f;
            parcel.writeString(uri2 == null ? null : uri2.toString());
            Uri uri3 = this.g;
            parcel.writeString(uri3 == null ? null : uri3.toString());
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeLong(this.j);
            Uri uri4 = this.k;
            parcel.writeString(uri4 == null ? null : uri4.toString());
            parcel.writeLong(this.l);
            byzc byzcVar = this.m;
            parcel.writeInt(byzcVar == null ? -1 : byzcVar.ordinal());
            byyu byyuVar = this.n;
            parcel.writeInt(byyuVar == null ? -1 : byyuVar.ordinal());
            parcel.writeLong(bdgq.a(this.o));
            parcel.writeString(byyo.b(this.p));
            parcel.writeString(byyo.b(this.q));
            parcel.writeLong(this.r);
            parcel.writeDouble(this.s);
            parcel.writeDouble(this.t);
            Uri uri5 = this.u;
            parcel.writeString(uri5 == null ? null : uri5.toString());
            parcel.writeString(this.v);
            Uri uri6 = this.w;
            parcel.writeString(uri6 == null ? null : uri6.toString());
            parcel.writeInt(this.x);
            parcel.writeInt(this.y);
            parcel.writeString(this.z);
            parcel.writeString(this.A);
            parcel.writeString(this.B);
            parcel.writeByteArray(this.C);
            parcel.writeByteArray(this.D);
            parcel.writeInt(this.E ? 1 : 0);
            parcel.writeLong(this.F);
            parcel.writeString(this.G);
            parcel.writeString(this.H);
            parcel.writeLong(this.I);
            parcel.writeString(this.J);
            parcel.writeString(this.K);
            parcel.writeInt(this.L ? 1 : 0);
            parcel.writeLong(this.M);
            parcel.writeByteArray(this.N);
            parcel.writeByteArray(this.O);
            parcel.writeInt(this.P ? 1 : 0);
            parcel.writeInt(this.Q ? 1 : 0);
            parcel.writeLong(this.R);
            parcel.writeString(this.S);
            byza byzaVar = this.T;
            parcel.writeInt(byzaVar == null ? -1 : byzaVar.ordinal());
            dteh dtehVar = this.U;
            parcel.writeByteArray(dtehVar != null ? dtehVar.toByteArray() : null);
            byzo byzoVar = this.V;
            parcel.writeInt(byzoVar == null ? -1 : byzoVar.ordinal());
            parcel.writeString(awao.b(this.W));
            byzh byzhVar = this.X;
            parcel.writeInt(byzhVar == null ? -1 : byzhVar.ordinal());
            byyz byyzVar = this.Y;
            parcel.writeInt(byyzVar != null ? byyzVar.ordinal() : -1);
            parcel.writeInt(this.Z ? 1 : 0);
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
            return "parts";
        }

        public final int hashCode() {
            dtsq dtsqVar = this.cL;
            dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
            String str = this.a;
            MessageIdType messageIdType = this.b;
            String str2 = this.c;
            Uri uri = this.d;
            String str3 = this.e;
            Uri uri2 = this.f;
            Uri uri3 = this.g;
            Integer valueOf = Integer.valueOf(this.h);
            Integer valueOf2 = Integer.valueOf(this.i);
            Long valueOf3 = Long.valueOf(this.j);
            Uri uri4 = this.k;
            Long valueOf4 = Long.valueOf(this.l);
            byzc byzcVar = this.m;
            Integer valueOf5 = Integer.valueOf(byzcVar == null ? 0 : byzcVar.ordinal());
            byyu byyuVar = this.n;
            Integer valueOf6 = Integer.valueOf(byyuVar == null ? 0 : byyuVar.ordinal());
            dtsq dtsqVar3 = dtsqVar2;
            ConversationIdType conversationIdType = this.o;
            byyp byypVar = this.p;
            byyp byypVar2 = this.q;
            Long valueOf7 = Long.valueOf(this.r);
            Double valueOf8 = Double.valueOf(this.s);
            Double valueOf9 = Double.valueOf(this.t);
            Uri uri5 = this.u;
            String str4 = this.v;
            Uri uri6 = this.w;
            Integer valueOf10 = Integer.valueOf(this.x);
            Integer valueOf11 = Integer.valueOf(this.y);
            String str5 = this.z;
            String str6 = this.A;
            String str7 = this.B;
            Integer valueOf12 = Integer.valueOf(Arrays.hashCode(this.C));
            Integer valueOf13 = Integer.valueOf(Arrays.hashCode(this.D));
            Boolean valueOf14 = Boolean.valueOf(this.E);
            Long valueOf15 = Long.valueOf(this.F);
            String str8 = this.G;
            String str9 = this.H;
            Long valueOf16 = Long.valueOf(this.I);
            String str10 = this.J;
            String str11 = this.K;
            Boolean valueOf17 = Boolean.valueOf(this.L);
            Long valueOf18 = Long.valueOf(this.M);
            Integer valueOf19 = Integer.valueOf(Arrays.hashCode(this.N));
            Integer valueOf20 = Integer.valueOf(Arrays.hashCode(this.O));
            Boolean valueOf21 = Boolean.valueOf(this.P);
            Boolean valueOf22 = Boolean.valueOf(this.Q);
            Long valueOf23 = Long.valueOf(this.R);
            String str12 = this.S;
            byza byzaVar = this.T;
            Integer valueOf24 = Integer.valueOf(byzaVar == null ? 0 : byzaVar.ordinal());
            dteh dtehVar = this.U;
            byzo byzoVar = this.V;
            Integer valueOf25 = Integer.valueOf(byzoVar == null ? 0 : byzoVar.ordinal());
            awap awapVar = this.W;
            byzh byzhVar = this.X;
            Integer valueOf26 = Integer.valueOf(byzhVar == null ? 0 : byzhVar.ordinal());
            byyz byyzVar = this.Y;
            return Objects.hash(dtsqVar3, str, messageIdType, str2, uri, str3, uri2, uri3, valueOf, valueOf2, valueOf3, uri4, valueOf4, valueOf5, valueOf6, conversationIdType, byypVar, byypVar2, valueOf7, valueOf8, valueOf9, uri5, str4, uri6, valueOf10, valueOf11, str5, str6, str7, valueOf12, valueOf13, valueOf14, valueOf15, str8, str9, valueOf16, str10, str11, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, str12, valueOf24, dtehVar, valueOf25, awapVar, valueOf26, Integer.valueOf(byyzVar == null ? 0 : byyzVar.ordinal()), Boolean.valueOf(this.Z), null);
        }

        @Override // defpackage.dtrq
        public final void i(StringBuilder sb, List list) {
            Object obj = new bvwj(this).get();
            String str = this.c;
            Uri uri = this.d;
            String uri2 = uri == null ? null : uri.toString();
            String str2 = this.e;
            Uri uri3 = this.f;
            String uri4 = uri3 == null ? null : uri3.toString();
            Uri uri5 = this.g;
            String uri6 = uri5 == null ? null : uri5.toString();
            Integer valueOf = Integer.valueOf(this.h);
            Integer valueOf2 = Integer.valueOf(this.i);
            Long valueOf3 = Long.valueOf(this.j);
            Uri uri7 = this.k;
            String uri8 = uri7 == null ? null : uri7.toString();
            Long valueOf4 = Long.valueOf(this.l);
            byzc byzcVar = this.m;
            Object valueOf5 = byzcVar == null ? 0 : String.valueOf(byzcVar.ordinal());
            byyu byyuVar = this.n;
            Object valueOf6 = byyuVar == null ? 0 : String.valueOf(byyuVar.ordinal());
            Object obj2 = new bvwk(this).get();
            String b = byyo.b(this.p);
            String b2 = byyo.b(this.q);
            Long valueOf7 = Long.valueOf(this.r);
            Double valueOf8 = Double.valueOf(this.s);
            Double valueOf9 = Double.valueOf(this.t);
            Uri uri9 = this.u;
            String uri10 = uri9 == null ? null : uri9.toString();
            String str3 = this.v;
            Uri uri11 = this.w;
            String uri12 = uri11 == null ? null : uri11.toString();
            Integer valueOf10 = Integer.valueOf(this.x);
            Integer valueOf11 = Integer.valueOf(this.y);
            String str4 = this.z;
            String str5 = this.A;
            String str6 = this.B;
            byte[] bArr = this.C;
            byte[] bArr2 = this.D;
            Integer valueOf12 = Integer.valueOf(this.E ? 1 : 0);
            String str7 = uri10;
            Long valueOf13 = Long.valueOf(this.F);
            String str8 = this.G;
            String str9 = this.H;
            Long valueOf14 = Long.valueOf(this.I);
            String str10 = this.J;
            String str11 = this.K;
            Integer valueOf15 = Integer.valueOf(this.L ? 1 : 0);
            Long valueOf16 = Long.valueOf(this.M);
            byte[] bArr3 = this.N;
            byte[] bArr4 = this.O;
            Integer valueOf17 = Integer.valueOf(this.P ? 1 : 0);
            Integer valueOf18 = Integer.valueOf(this.Q ? 1 : 0);
            Long valueOf19 = Long.valueOf(this.R);
            String str12 = this.S;
            byza byzaVar = this.T;
            Object valueOf20 = byzaVar == null ? 0 : String.valueOf(byzaVar.ordinal());
            dteh dtehVar = this.U;
            byte[] byteArray = dtehVar == null ? null : dtehVar.toByteArray();
            byzo byzoVar = this.V;
            Object valueOf21 = byzoVar == null ? 0 : String.valueOf(byzoVar.ordinal());
            String b3 = awao.b(this.W);
            byzh byzhVar = this.X;
            Object valueOf22 = byzhVar == null ? 0 : String.valueOf(byzhVar.ordinal());
            byyz byyzVar = this.Y;
            Object[] objArr = {obj, str, uri2, str2, uri4, uri6, valueOf, valueOf2, valueOf3, uri8, valueOf4, valueOf5, valueOf6, obj2, b, b2, valueOf7, valueOf8, valueOf9, str7, str3, uri12, valueOf10, valueOf11, str4, str5, str6, bArr, bArr2, valueOf12, valueOf13, str8, str9, valueOf14, str10, str11, valueOf15, valueOf16, bArr3, bArr4, valueOf17, valueOf18, valueOf19, str12, valueOf20, byteArray, valueOf21, b3, valueOf22, byyzVar == null ? 0 : String.valueOf(byyzVar.ordinal()), Integer.valueOf(this.Z ? 1 : 0)};
            sb.append('(');
            for (int i = 0; i < 51; i++) {
                Object obj3 = objArr[i];
                if (obj3 instanceof Number) {
                    sb.append(String.valueOf(obj3));
                } else {
                    if (obj3 instanceof String) {
                        String str13 = (String) obj3;
                        if (str13.length() < 12) {
                            sb.append(DatabaseUtils.sqlEscapeString(str13));
                        }
                    }
                    list.add(obj3);
                    sb.append('?');
                    sb.append(',');
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

        public final double k() {
            az(19, "latitude");
            return this.t;
        }

        public final double l() {
            az(18, "longitude");
            return this.s;
        }

        public final int m() {
            az(8, "height");
            return this.i;
        }

        public final int n() {
            az(7, "width");
            return this.h;
        }

        public final long o() {
            az(31, "blob_upload_timestamp");
            return this.F;
        }

        public final long q() {
            az(38, "compressed_blob_upload_timestamp");
            return this.M;
        }

        public final long r() {
            az(34, "duration");
            return this.I;
        }

        public final long s() {
            az(11, "target_size");
            return this.l;
        }

        public final Uri t() {
            az(3, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            return this.d;
        }

        public final String toString() {
            return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "PartsTable -- REDACTED") : a();
        }

        public final ConversationIdType u() {
            az(14, "conversation_id");
            return this.o;
        }

        public final MessageIdType v() {
            az(1, "message_id");
            return this.b;
        }

        public final bvwp w() {
            bvwq bvwqVar = new bvwq();
            bvwqVar.c(this, false, this.cJ);
            return bvwqVar;
        }

        public final bvwp x() {
            bvwq bvwqVar = new bvwq();
            bvwqVar.c(this, true, this.cJ);
            return bvwqVar;
        }

        public final byyu y() {
            az(13, "cms_attachment_processing_status");
            return this.n;
        }

        public final dteh z() {
            az(46, "voice_metadata");
            return this.U;
        }

        protected BindData(Parcel parcel) {
            aA(parcel);
        }
    }

    static {
        enhd enhdVar = new enhd();
        enhdVar.k("parts.original_uri", 10021);
        enhdVar.k("parts.storage_uri", 29060);
        enhdVar.k("parts.timestamp", 3010);
        enhdVar.k("parts.output_uri", 4020);
        enhdVar.k("parts.target_size", 4020);
        enhdVar.k("parts.processing_status", 4020);
        enhdVar.k("parts.cms_attachment_processing_status", 44010);
        enhdVar.k("parts.sticker_set_id", 5020);
        enhdVar.k("parts.sticker_id", 5020);
        enhdVar.k("parts.media_modified_timestamp", 7000);
        enhdVar.k("parts.longitude", 10005);
        enhdVar.k("parts.latitude", 10005);
        enhdVar.k("parts.preview_content_uri", 10017);
        enhdVar.k("parts.preview_content_type", 10017);
        enhdVar.k("parts.fallback_uri", 13000);
        enhdVar.k("parts.source", 14010);
        enhdVar.k("parts.bundle_index", 17010);
        enhdVar.k("parts.blob_id", 17020);
        enhdVar.k("parts.blob_gaia_email", 59570);
        enhdVar.k("parts.cms_full_size_blob_id", 40040);
        enhdVar.k("parts.cms_media_encryption_key", 42010);
        enhdVar.k("parts.cms_compressed_media_encryption_key", 42070);
        enhdVar.k("parts.blob_upload_permanent_failure", 18000);
        enhdVar.k("parts.blob_upload_timestamp", 19030);
        enhdVar.k("parts.expressive_sticker_name", 22060);
        enhdVar.k("parts.file_name", 26000);
        enhdVar.k("parts.duration", 26040);
        enhdVar.k("parts.compressed_blob_id", 27000);
        enhdVar.k("parts.cms_compressed_blob_id", 40040);
        enhdVar.k("parts.compressed_blob_upload_permanent_failure", 27000);
        enhdVar.k("parts.compressed_blob_upload_timestamp", 27000);
        enhdVar.k("parts.media_encryption_key", 30040);
        enhdVar.k("parts.compressed_media_encryption_key", 30040);
        enhdVar.k("parts.missing_entry_in_telephony", 52030);
        enhdVar.k("parts.awaiting_reverse_sync", 53040);
        enhdVar.k("parts.file_size_bytes", 52050);
        enhdVar.k("parts.local_cache_path", 52050);
        enhdVar.k("parts.media_send_type", 58150);
        enhdVar.k("parts.voice_metadata", 59470);
        enhdVar.k("parts.validation_status", 58770);
        enhdVar.k("parts.processing_id", 60080);
        enhdVar.k("parts.rich_card_media_download_failure_reason", 60230);
        enhdVar.k("parts.image_display_state", 60240);
        enhdVar.k("parts.preserve_size", 60680);
        b = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k("message_id", "index_parts_message_id");
        enhdVar2.k("content_type", "index_parts_content_type");
        enhdVar2.k("output_uri", "index_parts_output_uri");
        enhdVar2.k("conversation_id", "index_parts_conversation_id");
        enhdVar2.k("preview_content_type", "index_parts_preview_content_type");
        enhdVar2.k("file_size_bytes", "index_parts_file_size_bytes");
        enhdVar2.k("local_cache_path", "index_parts_local_cache_path");
        c = enhdVar2.c();
        d = new bwat();
        e = new int[]{3010, 4020, 5020, 7000, 10005, 10017, 10021, 13000, 14010, 17010, 17020, 18000, 19030, 22060, 26000, 26040, 27000, 29060, 30040, 40040, 42010, 42070, 44010, 49010, 52030, 52050, 53040, 58150, 58380, 58770, 59470, 59570, 60080, 60230, 60240, 60680};
    }

    public static BindData a(String str) {
        bwdf c2 = c();
        c2.z("parts.queryOnId");
        c2.q();
        bwdm bwdmVar = new bwdm();
        bwdmVar.j(str);
        c2.g(bwdmVar);
        return (BindData) dtub.c(c2.b());
    }

    public static bvwp b() {
        bvwq bvwqVar = new bvwq();
        bvwqVar.aF();
        return bvwqVar;
    }

    public static final bwdf c() {
        String[] strArr;
        Integer e2 = e();
        if (e2.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h("parts._id");
            engrVar.h("parts.message_id");
            engrVar.h("parts.text");
            engrVar.h("parts.uri");
            engrVar.h("parts.content_type");
            if (e2.intValue() >= 10021) {
                engrVar.h("parts.original_uri");
            }
            if (e2.intValue() >= 29060) {
                engrVar.h("parts.storage_uri");
            }
            engrVar.h("parts.width");
            engrVar.h("parts.height");
            if (e2.intValue() >= 3010) {
                engrVar.h("parts.timestamp");
            }
            if (e2.intValue() >= 4020) {
                engrVar.h("parts.output_uri");
            }
            if (e2.intValue() >= 4020) {
                engrVar.h("parts.target_size");
            }
            if (e2.intValue() >= 4020) {
                engrVar.h("parts.processing_status");
            }
            if (e2.intValue() >= 44010) {
                engrVar.h("parts.cms_attachment_processing_status");
            }
            engrVar.h("parts.conversation_id");
            if (e2.intValue() >= 5020) {
                engrVar.h("parts.sticker_set_id");
            }
            if (e2.intValue() >= 5020) {
                engrVar.h("parts.sticker_id");
            }
            if (e2.intValue() >= 7000) {
                engrVar.h("parts.media_modified_timestamp");
            }
            if (e2.intValue() >= 10005) {
                engrVar.h("parts.longitude");
            }
            if (e2.intValue() >= 10005) {
                engrVar.h("parts.latitude");
            }
            if (e2.intValue() >= 10017) {
                engrVar.h("parts.preview_content_uri");
            }
            if (e2.intValue() >= 10017) {
                engrVar.h("parts.preview_content_type");
            }
            if (e2.intValue() >= 13000) {
                engrVar.h("parts.fallback_uri");
            }
            if (e2.intValue() >= 14010) {
                engrVar.h("parts.source");
            }
            if (e2.intValue() >= 17010) {
                engrVar.h("parts.bundle_index");
            }
            if (e2.intValue() >= 17020) {
                engrVar.h("parts.blob_id");
            }
            if (e2.intValue() >= 59570) {
                engrVar.h("parts.blob_gaia_email");
            }
            if (e2.intValue() >= 40040) {
                engrVar.h("parts.cms_full_size_blob_id");
            }
            if (e2.intValue() >= 42010) {
                engrVar.h("parts.cms_media_encryption_key");
            }
            if (e2.intValue() >= 42070) {
                engrVar.h("parts.cms_compressed_media_encryption_key");
            }
            if (e2.intValue() >= 18000) {
                engrVar.h("parts.blob_upload_permanent_failure");
            }
            if (e2.intValue() >= 19030) {
                engrVar.h("parts.blob_upload_timestamp");
            }
            if (e2.intValue() >= 22060) {
                engrVar.h("parts.expressive_sticker_name");
            }
            if (e2.intValue() >= 26000) {
                engrVar.h("parts.file_name");
            }
            if (e2.intValue() >= 26040) {
                engrVar.h("parts.duration");
            }
            if (e2.intValue() >= 27000) {
                engrVar.h("parts.compressed_blob_id");
            }
            if (e2.intValue() >= 40040) {
                engrVar.h("parts.cms_compressed_blob_id");
            }
            if (e2.intValue() >= 27000) {
                engrVar.h("parts.compressed_blob_upload_permanent_failure");
            }
            if (e2.intValue() >= 27000) {
                engrVar.h("parts.compressed_blob_upload_timestamp");
            }
            if (e2.intValue() >= 30040) {
                engrVar.h("parts.media_encryption_key");
            }
            if (e2.intValue() >= 30040) {
                engrVar.h("parts.compressed_media_encryption_key");
            }
            if (e2.intValue() >= 52030) {
                engrVar.h("parts.missing_entry_in_telephony");
            }
            if (e2.intValue() >= 53040) {
                engrVar.h("parts.awaiting_reverse_sync");
            }
            if (e2.intValue() >= 52050) {
                engrVar.h("parts.file_size_bytes");
            }
            if (e2.intValue() >= 52050) {
                engrVar.h("parts.local_cache_path");
            }
            if (e2.intValue() >= 58150) {
                engrVar.h("parts.media_send_type");
            }
            if (e2.intValue() >= 59470) {
                engrVar.h("parts.voice_metadata");
            }
            if (e2.intValue() >= 58770) {
                engrVar.h("parts.validation_status");
            }
            if (e2.intValue() >= 60080) {
                engrVar.h("parts.processing_id");
            }
            if (e2.intValue() >= 60230) {
                engrVar.h("parts.rich_card_media_download_failure_reason");
            }
            if (e2.intValue() >= 60240) {
                engrVar.h("parts.image_display_state");
            }
            if (e2.intValue() >= 60680) {
                engrVar.h("parts.preserve_size");
            }
            strArr = (String[]) engrVar.g().toArray(new String[0]);
        }
        return new bwdf(strArr);
    }

    public static dtve d() {
        return dtub.e("$primary");
    }

    public static Integer e() {
        return Integer.valueOf(g().a());
    }

    public static void f(dtve dtveVar) {
        dtveVar.y("ALTER TABLE parts ADD COLUMN blob_upload_timestamp INT DEFAULT(0);");
    }

    public static dtzf g() {
        return d().P();
    }
}
