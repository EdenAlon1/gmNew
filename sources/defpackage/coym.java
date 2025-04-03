package defpackage;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coym implements coxk, coyq {
    private final ffbr A;
    private final ffbr B;
    private final ffbr C;
    private final ffbr D;
    private final ffbr E;
    private final ffbr F;
    private final ffbr G;
    private final ffbr H;
    private final ffbr I;
    private final ffbr J;
    private final ffbr K;
    private final ffbr L;
    private final ffbr M;
    private final ffbr N;
    private final ffbr O;
    private final ffbr P;
    private final ffbr Q;
    private final ffbr R;
    private final Optional S;
    private final ffbr T;
    private final ffbr U;
    private final errl V;
    private final errl W;
    private final ffbr X;
    private final ffbr Y;
    private final ffbr Z;
    private final ffbr aa;
    private final ffbr ab;
    private final ffbr ac;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final asmj m;
    private Boolean q = null;
    private Boolean r = null;
    private final Context s;
    private final ffbr t;
    private final cqoh u;
    private final ejtr v;
    private final ffbr w;
    private final ffbr x;
    private final ffbr y;
    private final ffbr z;
    public static final cfup d = cfvl.r(178041157, "handle_empty_recipients_from_telephony");
    public static final entd e = entd.c("Bugle");
    private static final cskc n = cskc.g("Bugle", "TelephonyManagerInterface");
    private static final String o = String.format(Locale.US, "((%s IN (%d, %d, %d, %d, %d)) AND (%s>=0))", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, 1, 4, 6, 5, 2, "thread_id");
    private static final String p = String.format(Locale.US, "((%s IN (%d, %d, %d, %d)) AND (%s IN (%d, %d, %d)) AND (%s>=0))", "msg_box", 1, 4, 2, 5, "m_type", 128, 130, 132, "thread_id");
    static final String[] f = {"_id", "recipient_ids"};
    static final Uri g = Telephony.Threads.CONTENT_URI.buildUpon().appendQueryParameter("simple", "true").build();
    static final String[] h = {"archived"};

    public coym(Context context, ejtr ejtrVar, ffbr ffbrVar, cqoh cqohVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, ffbr ffbrVar24, ffbr ffbrVar25, ffbr ffbrVar26, Optional optional, ffbr ffbrVar27, ffbr ffbrVar28, errl errlVar, errl errlVar2, ffbr ffbrVar29, ffbr ffbrVar30, ffbr ffbrVar31, ffbr ffbrVar32, ffbr ffbrVar33, ffbr ffbrVar34, ffbr ffbrVar35, asmj asmjVar) {
        this.s = context;
        this.v = ejtrVar;
        this.t = ffbrVar;
        this.u = cqohVar;
        this.w = ffbrVar2;
        this.x = ffbrVar3;
        this.y = ffbrVar4;
        this.z = ffbrVar5;
        this.A = ffbrVar6;
        this.B = ffbrVar7;
        this.C = ffbrVar8;
        this.D = ffbrVar9;
        this.E = ffbrVar10;
        this.F = ffbrVar11;
        this.G = ffbrVar12;
        this.H = ffbrVar13;
        this.I = ffbrVar14;
        this.i = ffbrVar15;
        this.j = ffbrVar16;
        this.k = ffbrVar17;
        this.J = ffbrVar18;
        this.K = ffbrVar19;
        this.L = ffbrVar22;
        this.M = ffbrVar23;
        this.N = ffbrVar20;
        this.O = ffbrVar21;
        this.P = ffbrVar24;
        this.Q = ffbrVar25;
        this.R = ffbrVar26;
        this.S = optional;
        this.T = ffbrVar27;
        this.U = ffbrVar28;
        this.V = errlVar;
        this.W = errlVar2;
        this.l = ffbrVar29;
        this.X = ffbrVar30;
        this.Y = ffbrVar31;
        this.Z = ffbrVar32;
        this.aa = ffbrVar33;
        this.ab = ffbrVar34;
        this.ac = ffbrVar35;
        this.m = asmjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.engw aA(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coym.aA(java.lang.String):engw");
    }

    private final String aB(long j, String str, String[] strArr) {
        Cursor query;
        if (j <= 0 || (query = aq().query(g, f, str, strArr, null)) == null) {
            return null;
        }
        do {
            try {
                if (!query.moveToNext()) {
                    return null;
                }
            } finally {
                query.close();
            }
        } while (j != query.getLong(0));
        return query.getString(1);
    }

    private final void aC(Uri uri, Uri uri2, String str) {
        if (uri != null) {
            int a = a(uri, "Bugle.Telephony.Delete.Message.Latency");
            csjb a2 = n.a();
            a2.I(str);
            a2.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            a2.A("updatedMessageUri", uri2);
            a2.y("count", a);
            a2.r();
        }
    }

    private final void aD(final Uri uri, final String str, final String[] strArr, final int i) {
        if (this.m.a()) {
            ((azei) this.T.b()).d(new Consumer() { // from class: coyj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cfup cfupVar = coym.d;
                    ((cpdd) obj).h(uri, str, strArr, i);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            this.S.ifPresent(new Consumer() { // from class: coyk
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cfup cfupVar = coym.d;
                    ((cpdd) ((ffbr) obj).b()).h(uri, str, strArr, i);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    private static boolean aE(List list) {
        return Collection.EL.stream(list).map(new Function() { // from class: coyc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfup cfupVar = coym.d;
                cfva cfvaVar = aoqm.a;
                return emxe.b(((aoku) obj).p(((Boolean) new aoqj().get()).booleanValue()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).anyMatch(new Predicate() { // from class: coye
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cuxt.i((String) obj);
            }
        });
    }

    private final Uri aF(Context context, lx lxVar, int i, String str, long j, long j2, String str2, boolean z, String str3, final int i2) {
        Uri uri = null;
        try {
            final Uri h2 = ((cgtc) this.M.b()).h(lxVar, Telephony.Mms.Inbox.CONTENT_URI, i, str, j, null);
            try {
                ContentValues contentValues = new ContentValues(3);
                if (this.q == null) {
                    this.q = Boolean.valueOf(aG(Telephony.Mms.CONTENT_URI));
                }
                if (this.q.booleanValue()) {
                    contentValues.put("date_sent", Long.valueOf(lxVar.a.b(133)));
                }
                contentValues.put("date", Long.valueOf(j2));
                contentValues.put("ct_l", str2);
                long b = lxVar.a.b(142);
                if (b > 0) {
                    contentValues.put("m_size", Long.valueOf(b));
                }
                if (z && !TextUtils.isEmpty(str3) && ctib.d()) {
                    contentValues.put("m_id", str3);
                }
                if (this.m.a()) {
                    aK(context.getContentResolver(), h2, contentValues, "Bugle.Telephony.Update.Field.Latency");
                } else {
                    akzw b2 = ((albq) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
                    cgsx.b(context.getContentResolver(), h2, contentValues, null, null);
                    b2.c();
                }
                csjb a = n.a();
                a.I("Inserted MMS message into telephony.");
                a.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, h2);
                a.r();
                if (z) {
                    if (this.m.a()) {
                        ((azei) this.T.b()).d(new Consumer() { // from class: coxy
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                cfup cfupVar = coym.d;
                                ((cpdd) obj).i(h2, i2, null);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return h2;
                    }
                    this.S.ifPresent(new Consumer() { // from class: coxz
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            cfup cfupVar = coym.d;
                            ((cpdd) ((ffbr) obj).b()).i(h2, i2, null);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return h2;
                }
                if (this.m.a()) {
                    ((azei) this.T.b()).d(new Consumer() { // from class: coya
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            cfup cfupVar = coym.d;
                            ((cpdd) obj).c(h2, null);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return h2;
                }
                this.S.ifPresent(new Consumer() { // from class: coyb
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        cfup cfupVar = coym.d;
                        ((cpdd) ((ffbr) obj).b()).c(h2, null);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return h2;
            } catch (SQLiteException e2) {
                e = e2;
                uri = h2;
                n.o("update mms received message failure", e);
                return uri;
            } catch (lj e3) {
                e = e3;
                uri = h2;
                n.o("persist mms received message failure", e);
                return uri;
            }
        } catch (SQLiteException e4) {
            e = e4;
        } catch (lj e5) {
            e = e5;
        }
    }

    private final boolean aG(Uri uri) {
        Uri uri2;
        csix.l(uri);
        csix.k(!TextUtils.isEmpty("date_sent"));
        try {
            uri2 = uri;
            try {
                Cursor c = cgsx.c(aq(), uri2, new String[]{"date_sent"}, null, null, a.v("date_sent", " ASC LIMIT 1"));
                if (c != null) {
                    c.close();
                }
                return true;
            } catch (SQLiteException e2) {
                e = e2;
                SQLiteException sQLiteException = e;
                csjb e3 = n.e();
                e3.I("date_sent in");
                e3.I(uri2);
                e3.I("does not exist");
                e3.s(sQLiteException);
                return false;
            }
        } catch (SQLiteException e4) {
            e = e4;
            uri2 = uri;
        }
    }

    private final boolean aH(long j, long j2, Uri uri) {
        String[] strArr;
        String str;
        if (as(j, "thread_id", uri) == 0) {
            return true;
        }
        ContentResolver contentResolver = this.s.getContentResolver();
        if (j2 != Long.MAX_VALUE) {
            strArr = new String[]{Long.toString(j), Long.toString(j2)};
            str = "thread_id=? AND date<=?";
        } else {
            strArr = new String[]{Long.toString(j)};
            str = "thread_id=?";
        }
        return au(contentResolver, uri, str, strArr, "Bugle.Telephony.Delete.SmsBulk.Latency") > 0;
    }

    private final void aI(long[] jArr) {
        String[] strArr;
        int length = jArr.length;
        if (length == 0) {
            return;
        }
        Uri[] uriArr = {Telephony.Mms.CONTENT_URI, Telephony.Sms.CONTENT_URI};
        for (int i = 0; i < 2; i++) {
            Uri uri = uriArr[i];
            akzw b = ((albq) this.x.b()).b(true != uri.equals(Telephony.Mms.CONTENT_URI) ? "Bugle.Telephony.Delete.SmsBulk.Latency" : "Bugle.Telephony.Delete.MmsBulk.Latency");
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 128;
                int min = Math.min(i3, length) - i2;
                String format = String.format(Locale.US, "%s IN %s", "_id", ar(min));
                if (min <= 0) {
                    strArr = null;
                } else {
                    String[] strArr2 = new String[min];
                    for (int i4 = 0; i4 < min; i4++) {
                        strArr2[i4] = Long.toString(jArr[i2 + i4]);
                    }
                    strArr = strArr2;
                }
                at(aq(), uri, format, strArr);
                i2 = i3;
            }
            b.c();
        }
    }

    private final int aJ(final ContentResolver contentResolver, final Uri uri, final ContentValues contentValues, final String[] strArr) {
        Optional a = ((coyp) this.ac.b()).a(new ffix() { // from class: coxw
            public final /* synthetic */ String e = "thread_id=? AND read=0 AND date<=?";

            @Override // defpackage.ffix
            public final Object invoke() {
                coym coymVar = coym.this;
                ContentResolver contentResolver2 = contentResolver;
                Uri uri2 = uri;
                ContentValues contentValues2 = contentValues;
                String str = this.e;
                String[] strArr2 = strArr;
                return coymVar.m.a() ? Integer.valueOf(coymVar.ap(contentResolver2, uri2, contentValues2, str, strArr2)) : Integer.valueOf(contentResolver2.update(uri2, contentValues2, str, strArr2));
            }
        });
        if (a.isPresent()) {
            return ((Integer) a.get()).intValue();
        }
        return 0;
    }

    private final int aK(ContentResolver contentResolver, Uri uri, ContentValues contentValues, String str) {
        akzw b = ((albq) this.x.b()).b(str);
        int b2 = cgsx.b(contentResolver, uri, contentValues, null, null);
        b.c();
        aD(uri, null, null, b2);
        return b2;
    }

    public static final String ar(int i) {
        if (i <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder("(?");
        for (int i2 = 0; i2 < i - 1; i2++) {
            sb.append(",?");
        }
        sb.append(")");
        return sb.toString();
    }

    private final int as(long j, String str, Uri uri) {
        String[] strArr;
        String str2;
        String[] strArr2;
        ContentResolver contentResolver = this.s.getContentResolver();
        Cursor cursor = null;
        if (j == -1 || str == null) {
            strArr = new String[]{"_id"};
            str2 = null;
            strArr2 = null;
        } else {
            strArr = new String[]{str};
            String[] strArr3 = {Long.toString(j)};
            str2 = str.concat("=?");
            strArr2 = strArr3;
        }
        String[] strArr4 = strArr;
        try {
            akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Query.Count.Latency");
            cursor = contentResolver.query(uri, strArr4, str2, strArr2, null);
            azyd.l(cursor);
            b.c();
            int count = cursor != null ? cursor.getCount() : 0;
            if (cursor != null) {
                cursor.close();
            }
            return count;
        } finally {
        }
    }

    private final int at(ContentResolver contentResolver, final Uri uri, final String str, final String[] strArr) {
        try {
            emxf.l(!(uri.getPathSegments().isEmpty() && str == null));
            final int delete = contentResolver.delete(uri, str, strArr);
            csjb c = n.c();
            c.I("Deleted messages from telephony");
            c.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            c.A("batchSelection", str);
            c.C("batchSelectionArgs", strArr);
            c.y("deletedCount", delete);
            c.r();
            if (delete > 0) {
                if (this.m.a()) {
                    ((azei) this.T.b()).d(new Consumer() { // from class: coyf
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            cfup cfupVar = coym.d;
                            ((cpdd) obj).a(uri, str, strArr, delete);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return delete;
                }
                this.S.ifPresent(new Consumer() { // from class: coyg
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        cfup cfupVar = coym.d;
                        ((cpdd) ((ffbr) obj).b()).a(uri, str, strArr, delete);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            return delete;
        } catch (SQLiteException e2) {
            if (!((Boolean) cpdc.a.e()).booleanValue()) {
                throw e2;
            }
            csjb b = n.b();
            b.I("Could not delete messages from telephony");
            b.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            b.s(e2);
            return 0;
        } catch (IllegalArgumentException e3) {
            csjb b2 = n.b();
            b2.I("Could not delete messages from telephony");
            b2.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            b2.s(e3);
            return 0;
        } catch (Exception e4) {
            csjb b3 = n.b();
            b3.I("Could not delete messages from telephony");
            b3.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            b3.s(e4);
            return 0;
        }
    }

    private final int au(ContentResolver contentResolver, Uri uri, String str, String[] strArr, String str2) {
        akzw b = ((albq) this.x.b()).b(str2);
        int at = at(contentResolver, uri, str, strArr);
        b.c();
        return at;
    }

    private final int av(ContentResolver contentResolver, Uri uri, ContentValues contentValues, String str, String[] strArr, String str2) {
        akzw b = ((albq) this.x.b()).b(str2);
        int update = contentResolver.update(uri, contentValues, str, strArr);
        b.c();
        aD(uri, str, strArr, update);
        return update;
    }

    private static long aw(Uri uri) {
        if (uri == null) {
            return -1L;
        }
        try {
            return ContentUris.parseId(uri);
        } catch (NumberFormatException | UnsupportedOperationException unused) {
            return -1L;
        }
    }

    private final Uri ax(Context context, lh lhVar, int i, String str, long j, String str2, Map map) {
        lj ljVar;
        Uri uri = null;
        try {
            Uri h2 = ((cgtc) this.M.b()).h(lhVar, Telephony.Mms.Sent.CONTENT_URI, i, str, j, map);
            try {
                ContentValues contentValues = new ContentValues(3);
                contentValues.put("read", (Integer) 1);
                contentValues.put("seen", (Integer) 1);
                if (!TextUtils.isEmpty(str2) && ctib.d()) {
                    contentValues.put("m_id", str2);
                }
                if (this.m.a()) {
                    aK(context.getContentResolver(), h2, contentValues, "Bugle.Telephony.Update.Mms.Seen.Latency");
                    return h2;
                }
                akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Update.Mms.Seen.Latency");
                cgsx.b(context.getContentResolver(), h2, contentValues, null, null);
                b.c();
                return h2;
            } catch (lj e2) {
                ljVar = e2;
                uri = h2;
                ((ensz) ((ensz) ((ensz) e.i()).g(ljVar)).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "insertSendReqInternal", (char) 1304, "TelephonyManagerInterfaceImpl.java")).q("persist mms sent message failure");
                return uri;
            }
        } catch (lj e3) {
            ljVar = e3;
        }
    }

    private final Uri ay(Context context, List list, final MessageCoreData messageCoreData, cgtf cgtfVar, long j, int i, String str, long j2, byte[] bArr, final boolean z) {
        final Uri l;
        byte[] bArr2 = bArr;
        ekzz f2 = eleg.f("TelephonyManagerInterface.insertSendingMmsMessage");
        try {
            if (((Boolean) ((cfup) ckey.a.get()).e()).booleanValue() && !z && bArr2 != null && new String(bArr2, StandardCharsets.US_ASCII).length() > 40) {
                ((ensz) ((ensz) e.j()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "insertSendingMessageInMmsTables", 1462, "TelephonyManagerInterfaceImpl.java")).q("MMS transaction IDs that are longer than 40 characters can not be sent over the network. Updating MMS Transaction ID as empty string");
                bArr2 = "".getBytes(StandardCharsets.US_ASCII);
                ((akzt) this.Q.b()).c("Bugle.TelephonyManagerInterface.MmsSend.PduTransactionIdCheck.Failure.Count");
            }
            lz aa = aa((String[]) list.toArray(new String[list.size()]), messageCoreData, cgtfVar, 604800L, messageCoreData.b(), j2, bArr2);
            Uri uri = null;
            if (aa != null) {
                HashMap hashMap = new HashMap();
                if (z) {
                    l = ax(context, aa, i, str, j, messageCoreData.E().b, hashMap);
                    hashMap = hashMap;
                } else {
                    l = l(context, aa, i, str, j, hashMap);
                }
                if (l != null) {
                    final Uri withAppendedId = ContentUris.withAppendedId(Telephony.Mms.CONTENT_URI, ContentUris.parseId(l));
                    final HashMap hashMap2 = new HashMap();
                    for (MessagePartCoreData messagePartCoreData : messageCoreData.ab()) {
                        Uri t = messagePartCoreData.t();
                        if (t != null) {
                            hashMap2.put(t, messagePartCoreData);
                        }
                    }
                    if (hashMap2.size() != hashMap.size()) {
                        csjb e2 = n.e();
                        e2.I("Can't update content uri for all parts.");
                        e2.d(messageCoreData.B());
                        e2.w(messageCoreData.t());
                        e2.y("partCount", hashMap2.size());
                        e2.y("updatedPartCount", hashMap.size());
                        e2.r();
                    }
                    final HashMap hashMap3 = hashMap;
                    uri = withAppendedId;
                    ((dtuu) this.L.b()).d("TelephonyManagerInterface#updateMessageAndPartsUriFromTelephony", new Runnable() { // from class: coxq
                        @Override // java.lang.Runnable
                        public final void run() {
                            coym coymVar = coym.this;
                            bdmq bdmqVar = (bdmq) coymVar.j.b();
                            MessageCoreData messageCoreData2 = messageCoreData;
                            ConversationIdType z2 = messageCoreData2.z();
                            MessageIdType B = messageCoreData2.B();
                            String[] strArr = MessagesTable.a;
                            buxr buxrVar = new buxr();
                            buxrVar.ap("updateMessageAndPartsUriFromTelephony");
                            buxrVar.S(withAppendedId);
                            bdmqVar.U(z2, B, buxrVar);
                            for (Map.Entry entry : hashMap3.entrySet()) {
                                Map map = hashMap2;
                                MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) map.get(entry.getKey());
                                if (messagePartCoreData2 != null) {
                                    ((bdpt) coymVar.i.b()).e(messageCoreData2, messagePartCoreData2, messagePartCoreData2.t(), (Uri) entry.getValue());
                                }
                            }
                            ((bdfl) coymVar.k.b()).b(messageCoreData2.z(), false, byyt.UNARCHIVED);
                        }
                    });
                    final boolean z2 = false;
                    if (messageCoreData.cm() && !messageCoreData.cE()) {
                        z2 = true;
                    }
                    csjb a = n.a();
                    a.I("Inserted outgoing");
                    a.I(z ? "RCS" : "MMS");
                    a.I(z2 ? "file transfer" : " text message");
                    a.I("into telephony.");
                    a.A("outboxUri", l);
                    a.r();
                    final UUID aI = messageCoreData.aI();
                    if (this.m.a()) {
                        ((azei) this.T.b()).d(new Consumer() { // from class: coxu
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                cpdd cpddVar = (cpdd) obj;
                                cfup cfupVar = coym.d;
                                if (z) {
                                    UUID uuid = aI;
                                    Uri uri2 = l;
                                    if (z2) {
                                        cpddVar.f(uri2, uuid);
                                    } else {
                                        cpddVar.i(uri2, 1, uuid);
                                    }
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    } else {
                        this.S.ifPresent(new Consumer() { // from class: coxv
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                ffbr ffbrVar = (ffbr) obj;
                                cfup cfupVar = coym.d;
                                if (z) {
                                    UUID uuid = aI;
                                    Uri uri2 = l;
                                    if (z2) {
                                        ((cpdd) ffbrVar.b()).f(uri2, uuid);
                                    } else {
                                        ((cpdd) ffbrVar.b()).i(uri2, 1, uuid);
                                    }
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                } else {
                    n.n("failed to persist message into telephony");
                }
            }
            f2.close();
            return uri;
        } catch (Throwable th) {
            try {
                f2.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private static aztg az(bdtd bdtdVar, SelfIdentityId selfIdentityId) {
        aztg f2 = bdtdVar.f(selfIdentityId);
        return f2 == null ? bdtdVar.e() : f2;
    }

    @Override // defpackage.coxk
    public final elfl A() {
        return elfl.g(this.v.f(Telephony.MmsSms.CONTENT_URI, new Bundle()));
    }

    @Override // defpackage.coxk
    public final Optional B(long j) {
        String H = H(j);
        return H == null ? Optional.empty() : Optional.of(engw.n(K(H)));
    }

    @Override // defpackage.coxk
    public final Optional C(cpxu cpxuVar) {
        return cpxuVar.d() ? Optional.empty() : B(cpxuVar.a());
    }

    @Override // defpackage.coxk
    public final Optional D(cpbd cpbdVar, String str) {
        if (cpbdVar != null && cpbdVar.b.size() == 1) {
            aoku aokuVar = (aoku) cpbdVar.b.get(0);
            cfva cfvaVar = aoqm.a;
            if (!((ckdn) this.z.b()).f(aokuVar.k(((Boolean) new aoqj().get()).booleanValue()))) {
                return Optional.ofNullable(aokuVar);
            }
        }
        akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Query.Addr.Latency");
        Cursor c = cgsx.c(aq(), Uri.withAppendedPath(Uri.parse(str), "addr"), axuh.b(), "type=137", null, null);
        azyd.l(c);
        b.c();
        if (c != null) {
            try {
                if (c.moveToFirst()) {
                    Optional of = Optional.of(((couw) this.P.b()).a(c));
                    c.close();
                    return of;
                }
                c.close();
            } finally {
            }
        }
        return Optional.empty();
    }

    @Override // defpackage.coxk
    public final String E(long j) {
        Cursor cursor;
        try {
            cursor = aq().query(ContentUris.withAppendedId(b, j), null, null, null, null);
        } catch (RuntimeException unused) {
            csjb b = n.b();
            b.I("getCanonicalAddressFromRecipientId: failed for id");
            b.H(j);
            b.r();
            cursor = null;
        }
        Cursor cursor2 = cursor;
        if (cursor2 == null) {
            return "";
        }
        try {
            if (cursor2.moveToFirst()) {
                return cursor2.getString(0);
            }
            if (cursor2.moveToNext()) {
                csjb a = n.a();
                a.I("getCanonicalAddressFromRecipientId found more than one result for id");
                a.H(j);
                a.r();
            }
            return "";
        } finally {
            cursor2.close();
        }
    }

    @Override // defpackage.coxk
    public final String F(cpbd cpbdVar, String str) {
        return (String) D(cpbdVar, str).map(new Function() { // from class: coyl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfup cfupVar = coym.d;
                cfva cfvaVar = aoqm.a;
                return ((aoku) obj).k(((Boolean) new aoox().get()).booleanValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
    }

    @Override // defpackage.coxk
    public final String G() {
        return p;
    }

    @Override // defpackage.coxk
    public final String H(long j) {
        String aB = aB(j, "_id=?", new String[]{String.valueOf(j)});
        if (aB == null) {
            aB = aB(j, null, null);
        }
        if (TextUtils.isEmpty(aB) && j > 0) {
            ((akzt) this.Q.b()).c("Bugle.Telephony.Thread.Recipients.LookupFailed");
        }
        return aB;
    }

    @Override // defpackage.coxk
    public final String I(cpxu cpxuVar) {
        return H(cpxv.a(cpxuVar));
    }

    @Override // defpackage.coxk
    public final String J() {
        return o;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0013 A[SYNTHETIC] */
    @Override // defpackage.coxk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List K(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coym.K(java.lang.String):java.util.List");
    }

    @Override // defpackage.coxk
    public final List L(String str) {
        Uri withAppendedPath = Uri.withAppendedPath(Uri.parse(str), "addr");
        akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Query.Addr.Latency");
        Cursor c = cgsx.c(this.s.getContentResolver(), withAppendedPath, axuh.b(), null, null, null);
        azyd.l(c);
        b.c();
        if (c == null) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (c.moveToNext()) {
                aoku x = ((aolr) this.l.b()).x(((couw) this.P.b()).a(c));
                if (!arrayList.contains(x) && !((bdtd) this.X.b()).l(x)) {
                    arrayList.add(x);
                }
            }
            return arrayList;
        } finally {
            c.close();
        }
    }

    @Override // defpackage.coxk
    public final Map M() {
        HashMap hashMap = new HashMap();
        Cursor query = aq().query(g, f, null, null, null);
        while (query != null) {
            try {
                if (!query.moveToNext()) {
                    break;
                }
                int columnIndex = query.getColumnIndex("recipient_ids");
                emxf.x(columnIndex, query.getColumnCount());
                String string = query.getString(columnIndex);
                string.getClass();
                if (emye.b(' ').i(string).size() <= 1) {
                    List K = K(string);
                    if (K.size() != 1) {
                        csjb e2 = n.e();
                        e2.I("More than one messaging identity returned for a single recipient ID.");
                        e2.A("recipientId", string);
                        e2.N("identities", K);
                        e2.r();
                    } else {
                        clbc clbcVar = (clbc) this.U.b();
                        aoku aokuVar = (aoku) K.get(0);
                        cfva cfvaVar = aoqm.a;
                        if (clbcVar.b(emxe.b(aokuVar.i(((Boolean) new aoqj().get()).booleanValue())))) {
                            int columnIndex2 = query.getColumnIndex("_id");
                            emxf.x(columnIndex2, query.getColumnCount());
                            long j = query.getLong(columnIndex2);
                            csjb a = n.a();
                            a.I("Found a RCS group conversation");
                            a.z("threadId", j);
                            a.N("identity", K.get(0));
                            a.r();
                            hashMap.put(Long.valueOf(j), (aoku) K.get(0));
                        }
                    }
                }
            } finally {
            }
        }
        if (query != null) {
            query.close();
        }
        return hashMap;
    }

    @Override // defpackage.coxk
    public final void N(Context context, Uri uri) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.putNull("st");
        if (this.m.a()) {
            aK(context.getContentResolver(), uri, contentValues, "Bugle.Telephony.Update.Mms.Status.Latency");
            return;
        }
        akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Update.Mms.Status.Latency");
        cgsx.b(context.getContentResolver(), uri, contentValues, null, null);
        b.c();
    }

    @Override // defpackage.coxk
    public final void O(cno cnoVar) {
        int b = cnoVar.b();
        int i = 0;
        while (i < b) {
            int i2 = i + 128;
            int min = Math.min(i2, b) - i;
            String format = String.format(Locale.US, "%s != '%s' AND %s IN %s", "ct", "application/smil", "mid", ar(min));
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < min; i3++) {
                int i4 = i + i3;
                List list = ((coux) cnoVar.e(i4)).x;
                if (((coux) cnoVar.e(i4)).x.isEmpty()) {
                    arrayList.add(Long.toString(((coux) cnoVar.e(i4)).b));
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Cursor c = cgsx.c(this.s.getContentResolver(), coxk.a, couy.a, format, (String[]) arrayList.toArray(new String[arrayList.size()]), null);
            azyd.l(c);
            if (c != null) {
                while (c.moveToNext()) {
                    try {
                        couy a = ((covd) this.H.b()).a();
                        a.b(c, false);
                        coux couxVar = (coux) cnoVar.d(a.d);
                        if (couxVar != null && (!a.e() || !TextUtils.isEmpty(a.f))) {
                            couxVar.i(a);
                        }
                    } finally {
                        c.close();
                    }
                }
            }
            i = i2;
        }
    }

    @Override // defpackage.coxk
    public final void P(long j, long j2) {
        ContentValues contentValues = new ContentValues(1);
        long j3 = j2 / 1000;
        if (j3 == 0) {
            ((akzt) this.Q.b()).e("Bugle.Telephony.Timestamp0.Mms", 5);
            j3 = 0;
        }
        contentValues.put("date", Long.valueOf(j3));
        if (this.m.a()) {
            av(aq(), Telephony.Mms.CONTENT_URI, contentValues, "_id=?", new String[]{Long.toString(j)}, "Bugle.Telephony.Update.Field.Latency");
            return;
        }
        akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
        aq().update(Telephony.Mms.CONTENT_URI, contentValues, "_id=?", new String[]{Long.toString(j)});
        b.c();
    }

    @Override // defpackage.coxk
    @Deprecated
    public final void Q(Uri uri, String str) {
        int i;
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("tr_id", str);
            if (this.m.a()) {
                i = aK(this.s.getContentResolver(), uri, contentValues, "Bugle.Telephony.Update.Field.Latency");
            } else {
                akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
                int b2 = cgsx.b(this.s.getContentResolver(), uri, contentValues, null, null);
                b.c();
                i = b2;
            }
            if (i == 1) {
                ((ensz) ((ensz) e.h()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionIdLegacy", 4070, "TelephonyManagerInterfaceImpl.java")).t("Updated MMS transaction ID. Message URI: %s", uri);
            } else if (i > 1) {
                ((ensz) ((ensz) e.j()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionIdLegacy", 4072, "TelephonyManagerInterfaceImpl.java")).t("Multiple MMS transaction IDs updated. Message URI: %s", uri);
            } else {
                ((ensz) ((ensz) e.j()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionIdLegacy", 4076, "TelephonyManagerInterfaceImpl.java")).t("Failed to update MMS transaction ID. Message URI: %s", uri);
            }
        } catch (SQLiteException | IllegalArgumentException e2) {
            ((ensz) ((ensz) ((ensz) e.j()).g(e2)).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionIdLegacy", (char) 4079, "TelephonyManagerInterfaceImpl.java")).q("Update MMS Transaction ID failure");
        }
    }

    @Override // defpackage.coxk
    public final void R(Uri uri, int i, long j) {
        if (uri == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(i));
        if (V()) {
            contentValues.put("date_sent", Long.valueOf(j));
        }
        if (this.m.a()) {
            av(aq(), uri, contentValues, null, null, "Bugle.Telephony.Update.Field.Latency");
            return;
        }
        akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
        aq().update(uri, contentValues, null, null);
        b.c();
    }

    @Override // defpackage.coxk
    @Deprecated
    public final void S(long j, boolean z) {
        if (!((ctvb) this.E.b()).G()) {
            csjb e2 = n.e();
            e2.I("Not default SMS app. Cannot update archive status of thread in Telephony.");
            e2.B("isArchived", z);
            e2.z("threadId", j);
            e2.r();
            return;
        }
        if (!((ctud) this.t.b()).r()) {
            csjb e3 = n.e();
            e3.I("No SMS permissions. Cannot update archive status of thread in Telephony.");
            e3.B("isArchived", z);
            e3.z("threadId", j);
            e3.r();
            return;
        }
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("archived", Integer.valueOf(z ? 1 : 0));
        try {
        } catch (Exception e4) {
            e = e4;
        }
        try {
            if (this.m.a()) {
                av(aq(), Telephony.Threads.CONTENT_URI, contentValues, "_id=?", new String[]{Long.toString(j)}, "Bugle.Telephony.Update.FieldBulk.Latency");
                return;
            }
            akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Update.FieldBulk.Latency");
            aq().update(Telephony.Threads.CONTENT_URI, contentValues, "_id=?", new String[]{Long.toString(j)});
            b.c();
        } catch (Exception e5) {
            e = e5;
            csjb b2 = n.b();
            b2.I("Error updating archive status of thread in Telephony. Missing Archive column?");
            b2.B("isArchived", z);
            b2.z("threadId", j);
            b2.s(e);
        }
    }

    @Override // defpackage.coxk
    public final void T(cpxu cpxuVar, boolean z) {
        S(cpxv.a(cpxuVar), z);
    }

    @Override // defpackage.coxk
    public final boolean U(long j, long j2) {
        ((covs) this.B.b()).i();
        return aH(j, j2, Telephony.Sms.CONTENT_URI) || aH(j, j2 != Long.MAX_VALUE ? j2 / 1000 : Long.MAX_VALUE, Telephony.Mms.CONTENT_URI);
    }

    @Override // defpackage.coxk
    public final boolean V() {
        if (this.r == null) {
            this.r = Boolean.valueOf(aG(Telephony.Sms.CONTENT_URI));
        }
        return this.r.booleanValue();
    }

    @Override // defpackage.coxk
    public final boolean W(cpxu cpxuVar) {
        Uri.Builder buildUpon = Telephony.Threads.CONTENT_URI.buildUpon();
        buildUpon.appendPath(String.valueOf(cpxv.a(cpxuVar))).appendPath("recipients");
        try {
            Cursor query = aq().query(buildUpon.build(), h, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        boolean z = query.getInt(0) == 1;
                        query.close();
                        return z;
                    }
                } finally {
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e2) {
            csjb b = n.b();
            b.I("Error getting the archived status of a thread in Telephony.");
            b.A("threadId", cpxuVar);
            b.s(e2);
        }
        return false;
    }

    @Override // defpackage.coxk
    public final boolean X(Context context, Uri uri, int i, long j) {
        Throwable th;
        ContentResolver contentResolver;
        ContentValues contentValues;
        long j2;
        Uri uri2;
        int i2;
        try {
            contentResolver = context.getContentResolver();
            contentValues = new ContentValues();
            j2 = j / 1000;
            contentValues.put("msg_box", Integer.valueOf(i));
            if (j2 == 0) {
                try {
                    ((akzt) this.Q.b()).e("Bugle.Telephony.Timestamp0.Mms", 4);
                    j2 = 0;
                } catch (SQLiteException | IllegalArgumentException e2) {
                    th = e2;
                    n.o("update mms message failure", th);
                    return false;
                }
            }
            contentValues.put("date", Long.valueOf(j2));
        } catch (SQLiteException | IllegalArgumentException e3) {
            e = e3;
        }
        try {
            if (this.m.a()) {
                uri2 = uri;
                i2 = av(contentResolver, uri2, contentValues, null, null, "Bugle.Telephony.Update.Field.Latency");
            } else {
                uri2 = uri;
                akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
                int update = contentResolver.update(uri2, contentValues, null, null);
                b.c();
                aD(uri2, null, null, update);
                i2 = update;
            }
            if (i2 != 1) {
                return false;
            }
            csjb a = n.a();
            a.I("Updated sending MMS.");
            a.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri2);
            a.y("box", i);
            a.z("date (secs since epoch)", j2);
            a.r();
            return true;
        } catch (SQLiteException e4) {
            e = e4;
            th = e;
            n.o("update mms message failure", th);
            return false;
        } catch (IllegalArgumentException e5) {
            e = e5;
            th = e;
            n.o("update mms message failure", th);
            return false;
        }
    }

    @Override // defpackage.coxk
    public final boolean Y(Uri uri, String str) {
        int i;
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("tr_id", str);
            if (this.m.a()) {
                i = aK(this.s.getContentResolver(), uri, contentValues, "Bugle.Telephony.Update.Field.Latency");
            } else {
                akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
                int b2 = cgsx.b(this.s.getContentResolver(), uri, contentValues, null, null);
                b.c();
                i = b2;
            }
            if (i <= 0) {
                ((ensz) ((ensz) e.j()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionId", 4112, "TelephonyManagerInterfaceImpl.java")).t("Failed to update MMS transaction ID. Message URI: %s", uri);
                return false;
            }
            if (i == 1) {
                ((ensz) ((ensz) e.h()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionId", 4117, "TelephonyManagerInterfaceImpl.java")).t("Updated MMS transaction ID. Message URI: %s", uri);
            } else {
                ((ensz) ((ensz) e.j()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionId", 4119, "TelephonyManagerInterfaceImpl.java")).t("Multiple MMS transaction IDs updated. Message URI: %s", uri);
            }
            return true;
        } catch (SQLiteException | IllegalArgumentException e2) {
            ((ensz) ((ensz) ((ensz) e.j()).g(e2)).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionId", (char) 4124, "TelephonyManagerInterfaceImpl.java")).q("Update MMS Transaction ID failure");
            return false;
        }
    }

    @Override // defpackage.coxk
    public final String[] Z(Context context, ll llVar) {
        byte[] f2 = llVar.f();
        if (f2 == null) {
            return null;
        }
        String str = new String(f2);
        long epochMilli = this.u.f().toEpochMilli() / 1000;
        String[] strArr = {Integer.toString(130), Long.toString(epochMilli), Long.toString((-604800) + epochMilli), Long.toString(epochMilli + 604800), str};
        akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Query.Mms.Latency");
        try {
            Cursor c = cgsx.c(context.getContentResolver(), Telephony.Mms.CONTENT_URI, new String[]{"_id"}, "((m_type<>?) OR (exp>?)) AND (date>?) AND (date<?) AND (ct_l=?)", strArr, null);
            try {
                azyd.l(c);
                b.c();
                c.getClass();
                int count = c.getCount();
                if (count <= 0) {
                    c.close();
                    return null;
                }
                int min = Math.min(count, 32);
                String[] strArr2 = new String[min];
                for (int i = 0; c.moveToNext() && i < min; i++) {
                    String string = c.getString(0);
                    string.getClass();
                    strArr2[i] = string;
                }
                c.close();
                return strArr2;
            } finally {
            }
        } catch (SQLiteException e2) {
            n.o("query failure.", e2);
            return null;
        }
    }

    @Override // defpackage.coxk
    public final int a(Uri uri, String str) {
        return au(aq(), uri, null, null, str);
    }

    @Override // defpackage.coxk
    public final lz aa(String[] strArr, MessageCoreData messageCoreData, cgtf cgtfVar, long j, int i, long j2, byte[] bArr) {
        int length;
        if (strArr == null || (length = strArr.length) <= 0) {
            throw new IllegalArgumentException("MMS sendReq no recipient");
        }
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (cuxe.a(str)) {
                strArr2[i2] = str;
            } else if (str != null) {
                int length2 = str.length();
                StringBuilder sb = new StringBuilder(length2);
                for (int i3 = 0; i3 < length2; i3++) {
                    char charAt = str.charAt(i3);
                    if (!Character.isLetterOrDigit(charAt) && charAt != '+' && charAt != '*') {
                        if (charAt == '#') {
                            charAt = '#';
                        }
                    }
                    sb.append(charAt);
                }
                strArr2[i2] = sb.toString();
            }
        }
        try {
            lz lzVar = new lz();
            aztg az = az((bdtd) this.X.b(), messageCoreData.v());
            final aolr aolrVar = (aolr) this.l.b();
            Optional b = az.b();
            aolrVar.getClass();
            Optional map = b.map(new Function() { // from class: aztf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return aolr.this.k((aoku) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (map.isPresent()) {
                aoku aokuVar = (aoku) map.get();
                cfva cfvaVar = aoqm.a;
                String m = aokuVar.m(((Boolean) new aopt().get()).booleanValue());
                csjb d2 = n.d();
                d2.I("createSendReq: from");
                d2.k(m);
                d2.r();
                lzVar.b(new lg(emxe.b(m)));
            }
            lg[] f2 = lg.f(strArr2);
            if (f2 != null) {
                lzVar.a.n(f2);
            }
            if (!TextUtils.isEmpty(messageCoreData.au())) {
                lzVar.g(new lg(messageCoreData.au()));
            }
            lzVar.f(j2 / 1000);
            lzVar.b = cgtfVar.b;
            lzVar.a.h(cgtfVar.a, 142);
            lzVar.a.j("personal".getBytes(), 138);
            lzVar.a.h(j, 136);
            lzVar.a.i(i, 143);
            lzVar.a.i(129, 134);
            lzVar.a.i(129, 144);
            if (messageCoreData.cX()) {
                lzVar.e();
            }
            if (bArr != null) {
                lzVar.h(bArr);
            }
            return lzVar;
        } catch (lj e2) {
            ((ensz) ((ensz) ((ensz) e.i()).g(e2)).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "createMmsSendReq", (char) 1730, "TelephonyManagerInterfaceImpl.java")).q("MmsException creating sendReq PDU");
            return null;
        }
    }

    @Override // defpackage.coxk
    public final Uri ab(Context context, lx lxVar, int i, String str, long j, long j2, String str2, int i2) {
        coym coymVar;
        long j3;
        if (j2 == 0) {
            coymVar = this;
            ((akzt) coymVar.Q.b()).e("Bugle.Telephony.Timestamp0.Mms", 2);
            j3 = 0;
        } else {
            coymVar = this;
            j3 = j2;
        }
        return coymVar.aF(context, lxVar, i, str, j, j3, null, true, str2, i2);
    }

    @Override // defpackage.coxk
    public final Uri ac(Context context, List list, MessageCoreData messageCoreData, cgtf cgtfVar, long j, int i, String str, long j2) {
        return ay(context, list, messageCoreData, cgtfVar, j, i, str, j2, null, false);
    }

    @Override // defpackage.coxk
    public final void ad(long j, long j2) {
        ContentResolver aq;
        String[] strArr;
        ContentValues contentValues;
        coym coymVar;
        int i;
        int i2;
        csix.e(-1L, j);
        csix.e(-1L, j2);
        try {
            aq = aq();
            strArr = new String[]{Long.toString(j)};
            contentValues = new ContentValues(2);
            contentValues.put("thread_id", Long.valueOf(j2));
        } catch (SQLiteException | IllegalArgumentException e2) {
            e = e2;
        }
        try {
            if (this.m.a()) {
                coymVar = this;
                i = coymVar.av(aq, Telephony.Sms.CONTENT_URI, contentValues, "thread_id=?", strArr, "Bugle.Telephony.Update.FieldBulk.Latency");
            } else {
                coymVar = this;
                akzw b = ((albq) coymVar.x.b()).b("Bugle.Telephony.Update.FieldBulk.Latency");
                int update = aq.update(Telephony.Sms.CONTENT_URI, contentValues, "thread_id=?", strArr);
                b.c();
                aD(Telephony.Sms.CONTENT_URI, "thread_id=?", strArr, update);
                i = update;
            }
            if (coymVar.m.a()) {
                i2 = coymVar.av(aq, Telephony.Mms.CONTENT_URI, contentValues, "thread_id=?", strArr, "Bugle.Telephony.Update.FieldBulk.Latency");
            } else {
                akzw b2 = ((albq) coymVar.x.b()).b("Bugle.Telephony.Update.FieldBulk.Latency");
                int update2 = aq.update(Telephony.Mms.CONTENT_URI, contentValues, "thread_id=?", strArr);
                b2.c();
                aD(Telephony.Mms.CONTENT_URI, "thread_id=?", strArr, update2);
                i2 = update2;
            }
            aq.notifyChange(Telephony.Sms.CONTENT_URI, null);
            aq.notifyChange(Telephony.Mms.CONTENT_URI, null);
            csjb a = n.a();
            a.I("Moved messages.");
            a.y("smsCount", i);
            a.y("mmsCount", i2);
            a.z("oldThreadId", j);
            a.z("newThreadId", j2);
            a.r();
        } catch (SQLiteException e3) {
            e = e3;
            n.o("move message failure ", e);
        } catch (IllegalArgumentException e4) {
            e = e4;
            n.o("move message failure ", e);
        }
    }

    @Override // defpackage.coxk
    public final void ae(Uri uri) {
        if (!((ctvb) this.E.b()).G() || !((ctud) this.t.b()).r()) {
            csjb e2 = n.e();
            e2.I("Has no permission to set read status in Telephony.");
            e2.A("messageUri", uri);
            e2.r();
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("read", (Integer) 1);
        contentValues.put("seen", (Integer) 1);
        akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
        int update = aq().update(uri, contentValues, "read=0", null);
        b.c();
        aD(uri, "read=0", null, update);
        if (update > 1) {
            csjb e3 = n.e();
            e3.I(a.h(update, "Unexpectedly marked more than one message as read: "));
            e3.A("messageUri", uri);
            e3.r();
        }
    }

    @Override // defpackage.coxk
    public final void af(Context context, Uri uri, long j) {
        Uri uri2;
        int i;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            ContentValues contentValues = new ContentValues(1);
            long j2 = j / 1000;
            contentValues.put("exp", Long.valueOf(j2));
            try {
                if (this.m.a()) {
                    uri2 = uri;
                    i = av(contentResolver, uri2, contentValues, null, null, "Bugle.Telephony.Update.Field.Latency");
                } else {
                    uri2 = uri;
                    akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
                    int update = contentResolver.update(uri2, contentValues, null, null);
                    b.c();
                    aD(uri2, null, null, update);
                    i = update;
                }
                if (i == 1) {
                    return;
                }
                csjb e2 = n.e();
                e2.I("updateMmsMessageExpiry - Expect one, but updated.");
                e2.y("cnt", i);
                e2.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri2);
                e2.z("expiry (secs since epoch)", j2);
                e2.r();
            } catch (SQLiteException e3) {
                e = e3;
                n.o("update mms message expiry failure", e);
            } catch (IllegalArgumentException e4) {
                e = e4;
                n.o("update mms message expiry failure", e);
            }
        } catch (SQLiteException | IllegalArgumentException e5) {
            e = e5;
        }
    }

    @Override // defpackage.coxk
    public final ckbx ag(Context context, Uri uri, ly lyVar) {
        int a = lyVar.a.a(146);
        int i = 2;
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("resp_st", Integer.valueOf(a));
        byte[] k = lyVar.a.k(139);
        if (k != null && k.length > 0) {
            contentValues.put("m_id", cgtc.c(k));
        }
        if (this.m.a()) {
            aK(context.getContentResolver(), uri, contentValues, "Bugle.Telephony.Update.Field.Latency");
        } else {
            akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
            cgsx.b(context.getContentResolver(), uri, contentValues, null, null);
            b.c();
        }
        if (a == 128) {
            i = 0;
        } else if (a == 192 || a == 195 || a == 196) {
            csjb e2 = n.e();
            e2.I("Response status indicates transient error, setting message send status to AUTO_RETRY");
            e2.y("responseStatus", a);
            e2.r();
            i = 1;
        } else {
            csjb b2 = n.b();
            b2.I("failed to send message. respStatus: 0x");
            b2.v(Integer.toHexString(a));
            b2.r();
        }
        ckbw j = ckbx.j(i, a);
        ((ckaw) j).c = uri;
        return j.a();
    }

    @Override // defpackage.coxk
    public final boolean ah(Uri uri, int i, long j) {
        ContentValues contentValues;
        Uri uri2;
        int i2;
        try {
            contentValues = new ContentValues(2);
            contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(i));
            contentValues.put("date", Long.valueOf(j));
        } catch (SQLiteException | IllegalArgumentException e2) {
            e = e2;
        }
        try {
            if (this.m.a()) {
                uri2 = uri;
                i2 = av(aq(), uri2, contentValues, null, null, "Bugle.Telephony.Update.Field.Latency");
            } else {
                uri2 = uri;
                akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
                int update = aq().update(uri2, contentValues, null, null);
                b.c();
                aD(uri2, null, null, update);
                i2 = update;
            }
            if (i2 != 1) {
                return false;
            }
            csjb a = n.a();
            a.I("Updated sending SMS.");
            a.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri2);
            a.y(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, i);
            a.z("date (ms since epoch)", j);
            a.r();
            return true;
        } catch (SQLiteException e3) {
            e = e3;
            n.o("update sms message failure", e);
            return false;
        } catch (IllegalArgumentException e4) {
            e = e4;
            n.o("update sms message failure", e);
            return false;
        }
    }

    @Override // defpackage.coxk
    public final void ai(Uri uri, long j) {
        akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Query.Field.Latency");
        Cursor query = aq().query(uri, new String[]{"thread_id", "date"}, null, null, null);
        azyd.l(query);
        b.c();
        try {
            if (query == null) {
                csjb b2 = n.b();
                b2.I("Error finding thread for");
                b2.I(uri);
                b2.r();
            } else if (query.getCount() != 1) {
                csjb b3 = n.b();
                b3.I("Found");
                b3.G(query.getCount());
                b3.I("threads for");
                b3.I(uri);
                b3.r();
            } else if (query.moveToFirst()) {
                int columnIndex = query.getColumnIndex("thread_id");
                emxf.x(columnIndex, query.getColumnCount());
                long j2 = query.getLong(columnIndex);
                long j3 = j(j2, j);
                csjb a = n.a();
                a.H(j3);
                a.I("messages as read for thread");
                a.H(j2);
                a.r();
            } else {
                csjb b4 = n.b();
                b4.I("Failed to advance cursor for");
                b4.I(uri);
                b4.r();
            }
        } finally {
            cslm.a(query);
        }
    }

    @Override // defpackage.coxk
    public final void aj() {
        String format = String.format(Locale.US, "%s AND (%s IN (SELECT %s FROM part WHERE %s))", p, "_id", "mid", String.format(Locale.US, "((%s LIKE '%s') OR (%s LIKE '%s') OR (%s LIKE '%s') OR (%s='%s'))", "ct", "image/%", "ct", "video/%", "ct", "audio/%", "ct", "application/ogg"));
        akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Query.PartsBulk.Latency");
        Cursor query = aq().query(Telephony.Mms.CONTENT_URI, new String[]{"_id"}, format, null, null);
        azyd.l(query);
        b.c();
        if (query != null) {
            long[] jArr = new long[query.getCount()];
            int i = 0;
            while (query.moveToNext()) {
                try {
                    int i2 = i + 1;
                    jArr[i] = query.getLong(0);
                    i = i2;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
            aI(jArr);
        }
    }

    @Override // defpackage.coxk
    public final void ak(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (csuu.A(uri) || csuu.z(uri)) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    arrayList.add(Long.valueOf(Long.parseLong(lastPathSegment)));
                }
            }
        }
        long[] jArr = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        aI(jArr);
    }

    final int al(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            return al(cause);
        }
        String message = th.getMessage();
        if (message == null) {
            return 1;
        }
        if (message.contains("SmsSender: empty destination address")) {
            return 10010;
        }
        if (message.contains("SmsSender: empty text message")) {
            return 10011;
        }
        if (message.contains("SmsSender: fails to divide message")) {
            return 10012;
        }
        if (message.contains("Invalid destinationAddress")) {
            return 10000;
        }
        if (message.contains("Invalid message body")) {
            return 10001;
        }
        return message.contains("caught exception in sending") ? 10002 : 1;
    }

    @Override // defpackage.coyq
    public final int am() {
        return ao() + an();
    }

    @Override // defpackage.coyq
    public final int an() {
        return as(-1L, null, Telephony.Mms.CONTENT_URI);
    }

    @Override // defpackage.coyq
    public final int ao() {
        return as(-1L, null, Telephony.Sms.CONTENT_URI);
    }

    public final int ap(ContentResolver contentResolver, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int update = contentResolver.update(uri, contentValues, str, strArr);
        aD(uri, str, strArr, update);
        return update;
    }

    final ContentResolver aq() {
        return this.s.getContentResolver();
    }

    @Override // defpackage.coxk
    public final int b(long j) {
        ContentResolver aq = aq();
        return au(aq, Telephony.Sms.CONTENT_URI, String.format(Locale.US, "%s AND (%s<=%d)", o, "date", Long.valueOf(j)), null, "Bugle.Telephony.Delete.SmsBulk.Latency") + au(aq, Telephony.Mms.CONTENT_URI, String.format(Locale.US, "%s AND (%s<=%d)", p, "date", Long.valueOf(j / 1000)), null, "Bugle.Telephony.Delete.MmsBulk.Latency");
    }

    @Override // defpackage.coxk
    public final int c(ContentResolver contentResolver, String str, String str2) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("address", str2);
        Uri build = b.buildUpon().appendPath(str).build();
        if (this.m.a()) {
            return ap(contentResolver, build, contentValues, null, null);
        }
        int update = contentResolver.update(build, contentValues, null, null);
        aD(build, null, null, update);
        return update;
    }

    @Override // defpackage.coxk
    public final /* synthetic */ long d(Context context, String str) {
        return f(context, covk.a, str);
    }

    @Override // defpackage.coxk
    public final /* synthetic */ long e(Context context, java.util.Collection collection) {
        return g(context, covk.a, collection);
    }

    @Override // defpackage.coxk
    public final long f(Context context, cotp cotpVar, String str) {
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        ayvn ayvnVar = (ayvn) this.aa.b();
        ffbr ffbrVar = ayvnVar.a;
        ffbr ffbrVar2 = ayvnVar.b;
        ffbr ffbrVar3 = ayvnVar.c;
        Function m105m = afg$$ExternalSyntheticApiModelOutline0.m105m(ayvnVar.d.b());
        m105m.getClass();
        ffbr ffbrVar4 = ayvnVar.e;
        ffbr ffbrVar5 = ayvnVar.f;
        ffbr ffbrVar6 = ayvnVar.g;
        ayhi ayhiVar = (ayhi) ayvnVar.h.b();
        ayhiVar.getClass();
        return i(context, cotpVar, hashSet, new ayvm(ffbrVar, ffbrVar2, ffbrVar3, m105m, ffbrVar4, ffbrVar5, ffbrVar6, ayhiVar, "TelephonyManagerInterfaceImpl#getOrCreateThreadId"));
    }

    @Override // defpackage.coxk
    public final long g(Context context, cotp cotpVar, java.util.Collection collection) {
        return i(context, cotpVar, collection, ((ayvn) this.aa.b()).a());
    }

    @Override // defpackage.coxk
    public final long h(Context context, cotp cotpVar, String str, ayvm ayvmVar) {
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        return i(context, cotpVar, hashSet, ayvmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[Catch: all -> 0x01e2, TRY_LEAVE, TryCatch #1 {all -> 0x01e2, blocks: (B:3:0x0011, B:5:0x001e, B:13:0x0049, B:15:0x0053, B:17:0x004d, B:28:0x0071, B:27:0x006e, B:29:0x0072, B:30:0x0084, B:32:0x008a, B:34:0x009c, B:35:0x00a3, B:37:0x00ab, B:39:0x00b1, B:43:0x00b7, B:45:0x00cf, B:47:0x00e2, B:58:0x0165, B:63:0x018e, B:50:0x019e, B:51:0x01e1, B:73:0x019d, B:72:0x019a, B:53:0x00f0, B:55:0x00f6, B:57:0x0101, B:61:0x0146, B:62:0x016c, B:7:0x002a, B:9:0x0030, B:12:0x0039, B:67:0x0194, B:21:0x0068), top: B:2:0x0011, inners: #0, #3, #5, #7 }] */
    @Override // defpackage.coxk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long i(android.content.Context r12, defpackage.cotp r13, final java.util.Collection r14, final defpackage.ayvm r15) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coym.i(android.content.Context, cotp, java.util.Collection, ayvm):long");
    }

    @Override // defpackage.coxk
    public final long j(long j, long j2) {
        long j3;
        Cursor cursor;
        long j4 = 0;
        if (!((ctvb) this.E.b()).G()) {
            csjb e2 = n.e();
            e2.I("Not default SMS app. Cannot set thread in Telephony DB to read status.");
            e2.z("threadId", j);
            e2.r();
            return 0L;
        }
        if (!((ctud) this.t.b()).r()) {
            csjb e3 = n.e();
            e3.I("No SMS permissions. Cannot set thread in Telephony DB to read status.");
            e3.z("threadId", j);
            e3.r();
            return 0L;
        }
        ContentResolver aq = aq();
        ContentValues contentValues = new ContentValues();
        contentValues.put("read", (Integer) 1);
        contentValues.put("seen", (Integer) 1);
        cskc cskcVar = n;
        if (cskcVar.t(2)) {
            j3 = this.u.f().toEpochMilli();
            cskcVar.q("updateSmsReadStatus - starting");
            try {
                String s = a.s(j, "thread_id=");
                akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Query.Count.Latency");
                cursor = aq.query(Telephony.Sms.CONTENT_URI, null, s, null, null);
                try {
                    azyd.l(cursor);
                    b.c();
                    csjb d2 = cskcVar.d();
                    d2.I("updateSmsReadStatus.");
                    d2.y("sms count", cursor != null ? cursor.getCount() : 0);
                    d2.z("time", this.u.f().toEpochMilli() - j3);
                    d2.r();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
        } else {
            j3 = 0;
        }
        String[] strArr = {Long.toString(j), Long.toString(j2)};
        akzw b2 = ((albq) this.x.b()).b("Bugle.Telephony.Update.FieldBulk.Latency");
        int aJ = aJ(aq, Telephony.Sms.CONTENT_URI, contentValues, strArr);
        b2.c();
        aD(Telephony.Sms.CONTENT_URI, "thread_id=? AND read=0 AND date<=?", strArr, aJ);
        if (cskcVar.t(2)) {
            j4 = this.u.f().toEpochMilli();
            csjb d3 = cskcVar.d();
            d3.I("updateSmsReadStatus - sms update time:");
            d3.H(j4 - j3);
            d3.r();
        }
        String[] strArr2 = {Long.toString(j), Long.toString(j2 / 1000)};
        akzw b3 = ((albq) this.x.b()).b("Bugle.Telephony.Update.FieldBulk.Latency");
        int aJ2 = aJ(aq, Telephony.Mms.CONTENT_URI, contentValues, strArr2);
        b3.c();
        aD(Telephony.Mms.CONTENT_URI, "thread_id=? AND read=0 AND date<=?", strArr2, aJ2);
        if (cskcVar.t(2)) {
            csjb d4 = cskcVar.d();
            d4.I("updateSmsReadStatus -mms update time:");
            d4.H(this.u.f().toEpochMilli() - j4);
            d4.r();
        }
        return aJ + aJ2;
    }

    @Override // defpackage.coxk
    public final Uri k(Context context, lx lxVar, int i, String str, long j, long j2, String str2) {
        coym coymVar;
        long j3;
        if (j2 == 0) {
            coymVar = this;
            ((akzt) coymVar.Q.b()).e("Bugle.Telephony.Timestamp0.Mms", 3);
            j3 = 0;
        } else {
            coymVar = this;
            j3 = j2;
        }
        return coymVar.aF(context, lxVar, i, str, j, j3, str2, false, null, 1);
    }

    @Override // defpackage.coxk
    public final Uri l(Context context, lh lhVar, int i, String str, long j, Map map) {
        return ax(context, lhVar, i, str, j, null, map);
    }

    @Override // defpackage.coxk
    public final Uri m(Context context, List list, MessageCoreData messageCoreData, cgtf cgtfVar, long j, int i, String str, long j2, byte[] bArr) {
        return ay(context, list, messageCoreData, cgtfVar, j, i, str, j2, bArr, true);
    }

    @Override // defpackage.coxk
    public final Uri n(Context context, Uri uri, int i, String str, String str2, long j, int i2, int i3, cpxu cpxuVar, final UUID uuid, Optional optional) {
        long a = cpxv.a(cpxuVar);
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Long valueOf = Long.valueOf(j);
            cskc cskcVar = n;
            csjb a2 = cskcVar.a();
            a2.I("add message to uri.");
            a2.k(str);
            a2.m(i);
            a2.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            a2.B("read", true);
            a2.B("notified", true);
            a2.y("status", i2);
            a2.y(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, i3);
            a2.A("subject", null);
            a2.r();
            ContentValues contentValues = new ContentValues(7);
            contentValues.put("address", str);
            contentValues.put("date", valueOf);
            contentValues.put("read", (Integer) 1);
            contentValues.put("seen", (Integer) 1);
            emyl emylVar = ckey.a;
            ckbk ckbkVar = (ckbk) ckbl.a.createBuilder();
            ckbv ckbvVar = ckbv.a;
            ckbkVar.copyOnWrite();
            ckbl ckblVar = (ckbl) ckbkVar.instance;
            ckbvVar.getClass();
            ckblVar.d = ckbvVar;
            ckblVar.c = 4;
            if (optional.isPresent()) {
                eyee a3 = cpzf.a((UUID) optional.get());
                ckbkVar.copyOnWrite();
                ckbl ckblVar2 = (ckbl) ckbkVar.instance;
                ckblVar2.b |= 1;
                ckblVar2.e = a3;
            }
            contentValues.put("subject", ckey.g((ckbl) ckbkVar.build()));
            contentValues.put("body", str2);
            contentValues.put("sub_id", Integer.valueOf(i));
            if (i2 != -1) {
                contentValues.put("status", (Integer) 0);
            }
            contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(i3));
            if (a != -1) {
                contentValues.put("thread_id", Long.valueOf(a));
            }
            akzw b = ((albq) this.x.b()).b("Bugle.Telephony.Insert.Sms.Latency");
            Uri insert = contentResolver.insert(uri, contentValues);
            b.c();
            if (insert == null) {
                csjb a4 = cskcVar.a();
                a4.I("Cannot insert SMS message into telephony.");
                a4.y(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, i3);
                a4.r();
                return null;
            }
            final Uri withAppendedId = ContentUris.withAppendedId(Telephony.Sms.CONTENT_URI, ContentUris.parseId(insert));
            csjb a5 = cskcVar.a();
            a5.I("Inserted SMS message into telephony.");
            a5.y(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, i3);
            a5.A("messageUri", insert);
            a5.A("result", withAppendedId);
            a5.z("threadId", a);
            a5.r();
            if (this.m.a()) {
                ((azei) this.T.b()).d(new Consumer() { // from class: coyh
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        cfup cfupVar = coym.d;
                        ((cpdd) obj).g(withAppendedId, uuid);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return withAppendedId;
            }
            this.S.ifPresent(new Consumer() { // from class: coyi
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cfup cfupVar = coym.d;
                    ((cpdd) ((ffbr) obj).b()).g(withAppendedId, uuid);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return withAppendedId;
        } catch (SQLiteException | IllegalArgumentException e2) {
            n.o("persist sms message failure", e2);
            return null;
        }
    }

    @Override // defpackage.coxk
    public final Uri o(bdtd bdtdVar, MessageCoreData messageCoreData, long j) {
        Uri n2;
        Uri u = messageCoreData.u();
        if (u != null && csuu.A(u)) {
            return u;
        }
        String ar = messageCoreData.ar();
        if (ar == null) {
            n2 = null;
        } else {
            aztg az = az(bdtdVar, messageCoreData.v());
            int e2 = az != null ? az.e() : -1;
            cpxu a = ((cbek) this.K.b()).a(messageCoreData.z());
            ArrayList a2 = ((bdfw) this.J.b()).a(messageCoreData.z(), messageCoreData.cw());
            emyw.a(!a2.isEmpty());
            emyw.a(a2.size() == 1);
            n2 = n(this.s, Telephony.Sms.CONTENT_URI, e2, (String) a2.get(0), ar, j, -1, 2, a, messageCoreData.aI(), messageCoreData.ad());
        }
        if (n2 != null) {
            if (!messageCoreData.cY()) {
                aC(u, n2, "move MMS to SMS.");
            }
            return n2;
        }
        csjb a3 = n.a();
        a3.I("moveFallbackMessageToSms fails to insert SMS message.");
        a3.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, u);
        a3.r();
        return u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        if (r2.toString().equals(r0.b) == false) goto L26;
     */
    @Override // defpackage.coxk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri p(defpackage.bdtd r14, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r15) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coym.p(bdtd, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData):android.net.Uri");
    }

    @Override // defpackage.coxk
    public final ckbx q(Context context, Uri uri, int i, String str, String str2, Uri uri2, boolean z, long j, Bundle bundle, long j2) {
        Parcelable parcelable;
        int i2;
        String uri3 = uri2.toString();
        if (TextUtils.isEmpty(uri3)) {
            n.n("Download from empty content location URL");
            return ckbx.j(3, 0).a();
        }
        try {
            if (((csrv) this.N.b()).q() && cbgi.k(uri2, context)) {
                csjb a = n.a();
                a.I("Reading MMS from dump file:");
                a.I(uri2);
                a.r();
                try {
                    return r(context, uri, i, str, str2, uri3, z, j, covp.a(((csrv) this.N.b()).s(uri2.getPathSegments().get(1), context)), j2);
                } catch (covq e2) {
                    e = e2;
                    parcelable = uri;
                    csjb b = n.b();
                    b.I("failed to download message");
                    b.I(parcelable);
                    b.s(e);
                    i2 = e.a;
                    return ckbx.j(i2, 0).a();
                } catch (li e3) {
                    e = e3;
                    parcelable = uri;
                    csjb b2 = n.b();
                    b2.I("failed to download message");
                    b2.I(parcelable);
                    b2.s(e);
                    i2 = 2;
                    return ckbx.j(i2, 0).a();
                }
            }
            parcelable = uri;
            try {
                cskc cskcVar = n;
                csjb a2 = cskcVar.a();
                a2.I("Downloading MMS.");
                a2.A("notification message", parcelable);
                a2.r();
                if (i < 0) {
                    cskcVar.n("Incoming MMS came from unknown SIM");
                    throw new covq(3, "Message from unknown SIM");
                }
                bundle.putParcelable("notification_uri", parcelable);
                bundle.putInt("sub_id", i);
                bundle.putString("sub_phone_number", str);
                bundle.putString("transaction_id", str2);
                bundle.putString("content_location", uri3);
                bundle.putBoolean("auto_download", z);
                bundle.putLong("received_timestamp", j);
                covr covrVar = (covr) this.C.b();
                Uri parse = Uri.parse(uri3);
                Uri d2 = cbgk.d(context);
                Intent b3 = covrVar.e.b(parse, d2, bundle, j2);
                alsa e4 = ((altk) covrVar.f.b()).e();
                if (e4 != null) {
                    e4.c(0, d2);
                }
                ky kyVar = covrVar.g;
                b3.putExtra("mms_api", 1);
                csjb c = ky.a.c();
                c.I("downloading MMS. ");
                c.w(j2);
                c.r();
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, b3, ctie.a | VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
                int a3 = la.a(i);
                SmsManager smsManagerForSubscriptionId = SmsManager.getSmsManagerForSubscriptionId(a3);
                if (ctid.e) {
                    smsManagerForSubscriptionId.downloadMultimediaMessage(context, uri3, d2, kyVar.a(a3), broadcast, j2);
                } else {
                    smsManagerForSubscriptionId.downloadMultimediaMessage(context, uri3, d2, kyVar.a(a3), broadcast);
                }
                return ckbx.i;
            } catch (covq e5) {
                e = e5;
                csjb b4 = n.b();
                b4.I("failed to download message");
                b4.I(parcelable);
                b4.s(e);
                i2 = e.a;
                return ckbx.j(i2, 0).a();
            } catch (li e6) {
                e = e6;
                csjb b22 = n.b();
                b22.I("failed to download message");
                b22.I(parcelable);
                b22.s(e);
                i2 = 2;
                return ckbx.j(i2, 0).a();
            }
        } catch (covq e7) {
            e = e7;
            parcelable = uri;
        } catch (li e8) {
            e = e8;
            parcelable = uri;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003a  */
    /* JADX WARN: Type inference failed for: r0v11, types: [aoku, java.lang.Object] */
    @Override // defpackage.coxk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ckbx r(android.content.Context r14, android.net.Uri r15, int r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, long r21, defpackage.lx r23, long r24) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coym.r(android.content.Context, android.net.Uri, int, java.lang.String, java.lang.String, java.lang.String, boolean, long, lx, long):ckbx");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02be A[Catch: Exception -> 0x02ce, TryCatch #1 {Exception -> 0x02ce, blocks: (B:15:0x0073, B:18:0x0094, B:20:0x009a, B:21:0x00a6, B:23:0x00de, B:25:0x00e8, B:26:0x00ef, B:28:0x00f5, B:30:0x0105, B:32:0x010b, B:36:0x0127, B:37:0x012f, B:39:0x0139, B:41:0x0145, B:44:0x0154, B:46:0x015a, B:52:0x0168, B:56:0x016b, B:57:0x0187, B:59:0x018d, B:61:0x019d, B:63:0x01a3, B:77:0x020e, B:88:0x022b, B:90:0x0234, B:91:0x0244, B:104:0x02a0, B:111:0x02b0, B:112:0x02b5, B:113:0x02b6, B:114:0x02bd, B:115:0x02be, B:116:0x02c5, B:119:0x0182, B:120:0x02c6, B:121:0x02cd, B:96:0x024f, B:98:0x026b, B:100:0x027c, B:101:0x0275, B:106:0x0281, B:108:0x0287, B:109:0x0295), top: B:14:0x0073, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018d A[Catch: Exception -> 0x02ce, TryCatch #1 {Exception -> 0x02ce, blocks: (B:15:0x0073, B:18:0x0094, B:20:0x009a, B:21:0x00a6, B:23:0x00de, B:25:0x00e8, B:26:0x00ef, B:28:0x00f5, B:30:0x0105, B:32:0x010b, B:36:0x0127, B:37:0x012f, B:39:0x0139, B:41:0x0145, B:44:0x0154, B:46:0x015a, B:52:0x0168, B:56:0x016b, B:57:0x0187, B:59:0x018d, B:61:0x019d, B:63:0x01a3, B:77:0x020e, B:88:0x022b, B:90:0x0234, B:91:0x0244, B:104:0x02a0, B:111:0x02b0, B:112:0x02b5, B:113:0x02b6, B:114:0x02bd, B:115:0x02be, B:116:0x02c5, B:119:0x0182, B:120:0x02c6, B:121:0x02cd, B:96:0x024f, B:98:0x026b, B:100:0x027c, B:101:0x0275, B:106:0x0281, B:108:0x0287, B:109:0x0295), top: B:14:0x0073, inners: #0 }] */
    @Override // defpackage.coxk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ckbx s(defpackage.aoku r27, java.lang.String r28, android.net.Uri r29, int r30, java.lang.String r31, boolean r32, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r33, long r34) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coym.s(aoku, java.lang.String, android.net.Uri, int, java.lang.String, boolean, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, long):ckbx");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [covb] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // defpackage.coxk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cout t(android.net.Uri r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getAuthority()
            java.lang.String r1 = "sms"
            boolean r2 = r1.equals(r0)
            r3 = 1
            if (r2 != 0) goto L17
            java.lang.String r2 = "mms"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L16
            goto L17
        L16:
            r3 = 0
        L17:
            defpackage.csix.k(r3)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L34
            java.lang.String[] r1 = defpackage.covb.h(r9)
            ffbr r2 = r9.x
            java.lang.Object r2 = r2.b()
            albq r2 = (defpackage.albq) r2
            java.lang.String r3 = "Bugle.Telephony.Query.Sms.Latency"
            akzw r2 = r2.b(r3)
            r5 = r1
            goto L48
        L34:
            ffbr r1 = r9.x
            java.lang.String[] r2 = defpackage.coux.n()
            java.lang.Object r1 = r1.b()
            albq r1 = (defpackage.albq) r1
            java.lang.String r3 = "Bugle.Telephony.Query.Mms.Latency"
            akzw r1 = r1.b(r3)
            r5 = r2
            r2 = r1
        L48:
            r1 = 0
            android.content.Context r3 = r9.s     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L86
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L86
            r7 = 0
            r8 = 0
            r6 = 0
            r4 = r10
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L86
            defpackage.azyd.l(r10)     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
            r2.c()     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
            if (r10 == 0) goto L98
            boolean r2 = r10.moveToFirst()     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
            if (r2 == 0) goto L98
            if (r0 == 0) goto L77
            ffbr r0 = r9.ab     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
            cove r0 = (defpackage.cove) r0     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
            covb r0 = r0.a()     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
            r0.g(r10, r11)     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
            goto L7b
        L77:
            coux r0 = defpackage.coux.g(r10, r11)     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
        L7b:
            r10.close()
            return r0
        L7f:
            r0 = move-exception
            r11 = r0
            goto L8a
        L82:
            r0 = move-exception
            r10 = r0
            r11 = r10
            goto La1
        L86:
            r0 = move-exception
            r10 = r0
            r11 = r10
            r10 = r1
        L8a:
            cskc r0 = defpackage.coym.n     // Catch: java.lang.Throwable -> L9e
            csjb r0 = r0.b()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = "load telephony message failed"
            r0.I(r2)     // Catch: java.lang.Throwable -> L9e
            r0.s(r11)     // Catch: java.lang.Throwable -> L9e
        L98:
            if (r10 == 0) goto L9d
            r10.close()
        L9d:
            return r1
        L9e:
            r0 = move-exception
            r11 = r0
            r1 = r10
        La1:
            if (r1 == 0) goto La6
            r1.close()
        La6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coym.t(android.net.Uri, int):cout");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    @Override // defpackage.coxk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.coux u(android.net.Uri r10) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coym.u(android.net.Uri):coux");
    }

    @Override // defpackage.coxk
    public final coxj v(Uri uri) {
        aoku f2;
        ContentResolver aq = aq();
        Uri withAppendedPath = Uri.withAppendedPath(uri, "addr");
        engw engwVar = axuh.f;
        Cursor c = cgsx.c(aq, withAppendedPath, (String[]) engwVar.toArray(new String[((enou) engwVar).c]), "type=137 OR type=151 OR type=130", null, null);
        azyd.l(c);
        enin eninVar = new enin();
        enin eninVar2 = new enin();
        enin eninVar3 = new enin();
        enin eninVar4 = new enin();
        if (c != null) {
            while (c.moveToNext()) {
                try {
                    try {
                        f2 = ((couw) this.P.b()).a(c);
                    } catch (couv e2) {
                        ((ensz) ((ensz) ((ensz) e.j()).g(e2)).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "getRawMmsSenderAndRecipientsObject", (char) 4281, "TelephonyManagerInterfaceImpl.java")).q("Error loading MMS recipient from Telephony.");
                        f2 = ((aolr) this.l.b()).f();
                    }
                    String b = emxe.b(f2.n());
                    int i = c.getInt(2);
                    if (i == 130) {
                        eninVar2.c(b);
                    } else if (i == 137) {
                        eninVar3.c(b);
                        eninVar4.c(f2);
                    } else if (i == 151) {
                        eninVar.c(b);
                    }
                } finally {
                    c.close();
                }
            }
        }
        return new cotn(eninVar3.g(), eninVar.g(), eninVar2.g(), eninVar4.g());
    }

    @Override // defpackage.coxk
    public final /* synthetic */ cpbd w(long j, String str) {
        return y(covk.a, j, str);
    }

    @Override // defpackage.coxk
    public final /* synthetic */ cpbd x(cpxu cpxuVar, String str) {
        return z(covk.a, cpxuVar, str);
    }

    @Override // defpackage.coxk
    @Deprecated
    public final cpbd y(cotp cotpVar, long j, String str) {
        return z(cotpVar, cpxu.b(j), str);
    }

    @Override // defpackage.coxk
    @Deprecated
    public final cpbd z(cotp cotpVar, cpxu cpxuVar, String str) {
        List K;
        ((cotq) this.Y.b()).a(cotpVar);
        String I = I(cpxuVar);
        boolean W = W(cpxuVar);
        if (TextUtils.isEmpty(I)) {
            csjb e2 = n.e();
            e2.I("No recipient ids found using thread lookup, trying again with message lookup.");
            e2.A("threadId", cpxuVar);
            e2.r();
            K = aA(str);
            if (!K.isEmpty()) {
                ((akzt) this.Q.b()).c("Bugle.Telephony.ThreadData.Recipients.UsedMessageInsteadOfThread");
            }
        } else {
            K = K(I);
        }
        if (K.isEmpty()) {
            csjb e3 = n.e();
            e3.I("No recipients found.");
            e3.A("threadId", cpxuVar);
            e3.r();
            ((akzt) this.Q.b()).c("Bugle.Telephony.ThreadData.Recipients.Empty");
            return new cpbd(cpxv.a(cpxuVar), new ArrayList(), W);
        }
        if (((Boolean) d.e()).booleanValue() && aE(K)) {
            ((akzt) this.Q.b()).c("Bugle.Telephony.ThreadData.Recipients.EmptyRecipientString");
            engw aA = aA(str);
            int i = ((enou) aA).c;
            int size = K.size();
            boolean z = i == size;
            if (i == size) {
                K = aA;
            }
            if (aE(K)) {
                K = (engw) Collection.EL.stream(K).map(new Function() { // from class: coxm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        aoku aokuVar = (aoku) obj;
                        cfva cfvaVar = aoqm.a;
                        return cuxt.i(aokuVar.p(((Boolean) new aoqj().get()).booleanValue())) ? ((aolr) coym.this.l.b()).n("ʼUNKNOWN_SENDER!ʼ") : aokuVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.a);
            } else if (z) {
                ((akzt) this.Q.b()).c("Bugle.Telephony.ThreadData.Recipients.UsedMessageToFixEmptyRecipient");
            }
        }
        if (K.size() == 1) {
            aoku aokuVar = (aoku) K.get(0);
            cfva cfvaVar = aoqm.a;
            String k = aokuVar.k(((Boolean) new aoqj().get()).booleanValue());
            if (((ckdn) this.z.b()).f(k) || ((ckdn) this.z.b()).e(k)) {
                return ((Boolean) ((cfup) ckds.a.get()).e()).booleanValue() ? ((ckch) this.A.b()).c(cpxuVar, k, str) : ((ckds) this.y.b()).k(cpxv.a(cpxuVar), k, str);
            }
        }
        Stream map = Collection.EL.stream(K).map(new Function() { // from class: coxt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfup cfupVar = coym.d;
                cfva cfvaVar2 = aoqm.a;
                return emxe.b(((aoku) obj).k(((Boolean) new aoqj().get()).booleanValue()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = engw.d;
        long h2 = ((covs) this.B.b()).h(cotpVar, (List) map.collect(endq.a));
        if (h2 != -1) {
            cpxuVar = cpxu.b(h2);
        }
        return new cpbd(cpxv.a(cpxuVar), K, W);
    }
}
