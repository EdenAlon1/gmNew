package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgs {
    public final lge a;
    private final lgz b;
    private lgf c;
    private final boolean d;
    private final int[] e;

    public lgs(lgz lgzVar, lge lgeVar, lgf lgfVar, boolean z, int[] iArr, Set set) {
        this.a = lgeVar;
        this.b = lgzVar;
        this.c = lgfVar;
        this.d = z;
        this.e = iArr;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr2 = (int[]) it.next();
            String str = new String(iArr2, 0, iArr2.length);
            a(str, 0, str.length(), 1, true, new lgq(str));
        }
    }

    public static boolean b(Editable editable, KeyEvent keyEvent, boolean z) {
        lgt[] lgtVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!e(selectionStart, selectionEnd) && (lgtVarArr = (lgt[]) editable.getSpans(selectionStart, selectionEnd, lgt.class)) != null && (lgtVarArr.length) > 0) {
                for (lgt lgtVar : lgtVarArr) {
                    int spanStart = editable.getSpanStart(lgtVar);
                    int spanEnd = editable.getSpanEnd(lgtVar);
                    if (z) {
                        if (spanStart == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart && selectionStart < spanEnd) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                    } else {
                        if (spanEnd == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart) {
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0041, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x007c, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x006f, code lost:
    
        if (r11 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x009f, code lost:
    
        if (r10 != (-1)) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgs.c(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    private final boolean d(CharSequence charSequence, int i, int i2, lhc lhcVar) {
        if (lhcVar.c() == 0) {
            lgf lgfVar = this.c;
            lhh f = lhcVar.f();
            int b = f.b(8);
            if (b != 0) {
                f.b.getShort(b + f.a);
            }
            if (lga.a.get() == null) {
                lga.a.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) lga.a.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = ((lga) lgfVar).b;
            String sb2 = sb.toString();
            int i3 = kpu.a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i4 = lhcVar.c & 4;
            lhcVar.c = hasGlyph ? i4 | 2 : i4 | 1;
        }
        return lhcVar.c() == 2;
    }

    private static boolean e(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public final Object a(CharSequence charSequence, int i, int i2, int i3, boolean z, lgo lgoVar) {
        int i4;
        char c;
        lgr lgrVar = new lgr(this.b.c, this.d, this.e);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z2 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                lgy a = lgrVar.b.a(codePointAt);
                if (lgrVar.a == 2) {
                    if (a != null) {
                        lgrVar.b = a;
                        lgrVar.e++;
                    } else {
                        if (codePointAt == 65038) {
                            lgrVar.e();
                        } else if (!lgr.c(codePointAt)) {
                            lgy lgyVar = lgrVar.b;
                            if (lgyVar.a != null) {
                                c = 3;
                                if (lgrVar.e != 1) {
                                    lgrVar.c = lgyVar;
                                    lgrVar.e();
                                } else if (lgrVar.d()) {
                                    lgrVar.c = lgrVar.b;
                                    lgrVar.e();
                                } else {
                                    lgrVar.e();
                                }
                            } else {
                                lgrVar.e();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (a == null) {
                    lgrVar.e();
                    c = 1;
                } else {
                    lgrVar.a = 2;
                    lgrVar.b = a;
                    lgrVar.e = 1;
                    c = 2;
                }
                lgrVar.d = codePointAt;
                if (c == 1) {
                    i4 += Character.charCount(Character.codePointAt(charSequence, i4));
                    if (i4 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i4);
                    }
                    i6 = i4;
                } else if (c == 2) {
                    i6 += Character.charCount(codePointAt);
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (z || !d(charSequence, i4, i6, lgrVar.b())) {
                    i5++;
                    z2 = lgoVar.b(charSequence, i4, i6, lgrVar.b());
                }
            }
        }
        if (lgrVar.a == 2 && lgrVar.b.a != null && ((lgrVar.e > 1 || lgrVar.d()) && i5 < i3 && z2 && (z || !d(charSequence, i4, i6, lgrVar.a())))) {
            lgoVar.b(charSequence, i4, i6, lgrVar.a());
        }
        return lgoVar.a();
    }
}
