package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteDatabase;
import android.provider.ContactsContract;
import j$.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dipf {
    public final ContentResolver a;
    public final diop b;
    public final dkrx c;
    public final ctvb f;
    private final Context i;
    private ExecutorService j;
    private final ThreadFactory g = new dipc();
    private final ContentObserver h = new dipd(this);
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final AtomicBoolean e = new AtomicBoolean(false);

    public dipf(Context context, diop diopVar, dkrx dkrxVar, ctvb ctvbVar) {
        this.i = context;
        this.b = diopVar;
        this.c = dkrxVar;
        this.a = context.getContentResolver();
        this.f = ctvbVar;
    }

    public static final boolean e(int i, SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase.delete("Subscribers", "phoneId=?", new String[]{String.valueOf(i)}) > 0;
    }

    public final synchronized void a() {
        if ("com.google.android.ims".equals(this.i.getPackageName())) {
            if (!dkve.a(this.i, "android.permission.READ_CONTACTS")) {
                dkty.c("Permission to read contacts is not granted to cs apk", new Object[0]);
                return;
            }
            dkty.c("Permission to read contacts is granted to cs apk", new Object[0]);
        }
        if (this.j != null) {
            dkty.c("IMS DB syncer has already started.", new Object[0]);
            return;
        }
        dkty.c("Starting NAB to IMS DB syncer", new Object[0]);
        this.j = Executors.newSingleThreadExecutor(this.g);
        this.a.registerContentObserver(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, true, this.h);
        c();
    }

    public final synchronized void b() {
        dkty.c("Stopping NAB to IMS DB syncer", new Object[0]);
        this.a.unregisterContentObserver(this.h);
        ExecutorService executorService = this.j;
        if (executorService != null) {
            executorService.shutdownNow();
            this.j = null;
        }
    }

    public final synchronized void c() {
        if (!this.e.compareAndSet(false, true)) {
            dkty.c("DB sync is already running", new Object[0]);
        } else if (Objects.isNull(this.j)) {
            dkty.g("Executor not initialized", new Object[0]);
        } else {
            this.j.submit(new Runnable() { // from class: dipb
                /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|13|7|8|9|(3:37|38|(1:40)(11:41|42|43|(2:44|(4:46|(2:51|47)|54|(4:88|89|(1:90)|93)(5:56|(4:58|(1:60)|61|(7:63|64|(1:66)(3:80|(1:82)(1:84)|83)|67|(1:79)(1:71)|72|(1:74)(1:78))(2:85|77))(2:86|87)|75|76|77))(1:106))|94|(2:97|95)|98|99|100|(1:102)|(4:19|(4:22|(3:28|29|30)(3:24|25|26)|27|20)|31|32)(1:34)))|11|12|13|14|(2:(0)|(3:16|17|(0)(0)))) */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x01db, code lost:
                
                    if (((java.lang.Integer) defpackage.diph.a(r6, new defpackage.diou()).orElse(0)).intValue() > 0) goto L77;
                 */
                /* JADX WARN: Removed duplicated region for block: B:19:0x01e5  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0217 A[ORIG_RETURN, RETURN] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 558
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dipb.run():void");
                }
            });
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(3:3|(1:5)(1:32)|6)(1:33)|(1:8)(1:31)|9|(1:11)(1:30)|12|(2:16|(3:18|19|(1:21)(1:23)))|24|25|26|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        defpackage.dkty.i(r11, "Insert operation failed", new java.lang.Object[0]);
        r11 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.database.Cursor r11, android.database.sqlite.SQLiteDatabase r12) {
        /*
            r10 = this;
            r0 = 1
            long r1 = r11.getLong(r0)
            r3 = 0
            long r4 = r11.getLong(r3)
            r6 = 2
            java.lang.String r6 = r11.getString(r6)
            r7 = 3
            int r11 = r11.getInt(r7)
            android.content.ContentValues r7 = new android.content.ContentValues
            r8 = 8
            r7.<init>(r8)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "phoneId"
            r7.put(r5, r4)
            java.lang.String r4 = "nativeNumber"
            if (r6 == 0) goto L3b
            boolean r5 = defpackage.dizg.w()
            if (r5 == 0) goto L30
            r5 = r6
            goto L36
        L30:
            ctvb r5 = r10.f
            java.lang.String r5 = r5.x(r6)
        L36:
            r7.put(r4, r6)
            r6 = r5
            goto L3e
        L3b:
            r7.putNull(r4)
        L3e:
            if (r6 == 0) goto L45
            boolean r4 = android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(r6)
            goto L46
        L45:
            r4 = r3
        L46:
            java.lang.String r5 = "number"
            if (r4 == 0) goto L4e
            r7.put(r5, r6)
            goto L51
        L4e:
            r7.putNull(r5)
        L51:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r5 = "dataVersion"
            r7.put(r5, r11)
            java.lang.Long r11 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "contactId"
            r7.put(r1, r11)
            java.lang.String r11 = "Subscribers"
            r1 = 0
            if (r4 == 0) goto L97
            boolean r4 = j$.util.Objects.isNull(r6)
            if (r4 != 0) goto L97
            diop r4 = r10.b
            dipa r4 = (defpackage.dipa) r4
            android.database.sqlite.SQLiteDatabase r4 = r4.getReadableDatabase()
            java.lang.String r5 = "SELECT COUNT(*) FROM Subscribers WHERE number=? AND phoneId = 0 AND contactId = 0"
            android.database.sqlite.SQLiteStatement r4 = r4.compileStatement(r5)
            r4.bindString(r0, r6)
            long r8 = r4.simpleQueryForLong()
            r4.close()
            int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r4 <= 0) goto L97
            java.lang.String[] r4 = new java.lang.String[]{r6}
            java.lang.String r5 = "number=?"
            int r11 = r12.update(r11, r7, r5, r4)
            long r11 = (long) r11
            goto Lb9
        L97:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "state"
            r7.put(r5, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            java.lang.String r5 = "date"
            r7.put(r5, r4)
            r4 = 0
            long r11 = r12.insertOrThrow(r11, r4, r7)     // Catch: java.lang.Exception -> Laf
            goto Lb9
        Laf:
            r11 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.String r4 = "Insert operation failed"
            defpackage.dkty.i(r11, r4, r12)
            r11 = -1
        Lb9:
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 <= 0) goto Lbe
            return r0
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dipf.d(android.database.Cursor, android.database.sqlite.SQLiteDatabase):boolean");
    }
}
