package defpackage;

import android.text.SpannableString;
import android.text.Spanned;
import android.widget.MultiAutoCompleteTextView;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbww implements MultiAutoCompleteTextView.Tokenizer {
    final /* synthetic */ SpannedMultiAutoCompleteTextView a;

    public dbww(SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView) {
        this.a = spannedMultiAutoCompleteTextView;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkArrayForEach(LoopRegionVisitor.java:230)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkForIndexedLoop(LoopRegionVisitor.java:144)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:81)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:65)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:55)
        */
    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public final int findTokenEnd(java.lang.CharSequence r6, int r7) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L47
            int r1 = r6.length()
            if (r1 != 0) goto La
            goto L47
        La:
            r1 = r6
            android.text.Spanned r1 = (android.text.Spanned) r1
            int r2 = r6.length()
            java.lang.Class<dbwx> r3 = defpackage.dbwx.class
            java.lang.Object[] r7 = r1.getSpans(r7, r2, r3)
            dbwx[] r7 = (defpackage.dbwx[]) r7
            int r2 = r6.length()
            if (r7 == 0) goto L33
            int r3 = r7.length
            if (r3 <= 0) goto L33
        L22:
            if (r0 >= r3) goto L33
            r4 = r7[r0]
            int r4 = r1.getSpanStart(r4)
            int r4 = r4 + (-1)
            int r2 = java.lang.Math.min(r4, r2)
            int r0 = r0 + 1
            goto L22
        L33:
            int r7 = r6.length()
            if (r2 >= r7) goto L46
            if (r2 < 0) goto L46
            char r7 = r6.charAt(r2)
            r0 = 32
            if (r7 != r0) goto L46
            int r2 = r2 + (-1)
            goto L33
        L46:
            return r2
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbww.findTokenEnd(java.lang.CharSequence, int):int");
    }

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public final int findTokenStart(CharSequence charSequence, int i) {
        if (i != 0 && charSequence != null && charSequence.length() != 0) {
            Spanned spanned = (Spanned) charSequence;
            dbwx[] dbwxVarArr = (dbwx[]) spanned.getSpans(0, i, dbwx.class);
            if (dbwxVarArr != null && (dbwxVarArr.length) != 0) {
                int i2 = 0;
                for (dbwx dbwxVar : dbwxVarArr) {
                    i2 = Math.max(i2, spanned.getSpanEnd(dbwxVar));
                }
                while (i2 < charSequence.length() && charSequence.charAt(i2) == ' ') {
                    i2++;
                }
                return i2;
            }
        }
        return 0;
    }

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public final CharSequence terminateToken(CharSequence charSequence) {
        csix.l(this.a.b);
        int length = charSequence.length();
        while (length > 0) {
            int i = length - 1;
            if (charSequence.charAt(i) != ' ') {
                break;
            }
            length = i;
        }
        if (length == 0) {
            return charSequence;
        }
        if (length == charSequence.length()) {
            charSequence = String.valueOf(String.valueOf(charSequence)).concat(" ");
            length++;
        }
        SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView = this.a;
        if (!spannedMultiAutoCompleteTextView.c.d(spannedMultiAutoCompleteTextView.b)) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView2 = this.a;
        spannableString.setSpan(new dbwx(this.a.b, spannedMultiAutoCompleteTextView2.c.a(spannedMultiAutoCompleteTextView2.b)), 0, length, 33);
        return spannableString;
    }
}
