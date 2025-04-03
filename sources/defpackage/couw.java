package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class couw {
    private final aolr a;

    public couw(aolr aolrVar) {
        this.a = aolrVar;
    }

    public final aoku a(Cursor cursor) {
        int i = cursor.getInt(1);
        String string = cursor.getString(0);
        if (string == null) {
            throw new couv();
        }
        String b = covc.b(covc.c(string, 4), i);
        aolr aolrVar = this.a;
        return aolrVar.x(aolrVar.h(aolrVar.n(b), b));
    }
}
