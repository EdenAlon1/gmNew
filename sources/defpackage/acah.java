package defpackage;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.apps.messaging.datadonation.redact.RedactedSpan;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acah {
    private static final cfva a = cfvl.e(cfvl.b, "donation_timestamp_round_value", 3600000);

    public static ezfx a(Spanned spanned, String str, long j, int i, abwy abwyVar) {
        int i2;
        RedactedSpan[] redactedSpanArr = (RedactedSpan[]) spanned.getSpans(0, spanned.length(), RedactedSpan.class);
        ezge ezgeVar = (ezge) ezgf.a.createBuilder();
        String obj = spanned.toString();
        ezgeVar.copyOnWrite();
        ezgf ezgfVar = (ezgf) ezgeVar.instance;
        obj.getClass();
        ezgfVar.b = obj;
        for (RedactedSpan redactedSpan : redactedSpanArr) {
            ezgc ezgcVar = (ezgc) ezgd.a.createBuilder();
            int ordinal = redactedSpan.a.ordinal();
            if (ordinal == 0) {
                i2 = 3;
            } else if (ordinal == 1) {
                i2 = 5;
            } else {
                if (ordinal != 2) {
                    throw new IllegalArgumentException("Unsupported RedactedSpan.Type: ".concat(String.valueOf(redactedSpan.a.name())));
                }
                i2 = 4;
            }
            ezgcVar.copyOnWrite();
            ((ezgd) ezgcVar.instance).b = i2 - 2;
            int spanStart = spanned.getSpanStart(redactedSpan);
            ezgcVar.copyOnWrite();
            ((ezgd) ezgcVar.instance).c = spanStart;
            int spanEnd = spanned.getSpanEnd(redactedSpan);
            ezgcVar.copyOnWrite();
            ((ezgd) ezgcVar.instance).d = spanEnd;
            ezgeVar.copyOnWrite();
            ezgf ezgfVar2 = (ezgf) ezgeVar.instance;
            ezgd ezgdVar = (ezgd) ezgcVar.build();
            ezgdVar.getClass();
            eygr eygrVar = ezgfVar2.c;
            if (!eygrVar.c()) {
                ezgfVar2.c = eyfy.mutableCopy(eygrVar);
            }
            ezgfVar2.c.add(ezgdVar);
        }
        ezfp ezfpVar = (ezfp) ezfq.a.createBuilder();
        ezfpVar.copyOnWrite();
        ((ezfq) ezfpVar.instance).e = 1;
        ezfpVar.copyOnWrite();
        ezfq ezfqVar = (ezfq) ezfpVar.instance;
        ezgf ezgfVar3 = (ezgf) ezgeVar.build();
        ezgfVar3.getClass();
        ezfqVar.d = ezgfVar3;
        ezfqVar.c = 2;
        if (abwyVar != null) {
            ezfv ezfvVar = (ezfv) ezfw.a.createBuilder();
            ezfvVar.copyOnWrite();
            abwx abwxVar = (abwx) abwyVar;
            ((ezfw) ezfvVar.instance).b = abwxVar.a;
            ezfvVar.copyOnWrite();
            ((ezfw) ezfvVar.instance).d = abwxVar.b;
            ezfvVar.copyOnWrite();
            ((ezfw) ezfvVar.instance).c = abwxVar.c;
            ezfpVar.copyOnWrite();
            ezfq ezfqVar2 = (ezfq) ezfpVar.instance;
            ezfw ezfwVar = (ezfw) ezfvVar.build();
            ezfwVar.getClass();
            ezfqVar2.f = ezfwVar;
            ezfqVar2.b |= 1;
        }
        ezfx ezfxVar = (ezfx) ezfz.a.createBuilder();
        ezfxVar.copyOnWrite();
        ezfz ezfzVar = (ezfz) ezfxVar.instance;
        str.getClass();
        ezfzVar.b = str;
        ezfxVar.copyOnWrite();
        ezfz ezfzVar2 = (ezfz) ezfxVar.instance;
        ezfq ezfqVar3 = (ezfq) ezfpVar.build();
        ezfqVar3.getClass();
        eygr eygrVar2 = ezfzVar2.c;
        if (!eygrVar2.c()) {
            ezfzVar2.c = eyfy.mutableCopy(eygrVar2);
        }
        ezfzVar2.c.add(ezfqVar3);
        int intValue = ((Integer) a.e()).intValue();
        if (intValue > 0) {
            j = (intValue * Math.round(j / intValue)) + i;
        }
        ezfxVar.copyOnWrite();
        ((ezfz) ezfxVar.instance).d = j;
        ezfxVar.copyOnWrite();
        ((ezfz) ezfxVar.instance).e = 1;
        return ezfxVar;
    }

    public static Optional b(Spanned spanned, Spanned spanned2) {
        int i;
        if (TextUtils.equals(spanned, spanned2)) {
            return Optional.empty();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned2);
        int i2 = 0;
        RedactedSpan[] redactedSpanArr = (RedactedSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), RedactedSpan.class);
        RedactedSpan[] redactedSpanArr2 = (RedactedSpan[]) spanned.getSpans(0, spanned.length(), RedactedSpan.class);
        for (RedactedSpan redactedSpan : redactedSpanArr) {
            int length = redactedSpanArr2.length;
            while (true) {
                if (i >= length) {
                    spannableStringBuilder.removeSpan(redactedSpan);
                    break;
                }
                RedactedSpan redactedSpan2 = redactedSpanArr2[i];
                i = (redactedSpan.a == redactedSpan2.a && TextUtils.equals(spannableStringBuilder.subSequence(spannableStringBuilder.getSpanStart(redactedSpan), spannableStringBuilder.getSpanEnd(redactedSpan)), spanned.subSequence(spanned.getSpanStart(redactedSpan2), spanned.getSpanEnd(redactedSpan2)))) ? 0 : i + 1;
            }
        }
        abxa abxaVar = new abxa((String) abxc.a.e());
        engw a2 = abxaVar.a(spanned.toString());
        engw a3 = abxaVar.a(spannableStringBuilder.toString());
        int[][] a4 = abwz.a(a2, a3);
        int i3 = ((enou) a2).c;
        int i4 = ((enou) a3).c;
        int i5 = 0;
        int i6 = 0;
        while (i3 > 0 && i4 > 0) {
            int i7 = i3 - 1;
            int[] iArr = a4[i7];
            int i8 = i4 - 1;
            int i9 = iArr[i8];
            int i10 = iArr[i4];
            if (i9 <= i10) {
                int[] iArr2 = a4[i3];
                if (i9 <= iArr2[i8]) {
                    if (i9 < iArr2[i4]) {
                        i6++;
                    }
                    i3 = i7;
                    i4 = i8;
                }
            }
            if (i10 < a4[i3][i8]) {
                i2++;
                i3 = i7;
            } else {
                i5++;
                i4 = i8;
            }
        }
        while (i3 > 0) {
            i2++;
            i3--;
        }
        while (i4 > 0) {
            i5++;
            i4--;
        }
        return Optional.of(new acae(spannableStringBuilder, new abwx(i5, i2, i6)));
    }
}
