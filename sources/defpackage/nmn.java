package defpackage;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmn {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map c;
    private static final Map d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, PrivateKeyType.INVALID, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, PrivateKeyType.INVALID, PrivateKeyType.INVALID)));
        hashMap.put("red", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, PrivateKeyType.INVALID, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, 0, PrivateKeyType.INVALID)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, PrivateKeyType.INVALID)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, PrivateKeyType.INVALID, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, PrivateKeyType.INVALID, PrivateKeyType.INVALID)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, PrivateKeyType.INVALID, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(PrivateKeyType.INVALID, 0, PrivateKeyType.INVALID)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, PrivateKeyType.INVALID)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = DesugarCollections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.text.SpannedString a(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmn.a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static nmh b(String str, Matcher matcher, luv luvVar, List list) {
        nmm nmmVar = new nmm();
        try {
            String group = matcher.group(1);
            lti.f(group);
            nmmVar.a = nmp.b(group);
            String group2 = matcher.group(2);
            lti.f(group2);
            nmmVar.b = nmp.b(group2);
            String group3 = matcher.group(3);
            lti.f(group3);
            c(group3, nmmVar);
            StringBuilder sb = new StringBuilder();
            String u = luvVar.u();
            while (!TextUtils.isEmpty(u)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(u.trim());
                u = luvVar.u();
            }
            nmmVar.c = a(str, sb.toString(), list);
            return new nmh(nmmVar.a().a(), nmmVar.a, nmmVar.b);
        } catch (IllegalArgumentException unused) {
            luj.f("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void c(String str, nmm nmmVar) {
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            lti.f(group);
            int i2 = 2;
            String group2 = matcher.group(2);
            lti.f(group2);
            try {
                char c2 = 65535;
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME)) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0) {
                            i2 = 0;
                        } else if (c2 == 1 || c2 == 2) {
                            i2 = 1;
                        } else if (c2 != 3) {
                            luj.f("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring)));
                            i2 = Integer.MIN_VALUE;
                        }
                        nmmVar.g = i2;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        nmmVar.e = nmp.a(group2);
                        nmmVar.f = 0;
                    } else {
                        nmmVar.e = Integer.parseInt(group2);
                        nmmVar.f = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME)) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c2 = 5;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
                                c2 = 0;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            if (c2 != 2 && c2 != 3) {
                                if (c2 != 4) {
                                    i = 5;
                                    if (c2 != 5) {
                                        luj.f("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                    }
                                } else {
                                    i = 3;
                                }
                            }
                            i = 2;
                        } else {
                            i = 4;
                        }
                    }
                    nmmVar.d = i;
                } else if ("position".equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                if (substring2.equals("line-left")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (substring2.equals("center")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (substring2.equals("line-right")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring2.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME)) {
                                    c2 = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring2.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0 || c2 == 1) {
                            i = 0;
                        } else if (c2 != 2 && c2 != 3) {
                            if (c2 == 4 || c2 == 5) {
                                i = 2;
                            } else {
                                luj.f("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(substring2)));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        nmmVar.i = i;
                        group2 = group2.substring(0, indexOf2);
                    }
                    nmmVar.h = nmp.a(group2);
                } else if ("size".equals(group)) {
                    nmmVar.j = nmp.a(group2);
                } else if ("vertical".equals(group)) {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642 && group2.equals("rl")) {
                            c2 = 0;
                        }
                    } else if (group2.equals("lr")) {
                        c2 = 1;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            luj.f("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    nmmVar.k = i;
                } else {
                    luj.f("WebvttCueParser", a.m(group2, group, "Unknown cue setting ", ":"));
                }
            } catch (NumberFormatException unused) {
                luj.f("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    private static int d(List list, String str, nmk nmkVar) {
        List e = e(list, str, nmkVar);
        for (int i = 0; i < e.size(); i++) {
            int i2 = ((nml) e.get(i)).b.o;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    private static List e(List list, String str, nmk nmkVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            nmg nmgVar = (nmg) list.get(i);
            String str2 = nmkVar.a;
            Set set = nmkVar.d;
            String str3 = nmkVar.c;
            if (nmgVar.a.isEmpty() && nmgVar.b.isEmpty() && nmgVar.c.isEmpty() && nmgVar.d.isEmpty()) {
                if (TextUtils.isEmpty(str2)) {
                    size = 1;
                }
                size = 0;
            } else {
                int b2 = nmg.b(nmg.b(nmg.b(0, nmgVar.a, str, 1073741824), nmgVar.b, str2, 2), nmgVar.d, str3, 4);
                if (b2 != -1 && set.containsAll(nmgVar.c)) {
                    size = b2 + (nmgVar.c.size() * 4);
                }
                size = 0;
            }
            if (size > 0) {
                arrayList.add(new nml(size, nmgVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void f(String str, nmk nmkVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c2;
        int i = nmkVar.b;
        int length = spannableStringBuilder.length();
        String str2 = nmkVar.a;
        int hashCode = str2.hashCode();
        int i2 = -1;
        if (hashCode == 0) {
            if (str2.equals("")) {
                c2 = 7;
            }
            c2 = 65535;
        } else if (hashCode == 105) {
            if (str2.equals("i")) {
                c2 = 1;
            }
            c2 = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals("lang")) {
                c2 = 6;
            }
            c2 = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals("ruby")) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode == 99) {
            if (str2.equals("c")) {
                c2 = 4;
            }
            c2 = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals("v")) {
                c2 = 5;
            }
            c2 = 65535;
        } else {
            if (str2.equals("u")) {
                c2 = 3;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 2:
                int d2 = d(list2, str, nmkVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, nmj.a);
                int i3 = nmkVar.b;
                int i4 = 0;
                int i5 = 0;
                while (i4 < arrayList.size()) {
                    if ("rt".equals(((nmj) arrayList.get(i4)).b.a)) {
                        nmj nmjVar = (nmj) arrayList.get(i4);
                        int d3 = d(list2, str, nmjVar.b);
                        if (d3 == i2) {
                            d3 = d2 != i2 ? d2 : 1;
                        }
                        int i6 = nmjVar.b.b - i5;
                        int i7 = nmjVar.c - i5;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i6, i7);
                        spannableStringBuilder.delete(i6, i7);
                        spannableStringBuilder.setSpan(new lte(subSequence.toString(), d3), i3, i6, 33);
                        i5 += subSequence.length();
                        i3 = i6;
                    }
                    i4++;
                    i2 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 4:
                for (String str3 : nmkVar.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new lth(nmkVar.c), i, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List e = e(list2, str, nmkVar);
        for (int i8 = 0; i8 < e.size(); i8++) {
            nmg nmgVar = ((nml) e.get(i8)).b;
            if (nmgVar != null) {
                if (nmgVar.a() != -1) {
                    ltf.a(spannableStringBuilder, new StyleSpan(nmgVar.a()), i, length);
                }
                if (nmgVar.j == 1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (nmgVar.g) {
                    if (!nmgVar.g) {
                        throw new IllegalStateException("Font color not defined");
                    }
                    ltf.a(spannableStringBuilder, new ForegroundColorSpan(nmgVar.f), i, length);
                }
                if (nmgVar.i) {
                    if (!nmgVar.i) {
                        throw new IllegalStateException("Background color not defined.");
                    }
                    ltf.a(spannableStringBuilder, new BackgroundColorSpan(nmgVar.h), i, length);
                }
                if (nmgVar.e != null) {
                    ltf.a(spannableStringBuilder, new TypefaceSpan(nmgVar.e), i, length);
                }
                int i9 = nmgVar.m;
                if (i9 == 1) {
                    ltf.a(spannableStringBuilder, new AbsoluteSizeSpan((int) nmgVar.n, true), i, length);
                } else if (i9 == 2) {
                    ltf.a(spannableStringBuilder, new RelativeSizeSpan(nmgVar.n), i, length);
                } else if (i9 == 3) {
                    ltf.a(spannableStringBuilder, new RelativeSizeSpan(nmgVar.n / 100.0f), i, length);
                }
                if (nmgVar.p) {
                    spannableStringBuilder.setSpan(new ltc(), i, length, 33);
                }
            }
        }
    }
}
