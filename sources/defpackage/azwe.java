package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azwe extends ContentProvider {

    /* compiled from: PG */
    public interface a {
        bcqh bx();
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        Context context = getContext();
        context.getClass();
        bcqh bx = ((a) ekhw.a(context, a.class)).bx();
        ekzm b = bx.c.b("BugleContentProvider#call");
        try {
            Bundle bundle2 = null;
            if (!Arrays.asList(bx.d.getPackageName(), "com.google.android.ims").contains(bx.d.getPackageManager().getNameForUid(Binder.getCallingUid()))) {
                csjb e = bcqh.a.e();
                e.I("Ignored");
                e.I(str);
                e.I("call from external package.");
                e.r();
            } else if ("is_blocked".equals(str)) {
                boolean z = false;
                if (str2 != null && ((crrm) bx.b.b()).f(str2)) {
                    z = true;
                }
                bundle2 = new Bundle();
                bundle2.putBoolean("blocked", z);
            } else {
                csjb a2 = bcqh.a.a();
                a2.I("Ignored unsupported");
                a2.I(str);
                a2.I("call.");
                a2.r();
            }
            b.close();
            return bundle2;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("unimplemented");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("unimplemented");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("unimplemented");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("unimplemented");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("unimplemented");
    }
}
