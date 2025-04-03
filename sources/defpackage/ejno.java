package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import java.io.FileNotFoundException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejno {
    public final Context a;
    private final PackageManager b;

    public ejno(Context context, PackageManager packageManager) {
        this.a = context;
        this.b = packageManager;
    }

    public static String f(String[] strArr, Uri uri, String str, String str2) {
        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(Arrays.toString(strArr));
        sb.append(" FROM ");
        sb.append(uri.getAuthority());
        if (str != null) {
            sb.append(" WHERE ");
            sb.append(str);
        }
        if (str2 != null) {
            sb.append(" ORDER BY ");
            sb.append(str2);
        }
        return sb.toString();
    }

    private final ContentProviderClient g(final Uri uri) {
        String authority = uri.getAuthority();
        emyl emylVar = new emyl() { // from class: ejmw
            @Override // defpackage.emyl
            public final Object get() {
                int i = Build.VERSION.SDK_INT;
                Context context = ejno.this.a;
                if (i >= 30) {
                    elaa a = eleg.a(ejim.a);
                    if (a.b()) {
                        context = context.createAttributionContext((String) a.a());
                    }
                }
                return context.getContentResolver().acquireUnstableContentProviderClient(uri);
            }
        };
        Object obj = null;
        try {
            Object obj2 = emylVar.get();
            e = null;
            obj = obj2;
        } catch (SecurityException e) {
            e = e;
        }
        if (obj != null) {
            return (ContentProviderClient) obj;
        }
        ProviderInfo resolveContentProvider = this.b.resolveContentProvider(authority, 786944);
        if (resolveContentProvider == null) {
            throw new ejnk(authority, e);
        }
        throw new ejnn(resolveContentProvider, e);
    }

    public final int a(final Uri uri, final String str, final String[] strArr) {
        return ((Integer) e(uri, new ejnm() { // from class: ejnc
            @Override // defpackage.ejnm
            public final Object a(ContentProviderClient contentProviderClient) {
                return Integer.valueOf(contentProviderClient.delete(uri, str, strArr));
            }
        })).intValue();
    }

    public final Cursor b(Uri uri, String[] strArr, ejnf ejnfVar, emyl emylVar) {
        strArr.getClass();
        ContentProviderClient g = g(uri);
        try {
            Cursor a = ejnfVar.a(g);
            if (a != null) {
                return new ejng(a, g);
            }
            throw new ejnl("Null returned from query: " + ((String) emylVar.get()));
        } catch (RemoteException e) {
            e = e;
            g.release();
            throw new ejnh(e);
        } catch (ejnl e2) {
            e = e2;
            g.release();
            throw new ejnh(e);
        } catch (Error e3) {
            g.release();
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            g.release();
            throw new ejnh(e);
        }
    }

    public final Cursor c(final Uri uri, final String[] strArr, final String str, final String[] strArr2, final String str2, final CancellationSignal cancellationSignal) {
        return b(uri, strArr, new ejnf() { // from class: ejna
            @Override // defpackage.ejnf
            public final Cursor a(ContentProviderClient contentProviderClient) {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            }
        }, new emyl() { // from class: ejnb
            @Override // defpackage.emyl
            public final Object get() {
                return ejno.f(strArr, uri, str, str2);
            }
        });
    }

    public final Uri d(final Uri uri, final ContentValues contentValues) {
        return (Uri) e(uri, new ejnm() { // from class: ejmz
            @Override // defpackage.ejnm
            public final Object a(ContentProviderClient contentProviderClient) {
                return contentProviderClient.insert(uri, contentValues);
            }
        });
    }

    public final Object e(Uri uri, ejnm ejnmVar) {
        ContentProviderClient g = g(uri);
        try {
            try {
                return ejnmVar.a(g);
            } finally {
                g.release();
            }
        } catch (OperationApplicationException | RemoteException | FileNotFoundException | RuntimeException e) {
            throw new ejnh(e);
        }
    }
}
