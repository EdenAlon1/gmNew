package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import com.google.android.apps.messaging.R;
import defpackage.oyh;
import defpackage.oyi;
import defpackage.oyj;
import defpackage.ozg;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new oyj();
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        if (oyh.a == null) {
            synchronized (oyh.b) {
                if (oyh.a == null) {
                    oyh.a = new oyh(context);
                }
            }
        }
        Class<?> cls = getClass();
        oyh oyhVar = oyh.a;
        try {
            try {
                ozg.a("Startup");
                Bundle bundle = oyhVar.e.getPackageManager().getProviderInfo(new ComponentName(oyhVar.e, cls), 128).metaData;
                String string = oyhVar.e.getString(R.string.androidx_startup);
                if (bundle != null) {
                    try {
                        HashSet hashSet = new HashSet();
                        for (String str : bundle.keySet()) {
                            if (string.equals(bundle.getString(str, null))) {
                                Class<?> cls2 = Class.forName(str);
                                if (oyi.class.isAssignableFrom(cls2)) {
                                    oyhVar.d.add(cls2);
                                }
                            }
                        }
                        Iterator it = oyhVar.d.iterator();
                        while (it.hasNext()) {
                            oyhVar.a((Class) it.next(), hashSet);
                        }
                    } catch (ClassNotFoundException e) {
                        throw new oyj(e);
                    }
                }
                return true;
            } catch (PackageManager.NameNotFoundException e2) {
                throw new oyj(e2);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
