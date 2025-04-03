package com.google.android.ims.rcsservice.businessinfo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoContentProvider;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.csix;
import defpackage.diyr;
import defpackage.dktx;
import defpackage.dkty;
import defpackage.emux;
import defpackage.emxc;
import defpackage.engw;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BusinessInfoDatabase extends SQLiteOpenHelper {
    protected static final String BUSINESS_INFO_METADATA_SELECTION_ON_RBM_BOT_ID = "rbm_bot_id = ?";
    private static final String BUSINESS_INFO_METADATA_TABLE_DROP = "DROP TABLE IF EXISTS business_info_metadata";
    private static final String BUSINESS_INFO_METADATA_TABLE_HEAD_CREATE_SQL = "CREATE TABLE IF NOT EXISTS business_info_metadata ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL, version TEXT, expiry_milliseconds INTEGER NOT NULL DEFAULT 0,  FOREIGN KEY (rbm_bot_id) REFERENCES business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE);";
    private static final String BUSINESS_INFO_METADATA_TABLE_V_3_CREATE_SQL = "CREATE TABLE IF NOT EXISTS business_info_metadata ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL, version TEXT, expiry_milliseconds INTEGER NOT NULL DEFAULT 0,  FOREIGN KEY (rbm_bot_id) REFERENCES business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE);";
    protected static final String BUSINESS_INFO_PROPERTIES_SELECTION_ON_RBM_BOT_ID = "rbm_bot_id = ?";
    private static final String BUSINESS_INFO_PROPERTIES_TABLE_DROP = "DROP TABLE IF EXISTS business_info_properties";
    private static final String BUSINESS_INFO_PROPERTIES_TABLE_HEAD_CREATE_SQL = "CREATE TABLE IF NOT EXISTS business_info_properties ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL, type INTEGER NOT NULL DEFAULT 0, header TEXT, subheader TEXT, value TEXT, importance INTEGER NOT NULL DEFAULT 0,  FOREIGN KEY (rbm_bot_id) REFERENCES business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE);";
    private static final String BUSINESS_INFO_PROPERTIES_TABLE_V_3_CREATE_SQL = "CREATE TABLE IF NOT EXISTS business_info_properties ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL, type INTEGER NOT NULL DEFAULT 0, header TEXT, subheader TEXT, value TEXT, importance INTEGER NOT NULL DEFAULT 0,  FOREIGN KEY (rbm_bot_id) REFERENCES business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE);";
    public static final String BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID = "rbm_bot_id = ?";
    private static final String BUSINESS_INFO_TABLE_DROP = "DROP TABLE IF EXISTS business_info";
    private static final String BUSINESS_INFO_TABLE_HEAD_CREATE_SQL = "CREATE TABLE IF NOT EXISTS business_info ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL UNIQUE, name TEXT, logo_image_remote_url TEXT, logo_image_local_uri TEXT, description TEXT, color TEXT, verification_status INTEGER NOT NULL DEFAULT 0, hero_image_remote_url TEXT, hero_image_local_uri TEXT, verifier_id TEXT );";
    private static final String BUSINESS_INFO_TABLE_V_3_COLUMNS = "_id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL UNIQUE, name TEXT, logo_image_remote_url TEXT, logo_image_local_uri TEXT, description TEXT, color TEXT, verification_status INTEGER NOT NULL DEFAULT 0, hero_image_remote_url TEXT, hero_image_local_uri TEXT";
    private static final String BUSINESS_INFO_TABLE_V_3_CREATE_SQL = "CREATE TABLE IF NOT EXISTS business_info ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL UNIQUE, name TEXT, logo_image_remote_url TEXT, logo_image_local_uri TEXT, description TEXT, color TEXT, verification_status INTEGER NOT NULL DEFAULT 0, hero_image_remote_url TEXT, hero_image_local_uri TEXT);";
    private static final String BUSINESS_INFO_WITH_VERIFIER_VIEW_DROP = "DROP VIEW IF EXISTS business_info_and_verifier_info";
    private static final String BUSINESS_INFO_WITH_VERIFIER_VIEW_HEAD_CREATE_SQL = "CREATE VIEW IF NOT EXISTS business_info_and_verifier_info AS SELECT " + qualifyWithBusinessInfoTable("rbm_bot_id") + ", " + qualifyWithBusinessInfoTable("name") + ", " + qualifyWithBusinessInfoTable("logo_image_remote_url") + ", " + qualifyWithBusinessInfoTable("logo_image_local_uri") + ", " + qualifyWithBusinessInfoTable("description") + ", " + qualifyWithBusinessInfoTable(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR) + ", " + qualifyWithBusinessInfoTable(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS) + ", " + qualifyWithBusinessInfoTable(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL) + ", " + qualifyWithBusinessInfoTable(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI) + ", " + qualifyWithVerifierInfoTable("verifier_id") + ", " + qualifyWithVerifierInfoTable("name") + " AS verifier_name, " + qualifyWithVerifierInfoTable("description") + " AS verifier_description, " + qualifyWithVerifierInfoTable("logo_image_remote_url") + " AS verifier_logo_image_remote_url, " + qualifyWithVerifierInfoTable("logo_image_local_uri") + " AS verifier_logo_image_local_uri FROM business_info LEFT JOIN business_verifier_info ON " + qualifyWithBusinessInfoTable("verifier_id") + " = " + qualifyWithVerifierInfoTable("verifier_id") + ";";
    protected static final String BUSINESS_VERIFIER_INFO_SELECTION_ON_RBM_BOT_ID = "verifier_id IN (SELECT verifier_id FROM business_info WHERE rbm_bot_id = ?)";
    private static final String BUSINESS_VERIFIER_INFO_TABLE_DROP = "DROP TABLE IF EXISTS business_verifier_info";
    private static final String BUSINESS_VERIFIER_INFO_TABLE_HEAD_CREATE_SQL = "CREATE TABLE IF NOT EXISTS business_verifier_info ( verifier_id TEXT PRIMARY KEY, name TEXT, description TEXT, logo_image_remote_url TEXT, logo_image_local_uri TEXT);";
    private static final String DATABASE_NAME = "business_info";
    public static final int DATABASE_VERSION = 5;
    private static BusinessInfoDatabase instance;
    private final Context context;

    private BusinessInfoDatabase(Context context) {
        super(context, "business_info", (SQLiteDatabase.CursorFactory) null, 5);
        this.context = context;
    }

    public static void clearInstance() {
        BusinessInfoDatabase businessInfoDatabase = instance;
        if (businessInfoDatabase != null) {
            businessInfoDatabase.close();
        }
        instance = null;
    }

    private static void dropAllTables(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(BUSINESS_INFO_TABLE_DROP);
        sQLiteDatabase.execSQL(BUSINESS_INFO_PROPERTIES_TABLE_DROP);
        sQLiteDatabase.execSQL(BUSINESS_INFO_METADATA_TABLE_DROP);
        sQLiteDatabase.execSQL(BUSINESS_VERIFIER_INFO_TABLE_DROP);
        sQLiteDatabase.execSQL(BUSINESS_INFO_WITH_VERIFIER_VIEW_DROP);
    }

    public static synchronized BusinessInfoDatabase getInstance(Context context) {
        BusinessInfoDatabase businessInfoDatabase;
        synchronized (BusinessInfoDatabase.class) {
            if (instance == null) {
                instance = new BusinessInfoDatabase(context);
            }
            businessInfoDatabase = instance;
        }
        return businessInfoDatabase;
    }

    private String getStringDatabaseColumn(String str, String str2) {
        Cursor query = getReadableDatabase().query(BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.VIEW_NAME, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.DEFAULT_PROJECTION, BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID, new String[]{str}, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndex(str2));
                    query.close();
                    return string;
                }
            } finally {
            }
        }
        if (query == null) {
            return null;
        }
        query.close();
        return null;
    }

    private boolean insertBusinessInfoProperty(String str, int i, String str2, String str3, String str4, int i2) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues(6);
        contentValues.put("rbm_bot_id", str);
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(i));
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER, str2);
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.SUBHEADER, str3);
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, str4);
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.IMPORTANCE, Integer.valueOf(i2));
        return writableDatabase.insert(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.TABLE_NAME, null, contentValues) > 0;
    }

    private boolean insertOrReplaceVerifierInfo(String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("verifier_id", str);
        contentValues.put("name", str2);
        contentValues.put("logo_image_remote_url", str3);
        dkty.k("Insert-or-replacing verifier info for verifierId %s", dktx.GENERIC.c(str));
        return getWritableDatabase().replace(BusinessInfoDatabaseConstants.BusinessVerifierInfoTableConstants.TABLE_NAME, null, contentValues) > 0;
    }

    private boolean insertOrUpdateBusinessInfo(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        String[] strArr = {str};
        Cursor query = writableDatabase.query("business_info", BusinessInfoDatabaseConstants.BusinessInfoTableConstants.DEFAULT_PROJECTION, BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID, strArr, null, null, null);
        try {
            boolean moveToFirst = query.moveToFirst();
            if (query != null) {
                query.close();
            }
            ContentValues contentValues = new ContentValues(8);
            contentValues.put("rbm_bot_id", str);
            contentValues.put("name", str2);
            contentValues.put("logo_image_remote_url", str3);
            contentValues.put("description", str4);
            contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR, str5);
            contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, Integer.valueOf(i));
            contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL, str6);
            contentValues.put("verifier_id", str7);
            if (moveToFirst) {
                dkty.k("Business info already exists for botId %s, updating", dkty.a(str));
                return writableDatabase.update("business_info", contentValues, BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID, strArr) > 0;
            }
            dkty.k("Inserting new business info for botId %s", dkty.a(str));
            return writableDatabase.insert("business_info", null, contentValues) > 0;
        } catch (Throwable th) {
            if (query == null) {
                throw th;
            }
            try {
                query.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private static void logUpgradeProgress(int i, int i2) {
        dkty.k("Database upgraded to version %d. True database version is version %d", Integer.valueOf(i), Integer.valueOf(i2));
    }

    private static void logUpgradeStart(int i, int i2) {
        dkty.k("Database upgrade started from version %d to %d.", Integer.valueOf(i), Integer.valueOf(i2));
    }

    private static String qualifyWithBusinessInfoTable(String str) {
        return "business_info.".concat(String.valueOf(str));
    }

    private static String qualifyWithVerifierInfoTable(String str) {
        return "business_verifier_info.".concat(String.valueOf(str));
    }

    public static synchronized BusinessInfoDatabase recreateInstanceForTestsOnly(Context context, int i) {
        BusinessInfoDatabase businessInfoDatabase;
        synchronized (BusinessInfoDatabase.class) {
            clearInstance();
            businessInfoDatabase = new BusinessInfoDatabase(context, i);
            instance = businessInfoDatabase;
        }
        return businessInfoDatabase;
    }

    private boolean removeBusinessInfoPropertiesInTransaction(String str) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        csix.k(writableDatabase.inTransaction());
        return writableDatabase.delete(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.TABLE_NAME, BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID, new String[]{str}) > 0;
    }

    public void createV3Db(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(BUSINESS_INFO_TABLE_V_3_CREATE_SQL);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS business_info_properties ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL, type INTEGER NOT NULL DEFAULT 0, header TEXT, subheader TEXT, value TEXT, importance INTEGER NOT NULL DEFAULT 0,  FOREIGN KEY (rbm_bot_id) REFERENCES business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS business_info_metadata ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL, version TEXT, expiry_milliseconds INTEGER NOT NULL DEFAULT 0,  FOREIGN KEY (rbm_bot_id) REFERENCES business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE);");
    }

    public emxc<String> getBusinessInfoVersion(String str) {
        emxc<String> j;
        try {
            Cursor query = getReadableDatabase().query(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.TABLE_NAME, new String[]{BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION}, BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID, new String[]{str}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION));
                        j = TextUtils.isEmpty(string) ? emux.a : emxc.j(string);
                        query.close();
                        return j;
                    }
                } catch (Throwable th) {
                    if (query == null) {
                        throw th;
                    }
                    try {
                        query.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            j = emux.a;
            if (query == null) {
                return j;
            }
            query.close();
            return j;
        } catch (Exception e) {
            dkty.i(e, "Exception retrieving business info version for %s", dkty.a(str));
            return emux.a;
        }
    }

    public String getLocalMediaPath(String str, int i) {
        if (i == 0) {
            return getStringDatabaseColumn(str, "logo_image_local_uri");
        }
        if (i == 1) {
            return getStringDatabaseColumn(str, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI);
        }
        if (i == 2) {
            return getStringDatabaseColumn(str, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_LOCAL_URI);
        }
        dkty.q("Cannot get local media uri, incorrect media type for %s", dkty.a(str));
        return null;
    }

    public engw<String> getRbmBotIds() {
        Cursor query = getReadableDatabase().query("business_info", new String[]{"rbm_bot_id"}, null, null, null, null, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            if (query.getCount() > 0) {
                while (query.moveToNext()) {
                    String string = query.getString(query.getColumnIndex("rbm_bot_id"));
                    if (string != null) {
                        arrayList.add(string);
                    }
                }
            }
            engw<String> n = engw.n(arrayList);
            if (query != null) {
                query.close();
            }
            return n;
        } catch (Throwable th) {
            if (query == null) {
                throw th;
            }
            try {
                query.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public String getRemoteMediaPath(String str, int i) {
        if (i == 0) {
            return getStringDatabaseColumn(str, "logo_image_remote_url");
        }
        if (i == 1) {
            return getStringDatabaseColumn(str, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_REMOTE_URL);
        }
        if (i == 2) {
            return getStringDatabaseColumn(str, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL);
        }
        dkty.g("Cannot get remote media url, incorrect media type for %s", dkty.a(str));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public boolean insertOrUpdateBusinessInfoData(BusinessInfoData businessInfoData) {
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        if (businessInfoData == null) {
            dkty.g("Cannot insert or update null BusinessInfoData", new Object[0]);
            return false;
        }
        String rbmBotId = businessInfoData.getRbmBotId();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            try {
                try {
                    if (!insertOrUpdateBusinessInfo(rbmBotId, businessInfoData.getName(), businessInfoData.getLogoImageRemoteUrl(), businessInfoData.getDescription(), businessInfoData.getColor(), businessInfoData.getVerificationStatus(), businessInfoData.getHeroImageRemoteUrl(), businessInfoData.getVerifierId())) {
                        dkty.g("Unable to insert business info for rbmBotId %s", dkty.a(rbmBotId));
                    } else if (!diyr.d() || insertOrReplaceVerifierInfo(businessInfoData.getVerifierId(), businessInfoData.getVerifierName(), businessInfoData.getVerifierLogoImageRemoteUrl())) {
                        removeBusinessInfoPropertiesInTransaction(rbmBotId);
                        Iterator<BusinessInfoProperty> it = businessInfoData.getProperties().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                writableDatabase.setTransactionSuccessful();
                                BusinessInfoContentProvider.BusinessInfoContentProviderInternal.notifyBusinessInfoChanged(this.context, rbmBotId);
                                BusinessInfoContentProvider.BusinessInfoContentProviderInternal.notifyBusinessInfoPropertiesChanged(this.context, rbmBotId);
                                r1 = 1;
                                break;
                            }
                            BusinessInfoProperty next = it.next();
                            if (!insertBusinessInfoProperty(rbmBotId, next.getPropertyType(), next.getHeader(), next.getSubHeader(), next.getValue(), next.getImportance())) {
                                dkty.g("Unable to insert business info property %s for rbmBotId %s", next, dkty.a(rbmBotId));
                                break;
                            }
                        }
                    } else {
                        dkty.g("Unable to insert verifier info for rbmBotId %s", dkty.a(rbmBotId));
                    }
                } catch (Exception e) {
                    e = e;
                    Exception exc = e;
                    Object[] objArr = new Object[2];
                    objArr[r1] = dkty.a(rbmBotId);
                    objArr[1] = exc;
                    dkty.g("Exception inserting business info for rbmBotId %s: %s", objArr);
                    writableDatabase.endTransaction();
                    return r1;
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (Exception e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            writableDatabase.endTransaction();
            throw th22;
        }
        writableDatabase.endTransaction();
        return r1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean insertOrUpdateBusinessInfoMetadata(java.lang.String r15, java.lang.String r16, long r17) {
        /*
            r14 = this;
            java.lang.String r0 = defpackage.dkty.a(r15)
            java.lang.String r1 = defpackage.dkty.a(r16)
            java.lang.Long r2 = java.lang.Long.valueOf(r17)
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r1 = 2
            r4[r1] = r2
            java.lang.String r1 = "Updating bot info metadata for bot id: {%s} with e-tag: {%s} and expiry %s."
            defpackage.dkty.k(r1, r4)
            android.database.sqlite.SQLiteDatabase r6 = r14.getWritableDatabase()
            java.lang.String[] r10 = new java.lang.String[]{r15}
            java.lang.String[] r8 = com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.DEFAULT_PROJECTION
            r12 = 0
            r13 = 0
            java.lang.String r7 = "business_info_metadata"
            java.lang.String r9 = "rbm_bot_id = ?"
            r11 = 0
            android.database.Cursor r1 = r6.query(r7, r8, r9, r10, r11, r12, r13)
            if (r1 == 0) goto L47
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L47
            r4 = r0
            goto L48
        L3c:
            r0 = move-exception
            r15 = r0
            r1.close()     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r0 = move-exception
            r15.addSuppressed(r0)
        L46:
            throw r15
        L47:
            r4 = r5
        L48:
            if (r1 == 0) goto L4d
            r1.close()
        L4d:
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>(r3)
            java.lang.String r3 = "rbm_bot_id"
            r1.put(r3, r15)
            java.lang.String r3 = "version"
            r7 = r16
            r1.put(r3, r7)
            java.lang.String r3 = "expiry_milliseconds"
            r1.put(r3, r2)
            java.lang.String r2 = "business_info_metadata"
            if (r4 == 0) goto L7c
            java.lang.String r15 = defpackage.dkty.a(r15)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r5] = r15
            java.lang.String r15 = "Bot info metadata already exists for bot id: {%s}. Updating row..."
            defpackage.dkty.k(r15, r3)
            int r15 = r6.update(r2, r1, r9, r10)
            if (r15 <= 0) goto L7b
            return r0
        L7b:
            return r5
        L7c:
            java.lang.String r15 = defpackage.dkty.a(r15)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r5] = r15
            java.lang.String r15 = "Inserting new bot info metadata for bot id: {%s}."
            defpackage.dkty.k(r15, r3)
            r15 = 0
            long r1 = r6.insert(r2, r15, r1)
            r3 = 0
            int r15 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r15 <= 0) goto L95
            return r0
        L95:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase.insertOrUpdateBusinessInfoMetadata(java.lang.String, java.lang.String, long):boolean");
    }

    public boolean isMediaLocallyAvailable(String str, int i) {
        boolean z;
        String localMediaPath = getLocalMediaPath(str, i);
        if (TextUtils.isEmpty(localMediaPath)) {
            return false;
        }
        try {
            Cursor query = this.context.getContentResolver().query(Uri.parse(localMediaPath), null, null, null, null);
            try {
                query.getClass();
                if (query.moveToFirst()) {
                    if (query.getLong(query.getColumnIndex("_size")) > 0) {
                        z = true;
                        query.close();
                        return z;
                    }
                }
                z = false;
                query.close();
                return z;
            } finally {
            }
        } catch (Exception e) {
            dkty.i(e, "Cannot determine media file availability for botId %s.", dkty.a(str));
            return false;
        }
    }

    public boolean isMetadataLocallyAvailable(String str) {
        try {
            Cursor query = getReadableDatabase().query(BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.VIEW_NAME, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.DEFAULT_PROJECTION, BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID, new String[]{str}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        if (query.getCount() > 1) {
                            dkty.g("Multiple business info rows detected for %s", dkty.a(str));
                            csix.c("Multiple business info rows detected");
                            query.close();
                            return true;
                        }
                        if (diyr.d() && BusinessInfoData.getVerifiedBotPlatform(str) == 1 && TextUtils.isEmpty(query.getString(query.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.Columns.VERIFIER_LOGO_IMAGE_REMOTE_URL)))) {
                            dkty.k("Historical business info is present for %s, but does not contain verifier information (and feature is enabled).", dkty.a(str));
                            query.close();
                            return false;
                        }
                        dkty.k("Business info is locally available for bot id %s.", dkty.a(str));
                        query.close();
                        return true;
                    }
                } finally {
                }
            }
            dkty.k("Business info not available for %s", dkty.a(str));
            if (query != null) {
                query.close();
            }
            return false;
        } catch (Exception e) {
            dkty.i(e, "Exception while determining business info availability for %s", dkty.a(str));
            return false;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(BUSINESS_INFO_TABLE_HEAD_CREATE_SQL);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS business_info_properties ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL, type INTEGER NOT NULL DEFAULT 0, header TEXT, subheader TEXT, value TEXT, importance INTEGER NOT NULL DEFAULT 0,  FOREIGN KEY (rbm_bot_id) REFERENCES business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS business_info_metadata ( _id INTEGER PRIMARY KEY AUTOINCREMENT, rbm_bot_id TEXT NOT NULL, version TEXT, expiry_milliseconds INTEGER NOT NULL DEFAULT 0,  FOREIGN KEY (rbm_bot_id) REFERENCES business_info(rbm_bot_id) ON DELETE CASCADE ON UPDATE CASCADE);");
        sQLiteDatabase.execSQL(BUSINESS_VERIFIER_INFO_TABLE_HEAD_CREATE_SQL);
        sQLiteDatabase.execSQL(BUSINESS_INFO_WITH_VERIFIER_VIEW_HEAD_CREATE_SQL);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        dkty.k("Beginning database upgrade procedure...", new Object[0]);
        if (i < 3) {
            logUpgradeStart(i, i2);
            dropAllTables(sQLiteDatabase);
            createV3Db(sQLiteDatabase);
            logUpgradeProgress(3, i2);
        }
        if (i < 4) {
            logUpgradeStart(i, i2);
            sQLiteDatabase.execSQL(BUSINESS_VERIFIER_INFO_TABLE_HEAD_CREATE_SQL);
            sQLiteDatabase.execSQL("ALTER TABLE business_info ADD COLUMN verifier_id TEXT ");
            logUpgradeProgress(4, i2);
        }
        if (i < 5) {
            logUpgradeStart(i, i2);
            sQLiteDatabase.execSQL(BUSINESS_INFO_WITH_VERIFIER_VIEW_HEAD_CREATE_SQL);
            logUpgradeProgress(5, i2);
        }
        dkty.k("Database upgrade completed. Database is now version %d.", Integer.valueOf(i2));
    }

    public Long queryExpiryMillisByBotId(String str) {
        Cursor query = getReadableDatabase().query(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.TABLE_NAME, new String[]{BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS}, BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID, new String[]{str}, null, null, null);
        try {
            int columnIndex = query.getColumnIndex(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.EXPIRY_MILLISECONDS);
            Long l = null;
            if (query.moveToFirst() && !query.isNull(columnIndex)) {
                l = Long.valueOf(query.getLong(columnIndex));
            }
            if (query != null) {
                query.close();
            }
            return l;
        } catch (Throwable th) {
            if (query == null) {
                throw th;
            }
            try {
                query.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public boolean updateLocalUri(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            String[] strArr = {str};
            ContentValues contentValues = new ContentValues();
            String str3 = "logo_image_local_uri";
            String str4 = "business_info";
            String str5 = BUSINESS_INFO_SELECTION_ON_RBM_BOT_ID;
            if (i != 0) {
                if (i == 1) {
                    str3 = BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.HERO_IMAGE_LOCAL_URI;
                } else {
                    if (i != 2) {
                        return false;
                    }
                    str5 = BUSINESS_VERIFIER_INFO_SELECTION_ON_RBM_BOT_ID;
                    str4 = BusinessInfoDatabaseConstants.BusinessVerifierInfoTableConstants.TABLE_NAME;
                }
            }
            contentValues.put(str3, str2);
            if (writableDatabase.update(str4, contentValues, str5, strArr) > 0) {
                return true;
            }
        }
        return false;
    }

    private BusinessInfoDatabase(Context context, int i) {
        super(context, "business_info", (SQLiteDatabase.CursorFactory) null, i);
        this.context = context;
    }
}
