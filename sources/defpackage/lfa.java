package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lfa {
    public final lfh a;
    public final boolean b;
    public final int[] c;
    private final ler d;

    public lfa(lfh lfhVar, ler lerVar, boolean z, int[] iArr) {
        this.a = lfhVar;
        this.d = lerVar;
        this.b = z;
        this.c = iArr;
    }

    public static boolean b(Editable editable, KeyEvent keyEvent, boolean z) {
        lfb[] lfbVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!f(selectionStart, selectionEnd) && (lfbVarArr = (lfb[]) editable.getSpans(selectionStart, selectionEnd, lfb.class)) != null && (lfbVarArr.length) > 0) {
                for (lfb lfbVar : lfbVarArr) {
                    int spanStart = editable.getSpanStart(lfbVar);
                    int spanEnd = editable.getSpanEnd(lfbVar);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfa.c(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static final void e(Spannable spannable, lex lexVar, int i, int i2) {
        spannable.setSpan(new lfi(lexVar), i, i2, 33);
    }

    private static boolean f(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public final lex a(CharSequence charSequence) {
        lez lezVar = new lez(this.a.c, this.b, this.c);
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(charSequence, i);
            if (lezVar.a(codePointAt) != 2) {
                return null;
            }
            i += Character.charCount(codePointAt);
        }
        if (lezVar.d()) {
            return lezVar.b();
        }
        return null;
    }

    public final boolean d(CharSequence charSequence, int i, int i2, lex lexVar) {
        if (lexVar.c == 0) {
            ler lerVar = this.d;
            ozb d = lexVar.d();
            int b = d.b(8);
            if (b != 0) {
                d.b.getShort(b + d.a);
            }
            if (ley.a.get() == null) {
                ley.a.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) ley.a.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = ((ley) lerVar).b;
            String sb2 = sb.toString();
            int i3 = kpu.a;
            lexVar.c = true != textPaint.hasGlyph(sb2) ? 1 : 2;
        }
        return lexVar.c == 2;
    }
}
