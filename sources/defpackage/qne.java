package defpackage;

import android.util.Log;
import com.android.vcard.VCardConfig;
import com.android.vcard.VCardConstants;
import com.android.vcard.VCardEntryCommitter;
import com.android.vcard.VCardParserImpl_V21;
import com.android.vcard.VCardParser_V30;
import com.android.vcard.VCardProperty;
import com.android.vcard.VCardUtils;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qne extends VCardParserImpl_V21 {
    private String f;
    private boolean g;

    public qne() {
        this.g = false;
    }

    protected static final String w(String str) {
        return VCardUtils.convertStringCharset(str, VCardConfig.DEFAULT_INTERMEDIATE_CHARSET, "UTF-8");
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected int a() {
        return 1;
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected final String c() {
        String str = this.f;
        if (str == null) {
            return this.c.readLine();
        }
        this.f = null;
        return str;
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected final String d() {
        String readLine;
        String str = null;
        StringBuilder sb = null;
        while (true) {
            readLine = this.c.readLine();
            if (readLine == null) {
                break;
            }
            if (readLine.length() != 0) {
                if (readLine.charAt(0) == ' ' || readLine.charAt(0) == '\t') {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    String str2 = this.f;
                    if (str2 != null) {
                        sb.append(str2);
                        this.f = null;
                    }
                    sb.append((CharSequence) readLine, 1, readLine.length());
                } else {
                    if (sb != null) {
                        break;
                    }
                    if (this.f != null) {
                        sb = null;
                        break;
                    }
                    this.f = readLine;
                }
            }
        }
        if (sb != null) {
            str = sb.toString();
        } else {
            String str3 = this.f;
            if (str3 != null) {
                str = str3;
            }
        }
        this.f = readLine;
        if (str != null) {
            return str;
        }
        throw new qnn("Reached end of buffer.");
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected String e() {
        return VCardConstants.VERSION_V30;
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected String f(String str) {
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

    @Override // com.android.vcard.VCardParserImpl_V21
    protected Set h() {
        return VCardParser_V30.sKnownPropertyNameSet;
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected final void l(VCardProperty vCardProperty) {
        if (this.g) {
            return;
        }
        Log.w(VCardEntryCommitter.LOG_TAG, "AGENT in vCard 3.0 is not supported yet. Ignore it");
        this.g = true;
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected final void m(VCardProperty vCardProperty, String str, String str2) {
        v(vCardProperty, str, str2);
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected final void n(VCardProperty vCardProperty, String str) {
        q(vCardProperty, str);
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    public final void o(VCardProperty vCardProperty, String str) {
        try {
            super.o(vCardProperty, str);
        } catch (qnn e) {
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                throw new qnn("Unknown params value: ".concat(String.valueOf(str)), e);
            }
            v(vCardProperty, split[0], split[1]);
        }
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    public final void q(VCardProperty vCardProperty, String str) {
        v(vCardProperty, VCardConstants.PARAM_TYPE, str);
    }

    protected void v(VCardProperty vCardProperty, String str, String str2) {
        int length = str2.length();
        boolean z = false;
        StringBuilder sb = null;
        for (int i = 0; i < length; i++) {
            char charAt = str2.charAt(i);
            if (charAt == '\"') {
                if (z) {
                    vCardProperty.addParameter(str, w(sb.toString()));
                    z = false;
                } else {
                    z = true;
                    if (sb != null) {
                        if (sb.length() > 0) {
                            Log.w(VCardEntryCommitter.LOG_TAG, "Unexpected Dquote inside property.");
                        } else {
                            vCardProperty.addParameter(str, w(sb.toString()));
                        }
                    }
                }
                sb = null;
            } else {
                if (charAt == ',') {
                    if (z) {
                        charAt = ',';
                    } else {
                        if (sb == null) {
                            Log.w(VCardEntryCommitter.LOG_TAG, a.a(str2, "Comma is used before actual string comes. (", ")"));
                        } else {
                            vCardProperty.addParameter(str, w(sb.toString()));
                        }
                        sb = null;
                    }
                }
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(charAt);
            }
        }
        if (z) {
            Log.d(VCardEntryCommitter.LOG_TAG, "Dangling Dquote.");
        }
        if (sb != null) {
            if (sb.length() == 0) {
                Log.w(VCardEntryCommitter.LOG_TAG, "Unintended behavior. We must not see empty StringBuilder at the end of parameter value parsing.");
            } else {
                vCardProperty.addParameter(str, w(sb.toString()));
            }
        }
    }

    public qne(byte[] bArr) {
        super(null);
        this.g = false;
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected final String b(String str) {
        return str;
    }
}
