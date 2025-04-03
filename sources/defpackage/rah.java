package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rah implements qud {
    private static final String[] a = {"_data"};
    private final Context b;
    private final Uri c;

    public rah(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.qud
    public final Class a() {
        return File.class;
    }

    @Override // defpackage.qud
    public final qsy eV() {
        return qsy.LOCAL;
    }

    @Override // defpackage.qud
    public final void g(qqe qqeVar, quc qucVar) {
        Cursor query = this.b.getContentResolver().query(this.c, a, null, null, null);
        if (query != null) {
            try {
                r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
            } finally {
                query.close();
            }
        }
        if (TextUtils.isEmpty(r0)) {
            qucVar.f(new FileNotFoundException("Failed to find file path for: ".concat(String.valueOf(String.valueOf(this.c)))));
        } else {
            qucVar.c(new File(r0));
        }
    }

    @Override // defpackage.qud
    public final void d() {
    }

    @Override // defpackage.qud
    public final void e() {
    }
}
