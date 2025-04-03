package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.SparseIntArray;
import com.google.android.apps.messaging.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpaz {
    private static final char[] a = {' ', '!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~'};
    private static final enip b = enip.s((char) 8205, (char) 8419, (char) 65039);
    private static final SparseIntArray c = new SparseIntArray();
    private static SparseIntArray d;
    private final ffbr e;
    private final ffbr f;

    static {
        for (int i = 0; i < 95; i++) {
            c.put(a[i], i + 32);
        }
        SparseIntArray sparseIntArray = c;
        sparseIntArray.put(10, 10);
        sparseIntArray.put(13, 13);
        d = null;
    }

    public cpaz(ffbr ffbrVar, ffbr ffbrVar2) {
        this.e = ffbrVar;
        this.f = ffbrVar2;
    }

    private static SparseIntArray c(Context context, boolean z) {
        XmlResourceParser xml;
        SparseIntArray sparseIntArray = new SparseIntArray();
        try {
            xml = z ? context.getResources().getXml(R.xml.gsm_sms_7bit_translation_table) : context.getResources().getXml(R.xml.cdma_sms_7bit_translation_table);
        } catch (Resources.NotFoundException e) {
            csjy.p("Bugle", e, "Failed to load 7bit translation table XML: ".concat(e.toString()));
        } catch (IOException e2) {
            csjy.p("Bugle", e2, "Could not read 7bit translation table XML: ".concat(e2.toString()));
        } catch (XmlPullParserException e3) {
            csjy.p("Bugle", e3, "Could not parse 7bit translation table XML: ".concat(e3.toString()));
        }
        if (xml == null) {
            csjy.n("Bugle", "Failed to load 7bit translation table XML: empty");
            return sparseIntArray;
        }
        while (true) {
            int next = xml.next();
            if (next == 1) {
                break;
            }
            if (next == 2) {
                String name = xml.getName();
                if (name.equals("translation")) {
                    int attributeUnsignedIntValue = xml.getAttributeUnsignedIntValue(null, "from", -1);
                    int attributeUnsignedIntValue2 = xml.getAttributeUnsignedIntValue(null, "to", -1);
                    if (attributeUnsignedIntValue == -1 || attributeUnsignedIntValue2 == -1) {
                        csjy.n("Bugle", "Invalid table file format: missing from or to");
                    } else {
                        sparseIntArray.put(attributeUnsignedIntValue, attributeUnsignedIntValue2);
                    }
                } else if (!name.equals("unicode_to_gsm_7bit_supported_character")) {
                    csjy.n("Bugle", "Invalid table file format: wrong tag");
                }
            }
        }
        return sparseIntArray;
    }

    private final boolean d(char c2) {
        if (c2 >= 1024 && c2 <= 7360) {
            return false;
        }
        if (c2 >= 11264 && c2 <= 11359) {
            return false;
        }
        if (c2 >= 11520 && c2 <= 11775) {
            return false;
        }
        if (c2 >= 11904 && c2 <= 13168) {
            return false;
        }
        if (c2 >= 13280 && c2 <= 40908) {
            return false;
        }
        if (c2 >= 40960 && c2 <= 55295) {
            return false;
        }
        if ((c2 < 55296 || c2 > 57343) && !((cstx) this.f.b()).g(String.valueOf(c2))) {
            enip enipVar = b;
            Character valueOf = Character.valueOf(c2);
            return (enipVar.contains(valueOf) || cmti.a.contains(valueOf)) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r3.getPhoneType() == 1) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(android.content.Context r10, java.lang.CharSequence r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpaz.a(android.content.Context, java.lang.CharSequence):java.lang.String");
    }

    public final boolean b(String str) {
        for (char c2 : str.toCharArray()) {
            if (!d(c2)) {
                return false;
            }
        }
        return true;
    }
}
