package defpackage;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import java.text.Bidi;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahni {
    private static final enru a = enru.c("com/google/android/apps/messaging/linkify/RtlLinkify");
    private final cuxh b;

    public ahni(cuxh cuxhVar) {
        this.b = cuxhVar;
    }

    final Spannable a(Spannable spannable, enhk enhkVar) {
        ClickableSpan[] clickableSpanArr;
        cgln[] cglnVarArr;
        cgln cglnVar;
        ClickableSpan[] clickableSpanArr2;
        char c;
        int length;
        if (!this.b.d() && !new Bidi(String.valueOf(spannable), -2).isMixed()) {
            return spannable;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        ClickableSpan[] clickableSpanArr3 = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
        int length2 = clickableSpanArr3.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            ClickableSpan clickableSpan = clickableSpanArr3[i2];
            int spanStart = spannable.getSpanStart(clickableSpan);
            int spanEnd = spannable.getSpanEnd(clickableSpan);
            String charSequence = spannable.subSequence(spanStart, spanEnd).toString();
            try {
                spannableStringBuilder.append((CharSequence) spannable.subSequence(i3, spanStart).toString());
                clickableSpanArr = clickableSpanArr3;
            } catch (StringIndexOutOfBoundsException unused) {
                char[] charArray = spannable.toString().toCharArray();
                StringBuilder sb = new StringBuilder();
                int length3 = charArray.length;
                while (i < length3) {
                    char c2 = charArray[i];
                    if (Character.isDigit(c2)) {
                        clickableSpanArr2 = clickableSpanArr3;
                        if (c2 < '0') {
                            c = '0';
                        } else if (c2 <= '9') {
                            sb.append('1');
                        } else {
                            c = '0';
                        }
                        sb.append(c);
                    } else {
                        clickableSpanArr2 = clickableSpanArr3;
                        if (Character.isLetter(c2)) {
                            byte directionality = Character.getDirectionality(c2);
                            if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                                sb.append('R');
                            } else {
                                sb.append('L');
                            }
                        } else {
                            sb.append(c2);
                        }
                    }
                    i++;
                    clickableSpanArr3 = clickableSpanArr2;
                }
                clickableSpanArr = clickableSpanArr3;
                String sb2 = sb.toString();
                if (enhkVar != null) {
                    cglnVarArr = (cgln[]) enhkVar.values().toArray(new cgln[0]);
                    cglnVar = (cgln) enhkVar.get(clickableSpan);
                } else {
                    cglnVarArr = null;
                    cglnVar = null;
                }
                ensk i4 = a.i();
                i4.Y(ente.a, "Bugle");
                ((enrr) ((enrr) i4).h("com/google/android/apps/messaging/linkify/RtlLinkify", "formatSpannableForRtl", 70, "RtlLinkify.java")).M("Index out of bounds! linkedText is \"%s\", spanStart = %d, spanEnd = %d, prevSpanEnd = %d, currentLinkEntityType is %s, linkEntityTypes are %s", sb2, Integer.valueOf(spanStart), Integer.valueOf(spanEnd), Integer.valueOf(i3), cglnVar, Arrays.toString(cglnVarArr));
            }
            int length4 = spannableStringBuilder.length();
            if (enhkVar != null && enhkVar.containsKey(clickableSpan) && ((cgln) enhkVar.get(clickableSpan)).equals(cgln.PHONE_NUMBER)) {
                String charSequence2 = spannable.subSequence(spanStart, spanEnd).toString();
                int i5 = kse.d;
                spannableStringBuilder.append((CharSequence) new ksc(null).a().c(charSequence2, ksk.a));
                length4 = spannableStringBuilder.toString().indexOf(charSequence, length4);
                length = charSequence.length() + length4;
            } else {
                spannableStringBuilder.append((CharSequence) spannable.subSequence(spanStart, spanEnd).toString());
                length = spannableStringBuilder.length();
            }
            spannableStringBuilder.setSpan(clickableSpan, length4, length, spannable.getSpanFlags(clickableSpan));
            i2++;
            i3 = spanEnd;
            clickableSpanArr3 = clickableSpanArr;
            i = 0;
        }
        spannableStringBuilder.append((CharSequence) spannable.subSequence(i3, spannable.length()).toString());
        return spannableStringBuilder;
    }
}
