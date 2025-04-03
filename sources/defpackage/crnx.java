package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.speech.tts.TextToSpeech;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crnx {
    public final Context e;
    public TextToSpeech f;
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/accessibility/AccessibilityUtil");
    public static final String b = Button.class.getName();
    private static final String[] g = new String[10];
    public static final enip c = new enpx("com.samsung.SMT");
    public final Object d = new Object();
    private final Map h = new HashMap();

    public crnx(Context context) {
        this.e = context;
    }

    public static String d(Resources resources, aoku aokuVar) {
        cfva cfvaVar = aoqm.a;
        return e(resources, emxe.b(aokuVar.H(((Boolean) new aopx().get()).booleanValue()).a));
    }

    @Deprecated
    public static String e(Resources resources, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (g[0] == null) {
            int[] iArr = {R.string.content_description_for_number_zero, R.string.content_description_for_number_one, R.string.content_description_for_number_two, R.string.content_description_for_number_three, R.string.content_description_for_number_four, R.string.content_description_for_number_five, R.string.content_description_for_number_six, R.string.content_description_for_number_seven, R.string.content_description_for_number_eight, R.string.content_description_for_number_nine};
            for (int i = 0; i < 10; i++) {
                g[i] = resources.getString(iArr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (char c2 : str.toCharArray()) {
            if (c2 < '0' || c2 > '9') {
                sb.append(c2);
                z = true;
            } else {
                if (z) {
                    sb.append(' ');
                }
                sb.append(g[c2 - '0']);
                sb.append(' ');
                z = false;
            }
        }
        return sb.toString();
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + length);
        for (char c2 : str.toCharArray()) {
            sb.append(c2);
            sb.append((char) 8291);
        }
        return sb.toString();
    }

    public static void g(String str, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getApplicationContext().getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
        obtain.setSource(view);
        obtain.setClassName(view.getContext().getClass().getName());
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setEnabled(true);
        obtain.getText().add(str);
        accessibilityManager.sendAccessibilityEvent(obtain);
    }

    public static void h(View view, CharSequence charSequence) {
        kvo.p(view, new crnu(charSequence));
    }

    public static boolean i(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public static boolean j(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static void k(View view, CharSequence charSequence) {
        Context context = view.getContext();
        if (i(context)) {
            Toast.makeText(context, charSequence, 0).show();
        }
    }

    public final SpannableString a(aoku aokuVar) {
        cfva cfvaVar = aoqm.a;
        return b(emxe.b(aokuVar.H(((Boolean) new aopx().get()).booleanValue()).a));
    }

    @Deprecated
    public final SpannableString b(String str) {
        return (SpannableString) Map.EL.computeIfAbsent(this.h, str, new Function() { // from class: crnt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String defaultEngine;
                String str2 = (String) obj;
                crnx crnxVar = crnx.this;
                synchronized (crnxVar.d) {
                    if (crnxVar.f == null) {
                        crnxVar.f = new TextToSpeech(crnxVar.e, new TextToSpeech.OnInitListener() { // from class: crns
                            @Override // android.speech.tts.TextToSpeech.OnInitListener
                            public final void onInit(int i) {
                                enru enruVar = crnx.a;
                            }
                        });
                    }
                    defaultEngine = crnxVar.f.getDefaultEngine();
                }
                ensk g2 = crnx.a.g();
                g2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) g2).h("com/google/android/apps/messaging/shared/util/accessibility/AccessibilityUtil", "getTtsEngine", 237, "AccessibilityUtil.java")).t("TTS engine: %s", defaultEngine);
                String b2 = cuxh.b(str2);
                if (!crnx.c.contains(defaultEngine)) {
                    SpannableString spannableString = new SpannableString(b2);
                    PhoneNumberUtils.addTtsSpan(spannableString, 0, b2.length());
                    return spannableString;
                }
                StringBuilder sb = new StringBuilder();
                boolean z = false;
                for (char c2 : b2.toCharArray()) {
                    if (c2 < '0' || c2 > '9') {
                        z = false;
                    } else {
                        if (z) {
                            sb.append((char) 8291);
                        }
                        z = true;
                    }
                    sb.append(c2);
                }
                return new SpannableString(sb.toString());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final String c(crnw crnwVar) {
        String string;
        int i;
        crnz crnzVar = (crnz) crnwVar;
        int i2 = crnzVar.b;
        Resources resources = crnzVar.a;
        if (i2 == 0) {
            string = resources.getString(R.string.failed_message);
        } else if (i2 == 2) {
            string = resources.getString(R.string.urgent);
        } else if (i2 != 3) {
            string = i2 != 4 ? i2 != 5 ? "" : resources.getString(R.string.notyetdelivered) : resources.getString(R.string.sending);
        } else if (crnzVar.c) {
            string = resources.getString(R.string.unsent);
        } else {
            int i3 = crnzVar.m;
            string = i3 == 0 ? resources.getString(R.string.unread) : resources.getQuantityString(R.plurals.unread_with_count, i3, Integer.valueOf(i3));
        }
        String string2 = crnzVar.c ? crnzVar.a.getString(R.string.outgoing) : crnzVar.a.getString(R.string.incoming);
        String string3 = crnzVar.c ? crnzVar.a.getString(R.string.to) : crnzVar.a.getString(R.string.from);
        String string4 = !emxe.c(crnzVar.h) ? crnzVar.a.getString(R.string.subject_content_description, crnzVar.h) : null;
        int i4 = crnzVar.b;
        if (i4 != 1) {
            if (i4 == 3 && !crnzVar.c) {
                int i5 = crnzVar.f;
                int i6 = i5 == 0 ? R.string.unsuccess_message_format : i5 == 1 ? le.t(crnzVar.g) ? R.string.unsuccess_message_format_with_single_attachment_location : le.n(crnzVar.g) ? R.string.unsuccess_message_format_with_single_attachment_image : le.A(crnzVar.g) ? R.string.unsuccess_message_format_with_single_attachment_video : le.f(crnzVar.g) ? R.string.unsuccess_message_format_with_single_attachment_audio : R.string.unsuccess_message_format_with_single_attachment : R.string.unsuccess_message_format_with_multiple_attachments;
                Resources resources2 = crnzVar.a;
                String b2 = emxe.b(string);
                String b3 = emxe.b(string3);
                String b4 = emxe.b(crnzVar.e);
                String b5 = emxe.b(string4);
                String str = crnzVar.i;
                if (str == null) {
                    str = crnzVar.l;
                }
                return resources2.getString(i6, b2, b3, b4, b5, emxe.b(str), emxe.b(crnzVar.j), emxe.b(crnzVar.k));
            }
            int i7 = crnzVar.f;
            int i8 = i7 == 0 ? R.string.unsuccessful_message_format_v2 : i7 == 1 ? le.t(crnzVar.g) ? R.string.unsuccessful_message_format_with_single_attachment_location_v2 : le.n(crnzVar.g) ? R.string.unsuccessful_message_format_with_single_attachment_image_v2 : le.A(crnzVar.g) ? R.string.unsuccessful_message_format_with_single_attachment_video_v2 : le.f(crnzVar.g) ? R.string.unsuccessful_message_format_with_single_attachment_audio_v2 : R.string.unsuccessful_message_format_with_single_attachment_v2 : R.string.unsuccessful_message_format_with_multiple_attachments_v2;
            Resources resources3 = crnzVar.a;
            String b6 = emxe.b(string);
            String b7 = emxe.b(string2);
            String str2 = crnzVar.e;
            if (str2 == null) {
                string3 = null;
            }
            String b8 = emxe.b(string3);
            String b9 = emxe.b(str2);
            String b10 = emxe.b(string4);
            String str3 = crnzVar.i;
            if (str3 == null) {
                str3 = crnzVar.l;
            }
            return resources3.getString(i8, b6, b7, b8, b9, b10, emxe.b(str3), emxe.b(crnzVar.j), emxe.b(crnzVar.k));
        }
        if (crnzVar.d && crnzVar.c) {
            int i9 = crnzVar.f;
            int i10 = i9 == 0 ? R.string.success_sent_to_message_format : i9 == 1 ? le.t(crnzVar.g) ? R.string.success_sent_to_message_format_with_single_attachment_location : le.n(crnzVar.g) ? R.string.success_sent_to_message_format_with_single_attachment_image : le.A(crnzVar.g) ? R.string.success_sent_to_message_format_with_single_attachment_video : le.f(crnzVar.g) ? R.string.success_sent_to_message_format_with_single_attachment_audio : R.string.success_sent_to_message_format_with_single_attachment : R.string.success_sent_to_message_format_with_multiple_attachments;
            Resources resources4 = crnzVar.a;
            String b11 = emxe.b(crnzVar.e);
            String b12 = emxe.b(string4);
            String str4 = crnzVar.i;
            if (str4 == null) {
                str4 = crnzVar.l;
            }
            return resources4.getString(i10, b11, b12, emxe.b(str4), emxe.b(crnzVar.j));
        }
        String string5 = (emxe.c(string4) && emxe.c(crnzVar.i) && emxe.c(crnzVar.l)) ? null : crnzVar.a.getString(R.string.said);
        int i11 = crnzVar.f;
        if (i11 == 0) {
            int i12 = crnzVar.n;
            if (i12 == 1) {
                return crnzVar.a.getString(R.string.success_message_self_sender, emxe.b(string4), emxe.b(crnzVar.i), emxe.b(crnzVar.j), emxe.b(crnzVar.k));
            }
            if (i12 == 2) {
                return crnzVar.a.getString(R.string.success_message_unspecified_sender, emxe.b(string4), emxe.b(crnzVar.i), emxe.b(crnzVar.j), emxe.b(crnzVar.k));
            }
            i = R.string.success_message_format;
        } else {
            int i13 = crnzVar.n;
            if (i13 != 0) {
                int i14 = i13 == 1 ? i11 == 1 ? le.t(crnzVar.g) ? R.string.success_message_self_sender_format_with_single_attachment_location : le.n(crnzVar.g) ? R.string.success_message_self_sender_format_with_single_attachment_image : le.A(crnzVar.g) ? R.string.success_message_self_sender_format_with_single_attachment_video : le.f(crnzVar.g) ? R.string.success_message_self_sender_format_with_single_attachment_audio : R.string.success_message_self_sender_format_with_single_attachment : R.string.success_message_self_sender_format_with_multiple_attachments : i11 == 1 ? le.t(crnzVar.g) ? R.string.success_message_unspecified_sender_format_with_single_attachment_location : le.n(crnzVar.g) ? R.string.success_message_unspecified_sender_format_with_single_attachment_image : le.A(crnzVar.g) ? R.string.success_message_unspecified_sender_format_with_single_attachment_video : le.f(crnzVar.g) ? R.string.success_message_unspecified_sender_format_with_single_attachment_audio : R.string.success_message_unspecified_sender_format_with_single_attachment : R.string.success_message_unspecified_sender_format_with_multiple_attachments;
                Resources resources5 = crnzVar.a;
                String b13 = emxe.b(string5);
                String b14 = emxe.b(string4);
                String str5 = crnzVar.i;
                if (str5 == null) {
                    str5 = crnzVar.l;
                }
                return resources5.getString(i14, b13, b14, emxe.b(str5), emxe.b(crnzVar.j), emxe.b(crnzVar.k));
            }
            i = i11 == 1 ? le.t(crnzVar.g) ? R.string.success_message_specified_sender_format_with_single_attachment_location : le.n(crnzVar.g) ? R.string.success_message_specified_sender_format_with_single_attachment_image : le.A(crnzVar.g) ? R.string.success_message_specified_sender_format_with_single_attachment_video : le.f(crnzVar.g) ? R.string.success_message_specified_sender_format_with_single_attachment_audio : R.string.success_message_specified_sender_format_with_single_attachment : R.string.success_message_specified_sender_format_with_multiple_attachments;
        }
        Resources resources6 = crnzVar.a;
        String b15 = emxe.b(crnzVar.e);
        String b16 = emxe.b(string5);
        String b17 = emxe.b(string4);
        String str6 = crnzVar.i;
        if (str6 == null) {
            str6 = crnzVar.l;
        }
        return resources6.getString(i, b15, b16, b17, emxe.b(str6), emxe.b(crnzVar.j), emxe.b(crnzVar.k));
    }
}
