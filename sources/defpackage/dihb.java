package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.RemoteException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dihb {
    public static final Map a(ContentResolver contentResolver, String[] strArr, dihc dihcVar) {
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(digv.b);
        try {
            if (acquireUnstableContentProviderClient == null) {
                throw new dihd("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor query = acquireUnstableContentProviderClient.query(digv.b, null, null, strArr, null);
                try {
                    if (query == null) {
                        throw new dihd("ContentProvider query returned null cursor");
                    }
                    Map a = dihcVar.a(query.getCount());
                    while (query.moveToNext()) {
                        a.put(query.getString(0), query.getString(1));
                    }
                    if (!query.isAfterLast()) {
                        throw new dihd("Cursor read incomplete (ContentProvider dead?)");
                    }
                    query.close();
                    acquireUnstableContentProviderClient.release();
                    return a;
                } finally {
                }
            } catch (RemoteException e) {
                throw new dihd(e);
            }
        } catch (Throwable th) {
            acquireUnstableContentProviderClient.release();
            throw th;
        }
    }
}
