package defpackage;

import android.content.Context;
import android.provider.ContactsContract;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csrc extends bcqd {
    public csrc(Context context, String[] strArr, String str, boolean z) {
        super(context, z ? ContactsContract.Contacts.CONTENT_STREQUENT_URI.buildUpon().appendQueryParameter("strequent_phone_only", "true").build() : ContactsContract.Contacts.CONTENT_STREQUENT_URI, strArr, str, null, null);
    }
}
