package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eins extends ContentProvider {
    private String a;
    private UriMatcher b;

    public abstract Cursor a();

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.a = providerInfo.authority;
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.b = uriMatcher;
        uriMatcher.addURI(this.a, "settings/indexables_xml_res", 1);
        this.b.addURI(this.a, "settings/indexables_raw", 2);
        this.b.addURI(this.a, "settings/non_indexables_key", 3);
        this.b.addURI(this.a, "settings/site_map_pairs", 4);
        this.b.addURI(this.a, "settings/slice_uri_pairs", 5);
        this.b.addURI(this.a, "settings/dynamic_indexables_raw", 6);
        if (!providerInfo.exported) {
            throw new SecurityException("Provider must be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grantUriPermissions");
        }
        if (!"android.permission.READ_SEARCH_INDEXABLES".equals(providerInfo.readPermission)) {
            throw new SecurityException("Provider must be protected by READ_SEARCH_INDEXABLES");
        }
        super.attachInfo(context, providerInfo);
    }

    public abstract Cursor b();

    public abstract Cursor c();

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Delete not supported");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        int match = this.b.match(uri);
        if (match == 1) {
            return "vnd.android.cursor.dir/indexables_xml_res";
        }
        if (match == 2) {
            return "vnd.android.cursor.dir/indexables_raw";
        }
        if (match == 3) {
            return "vnd.android.cursor.dir/non_indexables_key";
        }
        if (match == 6) {
            return "vnd.android.cursor.dir/indexables_raw";
        }
        throw new IllegalArgumentException("Unknown URI ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert not supported");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            switch (this.b.match(uri)) {
                case 1:
                    return c();
                case 2:
                    return b();
                case 3:
                    return a();
                case 4:
                case 5:
                case 6:
                    return null;
                default:
                    throw new UnsupportedOperationException(a.C(uri, "Unknown Uri "));
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (Exception e2) {
            Log.e("IndexablesProvider", "Provider querying exception:", e2);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Update not supported");
    }
}
