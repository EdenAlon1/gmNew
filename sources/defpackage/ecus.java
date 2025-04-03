package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecus implements ecux {
    public static final Map a = new cmh();
    public static final String[] b = {"key", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE};
    public final ContentResolver c;
    public final Uri d;
    private final ContentObserver e;
    private volatile Map g;
    private final Object f = new Object();
    private final List h = new ArrayList();

    private ecus(ContentResolver contentResolver, Uri uri) {
        contentResolver.getClass();
        uri.getClass();
        this.c = contentResolver;
        this.d = uri;
        this.e = new ecur(this);
    }

    static synchronized void b() {
        synchronized (ecus.class) {
            for (ecus ecusVar : a.values()) {
                ecusVar.c.unregisterContentObserver(ecusVar.e);
            }
            a.clear();
        }
    }

    public static ecus d(ContentResolver contentResolver, Uri uri) {
        ecus ecusVar;
        synchronized (ecus.class) {
            Map map = a;
            ecusVar = (ecus) map.get(uri);
            if (ecusVar == null) {
                try {
                    ecus ecusVar2 = new ecus(contentResolver, uri);
                    try {
                        contentResolver.registerContentObserver(uri, false, ecusVar2.e);
                        map.put(uri, ecusVar2);
                    } catch (SecurityException unused) {
                    }
                    ecusVar = ecusVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return ecusVar;
    }

    @Override // defpackage.ecux
    public final /* bridge */ /* synthetic */ Object a(String str) {
        Map map;
        Map map2 = this.g;
        if (map2 == null) {
            synchronized (this.f) {
                map2 = this.g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) ecuv.a(new ecuw() { // from class: ecuq
                                @Override // defpackage.ecuw
                                public final Object a() {
                                    ecus ecusVar = ecus.this;
                                    ContentProviderClient acquireUnstableContentProviderClient = ecusVar.c.acquireUnstableContentProviderClient(ecusVar.d);
                                    try {
                                        if (acquireUnstableContentProviderClient == null) {
                                            Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                                            return Collections.EMPTY_MAP;
                                        }
                                        Cursor query = acquireUnstableContentProviderClient.query(ecusVar.d, ecus.b, null, null, null);
                                        try {
                                            if (query == null) {
                                                Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                                                return Collections.EMPTY_MAP;
                                            }
                                            int count = query.getCount();
                                            if (count == 0) {
                                                Map map3 = Collections.EMPTY_MAP;
                                                query.close();
                                                return map3;
                                            }
                                            Map cmhVar = count <= 256 ? new cmh(count) : new HashMap(count, 1.0f);
                                            while (query.moveToNext()) {
                                                cmhVar.put(query.getString(0), query.getString(1));
                                            }
                                            if (query.isAfterLast()) {
                                                query.close();
                                                return cmhVar;
                                            }
                                            Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                                            Map map4 = Collections.EMPTY_MAP;
                                            query.close();
                                            return map4;
                                        } finally {
                                        }
                                    } catch (RemoteException e) {
                                        Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
                                        return Collections.EMPTY_MAP;
                                    } finally {
                                        acquireUnstableContentProviderClient.release();
                                    }
                                }
                            });
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException e) {
                        Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                        map = Collections.EMPTY_MAP;
                    }
                    this.g = map;
                    map2 = map;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.EMPTY_MAP;
        }
        return (String) map2.get(str);
    }

    public final void c() {
        synchronized (this.f) {
            this.g = null;
            ecwj.e();
        }
        synchronized (this) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((ecut) it.next()).a();
            }
        }
    }
}
