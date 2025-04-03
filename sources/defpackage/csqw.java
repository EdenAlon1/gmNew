package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csqw {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/contact/ContactUtil");
    public static final cfva b = cfvl.m(cfvl.b, "directory_query_limit", "100");
    public final Context c;
    public final ffbr d;
    public final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;

    public csqw(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.c = context;
        this.d = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.e = ffbrVar4;
        this.h = ffbrVar5;
    }

    public static Cursor a(Cursor cursor) {
        try {
            cpn cpnVar = new cpn();
            ArrayList arrayList = new ArrayList(cursor.getCount());
            Bundle extras = cursor.getExtras();
            if (extras == null) {
                ensk j = a.j();
                j.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/contact/ContactUtil", "mergeContactsWithSameLookupKey", 998, "ContactUtil.java")).q("Got a cursor without extra.");
            }
            int[] intArray = extras == null ? null : extras.getIntArray("android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS");
            if (intArray != null && intArray.length == 0) {
                intArray = null;
            }
            int i = intArray == null ? 0 : intArray[0];
            int i2 = 0;
            int i3 = 0;
            while (cursor.moveToNext()) {
                String string = cursor.getString(6);
                Object[] objArr = (Object[]) cpnVar.get(string);
                if (objArr == null) {
                    String[] strArr = csqt.a;
                    Object[] objArr2 = {Long.valueOf(cursor.getLong(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6), Long.valueOf(cursor.getLong(7)), cursor.getString(8), cursor.getString(9)};
                    arrayList.add(objArr2);
                    cpnVar.put(string, objArr2);
                } else {
                    objArr[3] = p(objArr[3], cursor.getString(3));
                    objArr[4] = p(objArr[4], cursor.getString(4));
                    objArr[5] = p(objArr[5], cursor.getString(5));
                    if (intArray != null && i2 < intArray.length) {
                        intArray[i2] = intArray[i2] - 1;
                    }
                }
                if (intArray != null && (i3 = i3 + 1) >= i) {
                    i2++;
                    if (i2 < intArray.length) {
                        i = intArray[i2];
                    }
                    i3 = 0;
                }
            }
            MatrixCursor matrixCursor = new MatrixCursor(csqt.a, arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                matrixCursor.addRow((Object[]) it.next());
            }
            String[] stringArray = extras == null ? null : extras.getStringArray("android.provider.extra.ADDRESS_BOOK_INDEX_TITLES");
            if (stringArray != null && intArray != null) {
                csix.a(stringArray.length, intArray.length);
                Bundle bundle = new Bundle();
                bundle.putStringArray("android.provider.extra.ADDRESS_BOOK_INDEX_TITLES", stringArray);
                bundle.putIntArray("android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS", intArray);
                matrixCursor.setExtras(bundle);
            }
            return matrixCursor;
        } finally {
            cursor.close();
        }
    }

    public static Uri b(Uri uri, String str, long j) {
        Uri.Builder buildUpon = uri.buildUpon();
        if (uri.equals(ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI) || uri.equals(ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI)) {
            buildUpon.appendQueryParameter("limit", (String) b.e());
        }
        return buildUpon.appendPath(str).appendQueryParameter("directory", String.valueOf(j)).build();
    }

    public static boolean l(String str) {
        return str != null && str.contains("@");
    }

    private final csqz o(Uri uri, String str, csqy csqyVar, CancellationSignal cancellationSignal) {
        if (!((ctud) this.d.b()).i()) {
            return new csqm(csqyVar, null);
        }
        try {
            return new csqm(csqyVar, new bcqd(this.c, b(uri, str, csqyVar.a()), csqt.a, null, null, "sort_key", cancellationSignal).a());
        } catch (OperationCanceledException e) {
            ensk h = a.h();
            h.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) h).g(e)).h("com/google/android/apps/messaging/shared/util/contact/ContactUtil", "filterPhonesInternal", (char) 668, "ContactUtil.java")).q("Query cancelled, not returning contacts search results.");
            return new csqm(csqyVar, null);
        }
    }

    private static String p(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        if (obj != null) {
            sb.append(obj);
        } else {
            sb.append("\u0000");
        }
        sb.append("\u001f");
        if (obj2 != null) {
            sb.append(obj2);
        } else {
            sb.append("\u0000");
        }
        return sb.toString();
    }

    private final bcqd q(Collection collection, Uri uri, String[] strArr) {
        return !((ctud) this.d.b()).i() ? new bcqd(this.c, Uri.EMPTY, null, null, null, null) : new bcqd(this.c, uri.buildUpon().appendQueryParameter("directory", "0").appendQueryParameter("android.provider.extra.ADDRESS_BOOK_INDEX", "true").build(), strArr, String.format("%s IN (%s)", "lookup", TextUtils.join(",", Collections.nCopies(collection.size(), "?"))), (String[]) collection.toArray(new String[0]), null);
    }

    public final bcqd c(Collection collection) {
        return q(collection, ContactsContract.CommonDataKinds.Email.CONTENT_URI, csqq.a);
    }

    public final bcqd d(Collection collection) {
        return q(collection, ContactsContract.CommonDataKinds.Phone.CONTENT_URI, csqt.a);
    }

    public final bcqd e() {
        if (!((ctud) this.d.b()).i()) {
            return new bcqd(this.c, Uri.EMPTY, null, null, null, null);
        }
        return new bcqd(this.c, ContactsContract.CommonDataKinds.Phone.CONTENT_URI.buildUpon().appendQueryParameter("directory", "0").appendQueryParameter("android.provider.extra.ADDRESS_BOOK_INDEX", "true").build(), csqt.a, null, null, "sort_key");
    }

    public final bcqd f() {
        return !((ctud) this.d.b()).i() ? new bcqd(this.c, Uri.EMPTY, null, null, null, null) : new bcqd(this.c, ContactsContract.Profile.CONTENT_URI, csqu.a, null, null, null);
    }

    public final csqz g(String str, csqy csqyVar, CancellationSignal cancellationSignal) {
        Uri uri;
        Uri uri2;
        if (l(str)) {
            uri2 = ContactsContract.CommonDataKinds.Email.ENTERPRISE_CONTENT_FILTER_URI;
            return h(uri2, str, csqyVar, cancellationSignal);
        }
        uri = ContactsContract.CommonDataKinds.Phone.ENTERPRISE_CONTENT_FILTER_URI;
        return o(uri, str, csqyVar, cancellationSignal);
    }

    public final csqz h(Uri uri, String str, csqy csqyVar, CancellationSignal cancellationSignal) {
        if (!((ctud) this.d.b()).i()) {
            return new csqm(csqyVar, null);
        }
        try {
            return new csqm(csqyVar, new bcqd(this.c, b(uri, str, csqyVar.a()), csqt.a, null, null, "sort_key", cancellationSignal).a());
        } catch (OperationCanceledException e) {
            ensk h = a.h();
            h.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) h).g(e)).h("com/google/android/apps/messaging/shared/util/contact/ContactUtil", "filterEmailsInternal", (char) 761, "ContactUtil.java")).q("Query cancelled, not returning contacts search results.");
            return new csqm(csqyVar, null);
        }
    }

    public final csqz i(String str, CancellationSignal cancellationSignal) {
        return o(ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI, str, csqy.a, cancellationSignal);
    }

    public final String j(Uri uri) {
        Cursor cursor = null;
        r1 = null;
        String string = null;
        if (!((ctud) this.d.b()).i()) {
            return null;
        }
        try {
            Cursor a2 = new bcqd(this.c, uri, new String[]{"lookup"}, null, null, null).a();
            if (a2 != null) {
                try {
                    if (a2.moveToFirst()) {
                        string = a2.getString(0);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = a2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (a2 != null) {
                a2.close();
            }
            return string;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String k(long j) {
        bcqd bcqdVar;
        Cursor cursor = null;
        r1 = null;
        String string = null;
        if (ContactsContract.Contacts.isEnterpriseContactId(j)) {
            return null;
        }
        try {
            if (((ctud) this.d.b()).i()) {
                bcqdVar = new bcqd(this.c, ContactsContract.Contacts.CONTENT_URI.buildUpon().appendPath(String.valueOf(j)).appendPath(GroupManagementRequest.DATA_TAG).build(), csqv.a, "mimetype=? AND display_name=data1", new String[]{"vnd.android.cursor.item/name"}, null);
            } else {
                bcqdVar = new bcqd(this.c, Uri.EMPTY, null, null, null, null);
            }
            Cursor a2 = bcqdVar.a();
            if (a2 != null) {
                try {
                    if (a2.moveToFirst()) {
                        string = a2.getString(1);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = a2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (a2 != null) {
                a2.close();
            }
            return string;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final qmc m(String str, aoku aokuVar, int i, String str2, long j, String str3, long j2, long j3, Uri uri, boolean z) {
        aokuVar.getClass();
        if (z) {
            return new bcqa(str, aokuVar, i, str2, j, Long.valueOf(j2), j3, uri, true, str3);
        }
        return new bcqa(str, aokuVar, i, str2, j, Long.valueOf(j2), j3, uri, false, str3);
    }

    public final Cursor n(aoku aokuVar) {
        bcqd bcqdVar;
        bcqd bcqdVar2;
        String b2 = emxe.b(aokuVar.j());
        if (!((ctud) this.d.b()).i() || TextUtils.isEmpty(b2.trim())) {
            return null;
        }
        cskc cskcVar = cpdg.a;
        if (aoqw.h(b2)) {
            if (((ctud) this.d.b()).i()) {
                bcqdVar2 = new bcqd(this.c, ContactsContract.CommonDataKinds.Email.ENTERPRISE_CONTENT_LOOKUP_URI.buildUpon().appendPath(b2).appendQueryParameter("directory", "0").build(), csqq.a, null, null, "sort_key");
            } else {
                bcqdVar2 = new bcqd(this.c, Uri.EMPTY, null, null, null, null);
            }
            return bcqdVar2.b(this.f);
        }
        if (((ctud) this.d.b()).i()) {
            Uri build = ContactsContract.PhoneLookup.ENTERPRISE_CONTENT_FILTER_URI.buildUpon().appendPath(b2).build();
            bcqdVar = new bcqd(this.c, build, csqs.a, null, null, null);
        } else {
            bcqdVar = new bcqd(this.c, Uri.EMPTY, null, null, null, null);
        }
        return bcqdVar.b(this.f);
    }
}
