package com.android.vcard;

import android.util.Log;
import defpackage.a;
import defpackage.emuz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VCardConfig {
    public static final String DEFAULT_EXPORT_CHARSET = "UTF-8";
    public static final String DEFAULT_IMPORT_CHARSET = "UTF-8";
    public static final String DEFAULT_INTERMEDIATE_CHARSET = "ISO-8859-1";
    public static final int FLAG_APPEND_TYPE_PARAM = 67108864;
    public static final int FLAG_CONVERT_PHONETIC_NAME_STRINGS = 134217728;
    private static final int FLAG_DOCOMO = 536870912;
    public static final int FLAG_REFRAIN_IMAGE_EXPORT = 8388608;
    public static final int FLAG_REFRAIN_PHONE_NUMBER_FORMATTING = 33554432;
    public static final int FLAG_REFRAIN_QP_TO_NAME_PROPERTIES = 268435456;
    private static final int FLAG_USE_ANDROID_PROPERTY = Integer.MIN_VALUE;
    private static final int FLAG_USE_DEFACT_PROPERTY = 1073741824;
    static final int LOG_LEVEL = 0;
    static final int LOG_LEVEL_NONE = 0;
    static final int LOG_LEVEL_PERFORMANCE_MEASUREMENT = 1;
    static final int LOG_LEVEL_SHOW_WARNING = 2;
    static final int LOG_LEVEL_VERBOSE = 3;
    private static final String LOG_TAG = "vCard";
    public static final int NAME_ORDER_DEFAULT = 0;
    public static final int NAME_ORDER_EUROPE = 4;
    public static final int NAME_ORDER_JAPANESE = 8;
    private static final int NAME_ORDER_MASK = 12;
    public static final int VCARD_TYPE_DEFAULT = -1073741824;
    public static final int VCARD_TYPE_DOCOMO = 939524104;
    static final String VCARD_TYPE_DOCOMO_STR = "docomo";
    public static final int VCARD_TYPE_UNKNOWN = 0;
    public static final int VCARD_TYPE_V21_EUROPE = -1073741820;
    static final String VCARD_TYPE_V21_EUROPE_STR = "v21_europe";
    public static final int VCARD_TYPE_V21_GENERIC = -1073741824;
    static final String VCARD_TYPE_V21_GENERIC_STR = "v21_generic";
    public static final int VCARD_TYPE_V21_JAPANESE = -1073741816;
    public static final int VCARD_TYPE_V21_JAPANESE_MOBILE = 402653192;
    static final String VCARD_TYPE_V21_JAPANESE_MOBILE_STR = "v21_japanese_mobile";
    static final String VCARD_TYPE_V21_JAPANESE_STR = "v21_japanese_utf8";
    public static final int VCARD_TYPE_V30_EUROPE = -1073741819;
    static final String VCARD_TYPE_V30_EUROPE_STR = "v30_europe";
    public static final int VCARD_TYPE_V30_GENERIC = -1073741823;
    static final String VCARD_TYPE_V30_GENERIC_STR = "v30_generic";
    public static final int VCARD_TYPE_V30_JAPANESE = -1073741815;
    static final String VCARD_TYPE_V30_JAPANESE_STR = "v30_japanese_utf8";
    public static final int VCARD_TYPE_V40_GENERIC = -1073741822;
    static final String VCARD_TYPE_V40_GENERIC_STR = "v40_generic";
    public static final int VERSION_21 = 0;
    public static final int VERSION_30 = 1;
    public static final int VERSION_40 = 2;
    public static final int VERSION_MASK = 3;
    private static final Set<Integer> sJapaneseMobileTypeSet;
    private static final Map<String, Integer> sVCardTypeMap;

    static {
        HashMap hashMap = new HashMap();
        sVCardTypeMap = hashMap;
        hashMap.put(VCARD_TYPE_V21_GENERIC_STR, -1073741824);
        hashMap.put(VCARD_TYPE_V30_GENERIC_STR, Integer.valueOf(VCARD_TYPE_V30_GENERIC));
        hashMap.put(VCARD_TYPE_V21_EUROPE_STR, Integer.valueOf(VCARD_TYPE_V21_EUROPE));
        hashMap.put(VCARD_TYPE_V30_EUROPE_STR, Integer.valueOf(VCARD_TYPE_V30_EUROPE));
        Integer valueOf = Integer.valueOf(VCARD_TYPE_V21_JAPANESE);
        hashMap.put(VCARD_TYPE_V21_JAPANESE_STR, valueOf);
        Integer valueOf2 = Integer.valueOf(VCARD_TYPE_V30_JAPANESE);
        hashMap.put(VCARD_TYPE_V30_JAPANESE_STR, valueOf2);
        Integer valueOf3 = Integer.valueOf(VCARD_TYPE_V21_JAPANESE_MOBILE);
        hashMap.put(VCARD_TYPE_V21_JAPANESE_MOBILE_STR, valueOf3);
        Integer valueOf4 = Integer.valueOf(VCARD_TYPE_DOCOMO);
        hashMap.put(VCARD_TYPE_DOCOMO_STR, valueOf4);
        HashSet hashSet = new HashSet();
        sJapaneseMobileTypeSet = hashSet;
        hashSet.add(valueOf);
        hashSet.add(valueOf2);
        hashSet.add(valueOf3);
        hashSet.add(valueOf4);
    }

    private VCardConfig() {
    }

    public static boolean appendTypeParamName(int i) {
        return isVersion30(i) || (i & FLAG_APPEND_TYPE_PARAM) != 0;
    }

    public static int getNameOrderType(int i) {
        return i & 12;
    }

    public static int getVCardTypeFromString(String str) {
        String c = emuz.c(str);
        Map<String, Integer> map = sVCardTypeMap;
        if (map.containsKey(c)) {
            return map.get(c).intValue();
        }
        if (emuz.e("default", str)) {
            return -1073741824;
        }
        Log.e("vCard", a.a(str, "Unknown vCard type String: \"", "\""));
        return -1073741824;
    }

    public static boolean isDoCoMo(int i) {
        return (i & FLAG_DOCOMO) != 0;
    }

    public static boolean isJapaneseDevice(int i) {
        return sJapaneseMobileTypeSet.contains(Integer.valueOf(i));
    }

    public static boolean isVersion21(int i) {
        return (i & 3) == 0;
    }

    public static boolean isVersion30(int i) {
        return (i & 3) == 1;
    }

    public static boolean isVersion40(int i) {
        return (i & 3) == 2;
    }

    public static boolean needsToConvertPhoneticString(int i) {
        return (i & FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0;
    }

    public static boolean onlyOneNoteFieldIsAvailable(int i) {
        return i == 939524104;
    }

    static boolean refrainPhoneNumberFormatting(int i) {
        return (i & FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) != 0;
    }

    public static boolean shouldRefrainQPToNameProperties(int i) {
        return (shouldUseQuotedPrintable(i) && (i & FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) == 0) ? false : true;
    }

    public static boolean shouldUseQuotedPrintable(int i) {
        return !isVersion30(i);
    }

    public static boolean showPerformanceLog() {
        return false;
    }

    public static boolean usesAndroidSpecificProperty(int i) {
        return (i & FLAG_USE_ANDROID_PROPERTY) != 0;
    }

    public static boolean usesDefactProperty(int i) {
        return (i & FLAG_USE_DEFACT_PROPERTY) != 0;
    }
}
