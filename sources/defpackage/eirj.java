package defpackage;

import android.net.Uri;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eirj {
    public static final Uri a;
    public static final Uri b;

    static {
        Uri parse = Uri.parse("content://com.google.android.setupwizard.deviceorigin");
        a = parse;
        parse.buildUpon().appendPath("list").build();
        b = parse.buildUpon().appendPath(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE).build();
    }
}
