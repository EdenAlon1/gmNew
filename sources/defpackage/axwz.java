package defpackage;

import android.net.Uri;
import android.provider.ContactsContract;
import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axwz {
    public static final axwz a;
    public static final axwz b;
    private static final /* synthetic */ axwz[] c;

    static {
        axwz axwzVar = new axwz("PHONE", 0);
        a = axwzVar;
        axwz axwzVar2 = new axwz(VCardConstants.PROPERTY_EMAIL, 1);
        b = axwzVar2;
        axwz[] axwzVarArr = {axwzVar, axwzVar2};
        c = axwzVarArr;
        ffhw.a(axwzVarArr);
    }

    private axwz(String str, int i) {
    }

    public static axwz[] values() {
        return (axwz[]) c.clone();
    }

    public final Uri a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
            uri.getClass();
            return uri;
        }
        if (ordinal != 1) {
            throw null;
        }
        Uri uri2 = ContactsContract.CommonDataKinds.Email.CONTENT_URI;
        uri2.getClass();
        return uri2;
    }

    public final Uri b(String str, boolean z) {
        Uri uri;
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw null;
            }
            uri = ContactsContract.CommonDataKinds.Email.CONTENT_LOOKUP_URI;
            uri.getClass();
        } else if (z) {
            uri = ContactsContract.PhoneLookup.ENTERPRISE_CONTENT_FILTER_URI;
            uri.getClass();
        } else {
            uri = ContactsContract.PhoneLookup.CONTENT_FILTER_URI;
            uri.getClass();
        }
        Uri build = uri.buildUpon().appendPath(str).build();
        build.getClass();
        return build;
    }

    public final String[] c(boolean z) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return z ? axyy.a : axyy.b;
        }
        if (ordinal == 1) {
            return axyy.c;
        }
        throw null;
    }
}
