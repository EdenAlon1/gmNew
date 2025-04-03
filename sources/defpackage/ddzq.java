package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddzq {
    public final csqw a;
    private final Context b;

    public ddzq(Context context, csqw csqwVar) {
        this.b = context;
        this.a = csqwVar;
    }

    public static void b(Uri uri, ddzp ddzpVar) {
        if (uri == null || uri.equals(Uri.EMPTY)) {
            return;
        }
        ddzpVar.a(uri);
    }

    public final Uri a(String str) {
        try {
            return cbgi.h(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str), "vcf", this.b);
        } catch (Exception e) {
            csjy.h("Bugle", e, "Error while copying vcard to scratch space for lookupKey ".concat(String.valueOf(str)));
            return Uri.EMPTY;
        }
    }

    public final void c(Uri uri, ddzp ddzpVar) {
        new ddzn(this, uri, ddzpVar).e(new Void[0]);
    }
}
