package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoContentProvider;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cowf {
    private final Context a;

    public cowf(Context context) {
        this.a = context;
    }

    public final BusinessInfoData a(String str) {
        Context context = this.a;
        Uri buildBusinessInfoUri = BusinessInfoContentProvider.BusinessInfoContentProviderInternal.buildBusinessInfoUri(str, context);
        Uri buildBusinessInfoPropertiesUri = BusinessInfoContentProvider.BusinessInfoContentProviderInternal.buildBusinessInfoPropertiesUri(str, context);
        Cursor c = cgsx.c(context.getContentResolver(), buildBusinessInfoUri, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.DEFAULT_PROJECTION, null, null, null);
        try {
            c = cgsx.c(this.a.getContentResolver(), buildBusinessInfoPropertiesUri, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.DEFAULT_PROJECTION, null, null, null);
            try {
                BusinessInfoData createFromCursors = BusinessInfoData.createFromCursors(c, c);
                if (c != null) {
                    c.close();
                }
                if (c != null) {
                    c.close();
                }
                return createFromCursors;
            } finally {
                if (c == null) {
                    throw th;
                }
                try {
                    c.close();
                    throw th;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } catch (Throwable th2) {
            if (c != null) {
                try {
                    c.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        }
    }
}
