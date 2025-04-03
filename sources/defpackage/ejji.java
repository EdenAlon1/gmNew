package defpackage;

import android.content.ContentValues;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejji implements ejiq {
    public final eyfc a;
    public final errl b;
    public final efiv c;
    public final dlpw d;
    public final eyhs e;
    public final long f;

    public ejji(ejin ejinVar, dlpw dlpwVar, eyfc eyfcVar, errl errlVar, ejis ejisVar) {
        this.d = dlpwVar;
        this.a = eyfcVar;
        this.b = errlVar;
        ejip ejipVar = (ejip) ejisVar;
        this.e = ejipVar.a;
        long millis = TimeUnit.DAYS.toMillis(7L);
        emxf.b(millis < 0 || ejipVar.c < 0 || millis > 0, "If expireAfterWriteDays and filterAfterWrite are both set, filterAfterWrite must be a shorter duration");
        if (millis > 0) {
            this.f = millis;
        } else {
            this.f = -1L;
        }
        efkg efkgVar = new efkg("evict_full_cache_trigger");
        efkgVar.c("AFTER INSERT ON cache_table");
        c(efkgVar, ejisVar);
        efkg efkgVar2 = new efkg("recursive_eviction_trigger");
        efkgVar2.c("AFTER DELETE ON cache_table");
        c(efkgVar2, ejisVar);
        efke efkeVar = new efke();
        efkd.a("recursive_triggers = 1", efkeVar);
        efkd.a("synchronous = 0", efkeVar);
        efkc efkcVar = new efkc();
        efkcVar.c("CREATE TABLE cache_table(request_data BLOB PRIMARY KEY, response_data BLOB NOT NULL, write_ms INTEGER NOT NULL, access_ms INTEGER NOT NULL)");
        efkcVar.c("ALTER TABLE cache_table ADD COLUMN invalid_flag INTEGER NOT NULL DEFAULT 0");
        efkcVar.c("DELETE FROM cache_table WHERE LENGTH(response_data) >= 2000000");
        efkcVar.b(new efki() { // from class: ejjd
            @Override // defpackage.efki
            public final void a(efks efksVar) {
            }
        });
        efkcVar.c("CREATE INDEX access ON cache_table(access_ms)");
        efkcVar.d(efkgVar.a());
        efkcVar.d(efkgVar2.a());
        efkcVar.a = efkeVar;
        efkj a = efkcVar.a();
        final ekqk ekqkVar = new ekqk(ejipVar.d, 2);
        final ejem ejemVar = ejinVar.a;
        efix efixVar = ejemVar.b;
        emxf.a(!"SqliteKeyValueCache:ProfileCache".contains(File.separator));
        this.c = efixVar.a(new erog() { // from class: ejek
            public final /* synthetic */ String c = "SqliteKeyValueCache:ProfileCache";

            @Override // defpackage.erog
            public final ListenableFuture a() {
                final ejej a2 = ejem.this.a.a(ekqkVar, this.c.concat(".db"));
                return erny.f(a2.b.submit(eldl.m(new Callable() { // from class: ejei
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        File a3 = ejej.this.a.a();
                        File parentFile = a3.getParentFile();
                        if (parentFile.mkdirs() || (parentFile.exists() && parentFile.isDirectory())) {
                            return a3;
                        }
                        throw new FileNotFoundException("Cannot create parent directory.");
                    }
                })), eldl.a(new emwl() { // from class: ejel
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return ((File) obj).getAbsolutePath();
                    }
                }), erpp.a);
            }
        }, a);
    }

    private static final void c(efkg efkgVar, ejis ejisVar) {
        efkgVar.c(" WHEN (");
        ejip ejipVar = (ejip) ejisVar;
        if (ejipVar.b > 0) {
            efkgVar.c("(SELECT SUM(LENGTH(request_data) + LENGTH(response_data)) > ");
            efkgVar.b(ejipVar.b);
            efkgVar.c(" AND COUNT(*) > 1 FROM cache_table) ");
        } else {
            efkgVar.c("(SELECT COUNT(*) > ");
            efkgVar.b(0);
            efkgVar.c(" FROM cache_table) ");
        }
        efkgVar.c(") BEGIN DELETE FROM cache_table WHERE rowid=(SELECT rowid FROM cache_table ORDER BY access_ms LIMIT 1); END");
    }

    @Override // defpackage.ejiq
    public final ListenableFuture a(final eyhs eyhsVar) {
        return this.c.d(new efkq() { // from class: ejjc
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00a1, code lost:
            
                if (r0 != null) goto L14;
             */
            @Override // defpackage.efkq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(defpackage.efks r9) {
                /*
                    r8 = this;
                    efko r0 = new efko
                    r0.<init>()
                    java.lang.String r1 = "SELECT response_data, write_ms FROM cache_table WHERE request_data=?"
                    r0.b(r1)
                    eyhs r1 = r2
                    byte[] r2 = r1.toByteArray()
                    r0.e(r2)
                    ejji r2 = defpackage.ejji.this
                    long r3 = r2.f
                    r5 = 0
                    int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r3 <= 0) goto L36
                    java.lang.String r3 = " AND write_ms>=?"
                    r0.b(r3)
                    dlpw r3 = r2.d
                    j$.time.Instant r3 = r3.f()
                    long r3 = r3.toEpochMilli()
                    long r5 = r2.f
                    long r3 = r3 - r5
                    java.lang.Long r3 = java.lang.Long.valueOf(r3)
                    r0.c(r3)
                L36:
                    efkn r0 = r0.a()
                    android.database.Cursor r0 = r9.d(r0)
                    boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> La7
                    if (r3 == 0) goto L9f
                    java.lang.String r3 = "response_data"
                    int r3 = r0.getColumnIndexOrThrow(r3)     // Catch: java.lang.Throwable -> La7
                    byte[] r3 = r0.getBlob(r3)     // Catch: java.lang.Throwable -> La7
                    java.lang.String r4 = "write_ms"
                    int r4 = r0.getColumnIndexOrThrow(r4)     // Catch: java.lang.Throwable -> La7
                    long r4 = r0.getLong(r4)     // Catch: java.lang.Throwable -> La7
                    j$.time.Instant r4 = j$.time.Instant.ofEpochMilli(r4)     // Catch: java.lang.Throwable -> La7
                    efko r5 = new efko     // Catch: java.lang.Throwable -> La7
                    r5.<init>()     // Catch: java.lang.Throwable -> La7
                    java.lang.String r6 = "UPDATE OR FAIL cache_table SET access_ms=?"
                    r5.b(r6)     // Catch: java.lang.Throwable -> La7
                    dlpw r6 = r2.d     // Catch: java.lang.Throwable -> La7
                    j$.time.Instant r6 = r6.f()     // Catch: java.lang.Throwable -> La7
                    long r6 = r6.toEpochMilli()     // Catch: java.lang.Throwable -> La7
                    java.lang.String r6 = java.lang.Long.toString(r6)     // Catch: java.lang.Throwable -> La7
                    r5.d(r6)     // Catch: java.lang.Throwable -> La7
                    java.lang.String r6 = " WHERE request_data=?"
                    r5.b(r6)     // Catch: java.lang.Throwable -> La7
                    byte[] r1 = r1.toByteArray()     // Catch: java.lang.Throwable -> La7
                    r5.e(r1)     // Catch: java.lang.Throwable -> La7
                    efkn r1 = r5.a()     // Catch: java.lang.Throwable -> La7
                    r9.g(r1)     // Catch: java.lang.Throwable -> La7
                    eyhs r9 = r2.e     // Catch: java.lang.Throwable -> La7
                    eyfc r1 = r2.a     // Catch: java.lang.Throwable -> La7
                    eyhs r9 = com.google.protobuf.contrib.android.ProtoParsers.h(r3, r9, r1)     // Catch: java.lang.Throwable -> La7
                    ejjb r1 = new ejjb     // Catch: java.lang.Throwable -> La7
                    r1.<init>(r9, r4)     // Catch: java.lang.Throwable -> La7
                    emxc r9 = defpackage.emxc.j(r1)     // Catch: java.lang.Throwable -> La7
                    if (r0 == 0) goto L9e
                    goto La3
                L9e:
                    return r9
                L9f:
                    emux r9 = defpackage.emux.a     // Catch: java.lang.Throwable -> La7
                    if (r0 == 0) goto La6
                La3:
                    r0.close()
                La6:
                    return r9
                La7:
                    r9 = move-exception
                    if (r0 == 0) goto Lb2
                    r0.close()     // Catch: java.lang.Throwable -> Lae
                    goto Lb2
                Lae:
                    r0 = move-exception
                    r9.addSuppressed(r0)
                Lb2:
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ejjc.a(efks):java.lang.Object");
            }
        });
    }

    @Override // defpackage.ejiq
    public final ListenableFuture b(final eyhs eyhsVar, ListenableFuture listenableFuture) {
        return elfl.g(listenableFuture).i(new eroh() { // from class: ejjf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final eyhs eyhsVar2 = (eyhs) obj;
                final ejji ejjiVar = ejji.this;
                final eyhs eyhsVar3 = eyhsVar;
                return ejjiVar.c.e(new efkr() { // from class: ejje
                    @Override // defpackage.efkr
                    public final void a(efks efksVar) {
                        eyhs eyhsVar4 = eyhsVar2;
                        eyhsVar4.getClass();
                        long epochMilli = ejji.this.d.f().toEpochMilli();
                        byte[] byteArray = eyhsVar4.toByteArray();
                        ContentValues contentValues = new ContentValues(5);
                        int length = byteArray.length;
                        emxf.d(length < 2000000, "Message exceeds 2MB limit. Was %s bytes", length);
                        contentValues.put("request_data", eyhsVar3.toByteArray());
                        contentValues.put("response_data", byteArray);
                        Long valueOf = Long.valueOf(epochMilli);
                        contentValues.put("write_ms", valueOf);
                        contentValues.put("access_ms", valueOf);
                        efksVar.c("cache_table", contentValues, 5);
                    }
                });
            }
        }, erpp.a);
    }
}
