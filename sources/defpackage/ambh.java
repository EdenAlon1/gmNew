package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.provider.ContactsContract;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ambh {
    public final aoku a;
    public final String b;
    private final Resources c;
    private final int d;
    private final String e;

    public ambh(Context context, aolr aolrVar, int i, String str) {
        this.c = context.getResources();
        this.d = i;
        this.e = null;
        aoku n = aolrVar.n(str);
        this.a = n;
        this.b = n.G().toString();
    }

    public final String a() {
        String str;
        if (this.d == 0 && (str = this.e) != null) {
            int i = 0;
            while (i < str.length()) {
                int codePointAt = str.codePointAt(i);
                if (!Character.isWhitespace(codePointAt)) {
                    return this.e;
                }
                i += Character.charCount(codePointAt);
            }
        }
        return this.c.getString(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(this.d));
    }

    public ambh(Context context, aolr aolrVar, int i, String str, String str2, String str3) {
        this.c = context.getResources();
        this.d = i;
        this.e = str;
        this.a = aolrVar.n(str2);
        this.b = str3;
    }
}
