package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.android.vcard.VCardConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyta implements dzwo {
    public static final /* synthetic */ int i = 0;
    private static final String j = "messages INNER JOIN conversations ON conversation_row_id = ".concat(dytn.b("conversations", "id"));
    public final dzja a;
    public final dzhn b;
    final long c;
    public final emxc e;
    public final dyti h;
    private final Context k;
    private final dyqy l;
    private LruCache m;
    public final engw d = engw.r(dzqm.INCOMING_RECEIVED);
    public final errl f = dyhp.b().a;
    final Executor g = new ersb(Executors.newSingleThreadExecutor());

    public dyta(Context context, dzja dzjaVar, dzhn dzhnVar, dyqy dyqyVar, dyti dytiVar, long j2, emxc emxcVar) {
        this.k = context.getApplicationContext();
        this.b = dzhnVar;
        this.l = dyqyVar;
        this.e = emxcVar;
        this.h = dytiVar;
        this.c = j2;
        this.a = dzjaVar;
    }

    private static final Pair aA(String str, dzpg dzpgVar) {
        String str2;
        String str3 = dytn.b(str, "lighter_id_normalized_id") + " =? AND " + dytn.b(str, "lighter_id_type") + " =? AND " + dytn.b(str, "lighter_id_app_name") + " =? ";
        String[] strArr = {dzpgVar.b() == dzpf.EMAIL ? dyhm.a(dzpgVar.d()) : dzpgVar.d(), Integer.toString(dzpgVar.b().f), dzpgVar.e()};
        if (dzpgVar.c().g()) {
            str2 = str3 + " AND " + dytn.b(str, "lighter_handler_id") + " =? ";
            strArr = (String[]) enoh.a(strArr, (String) dzpgVar.c().c());
        } else {
            str2 = str3 + " AND " + dytn.b(str, "lighter_handler_id") + " is NULL ";
        }
        return Pair.create(str2, strArr);
    }

    private static final String aB() {
        return "((conversations INNER JOIN contacts AS o ON owner_row_id = " + dytn.b("o", "id") + ") LEFT JOIN contacts AS c ON other_contact_row_id = " + dytn.b("c", "id") + ")";
    }

    private static final Pair aC(dzpg dzpgVar) {
        return aA("contacts", dzpgVar);
    }

    private final dywd aD(dzpt dzptVar, dzqr[] dzqrVarArr) {
        String str;
        String[] strArr;
        String[] h;
        String str2;
        int i2 = 0;
        if (dzptVar.e() == dzpq.GROUP) {
            str = "((" + j + ") LEFT JOIN contacts ON sender_contact_row_id = " + dytn.b("contacts", "id") + ")";
            strArr = new String[]{dzptVar.d().b(), dzptVar.d().a()};
            h = dytn.h(dytn.i("messages", dywp.a), dytn.i("contacts", dywi.a));
            str2 = "conversation_group_id = ? AND conversation_group_app_name = ?";
        } else {
            str = "(((" + j + ") LEFT JOIN contacts AS s ON sender_contact_row_id = " + dytn.b("s", "id") + ") INNER JOIN contacts AS o ON other_contact_row_id = " + dytn.b("o", "id") + ")";
            Pair aA = aA("o", dzptVar.c());
            String str3 = (String) aA.first;
            strArr = (String[]) aA.second;
            h = dytn.h(dytn.i("messages", dywp.a), dytn.i("s", dywi.a));
            str2 = str3;
        }
        int length = dzqrVarArr.length;
        String str4 = str2 + " AND rendering_type IN (" + TextUtils.join(", ", Collections.nCopies(2, '?')) + ")";
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 2);
        while (true) {
            int length2 = dzqrVarArr.length;
            if (i2 >= 2) {
                dywc j2 = dywd.j();
                j2.c(k(str));
                dyvs dyvsVar = (dyvs) j2;
                dyvsVar.a = engw.p(h);
                dyvsVar.b = str4;
                dyvsVar.c = engw.p(strArr2);
                dyvsVar.d = "server_timestamp_us DESC";
                j2.b(1);
                return j2.a();
            }
            strArr2[strArr.length + i2] = Integer.toString(dzqrVarArr[i2].f);
            i2++;
        }
    }

    public static final Pair am(dzxf dzxfVar) {
        String[] strArr;
        String str = "lighter_id_normalized_id =? AND lighter_id_type =? AND lighter_id_app_name =?";
        if (dzxfVar.b() == dzpq.ONE_TO_ONE) {
            dzpg c = dzxfVar.c();
            strArr = new String[]{c.b() == dzpf.EMAIL ? dyhm.a(c.d()) : c.d(), Integer.toString(((dyuc) dyue.a.fP(c.b())).g), c.e()};
            if (c.c().g()) {
                strArr = (String[]) enoh.a(strArr, (String) c.c().c());
                str = "lighter_id_normalized_id =? AND lighter_id_type =? AND lighter_id_app_name =? AND lighter_handler_id =?";
            }
        } else {
            strArr = new String[]{dzxfVar.a().b(), Integer.toString(dyuc.GROUP.g), dzxfVar.a().a()};
        }
        return Pair.create(str, strArr);
    }

    public static final boolean ao(int i2) {
        return i2 > 0;
    }

    private final long aq(String str, String str2) {
        Cursor h = this.h.h(k(str), new String[]{a.a(str2, "MAX(", ")")}, null, new String[0], null, null);
        try {
            long j2 = h.moveToFirst() ? h.getLong(0) : 0L;
            if (h != null) {
                h.close();
            }
            return j2;
        } catch (Throwable th) {
            if (h == null) {
                throw th;
            }
            try {
                h.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private final long ar(final dzpk dzpkVar) {
        return ((Long) dytm.a(this.h, new Callable() { // from class: dyrc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dzpk dzpkVar2 = dzpkVar;
                dzmw dzmwVar = (dzmw) dzpkVar2;
                dzpt dzptVar = dzmwVar.a;
                dyta dytaVar = dyta.this;
                long f = dytaVar.f(dzptVar.a());
                emxc j2 = dzmwVar.a.e() == dzpq.ONE_TO_ONE ? emxc.j(Long.valueOf(dytaVar.f(dzmwVar.a.c()))) : emux.a;
                ContentValues contentValues = new ContentValues();
                dzmv dzmvVar = new dzmv(dzpkVar2);
                dyhj.a();
                dzmvVar.g(System.currentTimeMillis());
                dzpk a = dzmvVar.a();
                contentValues.put("conversation_properties", dyuh.e(a));
                dzmw dzmwVar2 = (dzmw) a;
                contentValues.put("conversation_app_data", dyuh.d(new HashMap(dzmwVar2.i)));
                contentValues.put("conversation_type", Integer.valueOf(dzmwVar2.a.e().c));
                contentValues.put("local_update_timestamp_ms", Long.valueOf(dzmwVar2.o));
                if (dzmwVar2.a.e() == dzpq.GROUP) {
                    contentValues.put("conversation_group_id", dzmwVar2.a.d().b());
                    contentValues.put("conversation_group_app_name", dzmwVar2.a.d().a());
                }
                if (j2.g()) {
                    contentValues.put("other_contact_row_id", (Long) j2.c());
                }
                Long valueOf = Long.valueOf(f);
                contentValues.put("owner_row_id", valueOf);
                contentValues.put("update_timestamp_us", (Long) 0L);
                long c = dytaVar.h.c(dytaVar.k("conversations"), contentValues, 0);
                dytaVar.ah(1, dzmwVar2.a);
                dytaVar.M();
                ArrayList arrayList = new ArrayList();
                arrayList.add(valueOf);
                if (j2.g()) {
                    arrayList.add(j2.c());
                }
                dytaVar.D(dzmwVar2.a, c, arrayList);
                return Long.valueOf(c);
            }
        })).longValue();
    }

    private final dywd as(dzxf dzxfVar) {
        Pair am = am(dzxfVar);
        dywc j2 = dywd.j();
        j2.c(k("blocks"));
        dyvs dyvsVar = (dyvs) j2;
        dyvsVar.a = engw.p(dywg.a);
        dyvsVar.b = (String) am.first;
        dyvsVar.c = engw.p((String[]) am.second);
        dyvsVar.d = null;
        return j2.a();
    }

    private final dywd at(dzpg dzpgVar) {
        Pair aC = aC(dzpgVar);
        String str = (String) aC.first;
        String[] strArr = (String[]) aC.second;
        dywc j2 = dywd.j();
        j2.c(k("contacts"));
        dyvs dyvsVar = (dyvs) j2;
        dyvsVar.a = engw.p(dywi.a);
        dyvsVar.b = str;
        dyvsVar.c = engw.p(strArr);
        dyvsVar.d = null;
        return j2.a();
    }

    private final dywd au(dzpt dzptVar) {
        String[] strArr;
        String str;
        if (dzptVar.e() == dzpq.GROUP) {
            strArr = new String[]{String.valueOf(dzpq.GROUP.c), dzptVar.d().b(), dzptVar.d().a()};
            str = "conversation_type = ? AND conversation_group_id = ? AND conversation_group_app_name = ?";
        } else {
            Pair aA = aA("c", dzptVar.c());
            String valueOf = String.valueOf((String) aA.first);
            String[] strArr2 = (String[]) enoh.b(new String[]{String.valueOf(dzpq.ONE_TO_ONE.c)}, (String[]) aA.second, String.class);
            String concat = "conversation_type = ?AND ".concat(valueOf);
            strArr = strArr2;
            str = concat;
        }
        Pair create = Pair.create(str, strArr);
        String str2 = (String) create.first;
        String[] strArr3 = (String[]) create.second;
        String aB = aB();
        String[] h = dytn.h(dytn.i("conversations", dywm.b), dytn.i("o", dywi.a), dytn.i("c", dywi.a));
        dywc j2 = dywd.j();
        j2.c(k(aB));
        engw p = engw.p(h);
        dyvs dyvsVar = (dyvs) j2;
        dyvsVar.a = p;
        dyvsVar.b = str2;
        dyvsVar.c = engw.p(strArr3);
        dyvsVar.d = null;
        return j2.a();
    }

    private final synchronized dzwu av(dywd dywdVar) {
        LruCache lruCache = this.m;
        if (lruCache != null) {
            return (dzwu) lruCache.get(dywdVar);
        }
        synchronized (this) {
            int a = (int) fdpn.a();
            if (this.m == null && a > 0) {
                this.m = new LruCache(a);
            }
        }
        return null;
    }

    private final dzwu aw(final dywd dywdVar, final Context context, final emwl emwlVar, final Uri uri) {
        dzwu dzwuVar;
        Exception exc;
        Callable callable = new Callable() { // from class: dyrt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new dywa(context, emwlVar, dyta.this.h, uri, dywdVar);
            }
        };
        dzwu av = av(dywdVar);
        if (av != null) {
            return av;
        }
        try {
            dzwuVar = (dzwu) callable.call();
        } catch (Exception e) {
            dzwuVar = av;
            exc = e;
        }
        try {
            ay(dywdVar, dzwuVar);
            return dzwuVar;
        } catch (Exception e2) {
            exc = e2;
            dyhr.d("SQLiteMessagingStore", "Error creating monitor", exc);
            return dzwuVar;
        }
    }

    private final Object ax(dywd dywdVar, emwl emwlVar) {
        dyvt dyvtVar = (dyvt) dywdVar;
        engw engwVar = dyvtVar.b;
        String[] strArr = engwVar == null ? null : (String[]) engwVar.toArray(new String[((enou) engwVar).c]);
        engw engwVar2 = dyvtVar.d;
        String[] strArr2 = engwVar2 != null ? (String[]) engwVar2.toArray(new String[((enou) engwVar2).c]) : null;
        int i2 = dyvtVar.f;
        int i3 = dytn.a;
        Cursor h = this.h.h(dyvtVar.a, strArr, dyvtVar.c, strArr2, dyvtVar.e, "0, " + (i2 >= 0 ? String.valueOf(i2) : "2147483647"));
        try {
            dyhr.a("SQLiteMessagingStore", "Reading query result with the given cursor reader");
            Object apply = emwlVar.apply(h);
            if (h != null) {
                h.close();
            }
            return apply;
        } finally {
        }
    }

    private final synchronized void ay(dywd dywdVar, dzwu dzwuVar) {
        LruCache lruCache = this.m;
        if (lruCache != null) {
            lruCache.put(dywdVar, dzwuVar);
            return;
        }
        int a = (int) fdpn.a();
        if (this.m != null || a <= 0) {
            return;
        }
        LruCache lruCache2 = new LruCache(a);
        this.m = lruCache2;
        lruCache2.put(dywdVar, dzwuVar);
    }

    private final void az(final dzqs dzqsVar, final boolean z) {
        int i2 = ((dznm) dzqsVar).r;
        final ContentValues j2 = j(dzqsVar);
        if (i2 == 1) {
            j2.put("needs_delivery_receipt", (Boolean) true);
        } else {
            j2.put("needs_delivery_receipt", (Boolean) false);
        }
        dytm.b(this.h, new Runnable() { // from class: dyrd
            /* JADX WARN: Code restructure failed: missing block: B:10:0x005e, code lost:
            
                if (r5 != null) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
            
                r5.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x007e, code lost:
            
                if (r4.h.c(r4.k("messages"), r2, 5) < 0) goto L35;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
            
                r4.Q(r1.a);
                r4.K(r1.c);
                r2 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
            
                if (r0 == null) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0093, code lost:
            
                if (r0.equals(r1.g) != false) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
            
                r6 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
            
                if (r4.d.contains(r1.g) != false) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
            
                if (r6 == false) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
            
                if (r4.d.contains(r0) == false) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00b3, code lost:
            
                r4.R(r0);
                r4.ap(r1.c);
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
            
                r4.P(r1.c);
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
            
                if (r2 == false) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
            
                r4.R(r1.g);
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
            
                r2 = r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
            
                throw new android.database.sqlite.SQLiteException("Failed to save message.");
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
            
                if (r5 != null) goto L12;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r12 = this;
                    boolean r0 = r3
                    dzqs r1 = r2
                    if (r0 == 0) goto L14
                    r0 = r1
                    dznm r0 = (defpackage.dznm) r0
                    long r2 = r0.d
                    java.lang.Long r0 = java.lang.Long.valueOf(r2)
                    emxc r0 = defpackage.emxc.j(r0)
                    goto L16
                L14:
                    emux r0 = defpackage.emux.a
                L16:
                    android.content.ContentValues r2 = r4
                    dznm r1 = (defpackage.dznm) r1
                    dzpt r3 = r1.c
                    dyta r4 = defpackage.dyta.this
                    long r5 = r4.h(r3, r0)
                    java.lang.Long r0 = java.lang.Long.valueOf(r5)
                    java.lang.String r3 = "conversation_row_id"
                    r2.put(r3, r0)
                    dzpg r0 = r1.b
                    long r5 = r4.f(r0)
                    java.lang.Long r0 = java.lang.Long.valueOf(r5)
                    java.lang.String r3 = "sender_contact_row_id"
                    r2.put(r3, r0)
                    java.lang.String r0 = r1.a
                    java.lang.String r3 = "messages"
                    android.net.Uri r6 = r4.k(r3)
                    java.lang.String r5 = "message_status"
                    java.lang.String[] r7 = new java.lang.String[]{r5}
                    java.lang.String[] r9 = new java.lang.String[]{r0}
                    dyti r5 = r4.h
                    r10 = 0
                    r11 = 0
                    java.lang.String r8 = "message_id = ?"
                    android.database.Cursor r5 = r5.h(r6, r7, r8, r9, r10, r11)
                    boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> Lc9
                    r6 = 0
                    if (r0 != 0) goto L64
                    r0 = 0
                    if (r5 == 0) goto L6f
                L60:
                    r5.close()
                    goto L6f
                L64:
                    int r0 = r5.getInt(r6)     // Catch: java.lang.Throwable -> Lc9
                    dzqm r0 = defpackage.dzqm.a(r0)     // Catch: java.lang.Throwable -> Lc9
                    if (r5 == 0) goto L6f
                    goto L60
                L6f:
                    dyti r5 = r4.h
                    android.net.Uri r3 = r4.k(r3)
                    r7 = 5
                    long r2 = r5.c(r3, r2, r7)
                    r7 = 0
                    int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                    if (r2 < 0) goto Lc1
                    java.lang.String r2 = r1.a
                    r4.Q(r2)
                    dzpt r2 = r1.c
                    r4.K(r2)
                    r2 = 1
                    if (r0 == 0) goto L96
                    dzqm r3 = r1.g
                    boolean r3 = r0.equals(r3)
                    if (r3 != 0) goto L96
                    r6 = r2
                L96:
                    engw r3 = r4.d
                    dzqm r5 = r1.g
                    boolean r3 = r3.contains(r5)
                    if (r3 != 0) goto Lab
                    if (r6 == 0) goto Lbb
                    engw r3 = r4.d
                    boolean r3 = r3.contains(r0)
                    if (r3 == 0) goto Lb3
                    goto Lac
                Lab:
                    r2 = r6
                Lac:
                    dzpt r3 = r1.c
                    r4.P(r3)
                    if (r2 == 0) goto Lbb
                Lb3:
                    r4.R(r0)
                    dzpt r0 = r1.c
                    r4.ap(r0)
                Lbb:
                    dzqm r0 = r1.g
                    r4.R(r0)
                    return
                Lc1:
                    android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
                    java.lang.String r1 = "Failed to save message."
                    r0.<init>(r1)
                    throw r0
                Lc9:
                    r0 = move-exception
                    r1 = r0
                    if (r5 == 0) goto Ld5
                    r5.close()     // Catch: java.lang.Throwable -> Ld1
                    goto Ld5
                Ld1:
                    r0 = move-exception
                    r1.addSuppressed(r0)
                Ld5:
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dyrd.run():void");
            }
        });
    }

    public static ContentValues j(dzqs dzqsVar) {
        ContentValues contentValues = new ContentValues();
        dznm dznmVar = (dznm) dzqsVar;
        contentValues.put("message_id", dznmVar.a);
        contentValues.put("message_type", Integer.valueOf(dznmVar.r - 1));
        contentValues.put("message_status", Integer.valueOf(dznmVar.g.p));
        contentValues.put("server_timestamp_us", Long.valueOf(dznmVar.d));
        contentValues.put("capability", Integer.valueOf(dznmVar.j));
        contentValues.put("rendering_type", Integer.valueOf(dznmVar.k.a().f));
        contentValues.put("filterable_flags", Integer.valueOf(dznmVar.m));
        try {
            contentValues.put("message_properties", dyhu.i(dyuq.b(dzqsVar)));
            return contentValues;
        } catch (IOException e) {
            dyhr.d("SQLiteMessagingStore", "Failed to serialize message profile.", e);
            throw new SQLiteException("Fali to serialize message profile", e);
        }
    }

    @Override // defpackage.dzwo
    public final engw A(final dzpt dzptVar, final dzqm dzqmVar, final dzqm dzqmVar2) {
        if (!dzqmVar.equals(dzqmVar2)) {
            return (engw) dytm.a(this.h, new Callable() { // from class: dyru
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ContentValues contentValues = new ContentValues();
                    dzqm dzqmVar3 = dzqmVar2;
                    contentValues.put("message_status", Integer.valueOf(dzqmVar3.p));
                    dyta dytaVar = dyta.this;
                    dzpt dzptVar2 = dzptVar;
                    String l = Long.toString(dytaVar.c(dzptVar2));
                    dzqm dzqmVar4 = dzqmVar;
                    String[] strArr = {l, Integer.toString(dzqmVar4.p)};
                    int i2 = engw.d;
                    engr engrVar = new engr();
                    Cursor h = dytaVar.h.h(dytaVar.k("messages"), new String[]{"message_id"}, "conversation_row_id = ? AND message_status = ?", strArr, null, null);
                    try {
                        if (h.moveToFirst()) {
                            dytaVar.h.b(dytaVar.k("messages"), contentValues, "conversation_row_id = ? AND message_status = ?", strArr);
                            do {
                                String string = h.getString(0);
                                engrVar.h(string);
                                dytaVar.Q(string);
                                dytaVar.ap(dzptVar2);
                            } while (h.moveToNext());
                            dytaVar.Z(dzptVar2);
                            if (dytaVar.d.contains(dzqmVar3) || dytaVar.d.contains(dzqmVar4)) {
                                dytaVar.P(dzptVar2);
                            }
                            dytaVar.K(dzptVar2);
                            dytaVar.R(dzqmVar4);
                            dytaVar.R(dzqmVar3);
                        }
                        engw g = engrVar.g();
                        if (h != null) {
                            h.close();
                        }
                        return g;
                    } catch (Throwable th) {
                        if (h == null) {
                            throw th;
                        }
                        try {
                            h.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
            });
        }
        int i2 = engw.d;
        return enou.a;
    }

    @Override // defpackage.dzwo
    public final enhk B(long j2) {
        final String[] strArr = {"1", Long.toString(j2)};
        return (enhk) dytm.a(this.h, new Callable() { // from class: dyrx
            public final /* synthetic */ String b = "needs_delivery_receipt = ? AND server_timestamp_us > ?";

            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                dyta dytaVar = dyta.this;
                String str = this.b;
                String[] strArr2 = strArr;
                Cursor h = dytaVar.h.h(dytaVar.k("messages"), new String[]{"message_id", "conversation_row_id"}, str, strArr2, null, null);
                try {
                    if (h.moveToFirst()) {
                        do {
                            long j3 = h.getLong(1);
                            String string = h.getString(0);
                            Long valueOf = Long.valueOf(j3);
                            if (!hashMap2.containsKey(valueOf)) {
                                hashMap2.put(valueOf, new ArrayList());
                            }
                            ((List) hashMap2.get(valueOf)).add(string);
                        } while (h.moveToNext());
                    }
                    if (h != null) {
                        h.close();
                    }
                    for (Long l : hashMap2.keySet()) {
                        emxc r = dytaVar.r(l.longValue());
                        for (String str2 : (List) hashMap2.get(l)) {
                            if (r.g()) {
                                if (!hashMap.containsKey(((dzmw) r.c()).a)) {
                                    hashMap.put(((dzmw) r.c()).a, new ArrayList());
                                }
                                ((List) hashMap.get(((dzmw) r.c()).a)).add(str2);
                            } else {
                                dyhr.f("SQLiteMessagingStore", "Conversation decoding failed");
                            }
                        }
                    }
                    enhd enhdVar = new enhd();
                    for (dzpt dzptVar : hashMap.keySet()) {
                        enhdVar.k(dzptVar, engw.n((Collection) hashMap.get(dzptVar)));
                    }
                    return enhdVar.c();
                } catch (Throwable th) {
                    if (h == null) {
                        throw th;
                    }
                    try {
                        h.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
        });
    }

    @Override // defpackage.dzwo
    public final void C(final dzpt dzptVar, final List list) {
        dytm.b(this.h, new Runnable() { // from class: dyrh
            @Override // java.lang.Runnable
            public final void run() {
                dyta dytaVar = dyta.this;
                dzpt dzptVar2 = dzptVar;
                long c = dytaVar.c(dzptVar2);
                if (c == -1) {
                    dyhr.c("SQLiteMessagingStore", "Could not find conversation with the given id.");
                    return;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(dytaVar.f((dzpg) it.next())));
                }
                dytaVar.D(dzptVar2, c, arrayList);
            }
        });
    }

    public final void D(final dzpt dzptVar, final long j2, final List list) {
        dytm.b(this.h, new Runnable() { // from class: dyrz
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = list.iterator();
                while (true) {
                    dyta dytaVar = dyta.this;
                    if (!it.hasNext()) {
                        dytaVar.O(dzptVar);
                        return;
                    }
                    long j3 = j2;
                    Long l = (Long) it.next();
                    l.longValue();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("conversation_row_id", Long.valueOf(j3));
                    contentValues.put("contact_row_id", l);
                    dytaVar.h.c(dytaVar.k("participants"), contentValues, 5);
                }
            }
        });
    }

    @Override // defpackage.dzwo
    public final void E(final dzpt dzptVar) {
        dytm.b(this.h, new Runnable() { // from class: dyry
            @Override // java.lang.Runnable
            public final void run() {
                dzpt dzptVar2 = dzptVar;
                emxc f = dzptVar2.f();
                if (!f.g()) {
                    dyhr.f("SQLiteMessagingStore", "Failed converting conversationId to json: ".concat(String.valueOf(String.valueOf(dzptVar2))));
                    return;
                }
                dyta dytaVar = dyta.this;
                if (dytaVar.h.a(dytaVar.k("deleted_conversations"), "conversation_id_string = ?", new String[]{((JSONObject) f.c()).toString()}) < 0) {
                    dyhr.c("SQLiteMessagingStore", "Failed to delete from deleted_conversations table.");
                }
            }
        });
    }

    @Override // defpackage.dzwo
    public final void F(final dzpt dzptVar, final long j2) {
        final long c = c(dzptVar);
        final String valueOf = String.valueOf(c);
        Integer[] numArr = {Integer.valueOf(dzqm.OUTGOING_PENDING_SEND.p), Integer.valueOf(dzqm.OUTGOING_SENDING.p)};
        Integer[] numArr2 = {Integer.valueOf(dzqm.OUTGOING_FAILED_SEND.p), Integer.valueOf(dzqm.LOCAL.p)};
        final String str = "conversation_row_id = ?  AND server_timestamp_us <= ? AND message_status NOT IN (" + TextUtils.join(", ", numArr) + ")";
        final String[] strArr = {valueOf, String.valueOf(j2)};
        final String str2 = "conversation_row_id = ?  AND message_status IN ( " + TextUtils.join(", ", numArr2) + ") ";
        final String[] strArr2 = {valueOf};
        dytm.b(this.h, new Runnable() { // from class: dyro
            @Override // java.lang.Runnable
            public final void run() {
                dyta dytaVar = dyta.this;
                int a = dytaVar.h.a(dytaVar.k("messages"), str, strArr) + dytaVar.h.a(dytaVar.k("messages"), str2, strArr2);
                dytaVar.Y(c);
                String str3 = valueOf;
                Cursor h = dytaVar.h.h(dytaVar.k("messages"), new String[]{"message_id"}, "conversation_row_id = ?", new String[]{str3}, null, "1");
                try {
                    if (!h.moveToFirst()) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("update_timestamp_us", (Long) (-1L));
                        dytaVar.h.b(dytaVar.k("conversations"), contentValues, "id = ?", new String[]{String.valueOf(str3)});
                    }
                    if (h != null) {
                        h.close();
                    }
                    h = dytaVar.h.h(dytaVar.k("conversations"), new String[]{"last_deleted_timestamp_us"}, "id = ?", new String[]{str3}, null, null);
                    try {
                        if (h.moveToFirst()) {
                            long j3 = h.getLong(0);
                            long j4 = j2;
                            if (j3 < j4) {
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("last_deleted_timestamp_us", Long.valueOf(j4));
                                dytaVar.h.b(dytaVar.k("conversations"), contentValues2, "id = ?", new String[]{String.valueOf(str3)});
                            }
                        }
                        if (h != null) {
                            h.close();
                        }
                        dzpt dzptVar2 = dzptVar;
                        dytaVar.K(dzptVar2);
                        dytaVar.M();
                        dytaVar.ah(a, dzptVar2);
                    } finally {
                    }
                } finally {
                }
            }
        });
    }

    @Override // defpackage.dzwo
    public final void G() {
        try {
            final SQLiteDatabase writableDatabase = this.l.getWritableDatabase();
            writableDatabase.setForeignKeyConstraintsEnabled(false);
            final Runnable runnable = new Runnable() { // from class: dyrf
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = dyta.i;
                    dytn.d(writableDatabase);
                }
            };
            Callable callable = new Callable() { // from class: dytl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    runnable.run();
                    return null;
                }
            };
            dyhw.b();
            try {
                try {
                    writableDatabase.beginTransaction();
                    callable.call();
                    writableDatabase.setTransactionSuccessful();
                    if (writableDatabase.inTransaction()) {
                        writableDatabase.endTransaction();
                    }
                    writableDatabase.setForeignKeyConstraintsEnabled(true);
                } catch (Exception e) {
                    throw new dytj(e);
                }
            } catch (Throwable th) {
                if (writableDatabase.inTransaction()) {
                    writableDatabase.endTransaction();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            dyhr.d("SQLiteMessagingStore", "Unable to get writable database due to ", e2);
        }
    }

    @Override // defpackage.dzwo
    public final void H(final dzpt dzptVar, final List list) {
        dytm.b(this.h, new Runnable() { // from class: dysu
            @Override // java.lang.Runnable
            public final void run() {
                final dyta dytaVar = dyta.this;
                final dzpt dzptVar2 = dzptVar;
                final long c = dytaVar.c(dzptVar2);
                if (c == -1) {
                    dyhr.c("SQLiteMessagingStore", "Could not find conversation with the given id.");
                    return;
                }
                List list2 = list;
                final ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    long b = dytaVar.b((dzpg) it.next());
                    if (b != -1) {
                        arrayList.add(Long.valueOf(b));
                    }
                }
                dytm.b(dytaVar.h, new Runnable() { // from class: dysh
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            dyta dytaVar2 = dyta.this;
                            if (!it2.hasNext()) {
                                dytaVar2.O(dzptVar2);
                                return;
                            }
                            long j2 = c;
                            long longValue = ((Long) it2.next()).longValue();
                            if (dytaVar2.h.a(dytaVar2.k("participants"), "conversation_row_id =? AND contact_row_id =?", new String[]{Long.toString(j2), Long.toString(longValue)}) < 0) {
                                dyhr.c("SQLiteMessagingStore", a.D(j2, longValue, "Failed to kick participant,  Contact Row ID: ", " from Conversation Row ID: "));
                            }
                        }
                    }
                });
            }
        });
    }

    @Override // defpackage.dzwo
    public final void I(List list) {
        final ContentValues contentValues = new ContentValues();
        int i2 = 0;
        contentValues.put("needs_delivery_receipt", (Boolean) false);
        while (i2 < list.size()) {
            int min = Math.min(i2 + 998, list.size());
            List subList = list.subList(i2, min);
            final String[] strArr = new String[subList.size()];
            final String a = a.a(dytn.c(subList.size()), "message_id IN (", ")");
            subList.toArray(strArr);
            dytm.b(this.h, new Runnable() { // from class: dyrv
                @Override // java.lang.Runnable
                public final void run() {
                    dyta dytaVar = dyta.this;
                    dytaVar.h.b(dytaVar.k("messages"), contentValues, a, strArr);
                }
            });
            i2 = min;
        }
    }

    public final void J(int i2, dzpb dzpbVar) {
        dzms dzmsVar = (dzms) dzpbVar;
        dywe.a().b(dywb.b(this.c, dzmsVar.a));
        if (fdpk.b()) {
            dzpg dzpgVar = dzmsVar.a;
            dyhr.a("SQLiteMessagingStore", "Sending one to one conversation profile updated event");
            String aB = aB();
            Pair aA = aA("c", dzpgVar);
            String valueOf = String.valueOf((String) aA.first);
            Cursor h = this.h.h(k(aB), dytn.h(dytn.i("conversations", dywm.b), dytn.i("o", dywi.a), dytn.i("c", dywi.a)), "conversation_type = ?AND ".concat(valueOf), (String[]) enoh.b(new String[]{String.valueOf(dzpq.ONE_TO_ONE.c)}, (String[]) aA.second, String.class), null, null);
            try {
                final emxc a = dyuh.a(h);
                if (h != null) {
                    h.close();
                }
                if (!a.g() || dyjq.b((dzpk) a.c())) {
                    dyhr.a("SQLiteMessagingStore", "one to one conversation profile no need to update");
                    ListenableFuture listenableFuture = erre.a;
                } else {
                    dzhn dzhnVar = this.b;
                    dzhl m = m();
                    m.d(((dzmw) a.c()).a);
                    m.g(90);
                    m.f(493);
                    dzhnVar.b(m.a());
                    ernq.f(erqt.l(new Runnable() { // from class: dyrq
                        /* JADX WARN: Type inference failed for: r2v2, types: [dyix, java.lang.Object] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            dzpt dzptVar = ((dzmw) a.c()).a;
                            dyta dytaVar = dyta.this;
                            ((emxn) dytaVar.e).a.b(dytaVar.a, dzptVar);
                        }
                    }, this.g), Exception.class, new emwl() { // from class: dyrr
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            dyhr.b("SQLiteMessagingStore", "One to one conversation profile updated event receiver throws exception", (Exception) obj);
                            dyta dytaVar = dyta.this;
                            dzhl m2 = dytaVar.m();
                            m2.d(((dzmw) a.c()).a);
                            m2.g(90);
                            m2.f(494);
                            dytaVar.b.b(m2.a());
                            return null;
                        }
                    }, this.f);
                }
            } finally {
            }
        }
        final dzpg dzpgVar2 = dzmsVar.a;
        dyhr.a("SQLiteMessagingStore", "Sending contact updated event");
        if (!ao(i2)) {
            dyhr.a("SQLiteMessagingStore", "Contact updated event is not sent");
            ListenableFuture listenableFuture2 = erre.a;
            return;
        }
        dzhn dzhnVar2 = this.b;
        dzhl m2 = m();
        m2.c(dzpgVar2);
        m2.g(90);
        m2.f(499);
        dzhnVar2.b(m2.a());
        ernq.f(erqt.l(new Runnable() { // from class: dysw
            /* JADX WARN: Type inference failed for: r0v3, types: [dyix, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                ((emxn) dyta.this.e).a.c();
            }
        }, this.f), Exception.class, new emwl() { // from class: dysx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dyhr.b("SQLiteMessagingStore", "Contact updated event receiver throws exception", (Exception) obj);
                dyta dytaVar = dyta.this;
                dzhl m3 = dytaVar.m();
                m3.c(dzpgVar2);
                m3.g(90);
                m3.f(500);
                dytaVar.b.b(m3.a());
                return null;
            }
        }, this.f);
    }

    public final void K(dzpt dzptVar) {
        ag(dzptVar);
        N(dzptVar);
    }

    public final void L(dzpt dzptVar) {
        dywe.a().b(dywb.c(this.c, dzptVar));
    }

    public final void M() {
        dywe.a().b(dywb.f("conversations", "REGISTRATION", String.valueOf(this.c), "CONVERSATION_LIST_PATH"));
    }

    public final void N(dzpt dzptVar) {
        dywe.a().b(dywb.d(this.c, dzptVar));
    }

    public final void O(dzpt dzptVar) {
        dywe.a().b(dywb.e(this.c, dzptVar));
    }

    public final void P(dzpt dzptVar) {
        dywe.a().b(dywb.f("messages", "REGISTRATION", String.valueOf(this.c), "UNREAD_COUNT_FOR_CONVERSATION_PATH", String.valueOf(dzptVar.hashCode())));
    }

    public final void Q(String str) {
        dywe.a().b(dywb.f("messages", "REGISTRATION", String.valueOf(this.c), "MESSAGES_PATH", String.valueOf(str)));
    }

    public final void R(dzqm dzqmVar) {
        dywe.a().b(dywb.f("messages", "REGISTRATION", String.valueOf(this.c), "MESSAGES_STATUS_COUNT_FOR_ACCOUNT_PATH", String.valueOf(dzqmVar)));
    }

    public final void S(final dzxf dzxfVar, final boolean z) {
        dytm.b(this.h, new Runnable() { // from class: dyse
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                dzxf dzxfVar2 = dzxfVar;
                final boolean z2 = z;
                final dyta dytaVar = dyta.this;
                if (z2) {
                    dyti dytiVar = dytaVar.h;
                    Uri k = dytaVar.k("blocks");
                    ContentValues contentValues = new ContentValues();
                    if (dzxfVar2.b() == dzpq.ONE_TO_ONE) {
                        dyuc dyucVar = (dyuc) dyue.a.fP(dzxfVar2.c().b());
                        contentValues.put("lighter_id_id", dzxfVar2.c().d());
                        contentValues.put("lighter_id_normalized_id", dyucVar == dyuc.EMAIL ? dyhm.a(dzxfVar2.c().d()) : dzxfVar2.c().d());
                        contentValues.put("lighter_id_type", Integer.valueOf(dyucVar.g));
                        contentValues.put("lighter_handler_id", (String) dzxfVar2.c().c().e(""));
                        contentValues.put("lighter_id_app_name", dzxfVar2.c().e());
                    } else {
                        contentValues.put("lighter_id_type", Integer.toString(dyuc.GROUP.g));
                        contentValues.put("lighter_id_id", dzxfVar2.a().b());
                        contentValues.put("lighter_id_normalized_id", dzxfVar2.a().b());
                        contentValues.put("lighter_id_app_name", dzxfVar2.a().a());
                        contentValues.put("lighter_handler_id", "");
                    }
                    if (dytiVar.c(k, contentValues, 5) <= 0) {
                        return;
                    }
                } else {
                    Pair am = dyta.am(dzxfVar2);
                    if (dytaVar.h.a(dytaVar.k("blocks"), (String) am.first, (String[]) am.second) <= 0) {
                        return;
                    }
                }
                ArrayList<dzpt> arrayList = new ArrayList();
                engw g = dytaVar.a.c().g();
                int i2 = ((enou) g).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    dzpg dzpgVar = (dzpg) g.get(i3);
                    dzin dzinVar = new dzin();
                    dzinVar.c(dzpgVar);
                    if (dzxfVar2.b() == dzpq.ONE_TO_ONE) {
                        dzinVar.e(dzxfVar2.c());
                    } else {
                        dzinVar.d(dzxfVar2.a());
                    }
                    dzpt a = dzinVar.a();
                    if (dytaVar.c(a) != -1) {
                        arrayList.add(a);
                    }
                }
                for (final dzpt dzptVar : arrayList) {
                    dytaVar.Z(dzptVar);
                    dyhr.a("SQLiteMessagingStore", "Sending block status updated event");
                    dzhn dzhnVar = dytaVar.b;
                    dzhl m = dytaVar.m();
                    m.d(dzptVar);
                    m.g(90);
                    m.f(495);
                    dzhnVar.b(m.a());
                    ernq.f(erqt.l(new Runnable() { // from class: dysp
                        /* JADX WARN: Type inference failed for: r0v3, types: [dyix, java.lang.Object] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((emxn) dyta.this.e).a.d(dzptVar, z2);
                        }
                    }, dytaVar.g), Exception.class, new emwl() { // from class: dysq
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            dyhr.b("SQLiteMessagingStore", "Block status event receiver throws exception", (Exception) obj);
                            dyta dytaVar2 = dyta.this;
                            dzhl m2 = dytaVar2.m();
                            m2.d(dzptVar);
                            m2.g(90);
                            m2.f(496);
                            dytaVar2.b.b(m2.a());
                            return null;
                        }
                    }, dytaVar.f);
                }
                dywe.a().b(dywb.a(dytaVar.c, dzxfVar2));
            }
        });
    }

    @Override // defpackage.dzwo
    public final void T(final List list) {
        dytm.b(this.h, new Runnable() { // from class: dysl
            /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
            
                if (r3.hasNext() == false) goto L55;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
            
                r0.S((defpackage.dzxf) r3.next(), true);
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
            
                r2 = r0.h.h(r0.k("blocks"), defpackage.dywg.a, "id <= ?", new java.lang.String[]{java.lang.Long.toString(r6)}, null, null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
            
                if (r2.moveToNext() == false) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
            
                if (defpackage.dyuc.a(r2.getInt(defpackage.dywf.a(2))) != defpackage.dyuc.GROUP) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
            
                r3 = new defpackage.dzip();
                r3.c(r2.getString(defpackage.dywf.a(3)));
                r3.b(r2.getString(defpackage.dywf.a(5)));
                r4 = new defpackage.dzxb(r3.a());
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00f4, code lost:
            
                r0.S(r4, false);
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
            
                r4 = new defpackage.dzil();
                r4.c(r2.getString(defpackage.dywf.a(3)));
                r4.e((defpackage.dzpf) defpackage.dyue.a.m().fP(defpackage.dyuc.a(r2.getInt(defpackage.dywf.a(2)))));
                r4.d(r2.getString(defpackage.dywf.a(5)));
                r3 = r2.getString(defpackage.dywf.a(4));
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00e6, code lost:
            
                if (android.text.TextUtils.isEmpty(r3) != false) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00e8, code lost:
            
                r4.b(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00eb, code lost:
            
                r4 = new defpackage.dzxc(r4.a());
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00f9, code lost:
            
                if (r2 == null) goto L59;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00fb, code lost:
            
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00fe, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00ff, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0032, code lost:
            
                if (r3 != null) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
            
                if (r3 != null) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
            
                r3.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
            
                r3 = r2.iterator();
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 281
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dysl.run():void");
            }
        });
    }

    @Override // defpackage.dzwo
    public final void U(final dzpt dzptVar, final dzoy... dzoyVarArr) {
        dytm.b(this.h, new Runnable() { // from class: dyrn
            @Override // java.lang.Runnable
            public final void run() {
                dyta dytaVar = dyta.this;
                dzpt dzptVar2 = dzptVar;
                long h = dytaVar.h(dzptVar2, emux.a);
                int i2 = 0;
                boolean z = false;
                long j2 = 0;
                while (true) {
                    dzoy[] dzoyVarArr2 = dzoyVarArr;
                    if (i2 >= dzoyVarArr2.length) {
                        dytaVar.ag(dzptVar2);
                        if (z) {
                            dytaVar.P(dzptVar2);
                        }
                        dytaVar.h(dzptVar2, emxc.j(Long.valueOf(j2)));
                        return;
                    }
                    dzoy dzoyVar = dzoyVarArr2[i2];
                    dzqs a = dzoyVar.a();
                    dznm dznmVar = (dznm) a;
                    long j3 = dznmVar.d;
                    if (j2 < j3) {
                        j2 = j3;
                    }
                    ContentValues j4 = dyta.j(a);
                    j4.put("needs_delivery_receipt", (Boolean) dzoyVar.b().e(false));
                    j4.put("conversation_row_id", Long.valueOf(h));
                    j4.put("sender_contact_row_id", Long.valueOf(dytaVar.f(dznmVar.b)));
                    if (dytaVar.h.c(dytaVar.k("messages"), j4, 5) < 0) {
                        throw new SQLiteException("Failed to save message.");
                    }
                    dytaVar.Q(dznmVar.a);
                    dytaVar.N(dznmVar.c);
                    z |= dytaVar.d.contains(dznmVar.g);
                    if (dzoyVar.c().g()) {
                        dyhr.a("SQLiteMessagingStore", "Saving suggestion list for cloud message");
                        dytaVar.l((dzsc) dzoyVar.c().c());
                    }
                    i2++;
                }
            }
        });
    }

    @Override // defpackage.dzwo
    public final void V(dzqs dzqsVar) {
        az(dzqsVar, true);
    }

    @Override // defpackage.dzwo
    public final void W(dzqs dzqsVar) {
        az(dzqsVar, false);
    }

    public final void X(long j2, Long l) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("update_timestamp_us", l);
        if (this.h.b(k("conversations"), contentValues, "id = ?", new String[]{String.valueOf(j2)}) < 0) {
            throw new SQLiteException("Failed to update conversation.");
        }
        M();
    }

    public final void Y(long j2) {
        ContentValues contentValues = new ContentValues();
        dyhj.a();
        contentValues.put("local_update_timestamp_ms", Long.valueOf(System.currentTimeMillis()));
        if (this.h.b(k("conversations"), contentValues, "id = ?", new String[]{String.valueOf(j2)}) < 0) {
            throw new SQLiteException("Failed to update conversation local update timestamp.");
        }
    }

    public final void Z(dzpt dzptVar) {
        Y(c(dzptVar));
    }

    @Override // defpackage.dzwo
    public final int a(long j2, long j3) {
        if (j2 >= j3) {
            dyhr.c("SQLiteMessagingStore", " Delete message in range not possible. Invalid time range.");
            return 0;
        }
        final String str = "message_status NOT IN (" + TextUtils.join(", ", new Integer[]{Integer.valueOf(dzqm.OUTGOING_PENDING_SEND.p), Integer.valueOf(dzqm.OUTGOING_SENDING.p), Integer.valueOf(dzqm.OUTGOING_FAILED_SEND.p)}) + ") AND server_timestamp_us BETWEEN ? AND ? ";
        final String[] strArr = {String.valueOf(j2), String.valueOf(j3)};
        return ((Integer) dytm.a(this.h, new Callable() { // from class: dysi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dyta dytaVar = dyta.this;
                int a = dytaVar.h.a(dytaVar.k("messages"), str, strArr);
                dytaVar.M();
                return Integer.valueOf(a);
            }
        })).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dzwo
    public final void aa(final engw engwVar) {
        if (engwVar.isEmpty()) {
            return;
        }
        enhd enhdVar = new enhd();
        final HashSet hashSet = new HashSet();
        int i2 = ((enou) engwVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            dzqs dzqsVar = (dzqs) engwVar.get(i3);
            ContentValues contentValues = new ContentValues();
            try {
                byte[] i4 = dyhu.i(dyuq.b(dzqsVar));
                contentValues.put("rendering_type", Integer.valueOf(dzqsVar.j().a().f));
                contentValues.put("message_properties", i4);
                contentValues.put("capability", Integer.valueOf(dzqsVar.a()));
                enhdVar.k(dzqsVar.r(), contentValues);
            } catch (IOException unused) {
                dyhr.c("SQLiteMessagingStore", "Could not update message properties in database due to serialization error.");
            }
        }
        final enhk c = enhdVar.c();
        dytm.b(this.h, new Runnable() { // from class: dyrk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Set set;
                dyta dytaVar;
                int i5 = 0;
                while (true) {
                    engw engwVar2 = engwVar;
                    set = hashSet;
                    dytaVar = dyta.this;
                    if (i5 >= ((enou) engwVar2).c) {
                        break;
                    }
                    enhk enhkVar = c;
                    dzqs dzqsVar2 = (dzqs) engwVar2.get(i5);
                    dytaVar.h.b(dytaVar.k("messages"), (ContentValues) enhkVar.get(dzqsVar2.r()), "message_id = ?", new String[]{dzqsVar2.r()});
                    dytaVar.Q(dzqsVar2.r());
                    set.add(dzqsVar2.f());
                    i5++;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    dytaVar.K((dzpt) it.next());
                }
            }
        });
    }

    @Override // defpackage.dzwo
    public final void ab(List list, dzqm dzqmVar, dzqm dzqmVar2) {
        if (list.isEmpty() || dzqmVar.equals(dzqmVar2)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((dzqs) it.next()).r());
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("message_status", Integer.valueOf(dzqmVar2.p));
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int min = Math.min(i2 + 997, arrayList.size());
            final List subList = arrayList.subList(i2, min);
            final String[] strArr = new String[subList.size() + 1];
            subList.toArray(strArr);
            strArr[subList.size()] = Integer.toString(dzqmVar.p);
            dytm.a(this.h, new Callable() { // from class: dyrs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dyta dytaVar = dyta.this;
                    List list2 = subList;
                    Uri k = dytaVar.k("messages");
                    String a = a.a(dytn.c(list2.size()), "message_id IN (", ") AND message_status = ?");
                    return Integer.valueOf(dytaVar.h.b(k, contentValues, a, strArr));
                }
            });
            i2 = min;
        }
        HashSet<dzpt> hashSet = new HashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            dzqs dzqsVar = (dzqs) it2.next();
            if (dzqsVar.i().equals(dzqmVar)) {
                hashSet.add(dzqsVar.f());
                Q(dzqsVar.r());
                dzpt f = dzqsVar.f();
                dzqsVar.r();
                ap(f);
            }
        }
        boolean z = this.d.contains(dzqmVar2) || this.d.contains(dzqmVar);
        for (dzpt dzptVar : hashSet) {
            Z(dzptVar);
            K(dzptVar);
            if (z) {
                P(dzptVar);
            }
        }
        R(dzqmVar);
        R(dzqmVar2);
    }

    @Override // defpackage.dzwo
    public final void ac(final dzpt dzptVar, List list, List list2, final dzqm dzqmVar) {
        if (list.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(list2);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("message_status", Integer.valueOf(dzqmVar.p));
        int size = hashSet.size();
        final HashSet<dzqm> hashSet2 = new HashSet();
        int i2 = 0;
        while (i2 < list.size()) {
            int min = Math.min((998 - size) + i2, list.size());
            List subList = list.subList(i2, min);
            final String[] strArr = new String[subList.size() + hashSet.size()];
            final String str = "message_id IN (" + dytn.c(subList.size()) + ") AND message_status IN (" + dytn.c(hashSet.size()) + ")";
            subList.toArray(strArr);
            Iterator it = hashSet.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                strArr[subList.size() + i3] = Integer.toString(((dzqm) it.next()).p);
                i3++;
            }
            dytm.b(this.h, new Runnable() { // from class: dyso
                @Override // java.lang.Runnable
                public final void run() {
                    dyta dytaVar = dyta.this;
                    String str2 = str;
                    String[] strArr2 = strArr;
                    Cursor h = dytaVar.h.h(dytaVar.k("messages"), new String[]{"message_id", "message_status"}, str2, strArr2, null, null);
                    ContentValues contentValues2 = contentValues;
                    dzqm dzqmVar2 = dzqmVar;
                    Set set = hashSet2;
                    dzpt dzptVar2 = dzptVar;
                    try {
                        if (h.moveToFirst()) {
                            dytaVar.h.b(dytaVar.k("messages"), contentValues2, str2, strArr2);
                            do {
                                String string = h.getString(0);
                                dzqm a = dzqm.a(h.getInt(1));
                                if (!a.equals(dzqmVar2)) {
                                    set.add(a);
                                    dytaVar.Q(string);
                                    dytaVar.ap(dzptVar2);
                                }
                            } while (h.moveToNext());
                        }
                        if (h != null) {
                            h.close();
                        }
                    } catch (Throwable th) {
                        if (h == null) {
                            throw th;
                        }
                        try {
                            h.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
            });
            i2 = min;
        }
        Z(dzptVar);
        boolean contains = this.d.contains(dzqmVar);
        for (dzqm dzqmVar2 : hashSet2) {
            R(dzqmVar2);
            contains = contains || this.d.contains(dzqmVar2);
        }
        if (!hashSet2.isEmpty()) {
            R(dzqmVar);
        }
        if (contains) {
            P(dzptVar);
        }
        K(dzptVar);
    }

    @Override // defpackage.dzwo
    public final void ad(final dzqs dzqsVar, final long j2) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("server_timestamp_us", Long.valueOf(j2));
        dytm.b(this.h, new Runnable() { // from class: dysc
            @Override // java.lang.Runnable
            public final void run() {
                dznm dznmVar = (dznm) dzqsVar;
                String str = dznmVar.a;
                dyta dytaVar = dyta.this;
                ContentValues contentValues2 = contentValues;
                dytaVar.h.b(dytaVar.k("messages"), contentValues2, "message_id = ?", new String[]{str});
                long c = dytaVar.c(dznmVar.c);
                if (c == -1) {
                    dyhr.c("SQLiteMessagingStore", "Message time updated for non existent conversation");
                } else {
                    dytaVar.X(c, Long.valueOf(j2));
                    dytaVar.Y(c);
                }
            }
        });
        dznm dznmVar = (dznm) dzqsVar;
        Q(dznmVar.a);
        K(dznmVar.c);
    }

    @Override // defpackage.dzwo
    public final boolean ae(final String str) {
        return ((Boolean) dytm.a(this.h, new Callable() { // from class: dysy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dyta dytaVar = dyta.this;
                Cursor h = dytaVar.h.h(dytaVar.k("messages"), new String[]{"id"}, "message_id = ?", new String[]{str}, null, null);
                try {
                    Boolean valueOf = Boolean.valueOf(h.getCount() != 0);
                    if (h != null) {
                        h.close();
                    }
                    return valueOf;
                } catch (Throwable th) {
                    if (h == null) {
                        throw th;
                    }
                    try {
                        h.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
        })).booleanValue();
    }

    @Override // defpackage.dzwo
    public final boolean af(final dzpt dzptVar, final eyee eyeeVar) {
        return ((Boolean) dytm.a(this.h, new Callable() { // from class: dyrm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dyta dytaVar = dyta.this;
                dzpt dzptVar2 = dzptVar;
                long c = dytaVar.c(dzptVar2);
                if (c == -1) {
                    dyhr.a("SQLiteMessagingStore", "insertOrGetConversationRowId, conversation does not exist: ".concat(dzptVar2.toString()));
                    c = dytaVar.h(dzptVar2, emux.a);
                    if (c == -1) {
                        dyhr.a("SQLiteMessagingStore", "insertOrGetConversationRowId, conversation could not be created: ".concat(dzptVar2.toString()));
                        c = -1;
                    }
                }
                boolean z = false;
                if (c != -1) {
                    emxc r = dytaVar.r(c);
                    if (r.g()) {
                        eyee eyeeVar2 = eyeeVar;
                        dzmv dzmvVar = new dzmv((dzpk) r.c());
                        dzmvVar.e(eyeeVar2);
                        dzpk a = dzmvVar.a();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("conversation_properties", dyuh.e(a));
                        int b = dytaVar.h.b(dytaVar.k("conversations"), contentValues, "id = ?", new String[]{String.valueOf(c)});
                        if (b < 0) {
                            dyhr.c("SQLiteMessagingStore", "Failed to update conversation.");
                        } else {
                            dytaVar.Y(c);
                            dzmw dzmwVar = (dzmw) a;
                            dytaVar.ah(b, dzmwVar.a);
                            dytaVar.L(dzmwVar.a);
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        })).booleanValue();
    }

    public final void ag(final dzpt dzptVar) {
        dyhr.a("SQLiteMessagingStore", "Sending conversation messages updated event");
        dzhl m = m();
        m.d(dzptVar);
        m.g(90);
        m.f(497);
        this.b.b(m.a());
        ernq.f(erqt.l(new Runnable() { // from class: dysj
            /* JADX WARN: Type inference failed for: r1v2, types: [dyix, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                dyta dytaVar = dyta.this;
                ((emxn) dytaVar.e).a.a(dytaVar.a, dzptVar);
            }
        }, this.g), Exception.class, new emwl() { // from class: dysk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dyhr.b("SQLiteMessagingStore", "Conversation messages updated event receiver throws exception", (Exception) obj);
                dyta dytaVar = dyta.this;
                dzhl m2 = dytaVar.m();
                m2.d(dzptVar);
                m2.g(90);
                m2.f(498);
                dytaVar.b.b(m2.a());
                return null;
            }
        }, this.f);
    }

    public final void ah(int i2, final dzpt dzptVar) {
        dyhr.a("SQLiteMessagingStore", "Sending conversation updated event");
        if (!ao(i2)) {
            dyhr.a("SQLiteMessagingStore", "Conversation updated event is not sent");
            ListenableFuture listenableFuture = erre.a;
            return;
        }
        dzhn dzhnVar = this.b;
        dzhl m = m();
        m.d(dzptVar);
        m.g(90);
        m.f(493);
        dzhnVar.b(m.a());
        ernq.f(erqt.l(new Runnable() { // from class: dyss
            /* JADX WARN: Type inference failed for: r1v2, types: [dyix, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                dyta dytaVar = dyta.this;
                ((emxn) dytaVar.e).a.b(dytaVar.a, dzptVar);
            }
        }, this.g), Exception.class, new emwl() { // from class: dyst
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dyhr.b("SQLiteMessagingStore", "conversation updated event receiver throws exception", (Exception) obj);
                dyta dytaVar = dyta.this;
                dzhl m2 = dytaVar.m();
                m2.d(dzptVar);
                m2.g(90);
                m2.f(494);
                dytaVar.b.b(m2.a());
                return null;
            }
        }, this.f);
    }

    @Override // defpackage.dzwo
    public final dzwu ai(dzpt dzptVar) {
        String[] strArr;
        String str;
        String str2;
        String[] strArr2;
        if (dzptVar.e() == dzpq.ONE_TO_ONE) {
            str2 = "(((participants INNER JOIN contacts AS c ON contact_row_id = " + dytn.b("c", "id") + ") INNER JOIN conversations ON conversation_row_id = " + dytn.b("conversations", "id") + ") INNER JOIN contacts AS o ON other_contact_row_id = " + dytn.b("o", "id") + ")";
            strArr2 = dytn.i("c", dywi.a);
            Pair aA = aA("o", dzptVar.c());
            str = (String) aA.first;
            strArr = (String[]) aA.second;
        } else {
            String str3 = "((participants INNER JOIN conversations ON conversation_row_id = " + dytn.b("conversations", "id") + ") INNER JOIN contacts ON contact_row_id = " + dytn.b("contacts", "id") + ")";
            String[] i2 = dytn.i("contacts", dywi.a);
            strArr = new String[]{dzptVar.d().b(), dzptVar.d().a()};
            str = "conversation_group_id = ? AND conversation_group_app_name = ?";
            str2 = str3;
            strArr2 = i2;
        }
        dywc j2 = dywd.j();
        j2.c(k(str2));
        dyvs dyvsVar = (dyvs) j2;
        dyvsVar.a = engw.p(strArr2);
        dyvsVar.b = str;
        dyvsVar.c = engw.p(strArr);
        dyvsVar.d = null;
        return aw(j2.a(), this.k, new emwl() { // from class: dysf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Cursor cursor = (Cursor) obj;
                int i3 = engw.d;
                engr engrVar = new engr();
                while (cursor.moveToNext()) {
                    emxc c = dyug.c(cursor);
                    if (c.g()) {
                        engrVar.h(c.c());
                    } else {
                        dyhr.c("ContactCursors", "error parsing row in list");
                    }
                }
                return engrVar.g();
            }
        }, dywb.e(this.c, dzptVar));
    }

    @Override // defpackage.dzwo
    public final void aj(final dzpb dzpbVar) {
        ((Long) dytm.a(this.h, new Callable() { // from class: dysa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dyta dytaVar = dyta.this;
                dzpb dzpbVar2 = dzpbVar;
                long b = dytaVar.b(((dzms) dzpbVar2).a);
                if (b == -1) {
                    return Long.valueOf(dytaVar.g(dzpbVar2));
                }
                int b2 = dytaVar.h.b(dytaVar.k("contacts"), dyug.a(dzpbVar2), "id = ?", new String[]{String.valueOf(b)});
                if (b2 < 0) {
                    throw new SQLiteException("Failed to update contact.");
                }
                dytaVar.J(b2, dzpbVar2);
                return Long.valueOf(b);
            }
        })).longValue();
    }

    @Override // defpackage.dzwo
    public final void ak(final dzpk dzpkVar) {
        ((Long) dytm.a(this.h, new Callable() { // from class: dyrg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(dyta.this.i(dzpkVar, false));
            }
        })).longValue();
    }

    @Override // defpackage.dzwo
    public final void al(final dzpk dzpkVar) {
        ((Long) dytm.a(this.h, new Callable() { // from class: dysn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(dyta.this.i(dzpkVar, true));
            }
        })).longValue();
    }

    @Override // defpackage.dzwo
    public final dzwu an(final dzpt dzptVar, dzqr[] dzqrVarArr) {
        return aw(aD(dzptVar, dzqrVarArr), this.k, new emwl() { // from class: dysm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                engw g;
                Cursor cursor = (Cursor) obj;
                int i2 = engw.d;
                engr engrVar = new engr();
                boolean moveToFirst = cursor.moveToFirst();
                dzpt dzptVar2 = dzptVar;
                if (moveToFirst) {
                    do {
                        try {
                            engrVar.h(new dytz(dyuq.a(dzptVar2, cursor)));
                        } catch (Exception unused) {
                            dzhl r = dzhm.r();
                            r.g(10032);
                            r.d(dzptVar2);
                            engrVar.h(new dyty(r.a()));
                        }
                    } while (cursor.moveToNext());
                    g = engrVar.g();
                } else {
                    g = engrVar.g();
                }
                engw d = dyuj.d(g);
                int i3 = ((enou) d).c;
                for (int i4 = 0; i4 < i3; i4++) {
                    dyta dytaVar = dyta.this;
                    dytaVar.b.b((dzhm) d.get(i4));
                }
                return dyuj.e(g);
            }
        }, dywb.d(this.c, dzptVar));
    }

    public final void ap(final dzpt dzptVar) {
        dyhr.a("SQLiteMessagingStore", "Sending messages status updated event");
        dzhl m = m();
        m.d(dzptVar);
        m.g(90);
        m.f(511);
        this.b.b(m.a());
        ernq.f(erqt.l(new Runnable() { // from class: dyrj
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = dyta.i;
            }
        }, this.g), Exception.class, new emwl() { // from class: dyrl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dyhr.g("SQLiteMessagingStore", "Conversation messages status updated event receiver throws exception", (Exception) obj);
                dyta dytaVar = dyta.this;
                dzhl m2 = dytaVar.m();
                m2.d(dzptVar);
                m2.g(90);
                m2.f(512);
                dytaVar.b.b(m2.a());
                return null;
            }
        }, this.f);
    }

    public final long b(dzpg dzpgVar) {
        Pair aC = aC(dzpgVar);
        Cursor h = this.h.h(k("contacts"), new String[]{"id"}, (String) aC.first, (String[]) aC.second, null, null);
        try {
            long j2 = !h.moveToFirst() ? -1L : h.getLong(0);
            if (h != null) {
                h.close();
            }
            return j2;
        } catch (Throwable th) {
            if (h == null) {
                throw th;
            }
            try {
                h.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final long c(dzpt dzptVar) {
        String[] strArr;
        String str;
        long j2 = -1;
        if (dzptVar.e() == dzpq.GROUP) {
            str = "conversation_group_id = ? AND conversation_group_app_name = ?";
            strArr = new String[]{dzptVar.d().b(), dzptVar.d().a()};
        } else {
            long b = b(dzptVar.c());
            if (b == -1) {
                return -1L;
            }
            strArr = new String[]{String.valueOf(b)};
            str = "other_contact_row_id = ?";
        }
        Cursor h = this.h.h(k("conversations"), new String[]{"id"}, str, strArr, null, null);
        try {
            if (h.moveToFirst()) {
                j2 = h.getLong(0);
            }
            if (h != null) {
                h.close();
            }
            return j2;
        } finally {
        }
    }

    @Override // defpackage.dzwo
    public final long d() {
        return Math.max(aq("conversations", "local_update_timestamp_ms"), aq("deleted_conversations", "local_delete_timestamp_ms"));
    }

    @Override // defpackage.dzwo
    public final long e() {
        Cursor h = this.h.h(k("messages"), new String[]{"server_timestamp_us"}, "message_status NOT IN (" + TextUtils.join(", ", dzqm.o) + ")", new String[0], "server_timestamp_us DESC", "1");
        try {
            long j2 = !h.moveToFirst() ? 0L : h.getLong(0);
            if (h != null) {
                h.close();
            }
            return j2;
        } catch (Throwable th) {
            if (h == null) {
                throw th;
            }
            try {
                h.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final long f(final dzpg dzpgVar) {
        return ((Long) dytm.a(this.h, new Callable() { // from class: dysd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dyta dytaVar = dyta.this;
                dzpg dzpgVar2 = dzpgVar;
                long b = dytaVar.b(dzpgVar2);
                if (b == -1) {
                    dzpa k = dzpb.k();
                    k.c(dzpgVar2);
                    k.e(-1L);
                    int i2 = engw.d;
                    k.j(enou.a);
                    b = dytaVar.g(k.a());
                }
                return Long.valueOf(b);
            }
        })).longValue();
    }

    public final long g(final dzpb dzpbVar) {
        final ContentValues a = dyug.a(dzpbVar);
        return ((Long) dytm.a(this.h, new Callable() { // from class: dysv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dyta dytaVar = dyta.this;
                long c = dytaVar.h.c(dytaVar.k("contacts"), a, 0);
                if (c < 0) {
                    throw new SQLiteException("Failed to save contact.");
                }
                dytaVar.J(1, dzpbVar);
                return Long.valueOf(c);
            }
        })).longValue();
    }

    final long h(dzpt dzptVar, emxc emxcVar) {
        long c = c(dzptVar);
        if (c == -1) {
            dzpj r = dzpk.r();
            r.f(dzptVar);
            r.h(-1L);
            r.b(new HashMap());
            r.c(dzptVar.e() == dzpq.ONE_TO_ONE);
            c = ar(r.a());
        }
        if (emxcVar.g()) {
            X(c, (Long) emxcVar.c());
            Y(c);
        }
        return c;
    }

    public final long i(dzpk dzpkVar, boolean z) {
        byte[] bArr;
        dzmw dzmwVar = (dzmw) dzpkVar;
        long c = c(dzmwVar.a);
        if (c == -1) {
            return ar(dzpkVar);
        }
        emxc r = r(c);
        if (z && r.g() && ((dzmw) r.c()).f != -1) {
            return c;
        }
        ContentValues contentValues = new ContentValues();
        if (r.g()) {
            try {
                HashMap c2 = dyuh.c((dzpk) r.c());
                dyuh.f(c2, dzpkVar);
                bArr = dyhu.i(c2);
            } catch (IOException e) {
                dyhr.d("ConversationCursors", "Failed to serialize conversation properties.", e);
                bArr = new byte[0];
            }
            contentValues.put("conversation_properties", bArr);
        } else {
            contentValues.put("conversation_properties", dyuh.e(dzpkVar));
        }
        contentValues.put("conversation_app_data", dyuh.d(new HashMap(dzmwVar.i)));
        dyhj.a();
        contentValues.put("local_update_timestamp_ms", Long.valueOf(System.currentTimeMillis()));
        int b = this.h.b(k("conversations"), contentValues, "id = ?", new String[]{String.valueOf(c)});
        if (b < 0) {
            dyhr.c("SQLiteMessagingStore", "Failed to update conversation.");
            return -1L;
        }
        ah(b, dzmwVar.a);
        L(dzmwVar.a);
        M();
        return c;
    }

    public final Uri k(String str) {
        String valueOf = String.valueOf(this.k.getPackageName());
        return dytn.a(valueOf.concat(".lighter.data"), "MESSAGING", str, Long.toString(this.c));
    }

    @Override // defpackage.dzwo
    public final Pair l(final dzsc dzscVar) {
        return (Pair) dytm.a(this.h, new Callable() { // from class: dysr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dyta dytaVar = dyta.this;
                dzsc dzscVar2 = dzscVar;
                String e = dzscVar2.e();
                emxc t = dytaVar.t(e);
                if (!t.g()) {
                    dyhr.c("SQLiteMessagingStore", "Trying to save a SuggestionList whose Message has not been saved.");
                    return Pair.create(false, false);
                }
                emxc s = dytaVar.s(e, "conversation_row_id");
                if (!s.g()) {
                    dyhr.c("SQLiteMessagingStore", "Message exists without conversationId.");
                    return Pair.create(false, true);
                }
                emxc r = dytaVar.r(((Long) s.c()).longValue());
                if (!r.g()) {
                    dyhr.c("SQLiteMessagingStore", "Message exists without conversation.");
                    return Pair.create(false, true);
                }
                Object c = r.c();
                dzmw dzmwVar = (dzmw) c;
                if (dzmwVar.j.g()) {
                    emxc t2 = dytaVar.t(((dzsc) dzmwVar.j.c()).e());
                    if (t2.g() && ((Long) t.c()).longValue() < ((Long) t2.c()).longValue()) {
                        return Pair.create(false, true);
                    }
                }
                dzmv dzmvVar = new dzmv((dzpk) c);
                dzmvVar.a = emxc.j(dzscVar2);
                dzpk a = dzmvVar.a();
                ContentValues contentValues = new ContentValues();
                contentValues.put("conversation_properties", dyuh.e(a));
                int b = dytaVar.h.b(dytaVar.k("conversations"), contentValues, "id = ?", new String[]{s.c().toString()});
                if (b < 0) {
                    dyhr.c("SQLiteMessagingStore", "Failed to update conversation.");
                    return Pair.create(false, true);
                }
                dytaVar.ah(b, dzmwVar.a);
                dytaVar.L(dzmwVar.a);
                return Pair.create(true, true);
            }
        });
    }

    public final dzhl m() {
        dzja dzjaVar = this.a;
        dzhl r = dzhm.r();
        r.n(dzjaVar.c().f());
        r.o(this.a.d().E());
        return r;
    }

    @Override // defpackage.dzwo
    public final dzor n(dzpt dzptVar) {
        dzhl m = m();
        m.d(dzptVar);
        m.g(91);
        m.f(612);
        this.b.b(m.a());
        try {
            return (dzor) ax(as(dzxe.a(dzptVar)), new dysb());
        } catch (RuntimeException e) {
            dzhn dzhnVar = this.b;
            dzhl m2 = m();
            m2.d(dzptVar);
            m2.g(91);
            m2.f(613);
            dzhnVar.b(m2.a());
            throw e;
        }
    }

    @Override // defpackage.dzwo
    public final dzwu o(dzxf dzxfVar) {
        return aw(as(dzxfVar), this.k, new dysb(), dywb.a(this.c, dzxfVar));
    }

    @Override // defpackage.dzwo
    public final dzwu p(dzpg dzpgVar) {
        return aw(at(dzpgVar), this.k, new dyrw(), dywb.b(this.c, dzpgVar));
    }

    @Override // defpackage.dzwo
    public final dzwu q(dzpt dzptVar) {
        return aw(au(dzptVar), this.k, new dyri(), dywb.c(this.c, dzptVar));
    }

    public final emxc r(long j2) {
        String[] strArr = {Long.toString(j2)};
        String aB = aB();
        Cursor h = this.h.h(k(aB), dytn.h(dytn.i("conversations", dywm.b), dytn.i("o", dywi.a), dytn.i("c", dywi.a)), "conversations.id = ?", strArr, null, null);
        try {
            if (h.moveToFirst()) {
                emxc a = dyuh.a(h);
                if (h != null) {
                    h.close();
                }
                return a;
            }
            dyhr.f("SQLiteMessagingStore", "Conversation lookup failed");
            if (h != null) {
                h.close();
            }
            return emux.a;
        } catch (Throwable th) {
            if (h == null) {
                throw th;
            }
            try {
                h.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final emxc s(String str, String str2) {
        Cursor h = this.h.h(k("messages"), new String[]{str2}, "message_id = ?", new String[]{str}, null, null);
        try {
            if (h.moveToFirst()) {
                emxc j2 = emxc.j(Long.valueOf(h.getLong(0)));
                if (h != null) {
                    h.close();
                }
                return j2;
            }
            emux emuxVar = emux.a;
            if (h != null) {
                h.close();
            }
            return emuxVar;
        } catch (Throwable th) {
            if (h == null) {
                throw th;
            }
            try {
                h.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final emxc t(String str) {
        return s(str, "server_timestamp_us");
    }

    @Override // defpackage.dzwo
    public final emxc u(dzpg dzpgVar) {
        dzhl m = m();
        m.c(dzpgVar);
        m.g(91);
        m.f(605);
        this.b.b(m.a());
        try {
            return (emxc) ax(at(dzpgVar), new dyrw());
        } catch (RuntimeException e) {
            dzhn dzhnVar = this.b;
            dzhl m2 = m();
            m2.c(dzpgVar);
            m2.g(91);
            m2.f(606);
            dzhnVar.b(m2.a());
            throw e;
        }
    }

    @Override // defpackage.dzwo
    public final emxc v(dzpt dzptVar) {
        dzhl m = m();
        m.d(dzptVar);
        m.g(91);
        m.f(601);
        this.b.b(m.a());
        try {
            return (emxc) ax(au(dzptVar), new dyri());
        } catch (RuntimeException e) {
            dzhn dzhnVar = this.b;
            dzhl m2 = m();
            m2.d(dzptVar);
            m2.g(91);
            m2.f(602);
            dzhnVar.b(m2.a());
            throw e;
        }
    }

    @Override // defpackage.dzwo
    public final emxc w(final dzpt dzptVar) {
        dzhl m = m();
        m.d(dzptVar);
        m.g(91);
        m.f(603);
        this.b.b(m.a());
        try {
            return (emxc) ax(aD(dzptVar, dzqr.e), new emwl() { // from class: dysg
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Cursor cursor = (Cursor) obj;
                    int i2 = dyta.i;
                    if (cursor.moveToFirst()) {
                        return emxc.j(dyuq.a(dzpt.this, cursor));
                    }
                    dyhr.a("SQLiteMessagingStore", "no messages found in the conversation");
                    return emux.a;
                }
            });
        } catch (RuntimeException e) {
            dzhn dzhnVar = this.b;
            dzhl m2 = m();
            m2.d(dzptVar);
            m2.g(91);
            m2.f(604);
            dzhnVar.b(m2.a());
            throw e;
        }
    }

    @Override // defpackage.dzwo
    public final engw x(final dzpt dzptVar, final dzqm dzqmVar, final long j2) {
        return (engw) dytm.a(this.h, new Callable() { // from class: dyrp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dyta dytaVar = dyta.this;
                String[] strArr = {Long.toString(dytaVar.c(dzptVar)), Integer.toString(dzqmVar.p), Long.toString(j2)};
                int i2 = engw.d;
                engr engrVar = new engr();
                Cursor h = dytaVar.h.h(dytaVar.k("messages"), new String[]{"message_id"}, "conversation_row_id = ? AND message_status = ? AND server_timestamp_us > ?", strArr, null, null);
                try {
                    if (h.moveToFirst()) {
                        do {
                            engrVar.h(h.getString(0));
                        } while (h.moveToNext());
                    }
                    engw g = engrVar.g();
                    if (h != null) {
                        h.close();
                    }
                    return g;
                } catch (Throwable th) {
                    if (h == null) {
                        throw th;
                    }
                    try {
                        h.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
        });
    }

    @Override // defpackage.dzwo
    public final engw y(long j2, long j3) {
        dzhl m = m();
        m.g(91);
        m.f(609);
        this.b.b(m.a());
        try {
            String[] strArr = {String.valueOf(j2), String.valueOf(j3)};
            dywc j4 = dywd.j();
            j4.c(k("deleted_conversations"));
            ((dyvs) j4).a = dywk.a;
            ((dyvs) j4).b = "local_delete_timestamp_ms BETWEEN ? AND ?";
            ((dyvs) j4).c = engw.p(strArr);
            ((dyvs) j4).d = "local_delete_timestamp_ms ASC";
            return (engw) ax(j4.a(), new emwl() { // from class: dysz
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    emxc emxcVar;
                    Cursor cursor = (Cursor) obj;
                    boolean moveToFirst = cursor.moveToFirst();
                    dyta dytaVar = dyta.this;
                    if (!moveToFirst) {
                        dyhr.a("SQLiteMessagingStore", "no deleted conversations found");
                        int i2 = engw.d;
                        return enou.a;
                    }
                    int i3 = engw.d;
                    engr engrVar = new engr();
                    do {
                        try {
                            try {
                                String string = cursor.getString(dywj.a(2));
                                Long valueOf = Long.valueOf(cursor.getLong(dywj.a(3)));
                                JSONObject jSONObject = new JSONObject(string);
                                try {
                                    dzin dzinVar = new dzin();
                                    emxc f = dzpg.f(jSONObject.getJSONObject("OWNER"));
                                    if (f.g()) {
                                        dzinVar.c((dzpg) f.c());
                                        int ordinal = dzpq.a(jSONObject.getInt(VCardConstants.PARAM_TYPE)).ordinal();
                                        if (ordinal == 0) {
                                            emxc f2 = dzpg.f(jSONObject.getJSONObject("OTHER_PARTICIPANT"));
                                            if (f2.g()) {
                                                dzinVar.e((dzpg) f2.c());
                                            } else {
                                                emxcVar = emux.a;
                                            }
                                        } else if (ordinal == 1) {
                                            emxc c = dzpn.c(jSONObject.getJSONObject("GROUP"));
                                            if (c.g()) {
                                                dzinVar.d((dzpn) c.c());
                                            } else {
                                                emxcVar = emux.a;
                                            }
                                        }
                                        emxcVar = emxc.j(dzinVar.a());
                                    } else {
                                        emxcVar = emux.a;
                                    }
                                } catch (JSONException unused) {
                                    dyhr.c("ConversationId", "failed to convert JSONObject to ConversationId");
                                    emxcVar = emux.a;
                                }
                                if (emxcVar.g()) {
                                    engrVar.h(Pair.create(emxcVar.c(), valueOf));
                                } else {
                                    dyhr.c("SQLiteMessagingStore", "ConversationId.fromJSONObject returned empty optional");
                                    dzhn dzhnVar = dytaVar.b;
                                    dzhl m2 = dytaVar.m();
                                    m2.g(91);
                                    m2.f(611);
                                    dzhnVar.b(m2.a());
                                }
                            } catch (RuntimeException e) {
                                e = e;
                                dyhr.d("SQLiteMessagingStore", "Unable to parse the conversation id json object from a string.", e);
                                dzhn dzhnVar2 = dytaVar.b;
                                dzhl m3 = dytaVar.m();
                                m3.g(91);
                                m3.f(611);
                                dzhnVar2.b(m3.a());
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            dyhr.d("SQLiteMessagingStore", "Unable to parse the conversation id json object from a string.", e);
                            dzhn dzhnVar22 = dytaVar.b;
                            dzhl m32 = dytaVar.m();
                            m32.g(91);
                            m32.f(611);
                            dzhnVar22.b(m32.a());
                        }
                    } while (cursor.moveToNext());
                    return engrVar.g();
                }
            });
        } catch (RuntimeException e) {
            dyhr.d("SQLiteMessagingStore", "Query deleted conversations within time range failed", e);
            dzhn dzhnVar = this.b;
            dzhl m2 = m();
            m2.g(91);
            m2.f(610);
            dzhnVar.b(m2.a());
            throw e;
        }
    }

    @Override // defpackage.dzwo
    public final engw z(long j2, long j3) {
        dzhl m = m();
        m.g(91);
        m.f(607);
        this.b.b(m.a());
        try {
            String[] strArr = {String.valueOf(j2), String.valueOf(j3)};
            dywc j4 = dywd.j();
            j4.c(k(aB()));
            ((dyvs) j4).a = engw.p(dytn.h(dytn.i("conversations", dywm.b), dytn.i("o", dywi.a), dytn.i("c", dywi.a)));
            ((dyvs) j4).b = "local_update_timestamp_ms BETWEEN ? AND ?";
            ((dyvs) j4).c = engw.p(strArr);
            ((dyvs) j4).d = "local_update_timestamp_ms ASC";
            return (engw) ax(j4.a(), new emwl() { // from class: dyre
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    engw g;
                    Cursor cursor = (Cursor) obj;
                    int i2 = engw.d;
                    engr engrVar = new engr();
                    if (cursor.moveToFirst()) {
                        do {
                            try {
                                emxc a = dyuh.a(cursor);
                                if (a.g()) {
                                    engrVar.h(new dytz(a.c()));
                                } else {
                                    dzhl r = dzhm.r();
                                    r.g(10031);
                                    engrVar.h(new dyty(r.a()));
                                }
                            } catch (Exception unused) {
                                dzhl r2 = dzhm.r();
                                r2.g(10031);
                                engrVar.h(new dyty(r2.a()));
                            }
                        } while (cursor.moveToNext());
                        g = engrVar.g();
                    } else {
                        g = engrVar.g();
                    }
                    engw d = dyuj.d(g);
                    int i3 = ((enou) d).c;
                    for (int i4 = 0; i4 < i3; i4++) {
                        dyta dytaVar = dyta.this;
                        dytaVar.b.b((dzhm) d.get(i4));
                    }
                    return dyuj.e(g);
                }
            });
        } catch (RuntimeException e) {
            dyhr.d("SQLiteMessagingStore", "Query updated conversations within time range failed", e);
            dzhn dzhnVar = this.b;
            dzhl m2 = m();
            m2.g(91);
            m2.f(608);
            dzhnVar.b(m2.a());
            throw e;
        }
    }
}
