package com.android.vcard;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.a;
import defpackage.emuz;
import defpackage.qmz;
import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VCardBuilder {
    public static final int DEFAULT_EMAIL_TYPE = 3;
    public static final int DEFAULT_PHONE_TYPE = 1;
    public static final int DEFAULT_POSTAL_TYPE = 1;
    private static final String LOG_TAG = "vCard";
    private static final String SHIFT_JIS = "SHIFT_JIS";
    private static final String VCARD_DATA_PUBLIC = "PUBLIC";
    private static final String VCARD_DATA_SEPARATOR = ":";
    private static final String VCARD_DATA_VCARD = "VCARD";
    public static final String VCARD_END_OF_LINE = "\r\n";
    private static final String VCARD_ITEM_SEPARATOR = ";";
    private static final String VCARD_PARAM_ENCODING_BASE64_AS_B = "ENCODING=B";
    private static final String VCARD_PARAM_ENCODING_BASE64_V21 = "ENCODING=BASE64";
    private static final String VCARD_PARAM_ENCODING_QP = "ENCODING=QUOTED-PRINTABLE";
    private static final String VCARD_PARAM_EQUAL = "=";
    private static final String VCARD_PARAM_SEPARATOR = ";";
    private static final String VCARD_WS = " ";
    private static final Set<String> sAllowedAndroidPropertySet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("vnd.android.cursor.item/nickname", "vnd.android.cursor.item/contact_event", "vnd.android.cursor.item/relation")));
    private static final Map<Integer, Integer> sPostalTypePriorityMap;
    private final boolean mAppendTypeParamName;
    private StringBuilder mBuilder;
    private final String mCharset;
    private boolean mEndAppended;
    private final boolean mIsDoCoMo;
    private final boolean mIsJapaneseMobilePhone;
    private final boolean mIsV30OrV40;
    private final boolean mNeedsToConvertPhoneticString;
    private final boolean mOnlyOneNoteFieldIsAvailable;
    private final boolean mRefrainsQPToNameProperties;
    private final boolean mShouldAppendCharsetParam;
    private final boolean mShouldUseQuotedPrintable;
    private final boolean mUsesAndroidProperty;
    private final boolean mUsesDefactProperty;
    private final String mVCardCharsetParameter;
    private final int mVCardType;

    static {
        HashMap hashMap = new HashMap();
        sPostalTypePriorityMap = hashMap;
        hashMap.put(1, 0);
        hashMap.put(2, 1);
        hashMap.put(3, 2);
        hashMap.put(0, 3);
    }

    public VCardBuilder(int i) {
        this(i, null);
    }

    private VCardBuilder appendNamePropertiesV40(List<ContentValues> list) {
        String str;
        if (this.mIsDoCoMo || this.mNeedsToConvertPhoneticString) {
            Log.w("vCard", "Invalid flag is used in vCard 4.0 construction. Ignored.");
        }
        if (list == null || list.isEmpty()) {
            appendLine(VCardConstants.PROPERTY_FN, "");
            return this;
        }
        ContentValues primaryContentValueWithStructuredName = getPrimaryContentValueWithStructuredName(list);
        String asString = primaryContentValueWithStructuredName.getAsString("data3");
        String asString2 = primaryContentValueWithStructuredName.getAsString("data5");
        String asString3 = primaryContentValueWithStructuredName.getAsString("data2");
        String asString4 = primaryContentValueWithStructuredName.getAsString("data4");
        String asString5 = primaryContentValueWithStructuredName.getAsString("data6");
        String asString6 = primaryContentValueWithStructuredName.getAsString("data1");
        if (!TextUtils.isEmpty(asString) || !TextUtils.isEmpty(asString3) || !TextUtils.isEmpty(asString2) || !TextUtils.isEmpty(asString4) || !TextUtils.isEmpty(asString5)) {
            str = asString;
        } else {
            if (TextUtils.isEmpty(asString6)) {
                appendLine(VCardConstants.PROPERTY_FN, "");
                return this;
            }
            str = asString6;
        }
        String asString7 = primaryContentValueWithStructuredName.getAsString("data9");
        String asString8 = primaryContentValueWithStructuredName.getAsString("data8");
        String asString9 = primaryContentValueWithStructuredName.getAsString("data7");
        String escapeCharacters = escapeCharacters(str);
        String escapeCharacters2 = escapeCharacters(asString3);
        String escapeCharacters3 = escapeCharacters(asString2);
        String str2 = str;
        String escapeCharacters4 = escapeCharacters(asString4);
        String escapeCharacters5 = escapeCharacters(asString5);
        this.mBuilder.append(VCardConstants.PROPERTY_N);
        if (!TextUtils.isEmpty(asString7) || !TextUtils.isEmpty(asString8) || !TextUtils.isEmpty(asString9)) {
            this.mBuilder.append(";");
            String str3 = escapeCharacters(asString7) + ";" + escapeCharacters(asString9) + ";" + escapeCharacters(asString8);
            StringBuilder sb = this.mBuilder;
            sb.append("SORT-AS=");
            sb.append(VCardUtils.toStringAsV40ParamValue(str3));
        }
        this.mBuilder.append(VCARD_DATA_SEPARATOR);
        this.mBuilder.append(escapeCharacters);
        this.mBuilder.append(";");
        this.mBuilder.append(escapeCharacters2);
        this.mBuilder.append(";");
        this.mBuilder.append(escapeCharacters3);
        this.mBuilder.append(";");
        this.mBuilder.append(escapeCharacters4);
        this.mBuilder.append(";");
        this.mBuilder.append(escapeCharacters5);
        this.mBuilder.append(VCARD_END_OF_LINE);
        if (TextUtils.isEmpty(asString6)) {
            Log.w("vCard", "DISPLAY_NAME is empty.");
            appendLine(VCardConstants.PROPERTY_FN, escapeCharacters(VCardUtils.constructNameFromElements(VCardConfig.getNameOrderType(this.mVCardType), str2, asString2, asString3, asString4, asString5)));
        } else {
            String escapeCharacters6 = escapeCharacters(asString6);
            this.mBuilder.append(VCardConstants.PROPERTY_FN);
            this.mBuilder.append(VCARD_DATA_SEPARATOR);
            this.mBuilder.append(escapeCharacters6);
            this.mBuilder.append(VCARD_END_OF_LINE);
        }
        appendPhoneticNameFields(primaryContentValueWithStructuredName);
        return this;
    }

    private void appendPhoneticNameFields(ContentValues contentValues) {
        String escapeCharacters;
        String escapeCharacters2;
        String escapeCharacters3;
        boolean z;
        boolean z2 = this.mNeedsToConvertPhoneticString;
        String asString = contentValues.getAsString("data9");
        String asString2 = contentValues.getAsString("data8");
        String asString3 = contentValues.getAsString("data7");
        if (z2) {
            asString = VCardUtils.toHalfWidthString(asString);
            asString2 = VCardUtils.toHalfWidthString(asString2);
            asString3 = VCardUtils.toHalfWidthString(asString3);
        }
        if (TextUtils.isEmpty(asString) && TextUtils.isEmpty(asString2) && TextUtils.isEmpty(asString3)) {
            if (this.mIsDoCoMo) {
                this.mBuilder.append(VCardConstants.PROPERTY_SOUND);
                this.mBuilder.append(";");
                this.mBuilder.append("X-IRMC-N");
                this.mBuilder.append(VCARD_DATA_SEPARATOR);
                this.mBuilder.append(";");
                this.mBuilder.append(";");
                this.mBuilder.append(";");
                this.mBuilder.append(";");
                this.mBuilder.append(VCARD_END_OF_LINE);
                return;
            }
            return;
        }
        if (!VCardConfig.isVersion40(this.mVCardType)) {
            int i = this.mVCardType;
            if (VCardConfig.isVersion30(i)) {
                String constructNameFromElements = VCardUtils.constructNameFromElements(i, asString, asString2, asString3);
                this.mBuilder.append(VCardConstants.PROPERTY_SORT_STRING);
                if (VCardConfig.isVersion30(this.mVCardType) && shouldAppendCharsetParam(constructNameFromElements)) {
                    this.mBuilder.append(";");
                    this.mBuilder.append(this.mVCardCharsetParameter);
                }
                this.mBuilder.append(VCARD_DATA_SEPARATOR);
                this.mBuilder.append(escapeCharacters(constructNameFromElements));
                this.mBuilder.append(VCARD_END_OF_LINE);
            } else if (this.mIsJapaneseMobilePhone) {
                this.mBuilder.append(VCardConstants.PROPERTY_SOUND);
                this.mBuilder.append(";");
                this.mBuilder.append("X-IRMC-N");
                if (this.mRefrainsQPToNameProperties || (VCardUtils.containsOnlyNonCrLfPrintableAscii(asString) && VCardUtils.containsOnlyNonCrLfPrintableAscii(asString2) && VCardUtils.containsOnlyNonCrLfPrintableAscii(asString3))) {
                    escapeCharacters = escapeCharacters(asString);
                    escapeCharacters2 = escapeCharacters(asString2);
                    escapeCharacters3 = escapeCharacters(asString3);
                } else {
                    escapeCharacters = encodeQuotedPrintable(asString);
                    escapeCharacters2 = encodeQuotedPrintable(asString2);
                    escapeCharacters3 = encodeQuotedPrintable(asString3);
                }
                if (shouldAppendCharsetParam(escapeCharacters, escapeCharacters2, escapeCharacters3)) {
                    this.mBuilder.append(";");
                    this.mBuilder.append(this.mVCardCharsetParameter);
                }
                this.mBuilder.append(VCARD_DATA_SEPARATOR);
                if (TextUtils.isEmpty(escapeCharacters)) {
                    z = true;
                } else {
                    this.mBuilder.append(escapeCharacters);
                    z = false;
                }
                if (!TextUtils.isEmpty(escapeCharacters2)) {
                    if (!z) {
                        this.mBuilder.append(' ');
                    }
                    this.mBuilder.append(escapeCharacters2);
                    z = false;
                }
                if (!TextUtils.isEmpty(escapeCharacters3)) {
                    if (!z) {
                        this.mBuilder.append(' ');
                    }
                    this.mBuilder.append(escapeCharacters3);
                }
                this.mBuilder.append(";");
                this.mBuilder.append(";");
                this.mBuilder.append(";");
                this.mBuilder.append(";");
                this.mBuilder.append(VCARD_END_OF_LINE);
            }
        }
        if (this.mUsesDefactProperty) {
            if (!TextUtils.isEmpty(asString3)) {
                boolean z3 = this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(asString3);
                String encodeQuotedPrintable = z3 ? encodeQuotedPrintable(asString3) : escapeCharacters(asString3);
                this.mBuilder.append(VCardConstants.PROPERTY_X_PHONETIC_FIRST_NAME);
                if (shouldAppendCharsetParam(asString3)) {
                    this.mBuilder.append(";");
                    this.mBuilder.append(this.mVCardCharsetParameter);
                }
                if (z3) {
                    this.mBuilder.append(";");
                    this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
                }
                this.mBuilder.append(VCARD_DATA_SEPARATOR);
                this.mBuilder.append(encodeQuotedPrintable);
                this.mBuilder.append(VCARD_END_OF_LINE);
            }
            if (!TextUtils.isEmpty(asString2)) {
                boolean z4 = this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(asString2);
                String encodeQuotedPrintable2 = z4 ? encodeQuotedPrintable(asString2) : escapeCharacters(asString2);
                this.mBuilder.append(VCardConstants.PROPERTY_X_PHONETIC_MIDDLE_NAME);
                if (shouldAppendCharsetParam(asString2)) {
                    this.mBuilder.append(";");
                    this.mBuilder.append(this.mVCardCharsetParameter);
                }
                if (z4) {
                    this.mBuilder.append(";");
                    this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
                }
                this.mBuilder.append(VCARD_DATA_SEPARATOR);
                this.mBuilder.append(encodeQuotedPrintable2);
                this.mBuilder.append(VCARD_END_OF_LINE);
            }
            if (TextUtils.isEmpty(asString)) {
                return;
            }
            boolean z5 = this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(asString);
            String encodeQuotedPrintable3 = z5 ? encodeQuotedPrintable(asString) : escapeCharacters(asString);
            this.mBuilder.append(VCardConstants.PROPERTY_X_PHONETIC_LAST_NAME);
            if (shouldAppendCharsetParam(asString)) {
                this.mBuilder.append(";");
                this.mBuilder.append(this.mVCardCharsetParameter);
            }
            if (z5) {
                this.mBuilder.append(";");
                this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
            }
            this.mBuilder.append(VCARD_DATA_SEPARATOR);
            this.mBuilder.append(encodeQuotedPrintable3);
            this.mBuilder.append(VCARD_END_OF_LINE);
        }
    }

    private void appendPostalsForDoCoMo(List<ContentValues> list) {
        ContentValues contentValues;
        Iterator<ContentValues> it = list.iterator();
        ContentValues contentValues2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        while (true) {
            if (!it.hasNext()) {
                contentValues = contentValues2;
                break;
            }
            ContentValues next = it.next();
            if (next != null) {
                Integer asInteger = next.getAsInteger("data2");
                Integer num = sPostalTypePriorityMap.get(asInteger);
                int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (intValue < i) {
                    i2 = asInteger.intValue();
                    if (intValue == 0) {
                        contentValues = next;
                        break;
                    } else {
                        contentValues2 = next;
                        i = intValue;
                    }
                } else {
                    continue;
                }
            }
        }
        int i3 = i2;
        if (contentValues == null) {
            Log.w("vCard", "Should not come here. Must have at least one postal data.");
        } else {
            appendPostalLine(i3, contentValues.getAsString("data3"), contentValues, false, true);
        }
    }

    private void appendPostalsForGeneric(List<ContentValues> list) {
        for (ContentValues contentValues : list) {
            if (contentValues != null) {
                Integer asInteger = contentValues.getAsInteger("data2");
                int intValue = asInteger != null ? asInteger.intValue() : 1;
                String asString = contentValues.getAsString("data3");
                Integer asInteger2 = contentValues.getAsInteger("is_primary");
                boolean z = false;
                if (asInteger2 != null && asInteger2.intValue() > 0) {
                    z = true;
                }
                appendPostalLine(intValue, asString, contentValues, z, false);
            }
        }
    }

    private void appendTypeParameter(String str) {
        appendTypeParameter(this.mBuilder, str);
    }

    private void appendTypeParameters(List<String> list) {
        boolean z = true;
        for (String str : list) {
            if (VCardConfig.isVersion30(this.mVCardType) || VCardConfig.isVersion40(this.mVCardType)) {
                String stringAsV40ParamValue = VCardConfig.isVersion40(this.mVCardType) ? VCardUtils.toStringAsV40ParamValue(str) : VCardUtils.toStringAsV30ParamValue(str);
                if (!TextUtils.isEmpty(stringAsV40ParamValue)) {
                    if (!z) {
                        this.mBuilder.append(";");
                    }
                    appendTypeParameter(stringAsV40ParamValue);
                    z = false;
                }
            } else if (VCardUtils.isV21Word(str)) {
                if (!z) {
                    this.mBuilder.append(";");
                }
                appendTypeParameter(str);
                z = false;
            }
        }
    }

    private void appendUncommonPhoneType(StringBuilder sb, Integer num) {
        if (this.mIsDoCoMo) {
            sb.append(VCardConstants.PARAM_TYPE_VOICE);
            return;
        }
        String phoneTypeString = VCardUtils.getPhoneTypeString(num);
        if (phoneTypeString != null) {
            appendTypeParameter(phoneTypeString);
        } else {
            Objects.toString(num);
            Log.e("vCard", "Unknown or unsupported (by vCard) Phone type: ".concat(String.valueOf(num)));
        }
    }

    private void buildSinglePartNameField(String str, String str2) {
        boolean z = false;
        if (!this.mRefrainsQPToNameProperties && !VCardUtils.containsOnlyNonCrLfPrintableAscii(str2)) {
            z = true;
        }
        String encodeQuotedPrintable = z ? encodeQuotedPrintable(str2) : escapeCharacters(str2);
        this.mBuilder.append(str);
        if (shouldAppendCharsetParam(str2)) {
            this.mBuilder.append(";");
            this.mBuilder.append(this.mVCardCharsetParameter);
        }
        if (z) {
            this.mBuilder.append(";");
            this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
        }
        this.mBuilder.append(VCARD_DATA_SEPARATOR);
        this.mBuilder.append(encodeQuotedPrintable);
    }

    private boolean containsNonEmptyName(ContentValues contentValues) {
        return (TextUtils.isEmpty(contentValues.getAsString("data3")) && TextUtils.isEmpty(contentValues.getAsString("data5")) && TextUtils.isEmpty(contentValues.getAsString("data2")) && TextUtils.isEmpty(contentValues.getAsString("data4")) && TextUtils.isEmpty(contentValues.getAsString("data6")) && TextUtils.isEmpty(contentValues.getAsString("data9")) && TextUtils.isEmpty(contentValues.getAsString("data8")) && TextUtils.isEmpty(contentValues.getAsString("data7")) && TextUtils.isEmpty(contentValues.getAsString("data1"))) ? false : true;
    }

    private String encodeQuotedPrintable(String str) {
        byte[] bytes;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            bytes = str.getBytes(this.mCharset);
        } catch (UnsupportedEncodingException unused) {
            Log.e("vCard", "Charset " + this.mCharset + " cannot be used. Try default charset");
            bytes = str.getBytes();
        }
        int i = 0;
        int i2 = 0;
        while (i < bytes.length) {
            sb.append(String.format("=%02X", Byte.valueOf(bytes[i])));
            i++;
            i2 += 3;
            if (i2 >= 67) {
                sb.append("=\r\n");
                i2 = 0;
            }
        }
        return sb.toString();
    }

    private String escapeCharacters(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != '\n') {
                if (charAt != '\r') {
                    if (charAt != ',') {
                        if (charAt != '>') {
                            if (charAt != '\\') {
                                if (charAt == ';') {
                                    sb.append("\\;");
                                } else if (charAt != '<') {
                                    sb.append(charAt);
                                }
                            } else if (this.mIsV30OrV40) {
                                sb.append("\\\\");
                            }
                        }
                        if (this.mIsDoCoMo) {
                            sb.append('\\');
                            sb.append(charAt);
                        } else {
                            sb.append(charAt);
                        }
                    } else if (this.mIsV30OrV40) {
                        sb.append("\\,");
                    } else {
                        sb.append(charAt);
                    }
                } else if (i2 < length && str.charAt(i) == '\n') {
                }
                i = i2;
            }
            sb.append("\\n");
            i = i2;
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0042, code lost:
    
        if (containsNonEmptyName(r2) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0044, code lost:
    
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.content.ContentValues getPrimaryContentValueWithStructuredName(java.util.List<android.content.ContentValues> r5) {
        /*
            r4 = this;
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = r0
        L6:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r5.next()
            android.content.ContentValues r2 = (android.content.ContentValues) r2
            if (r2 == 0) goto L6
            java.lang.String r3 = "is_super_primary"
            java.lang.Integer r3 = r2.getAsInteger(r3)
            if (r3 == 0) goto L24
            int r3 = r3.intValue()
            if (r3 <= 0) goto L24
            r0 = r2
            goto L46
        L24:
            if (r0 != 0) goto L6
            java.lang.String r3 = "is_primary"
            java.lang.Integer r3 = r2.getAsInteger(r3)
            if (r3 == 0) goto L3c
            int r3 = r3.intValue()
            if (r3 <= 0) goto L3c
            boolean r3 = r4.containsNonEmptyName(r2)
            if (r3 == 0) goto L3c
            r0 = r2
            goto L6
        L3c:
            if (r1 != 0) goto L6
            boolean r3 = r4.containsNonEmptyName(r2)
            if (r3 == 0) goto L6
            r1 = r2
            goto L6
        L46:
            if (r0 != 0) goto L51
            if (r1 == 0) goto L4b
            return r1
        L4b:
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            return r5
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardBuilder.getPrimaryContentValueWithStructuredName(java.util.List):android.content.ContentValues");
    }

    private boolean shouldAppendCharsetParam(String... strArr) {
        if (!this.mShouldAppendCharsetParam) {
            return false;
        }
        for (String str : strArr) {
            if (!VCardUtils.containsOnlyPrintableAscii(str)) {
                return true;
            }
        }
        return false;
    }

    private List<String> splitPhoneNumbers(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                if (sb.length() > 0) {
                    arrayList.add(sb.toString());
                    sb = new StringBuilder();
                } else {
                    charAt = '\n';
                }
            }
            sb.append(charAt);
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    private qmz tryConstructPostalStruct(ContentValues contentValues) {
        String escapeCharacters;
        String escapeCharacters2;
        String escapeCharacters3;
        String escapeCharacters4;
        String escapeCharacters5;
        String escapeCharacters6;
        String asString = contentValues.getAsString("data5");
        String asString2 = contentValues.getAsString("data6");
        String asString3 = contentValues.getAsString("data4");
        String asString4 = contentValues.getAsString("data7");
        String asString5 = contentValues.getAsString("data8");
        String asString6 = contentValues.getAsString("data9");
        String asString7 = contentValues.getAsString("data10");
        String[] strArr = {asString, asString2, asString3, asString4, asString5, asString6, asString7};
        boolean z = false;
        if (VCardUtils.areAllEmpty(strArr)) {
            String asString8 = contentValues.getAsString("data1");
            if (TextUtils.isEmpty(asString8)) {
                return null;
            }
            if (this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(asString8)) {
                z = true;
            }
            return new qmz(z, !VCardUtils.containsOnlyPrintableAscii(asString8), ";" + (z ? encodeQuotedPrintable(asString8) : escapeCharacters(asString8)) + ";;;;;");
        }
        if (this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(strArr)) {
            z = true;
        }
        boolean z2 = !VCardUtils.containsOnlyPrintableAscii(strArr);
        if (!TextUtils.isEmpty(asString4)) {
            asString2 = TextUtils.isEmpty(asString2) ? asString4 : a.w(asString2, asString4, VCARD_WS);
        } else if (TextUtils.isEmpty(asString2)) {
            asString2 = "";
        }
        if (z) {
            escapeCharacters = encodeQuotedPrintable(asString);
            escapeCharacters2 = encodeQuotedPrintable(asString3);
            escapeCharacters3 = encodeQuotedPrintable(asString2);
            escapeCharacters4 = encodeQuotedPrintable(asString5);
            escapeCharacters5 = encodeQuotedPrintable(asString6);
            escapeCharacters6 = encodeQuotedPrintable(asString7);
        } else {
            escapeCharacters = escapeCharacters(asString);
            escapeCharacters2 = escapeCharacters(asString3);
            escapeCharacters3 = escapeCharacters(asString2);
            escapeCharacters4 = escapeCharacters(asString5);
            escapeCharacters5 = escapeCharacters(asString6);
            escapeCharacters6 = escapeCharacters(asString7);
        }
        return new qmz(z, z2, escapeCharacters + ";;" + escapeCharacters2 + ";" + escapeCharacters3 + ";" + escapeCharacters4 + ";" + escapeCharacters5 + ";" + escapeCharacters6);
    }

    public void appendAndroidSpecificProperty(String str, ContentValues contentValues) {
        if (sAllowedAndroidPropertySet.contains(str)) {
            ArrayList arrayList = new ArrayList();
            for (int i = 1; i <= 15; i++) {
                String asString = contentValues.getAsString(a.h(i, GroupManagementRequest.DATA_TAG));
                if (asString == null) {
                    asString = "";
                }
                arrayList.add(asString);
            }
            boolean z = this.mShouldAppendCharsetParam && !VCardUtils.containsOnlyNonCrLfPrintableAscii(arrayList);
            boolean z2 = this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(arrayList);
            this.mBuilder.append(VCardConstants.PROPERTY_X_ANDROID_CUSTOM);
            if (z) {
                this.mBuilder.append(";");
                this.mBuilder.append(this.mVCardCharsetParameter);
            }
            if (z2) {
                this.mBuilder.append(";");
                this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
            }
            this.mBuilder.append(VCARD_DATA_SEPARATOR);
            this.mBuilder.append(str);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = (String) arrayList.get(i2);
                String encodeQuotedPrintable = z2 ? encodeQuotedPrintable(str2) : escapeCharacters(str2);
                this.mBuilder.append(";");
                this.mBuilder.append(encodeQuotedPrintable);
            }
            this.mBuilder.append(VCARD_END_OF_LINE);
        }
    }

    public void appendEmailLine(int i, String str, String str2, boolean z) {
        String str3 = VCardConstants.PARAM_TYPE_CELL;
        if (i != 0) {
            if (i == 1) {
                str3 = VCardConstants.PARAM_TYPE_HOME;
            } else if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        Log.e("vCard", a.h(i, "Unknown Email type: "));
                    }
                }
                str3 = null;
            } else {
                str3 = VCardConstants.PARAM_TYPE_WORK;
            }
        } else if (!VCardUtils.isMobilePhoneLabel(str)) {
            if (!TextUtils.isEmpty(str) && VCardUtils.containsOnlyAlphaDigitHyphen(str)) {
                str3 = "X-".concat(String.valueOf(str));
            }
            str3 = null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("PREF");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3);
        }
        appendLineWithCharsetAndQPDetection(VCardConstants.PROPERTY_EMAIL, arrayList, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r3 == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.android.vcard.VCardBuilder appendEmails(java.util.List<android.content.ContentValues> r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L5e
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
            r3 = r1
        Le:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r9.next()
            android.content.ContentValues r4 = (android.content.ContentValues) r4
            java.lang.String r5 = "data1"
            java.lang.String r5 = r4.getAsString(r5)
            if (r5 == 0) goto L26
            java.lang.String r5 = r5.trim()
        L26:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto Le
            java.lang.String r3 = "data2"
            java.lang.Integer r3 = r4.getAsInteger(r3)
            if (r3 == 0) goto L39
            int r3 = r3.intValue()
            goto L3a
        L39:
            r3 = 3
        L3a:
            java.lang.String r6 = "data3"
            java.lang.String r6 = r4.getAsString(r6)
            java.lang.String r7 = "is_primary"
            java.lang.Integer r4 = r4.getAsInteger(r7)
            if (r4 == 0) goto L50
            int r4 = r4.intValue()
            if (r4 <= 0) goto L50
            r4 = r0
            goto L51
        L50:
            r4 = r1
        L51:
            boolean r7 = r2.add(r5)
            if (r7 == 0) goto L5a
            r8.appendEmailLine(r3, r6, r5, r4)
        L5a:
            r3 = r0
            goto Le
        L5c:
            if (r3 != 0) goto L67
        L5e:
            boolean r9 = r8.mIsDoCoMo
            if (r9 == 0) goto L67
            java.lang.String r9 = ""
            r8.appendEmailLine(r0, r9, r9, r1)
        L67:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardBuilder.appendEmails(java.util.List):com.android.vcard.VCardBuilder");
    }

    public VCardBuilder appendEvents(List<ContentValues> list) {
        if (list != null) {
            Iterator<ContentValues> it = list.iterator();
            String str = null;
            String str2 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ContentValues next = it.next();
                if (next != null) {
                    Integer asInteger = next.getAsInteger("data2");
                    if (asInteger != null && asInteger.intValue() == 3) {
                        String asString = next.getAsString("data1");
                        if (asString != null) {
                            Integer asInteger2 = next.getAsInteger("is_super_primary");
                            if (asInteger2 != null && asInteger2.intValue() > 0) {
                                str = asString;
                                break;
                            }
                            Integer asInteger3 = next.getAsInteger("is_primary");
                            if (asInteger3 != null && asInteger3.intValue() > 0) {
                                str = asString;
                            } else if (str2 == null) {
                                str2 = asString;
                            }
                        } else {
                            continue;
                        }
                    } else if (this.mUsesAndroidProperty) {
                        appendAndroidSpecificProperty("vnd.android.cursor.item/contact_event", next);
                    }
                }
            }
            if (str != null) {
                appendLineWithCharsetAndQPDetection(VCardConstants.PROPERTY_BDAY, str.trim());
                return this;
            }
            if (str2 != null) {
                appendLineWithCharsetAndQPDetection(VCardConstants.PROPERTY_BDAY, str2.trim());
            }
        }
        return this;
    }

    public VCardBuilder appendIms(List<ContentValues> list) {
        String propertyNameForIm;
        if (list != null) {
            for (ContentValues contentValues : list) {
                Integer asInteger = contentValues.getAsInteger("data5");
                if (asInteger != null && (propertyNameForIm = VCardUtils.getPropertyNameForIm(asInteger.intValue())) != null) {
                    String asString = contentValues.getAsString("data1");
                    if (asString != null) {
                        asString = asString.trim();
                    }
                    if (!TextUtils.isEmpty(asString)) {
                        Integer asInteger2 = contentValues.getAsInteger("data2");
                        String str = null;
                        if (asInteger2 != null) {
                            int intValue = asInteger2.intValue();
                            if (intValue == 0) {
                                String asString2 = contentValues.getAsString("data3");
                                if (asString2 != null) {
                                    str = "X-".concat(asString2);
                                }
                            } else if (intValue == 1) {
                                str = VCardConstants.PARAM_TYPE_HOME;
                            } else if (intValue == 2) {
                                str = VCardConstants.PARAM_TYPE_WORK;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        if (!TextUtils.isEmpty(str)) {
                            arrayList.add(str);
                        }
                        Integer asInteger3 = contentValues.getAsInteger("is_primary");
                        if (asInteger3 != null && asInteger3.intValue() > 0) {
                            arrayList.add("PREF");
                        }
                        appendLineWithCharsetAndQPDetection(propertyNameForIm, arrayList, asString);
                    }
                }
            }
        }
        return this;
    }

    public void appendLine(String str, String str2) {
        appendLine(str, str2, false, false);
    }

    public void appendLineWithCharsetAndQPDetection(String str, String str2) {
        appendLineWithCharsetAndQPDetection(str, (List<String>) null, str2);
    }

    public VCardBuilder appendNameProperties(List<ContentValues> list) {
        String escapeCharacters;
        String escapeCharacters2;
        String escapeCharacters3;
        String escapeCharacters4;
        String escapeCharacters5;
        boolean z;
        if (VCardConfig.isVersion40(this.mVCardType)) {
            appendNamePropertiesV40(list);
            return this;
        }
        if (list == null || list.isEmpty()) {
            if (VCardConfig.isVersion30(this.mVCardType)) {
                appendLine(VCardConstants.PROPERTY_N, "");
                appendLine(VCardConstants.PROPERTY_FN, "");
                return this;
            }
            if (this.mIsDoCoMo) {
                appendLine(VCardConstants.PROPERTY_N, "");
            }
            return this;
        }
        ContentValues primaryContentValueWithStructuredName = getPrimaryContentValueWithStructuredName(list);
        String asString = primaryContentValueWithStructuredName.getAsString("data3");
        String asString2 = primaryContentValueWithStructuredName.getAsString("data5");
        String asString3 = primaryContentValueWithStructuredName.getAsString("data2");
        String asString4 = primaryContentValueWithStructuredName.getAsString("data4");
        String asString5 = primaryContentValueWithStructuredName.getAsString("data6");
        String asString6 = primaryContentValueWithStructuredName.getAsString("data1");
        if (!TextUtils.isEmpty(asString) || !TextUtils.isEmpty(asString3)) {
            boolean shouldAppendCharsetParam = shouldAppendCharsetParam(asString, asString3, asString2, asString4, asString5);
            boolean z2 = (this.mRefrainsQPToNameProperties || (VCardUtils.containsOnlyNonCrLfPrintableAscii(asString) && VCardUtils.containsOnlyNonCrLfPrintableAscii(asString3) && VCardUtils.containsOnlyNonCrLfPrintableAscii(asString2) && VCardUtils.containsOnlyNonCrLfPrintableAscii(asString4) && VCardUtils.containsOnlyNonCrLfPrintableAscii(asString5))) ? false : true;
            if (TextUtils.isEmpty(asString6)) {
                asString6 = VCardUtils.constructNameFromElements(VCardConfig.getNameOrderType(this.mVCardType), asString, asString2, asString3, asString4, asString5);
            }
            boolean shouldAppendCharsetParam2 = shouldAppendCharsetParam(asString6);
            boolean z3 = (this.mRefrainsQPToNameProperties || VCardUtils.containsOnlyNonCrLfPrintableAscii(asString6)) ? false : true;
            if (z2) {
                escapeCharacters = encodeQuotedPrintable(asString);
                escapeCharacters2 = encodeQuotedPrintable(asString3);
                escapeCharacters3 = encodeQuotedPrintable(asString2);
                escapeCharacters4 = encodeQuotedPrintable(asString4);
                escapeCharacters5 = encodeQuotedPrintable(asString5);
            } else {
                escapeCharacters = escapeCharacters(asString);
                escapeCharacters2 = escapeCharacters(asString3);
                escapeCharacters3 = escapeCharacters(asString2);
                escapeCharacters4 = escapeCharacters(asString4);
                escapeCharacters5 = escapeCharacters(asString5);
            }
            String encodeQuotedPrintable = z3 ? encodeQuotedPrintable(asString6) : escapeCharacters(asString6);
            this.mBuilder.append(VCardConstants.PROPERTY_N);
            if (this.mIsDoCoMo) {
                if (shouldAppendCharsetParam) {
                    this.mBuilder.append(";");
                    this.mBuilder.append(this.mVCardCharsetParameter);
                }
                if (z2) {
                    this.mBuilder.append(";");
                    this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
                }
                this.mBuilder.append(VCARD_DATA_SEPARATOR);
                this.mBuilder.append(asString6);
                this.mBuilder.append(";");
                this.mBuilder.append(";");
                this.mBuilder.append(";");
                this.mBuilder.append(";");
                z = shouldAppendCharsetParam2;
            } else {
                if (shouldAppendCharsetParam) {
                    this.mBuilder.append(";");
                    z = shouldAppendCharsetParam2;
                    this.mBuilder.append(this.mVCardCharsetParameter);
                } else {
                    z = shouldAppendCharsetParam2;
                }
                if (z2) {
                    this.mBuilder.append(";");
                    this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
                }
                this.mBuilder.append(VCARD_DATA_SEPARATOR);
                this.mBuilder.append(escapeCharacters);
                this.mBuilder.append(";");
                this.mBuilder.append(escapeCharacters2);
                this.mBuilder.append(";");
                this.mBuilder.append(escapeCharacters3);
                this.mBuilder.append(";");
                this.mBuilder.append(escapeCharacters4);
                this.mBuilder.append(";");
                this.mBuilder.append(escapeCharacters5);
            }
            this.mBuilder.append(VCARD_END_OF_LINE);
            this.mBuilder.append(VCardConstants.PROPERTY_FN);
            if (z) {
                this.mBuilder.append(";");
                this.mBuilder.append(this.mVCardCharsetParameter);
            }
            if (z3) {
                this.mBuilder.append(";");
                this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
            }
            this.mBuilder.append(VCARD_DATA_SEPARATOR);
            this.mBuilder.append(encodeQuotedPrintable);
            this.mBuilder.append(VCARD_END_OF_LINE);
        } else if (!TextUtils.isEmpty(asString6)) {
            buildSinglePartNameField(VCardConstants.PROPERTY_N, asString6);
            this.mBuilder.append(";");
            this.mBuilder.append(";");
            this.mBuilder.append(";");
            this.mBuilder.append(";");
            this.mBuilder.append(VCARD_END_OF_LINE);
            buildSinglePartNameField(VCardConstants.PROPERTY_FN, asString6);
            this.mBuilder.append(VCARD_END_OF_LINE);
        } else if (VCardConfig.isVersion30(this.mVCardType)) {
            appendLine(VCardConstants.PROPERTY_N, "");
            appendLine(VCardConstants.PROPERTY_FN, "");
        } else if (this.mIsDoCoMo) {
            appendLine(VCardConstants.PROPERTY_N, "");
        }
        appendPhoneticNameFields(primaryContentValueWithStructuredName);
        return this;
    }

    public VCardBuilder appendNickNames(List<ContentValues> list) {
        boolean z;
        if (!this.mIsV30OrV40) {
            z = this.mUsesAndroidProperty;
            return this;
        }
        if (list != null) {
            for (ContentValues contentValues : list) {
                String asString = contentValues.getAsString("data1");
                if (!TextUtils.isEmpty(asString)) {
                    if (z) {
                        appendAndroidSpecificProperty("vnd.android.cursor.item/nickname", contentValues);
                    } else {
                        appendLineWithCharsetAndQPDetection(VCardConstants.PROPERTY_NICKNAME, asString);
                    }
                }
            }
        }
        return this;
    }

    public VCardBuilder appendNotes(List<ContentValues> list) {
        if (list != null) {
            boolean z = false;
            if (this.mOnlyOneNoteFieldIsAvailable) {
                StringBuilder sb = new StringBuilder();
                Iterator<ContentValues> it = list.iterator();
                boolean z2 = true;
                while (it.hasNext()) {
                    String asString = it.next().getAsString("data1");
                    if (asString == null) {
                        asString = "";
                    }
                    if (asString.length() > 0) {
                        if (!z2) {
                            sb.append('\n');
                        }
                        sb.append(asString);
                        z2 = false;
                    }
                }
                String sb2 = sb.toString();
                boolean z3 = !VCardUtils.containsOnlyPrintableAscii(sb2);
                if (this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(sb2)) {
                    z = true;
                }
                appendLine(VCardConstants.PROPERTY_NOTE, sb2, z3, z);
                return this;
            }
            Iterator<ContentValues> it2 = list.iterator();
            while (it2.hasNext()) {
                String asString2 = it2.next().getAsString("data1");
                if (!TextUtils.isEmpty(asString2)) {
                    appendLine(VCardConstants.PROPERTY_NOTE, asString2, !VCardUtils.containsOnlyPrintableAscii(asString2), this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(asString2));
                }
            }
        }
        return this;
    }

    public VCardBuilder appendOrganizations(List<ContentValues> list) {
        if (list != null) {
            for (ContentValues contentValues : list) {
                String asString = contentValues.getAsString("data1");
                if (asString != null) {
                    asString = asString.trim();
                }
                String asString2 = contentValues.getAsString("data5");
                if (asString2 != null) {
                    asString2 = asString2.trim();
                }
                String asString3 = contentValues.getAsString("data4");
                if (asString3 != null) {
                    asString3 = asString3.trim();
                }
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(asString)) {
                    arrayList.add(asString);
                }
                if (!TextUtils.isEmpty(asString2)) {
                    if (arrayList.isEmpty()) {
                        arrayList.add("");
                    }
                    arrayList.add(asString2);
                }
                appendLine(VCardConstants.PROPERTY_ORG, arrayList, !VCardUtils.containsOnlyPrintableAscii(arrayList), this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(arrayList));
                if (!TextUtils.isEmpty(asString3)) {
                    appendLine(VCardConstants.PROPERTY_TITLE, asString3, !VCardUtils.containsOnlyPrintableAscii(asString3), this.mShouldUseQuotedPrintable && !VCardUtils.containsOnlyNonCrLfPrintableAscii(asString3));
                }
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0110, code lost:
    
        if (r3 == false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.android.vcard.VCardBuilder appendPhones(java.util.List<android.content.ContentValues> r14, com.android.vcard.VCardPhoneNumberTranslationCallback r15) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardBuilder.appendPhones(java.util.List, com.android.vcard.VCardPhoneNumberTranslationCallback):com.android.vcard.VCardBuilder");
    }

    public void appendPhotoLine(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("PHOTO;");
        if (this.mIsV30OrV40) {
            sb.append(VCARD_PARAM_ENCODING_BASE64_AS_B);
        } else {
            sb.append(VCARD_PARAM_ENCODING_BASE64_V21);
        }
        sb.append(";");
        appendTypeParameter(sb, str2);
        sb.append(VCARD_DATA_SEPARATOR);
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        int length = sb2.length();
        int i = 73;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            sb3.append(sb2.charAt(i3));
            i2++;
            if (i2 > i) {
                sb3.append("\r\n ");
                i = 72;
                i2 = 0;
            }
        }
        this.mBuilder.append((CharSequence) sb3);
        this.mBuilder.append(VCARD_END_OF_LINE);
        this.mBuilder.append(VCARD_END_OF_LINE);
    }

    public VCardBuilder appendPhotos(List<ContentValues> list) {
        byte[] asByteArray;
        if (list != null) {
            for (ContentValues contentValues : list) {
                if (contentValues != null && (asByteArray = contentValues.getAsByteArray("data15")) != null) {
                    String guessImageType = VCardUtils.guessImageType(asByteArray);
                    if (guessImageType == null) {
                        Log.d("vCard", "Unknown photo type. Ignored.");
                    } else {
                        String str = new String(Base64.encode(asByteArray, 2));
                        if (!TextUtils.isEmpty(str)) {
                            appendPhotoLine(str, guessImageType);
                        }
                    }
                }
            }
        }
        return this;
    }

    public void appendPostalLine(int i, String str, ContentValues contentValues, boolean z, boolean z2) {
        boolean z3;
        String str2;
        boolean z4;
        qmz tryConstructPostalStruct = tryConstructPostalStruct(contentValues);
        if (tryConstructPostalStruct != null) {
            boolean z5 = tryConstructPostalStruct.a;
            z3 = tryConstructPostalStruct.b;
            str2 = tryConstructPostalStruct.c;
            z4 = z5;
        } else {
            if (!z2) {
                return;
            }
            z4 = false;
            str2 = "";
            z3 = false;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("PREF");
        }
        if (i != 0) {
            if (i == 1) {
                arrayList.add(VCardConstants.PARAM_TYPE_HOME);
            } else if (i == 2) {
                arrayList.add(VCardConstants.PARAM_TYPE_WORK);
            } else if (i != 3) {
                Log.e("vCard", a.h(i, "Unknown StructuredPostal type: "));
            }
        } else if (!TextUtils.isEmpty(str) && VCardUtils.containsOnlyAlphaDigitHyphen(str)) {
            arrayList.add("X-".concat(String.valueOf(str)));
        }
        this.mBuilder.append(VCardConstants.PROPERTY_ADR);
        if (!arrayList.isEmpty()) {
            this.mBuilder.append(";");
            appendTypeParameters(arrayList);
        }
        if (z3) {
            this.mBuilder.append(";");
            this.mBuilder.append(this.mVCardCharsetParameter);
        }
        if (z4) {
            this.mBuilder.append(";");
            this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
        }
        this.mBuilder.append(VCARD_DATA_SEPARATOR);
        this.mBuilder.append(str2);
        this.mBuilder.append(VCARD_END_OF_LINE);
    }

    public VCardBuilder appendPostals(List<ContentValues> list) {
        if (list != null && !list.isEmpty()) {
            if (this.mIsDoCoMo) {
                appendPostalsForDoCoMo(list);
                return this;
            }
            appendPostalsForGeneric(list);
            return this;
        }
        if (this.mIsDoCoMo) {
            this.mBuilder.append(VCardConstants.PROPERTY_ADR);
            this.mBuilder.append(";");
            this.mBuilder.append(VCardConstants.PARAM_TYPE_HOME);
            this.mBuilder.append(VCARD_DATA_SEPARATOR);
            this.mBuilder.append(VCARD_END_OF_LINE);
        }
        return this;
    }

    public VCardBuilder appendRelation(List<ContentValues> list) {
        if (this.mUsesAndroidProperty && list != null) {
            for (ContentValues contentValues : list) {
                if (contentValues != null) {
                    appendAndroidSpecificProperty("vnd.android.cursor.item/relation", contentValues);
                }
            }
        }
        return this;
    }

    public VCardBuilder appendSipAddresses(List<ContentValues> list) {
        boolean z;
        if (!this.mIsV30OrV40) {
            z = this.mUsesDefactProperty;
            return this;
        }
        if (list != null) {
            Iterator<ContentValues> it = list.iterator();
            while (it.hasNext()) {
                String asString = it.next().getAsString("data1");
                if (!TextUtils.isEmpty(asString)) {
                    if (z) {
                        if (asString.startsWith("sip:")) {
                            if (asString.length() != 4) {
                                asString = asString.substring(4);
                            }
                        }
                        appendLineWithCharsetAndQPDetection(VCardConstants.PROPERTY_X_SIP, asString);
                    } else {
                        if (!asString.startsWith("sip:")) {
                            asString = "sip:".concat(String.valueOf(asString));
                        }
                        appendLineWithCharsetAndQPDetection(true != VCardConfig.isVersion40(this.mVCardType) ? VCardConstants.PROPERTY_IMPP : VCardConstants.PROPERTY_TEL, asString);
                    }
                }
            }
        }
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f9, code lost:
    
        if (r11 == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void appendTelLine(java.lang.Integer r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardBuilder.appendTelLine(java.lang.Integer, java.lang.String, java.lang.String, boolean):void");
    }

    public VCardBuilder appendWebsites(List<ContentValues> list) {
        if (list != null) {
            Iterator<ContentValues> it = list.iterator();
            while (it.hasNext()) {
                String asString = it.next().getAsString("data1");
                if (asString != null) {
                    asString = asString.trim();
                }
                if (!TextUtils.isEmpty(asString)) {
                    appendLineWithCharsetAndQPDetection(VCardConstants.PROPERTY_URL, asString);
                }
            }
        }
        return this;
    }

    public void clear() {
        this.mBuilder = new StringBuilder();
        this.mEndAppended = false;
        appendLine(VCardConstants.PROPERTY_BEGIN, VCARD_DATA_VCARD);
        if (VCardConfig.isVersion40(this.mVCardType)) {
            appendLine(VCardConstants.PROPERTY_VERSION, VCardConstants.VERSION_V40);
            return;
        }
        int i = this.mVCardType;
        if (VCardConfig.isVersion30(i)) {
            appendLine(VCardConstants.PROPERTY_VERSION, VCardConstants.VERSION_V30);
            return;
        }
        if (!VCardConfig.isVersion21(i)) {
            Log.w("vCard", "Unknown vCard version detected.");
        }
        appendLine(VCardConstants.PROPERTY_VERSION, VCardConstants.VERSION_V21);
    }

    public String toString() {
        if (!this.mEndAppended) {
            if (this.mIsDoCoMo) {
                appendLine(VCardConstants.PROPERTY_X_CLASS, VCARD_DATA_PUBLIC);
                appendLine(VCardConstants.PROPERTY_X_REDUCTION, "");
                appendLine(VCardConstants.PROPERTY_X_NO, "");
                appendLine(VCardConstants.PROPERTY_X_DCM_HMN_MODE, "");
            }
            appendLine(VCardConstants.PROPERTY_END, VCARD_DATA_VCARD);
            this.mEndAppended = true;
        }
        return this.mBuilder.toString();
    }

    public VCardBuilder(int i, String str) {
        String concat;
        this.mVCardType = i;
        if (VCardConfig.isVersion40(i)) {
            Log.w("vCard", "Should not use vCard 4.0 when building vCard. It is not officially published yet.");
        }
        this.mIsV30OrV40 = VCardConfig.isVersion30(i) || VCardConfig.isVersion40(i);
        this.mShouldUseQuotedPrintable = VCardConfig.shouldUseQuotedPrintable(i);
        this.mIsDoCoMo = VCardConfig.isDoCoMo(i);
        this.mIsJapaneseMobilePhone = VCardConfig.needsToConvertPhoneticString(i);
        this.mOnlyOneNoteFieldIsAvailable = VCardConfig.onlyOneNoteFieldIsAvailable(i);
        this.mUsesAndroidProperty = VCardConfig.usesAndroidSpecificProperty(i);
        this.mUsesDefactProperty = VCardConfig.usesDefactProperty(i);
        this.mRefrainsQPToNameProperties = VCardConfig.shouldRefrainQPToNameProperties(i);
        this.mAppendTypeParamName = VCardConfig.appendTypeParamName(i);
        this.mNeedsToConvertPhoneticString = VCardConfig.needsToConvertPhoneticString(i);
        this.mShouldAppendCharsetParam = (VCardConfig.isVersion30(i) && emuz.e("UTF-8", str)) ? false : true;
        if (VCardConfig.isDoCoMo(i)) {
            if (emuz.e(SHIFT_JIS, str) || !TextUtils.isEmpty(str)) {
                this.mCharset = str;
            } else {
                this.mCharset = SHIFT_JIS;
            }
            this.mVCardCharsetParameter = "CHARSET=SHIFT_JIS";
        } else {
            if (TextUtils.isEmpty(str)) {
                Log.i("vCard", "Use the charset \"UTF-8\" for export.");
                this.mCharset = "UTF-8";
                concat = "CHARSET=UTF-8";
            } else {
                this.mCharset = str;
                concat = "CHARSET=".concat(String.valueOf(str));
            }
            this.mVCardCharsetParameter = concat;
        }
        clear();
    }

    private void appendTypeParameter(StringBuilder sb, String str) {
        if (VCardConfig.isVersion40(this.mVCardType) || ((VCardConfig.isVersion30(this.mVCardType) || this.mAppendTypeParamName) && !this.mIsDoCoMo)) {
            sb.append("TYPE=");
        }
        sb.append(str);
    }

    public void appendLine(String str, String str2, boolean z, boolean z2) {
        appendLine(str, (List<String>) null, str2, z, z2);
    }

    public void appendLineWithCharsetAndQPDetection(String str, List<String> list) {
        appendLineWithCharsetAndQPDetection(str, (List<String>) null, list);
    }

    public void appendLine(String str, List<String> list) {
        appendLine(str, list, false, false);
    }

    public void appendLineWithCharsetAndQPDetection(String str, List<String> list, String str2) {
        String str3;
        List<String> list2;
        String str4;
        boolean z;
        VCardBuilder vCardBuilder;
        boolean z2 = !VCardUtils.containsOnlyPrintableAscii(str2);
        if (!this.mShouldUseQuotedPrintable || VCardUtils.containsOnlyNonCrLfPrintableAscii(str2)) {
            str3 = str;
            list2 = list;
            str4 = str2;
            z = false;
            vCardBuilder = this;
        } else {
            vCardBuilder = this;
            str3 = str;
            list2 = list;
            str4 = str2;
            z = true;
        }
        vCardBuilder.appendLine(str3, list2, str4, z2, z);
    }

    public void appendLine(String str, List<String> list, String str2) {
        appendLine(str, list, str2, false, false);
    }

    public void appendLine(String str, List<String> list, String str2, boolean z, boolean z2) {
        String escapeCharacters;
        this.mBuilder.append(str);
        if (list != null && !list.isEmpty()) {
            this.mBuilder.append(";");
            appendTypeParameters(list);
        }
        if (z) {
            this.mBuilder.append(";");
            this.mBuilder.append(this.mVCardCharsetParameter);
        }
        if (z2) {
            this.mBuilder.append(";");
            this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
            escapeCharacters = encodeQuotedPrintable(str2);
        } else {
            escapeCharacters = escapeCharacters(str2);
        }
        this.mBuilder.append(VCARD_DATA_SEPARATOR);
        this.mBuilder.append(escapeCharacters);
        this.mBuilder.append(VCARD_END_OF_LINE);
    }

    public void appendLineWithCharsetAndQPDetection(String str, List<String> list, List<String> list2) {
        VCardBuilder vCardBuilder;
        String str2;
        List<String> list3;
        List<String> list4;
        boolean z;
        boolean z2 = this.mShouldAppendCharsetParam && !VCardUtils.containsOnlyNonCrLfPrintableAscii(list2);
        if (!this.mShouldUseQuotedPrintable || VCardUtils.containsOnlyNonCrLfPrintableAscii(list2)) {
            vCardBuilder = this;
            str2 = str;
            list3 = list;
            list4 = list2;
            z = false;
        } else {
            vCardBuilder = this;
            str2 = str;
            list3 = list;
            list4 = list2;
            z = true;
        }
        vCardBuilder.appendLine(str2, list3, list4, z2, z);
    }

    public void appendLine(String str, List<String> list, List<String> list2, boolean z, boolean z2) {
        String escapeCharacters;
        this.mBuilder.append(str);
        if (list != null && !list.isEmpty()) {
            this.mBuilder.append(";");
            appendTypeParameters(list);
        }
        if (z) {
            this.mBuilder.append(";");
            this.mBuilder.append(this.mVCardCharsetParameter);
        }
        if (z2) {
            this.mBuilder.append(";");
            this.mBuilder.append(VCARD_PARAM_ENCODING_QP);
        }
        this.mBuilder.append(VCARD_DATA_SEPARATOR);
        boolean z3 = true;
        for (String str2 : list2) {
            if (z2) {
                escapeCharacters = encodeQuotedPrintable(str2);
            } else {
                escapeCharacters = escapeCharacters(str2);
            }
            if (!z3) {
                this.mBuilder.append(";");
            }
            this.mBuilder.append(escapeCharacters);
            z3 = false;
        }
        this.mBuilder.append(VCARD_END_OF_LINE);
    }

    public void appendLine(String str, List<String> list, boolean z, boolean z2) {
        appendLine(str, (List<String>) null, list, z, z2);
    }
}
