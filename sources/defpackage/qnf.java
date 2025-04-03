package defpackage;

import android.util.Base64;
import android.util.Log;
import com.android.vcard.VCardConstants;
import com.android.vcard.VCardEntryCommitter;
import com.android.vcard.VCardParser_V40;
import com.android.vcard.VCardProperty;
import java.util.ArrayList;
import java.util.Set;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qnf extends qne {
    public qnf() {
    }

    public static String x(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '\\') {
                if (i < length - 1) {
                    i++;
                    char charAt2 = str.charAt(i);
                    if (charAt2 == 'n' || charAt2 == 'N') {
                        sb.append("\n");
                    } else {
                        sb.append(charAt2);
                    }
                    i++;
                } else {
                    charAt = '\\';
                }
            }
            sb.append(charAt);
            i++;
        }
        return sb.toString();
    }

    @Override // defpackage.qne, com.android.vcard.VCardParserImpl_V21
    protected final int a() {
        return 2;
    }

    @Override // defpackage.qne, com.android.vcard.VCardParserImpl_V21
    protected final String e() {
        return VCardConstants.VERSION_V40;
    }

    @Override // defpackage.qne, com.android.vcard.VCardParserImpl_V21
    protected final String f(String str) {
        return x(str);
    }

    @Override // defpackage.qne, com.android.vcard.VCardParserImpl_V21
    protected final Set h() {
        return VCardParser_V40.sKnownPropertyNameSet;
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    public final void p(VCardProperty vCardProperty, String str) {
        Matcher matcher;
        String rawValue = vCardProperty.getRawValue();
        if ((!str.equals(VCardConstants.PROPERTY_PHOTO) && !str.equals(VCardConstants.PROPERTY_LOGO)) || !rawValue.startsWith("data:")) {
            super.p(vCardProperty, str);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(x(rawValue));
        vCardProperty.setValues(arrayList);
        try {
            matcher = qni.a.matcher(rawValue);
        } catch (OutOfMemoryError unused) {
            Log.e(VCardEntryCommitter.LOG_TAG, "OutOfMemoryError happened during parsing BASE64 data!");
        } catch (qnq e) {
            throw new qnn("Data uri has an invalid format", e);
        }
        if (!matcher.matches()) {
            throw new qnq("[" + rawValue + "] is not a valid data uri");
        }
        String group = matcher.group(2);
        String group2 = matcher.group(4);
        try {
            vCardProperty.setDataUri(new qni(group, Base64.decode(group2, 0)));
            k(vCardProperty);
        } catch (IllegalArgumentException e2) {
            throw new qnq("Decode error on base64 photo: ".concat(String.valueOf(group2)), e2);
        }
    }

    @Override // defpackage.qne
    protected final void v(VCardProperty vCardProperty, String str, String str2) {
        int length;
        StringBuilder sb = new StringBuilder(str2);
        if (VCardParser_V40.valueListParameters.contains(emuz.d(str)) && (length = str2.length()) > 1) {
            char charAt = sb.charAt(0);
            int i = length - 1;
            char charAt2 = sb.charAt(i);
            if (charAt == '\"' && charAt2 == '\"') {
                sb.deleteCharAt(i);
                sb.deleteCharAt(0);
            }
        }
        super.v(vCardProperty, str, sb.toString());
    }

    public qnf(byte[] bArr) {
        super(null);
    }
}
