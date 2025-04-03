package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqai implements Closeable, AutoCloseable {
    public final String d;
    public final String e;
    public final String f;
    private final Context j;
    private final albq k;
    private final cqak l;
    private final akzt m;
    private final asoa n;
    private final coxk o;
    private cqad p;
    private cqad q;
    private final String r;
    private final ffbr s;
    private final auxc t;
    private final ffbr u;
    public static final cskc a = cskc.g("Bugle", "SyncCursorPair");
    private static final enru g = enru.c("com/google/android/apps/messaging/shared/telephony/forwardsync/SyncCursorPair");
    static final cfup b = cfvl.e(cfvl.b, "forward_sync_spot_sync_limit", 1000);
    private static final String h = String.format(Locale.US, "(%s NOTNULL)", MessagesTable.c.o);
    public static final String c = String.format(Locale.US, "(%s NOTNULL)", MessagesTable.c.a);
    private static final String[] i = {"count()"};

    public cqai(Context context, albq albqVar, akzt akztVar, cqak cqakVar, coxk coxkVar, ffbr ffbrVar, asoa asoaVar, auxc auxcVar, ffbr ffbrVar2, long j, long j2) {
        this.j = context;
        this.k = albqVar;
        this.m = akztVar;
        this.l = cqakVar;
        this.n = asoaVar;
        this.s = ffbrVar;
        this.o = coxkVar;
        this.t = auxcVar;
        this.u = ffbrVar2;
        long j3 = j < 0 ? j : (j / 1000) * 1000;
        long j4 = j2 < 0 ? j2 : ((j2 + 999) / 1000) * 1000;
        long j5 = j3;
        this.r = x(c, MessagesTable.c.i.toString(), j5, j4);
        this.d = x(h, MessagesTable.c.i.toString(), j5, j4);
        this.e = x(s(coxkVar), "date", j5, j4);
        this.f = x(r(coxkVar), "date", j3 / 1000, j4 / 1000);
    }

    public static int b(final String str) {
        buxo d = MessagesTable.d();
        d.z("+isSynchronized");
        d.h(new Function() { // from class: cqaa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                cskc cskcVar = cqai.a;
                buxzVar.as(new dtzr(str));
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return d.b().i();
    }

    private static int m(ArrayList arrayList, cno cnoVar, ArrayList arrayList2) {
        return arrayList.size() + cnoVar.b() + arrayList2.size();
    }

    private static int n(Cursor cursor) {
        if (cursor == null || !cursor.moveToFirst()) {
            throw new IllegalArgumentException(a.a(cursor != null ? cursor.getCount() == 0 ? "empty" : "" : "null", "Cannot get count from ", " cursor"));
        }
        return cursor.getInt(0);
    }

    private static final long o(cout coutVar) {
        return coutVar.c() / 1000;
    }

    private static ecda p(int i2, int i3) {
        return i2 >= i3 ? new ecda("ForwardSync::ScanOneBatch::FullUpdates") : i2 > 0 ? new ecda("ForwardSync::ScanOneBatch::SomeUpdates") : new ecda("ForwardSync::ScanOneBatch::NoUpdates");
    }

    private static String q(Set set, final String str) {
        return String.format("(%s IN (%s))", "_id", (String) Collection.EL.stream(set).filter(new Predicate() { // from class: cpzp
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
                Uri uri = (Uri) obj;
                cskc cskcVar = cqai.a;
                if (!str.equals(uri.getAuthority())) {
                    return false;
                }
                if (uri.getPathSegments().size() != 1) {
                    csjb e = cqai.a.e();
                    e.I("Found message URI with number of path segments != 1.");
                    e.A("Uri", uri);
                    e.r();
                    return false;
                }
                try {
                    Long.parseLong(uri.getPathSegments().get(0));
                    return true;
                } catch (NumberFormatException unused) {
                    csjb e2 = cqai.a.e();
                    e2.I("Failed to parse message id from message Uri.");
                    e2.A("Uri", uri);
                    e2.r();
                    return false;
                }
            }
        }).map(new Function() { // from class: cpzu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = cqai.a;
                return ((Uri) obj).getPathSegments().get(0);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    private static String r(coxk coxkVar) {
        return coxkVar.G();
    }

    private static String s(coxk coxkVar) {
        return coxkVar.J();
    }

    private static boolean t(coux couxVar, final couu couuVar) {
        boolean z;
        bwdf c2 = PartsTable.c();
        c2.z("allPartsMatch");
        c2.h(new Function() { // from class: cpzs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwdm bwdmVar = (bwdm) obj;
                cskc cskcVar = cqai.a;
                bwdmVar.n(couu.this.d);
                return bwdmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = c2.b().y();
        if (couxVar.x.size() != ((enou) y).c) {
            return false;
        }
        while (true) {
            for (final couy couyVar : couxVar.x) {
                z = z && Collection.EL.stream(y).anyMatch(new Predicate() { // from class: cpzt
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
                        PartsTable.BindData bindData = (PartsTable.BindData) obj;
                        cskc cskcVar = cqai.a;
                        String str = couy.this.f;
                        return str == null || str.equals(bindData.K());
                    }
                });
            }
            return z;
        }
    }

    private final boolean u(couu couuVar, Set set, Set set2) {
        if (!emxe.c(couuVar.b)) {
            return false;
        }
        Stream map = Collection.EL.stream(set2).map(new Function() { // from class: cpzv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = cqai.a;
                return ((cpzg) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = engw.d;
        engw engwVar = (engw) map.collect(endq.a);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            cout coutVar = (cout) it.next();
            if (w(coutVar, couuVar) && !engwVar.contains(coutVar)) {
                set2.add(new cpxw(couuVar, coutVar));
                return true;
            }
        }
        return false;
    }

    private static boolean v(Optional optional, Optional optional2) {
        if (optional.isPresent() && optional2.isPresent()) {
            return ((UUID) optional.get()).equals(optional2.get());
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (j$.util.Objects.equals(r6.o, r7.g) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean w(defpackage.cout r6, defpackage.couu r7) {
        /*
            r5 = this;
            auxc r0 = r5.t
            boolean r0 = r0.a()
            r1 = 3
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L7d
            java.lang.String r0 = r6.d()
            java.lang.String r4 = r7.b
            boolean r0 = j$.util.Objects.equals(r0, r4)
            if (r0 != 0) goto L7c
            int r0 = r6.a()
            int r4 = r7.a
            if (r0 == r4) goto L23
            if (r0 != r3) goto L7b
            if (r4 != r1) goto L7b
        L23:
            int r0 = r6.a()
            if (r0 != r3) goto L5a
            coux r6 = (defpackage.coux) r6
            java.lang.String r0 = r6.o
            boolean r0 = defpackage.emxe.c(r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = r7.g
            boolean r0 = defpackage.emxe.c(r0)
            if (r0 != 0) goto L45
            java.lang.String r0 = r7.g
            java.lang.String r1 = r6.o
            boolean r0 = j$.util.Objects.equals(r1, r0)
            if (r0 != 0) goto L59
        L45:
            j$.util.Optional r0 = r6.h()
            j$.util.Optional r1 = r7.h
            boolean r0 = v(r0, r1)
            if (r0 != 0) goto L59
            boolean r6 = t(r6, r7)
            if (r6 == 0) goto L58
            goto L59
        L58:
            return r2
        L59:
            return r3
        L5a:
            int r0 = r6.a()
            if (r0 != 0) goto L7b
            covb r6 = (defpackage.covb) r6
            j$.util.Optional r0 = r6.f()
            j$.util.Optional r1 = r7.h
            boolean r0 = v(r0, r1)
            if (r0 != 0) goto L7a
            java.lang.String r6 = r6.e
            java.lang.String r7 = r7.f
            boolean r6 = j$.util.Objects.equals(r6, r7)
            if (r6 == 0) goto L79
            goto L7a
        L79:
            return r2
        L7a:
            return r3
        L7b:
            return r2
        L7c:
            return r3
        L7d:
            java.lang.String r0 = r6.d()
            java.lang.String r4 = r7.b
            boolean r0 = j$.util.Objects.equals(r0, r4)
            if (r0 == 0) goto L8a
            return r3
        L8a:
            int r0 = r6.a()
            int r4 = r7.a
            if (r0 == r4) goto L9c
            int r0 = r6.a()
            if (r0 != r3) goto Lda
            int r0 = r7.a
            if (r0 != r1) goto Lda
        L9c:
            int r0 = r6.a()
            if (r0 != r3) goto Lc7
            coux r6 = (defpackage.coux) r6
            java.lang.String r0 = r6.o
            boolean r0 = defpackage.emxe.c(r0)
            if (r0 != 0) goto Lc0
            java.lang.String r0 = r7.g
            boolean r0 = defpackage.emxe.c(r0)
            if (r0 != 0) goto Lc0
            java.lang.String r0 = r6.o
            java.lang.String r1 = r7.g
            boolean r0 = j$.util.Objects.equals(r0, r1)
            if (r0 != 0) goto Lbf
            goto Lc0
        Lbf:
            return r3
        Lc0:
            boolean r6 = t(r6, r7)
            if (r6 == 0) goto Lda
            return r3
        Lc7:
            int r0 = r6.a()
            if (r0 != 0) goto Lda
            covb r6 = (defpackage.covb) r6
            java.lang.String r6 = r6.e
            java.lang.String r7 = r7.f
            boolean r6 = j$.util.Objects.equals(r6, r7)
            if (r6 == 0) goto Lda
            return r3
        Lda:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqai.w(cout, couu):boolean");
    }

    private static String x(String str, String str2, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (j > 0) {
            sb.append(" AND ");
            sb.append(str2);
            sb.append(">=");
            sb.append(j);
        }
        if (j2 > 0) {
            sb.append(" AND ");
            sb.append(str2);
            sb.append("<");
            sb.append(j2);
        }
        if (!TextUtils.isEmpty(null) && !TextUtils.isEmpty(null)) {
            sb.append(" AND null=null");
        }
        return sb.toString();
    }

    public final int a() {
        buuo buuoVar = ((cqag) this.p).a;
        if (buuoVar == null) {
            return 0;
        }
        return buuoVar.getCount();
    }

    public final int c() {
        buuo buuoVar = ((cqag) this.p).a;
        if (buuoVar == null) {
            return 0;
        }
        return buuoVar.getPosition();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        cqag cqagVar;
        buuo buuoVar;
        cqad cqadVar = this.p;
        if (cqadVar != null && (buuoVar = (cqagVar = (cqag) cqadVar).a) != null) {
            buuoVar.close();
            cqagVar.a = null;
        }
        cqad cqadVar2 = this.q;
        if (cqadVar2 != null) {
            cqah cqahVar = (cqah) cqadVar2;
            Cursor cursor = cqahVar.a;
            if (cursor != null) {
                cursor.close();
                cqahVar.a = null;
            }
            Cursor cursor2 = cqahVar.b;
            if (cursor2 != null) {
                cursor2.close();
                cqahVar.b = null;
            }
        }
    }

    public final int d() {
        cqah cqahVar = (cqah) this.q;
        Cursor cursor = cqahVar.a;
        int count = cursor == null ? 0 : cursor.getCount();
        Cursor cursor2 = cqahVar.b;
        return count + (cursor2 != null ? cursor2.getCount() : 0);
    }

    public final int e(String str, String str2) {
        Context context = this.j;
        akzw b2 = this.k.b("Bugle.Telephony.Query.Count.Latency");
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Telephony.Sms.CONTENT_URI;
        String[] strArr = i;
        Cursor c2 = cgsx.c(contentResolver, uri, strArr, str, null, null);
        try {
            azyd.l(c2);
            b2.c();
            int n = n(c2);
            if (c2 != null) {
                c2.close();
            }
            albq albqVar = this.k;
            Context context2 = this.j;
            akzw b3 = albqVar.b("Bugle.Telephony.Query.Count.Latency");
            c2 = cgsx.c(context2.getContentResolver(), Telephony.Mms.CONTENT_URI, strArr, str2, null, null);
            try {
                azyd.l(c2);
                b3.c();
                int n2 = n(c2);
                if (c2 != null) {
                    c2.close();
                }
                return n + n2;
            } finally {
            }
        } finally {
        }
    }

    public final int f() {
        cqah cqahVar = (cqah) this.q;
        Cursor cursor = cqahVar.a;
        int position = cursor == null ? 0 : cursor.getPosition();
        return (position + (cqahVar.b != null ? r0.getPosition() : 0)) - 1;
    }

    final couu g() {
        cqag cqagVar = (cqag) this.p;
        buuo buuoVar = cqagVar.a;
        if (buuoVar == null || !buuoVar.moveToNext()) {
            return null;
        }
        cqai cqaiVar = cqagVar.b;
        buuo buuoVar2 = cqagVar.a;
        if (buuoVar2 == null) {
            return null;
        }
        Uri o = buuoVar2.o();
        String H = buuoVar2.H();
        String dd = buuoVar2.dd("parts_expression");
        MessageIdType q = buuoVar2.q();
        int c2 = buuoVar2.c();
        String uri = o != null ? o.toString() : null;
        long l = buuoVar2.l();
        ConversationIdType p = buuoVar2.p();
        buuoVar2.e();
        return new couu(q, c2, uri, l, p, dd, H, buuoVar2.B());
    }

    final couz h(Set set, cozl cozlVar) {
        couz couzVar;
        cqah cqahVar = (cqah) this.q;
        couz couzVar2 = cqahVar.c;
        if (couzVar2 == null || (couzVar = cqahVar.d) == null) {
            if (couzVar2 != null) {
                cqahVar.c = cqahVar.b();
            } else {
                couzVar2 = cqahVar.d;
                cqahVar.d = cqahVar.a();
            }
        } else if (((covb) couzVar2).f >= ((coux) couzVar).g) {
            cqahVar.c = cqahVar.b();
        } else {
            cqahVar.d = cqahVar.a();
            couzVar2 = couzVar;
        }
        if (couzVar2 != null && !((Boolean) ayhv.a.e()).booleanValue()) {
            long e = couzVar2.e();
            cpbd a2 = cozlVar.a(covk.a, e, emxe.b(couzVar2.d()));
            long j = a2.a;
            if (j != e && j != -1 && e != -1) {
                set.add(new cpxx(e, a2));
            }
        }
        if (couzVar2 != null && couzVar2.c() == 0) {
            this.m.e("Bugle.Telephony.ForwardSync.SyncCursorPair.ReadTelephonyMessageWithTimestampZero", couzVar2 instanceof coux ? 1 : 0);
        }
        return couzVar2;
    }

    public final void i(int i2) {
        this.p = new cqag(this, this.r);
        cqak cqakVar = this.l;
        Context context = (Context) cqakVar.a.b();
        context.getClass();
        albq albqVar = (albq) cqakVar.b.b();
        albqVar.getClass();
        cove coveVar = (cove) cqakVar.c.b();
        coveVar.getClass();
        coxk coxkVar = (coxk) cqakVar.d.b();
        coxkVar.getClass();
        this.q = new cqah(context, albqVar, coveVar, coxkVar, this.e, this.f, i2);
    }

    public final void j(List list, List list2, cno cnoVar, cout coutVar, cozl cozlVar) {
        String str;
        long j;
        if (coutVar.a() == 1) {
            coux couxVar = (coux) coutVar;
            if (((auwz) this.u.b()).a()) {
                couxVar.l = true;
            }
            cnoVar.f(couxVar.b, couxVar);
            list2.add(couxVar);
            j = couxVar.i;
            str = couxVar.a;
        } else if (coutVar.a() == 0) {
            covb covbVar = (covb) coutVar;
            if (((auwz) this.u.b()).a()) {
                covbVar.k = true;
            }
            list.add(covbVar);
            j = covbVar.i;
            str = covbVar.b;
        } else {
            csjb e = a.e();
            e.I("Tried to add message with unknown protocol");
            e.y("protocol", coutVar.a());
            e.r();
            str = null;
            j = -1;
        }
        cozlVar.a(coto.c, j, str);
    }

    public final boolean k() {
        String str = this.e;
        String str2 = this.f;
        try {
            int b2 = b(this.d);
            int e = e(str, str2);
            boolean z = b2 == e;
            if (z) {
                csjb a2 = a.a();
                a2.I("Same number of local and remote messages.");
                a2.y("count", b2);
                a2.r();
                return z;
            }
            csjb c2 = a.c();
            c2.I("Not in sync.");
            c2.y("localCount", b2);
            c2.y("remoteCount", e);
            c2.r();
            return z;
        } catch (Exception e2) {
            csjb b3 = a.b();
            b3.I("failed to query local or remote message counts");
            b3.s(e2);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #3 {all -> 0x0059, blocks: (B:204:0x0052, B:12:0x0065), top: B:203:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5 A[Catch: all -> 0x00ac, TRY_ENTER, TryCatch #5 {all -> 0x00ac, blocks: (B:199:0x007a, B:20:0x008d, B:32:0x00b5, B:34:0x00bd, B:35:0x00cd, B:42:0x00cb), top: B:198:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l(int r33, int r34, java.util.ArrayList r35, final java.util.ArrayList r36, final defpackage.cno r37, java.util.ArrayList r38, java.util.Set r39, java.util.Set r40, defpackage.cozl r41, java.util.ArrayList r42) {
        /*
            Method dump skipped, instructions count: 1079
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqai.l(int, int, java.util.ArrayList, java.util.ArrayList, cno, java.util.ArrayList, java.util.Set, java.util.Set, cozl, java.util.ArrayList):long");
    }

    public cqai(Context context, albq albqVar, akzt akztVar, cqak cqakVar, coxk coxkVar, ffbr ffbrVar, asoa asoaVar, auxc auxcVar, ffbr ffbrVar2, Set set) {
        this.j = context;
        this.k = albqVar;
        this.m = akztVar;
        this.l = cqakVar;
        this.n = asoaVar;
        this.s = ffbrVar;
        this.o = coxkVar;
        this.t = auxcVar;
        this.u = ffbrVar2;
        int size = set.size();
        cfup cfupVar = b;
        int intValue = ((Integer) cfupVar.e()).intValue();
        int size2 = set.size();
        Object e = cfupVar.e();
        if (size <= intValue) {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.ac(set);
            this.r = new buxs(buxzVar).a(dtzu.b());
            buxz buxzVar2 = new buxz();
            buxzVar2.ac(set);
            this.d = new buxs(buxzVar2).a(dtzu.b());
            this.e = String.format("%s AND %s", s(coxkVar), q(set, "sms"));
            this.f = String.format("%s AND %s", r(coxkVar), q(set, "mms"));
            return;
        }
        throw new emyx(emyk.a("Spot sync size exceeds limit: [%s] > [%s]", Integer.valueOf(size2), e));
    }
}
