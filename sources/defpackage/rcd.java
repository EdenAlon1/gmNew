package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rcd implements qud {
    private static final String[] a = {"_data"};
    private final Context b;
    private final rao c;
    private final rao d;
    private final Uri e;
    private final int f;
    private final int g;
    private final qtu h;
    private final Class i;
    private volatile boolean j;
    private volatile qud k;

    public rcd(Context context, rao raoVar, rao raoVar2, Uri uri, int i, int i2, qtu qtuVar, Class cls) {
        this.b = context.getApplicationContext();
        this.c = raoVar;
        this.d = raoVar2;
        this.e = uri;
        this.f = i;
        this.g = i2;
        this.h = qtuVar;
        this.i = cls;
    }

    @Override // defpackage.qud
    public final Class a() {
        return this.i;
    }

    @Override // defpackage.qud
    public final void d() {
        this.j = true;
        qud qudVar = this.k;
        if (qudVar != null) {
            qudVar.d();
        }
    }

    @Override // defpackage.qud
    public final void e() {
        qud qudVar = this.k;
        if (qudVar != null) {
            qudVar.e();
        }
    }

    @Override // defpackage.qud
    public final qsy eV() {
        return qsy.LOCAL;
    }

    @Override // defpackage.qud
    public final void g(qqe qqeVar, quc qucVar) {
        boolean isExternalStorageLegacy;
        ran a2;
        Throwable th;
        try {
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            if (isExternalStorageLegacy) {
                rao raoVar = this.c;
                Uri uri = this.e;
                try {
                    Cursor query = this.b.getContentResolver().query(uri, a, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException(a.C(uri, "File path was empty in media store for: "));
                                }
                                File file = new File(string);
                                query.close();
                                a2 = raoVar.a(file, this.f, this.g, this.h);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                            if (cursor == null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    }
                    throw new FileNotFoundException(a.C(uri, "Failed to media store entry for: "));
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                Uri uri2 = this.e;
                if (qut.a(uri2) && uri2.getPathSegments().contains("picker")) {
                    a2 = this.d.a(this.e, this.f, this.g, this.h);
                } else {
                    a2 = this.d.a(this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0 ? MediaStore.setRequireOriginal(this.e) : this.e, this.f, this.g, this.h);
                }
            }
            qud qudVar = a2 != null ? a2.c : null;
            if (qudVar == null) {
                qucVar.f(new IllegalArgumentException("Failed to build fetcher for: " + String.valueOf(this.e)));
                return;
            }
            this.k = qudVar;
            if (this.j) {
                d();
            } else {
                qudVar.g(qqeVar, qucVar);
            }
        } catch (FileNotFoundException e) {
            qucVar.f(e);
        }
    }
}
