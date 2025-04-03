package defpackage;

import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.Filter;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbxa implements TextWatcher {
    final /* synthetic */ SpannedMultiAutoCompleteTextView a;
    private dbwx[] b;
    private boolean c = false;

    public dbxa(SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView) {
        this.a = spannedMultiAutoCompleteTextView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable == null) {
            return;
        }
        dbwx[] dbwxVarArr = this.b;
        if (dbwxVarArr != null && dbwxVarArr.length > 0) {
            int length = editable.length();
            int i = 0;
            for (dbwx dbwxVar : this.b) {
                length = Math.max(Math.min(length, editable.getSpanStart(dbwxVar)), 0);
                i = Math.min(Math.max(i, editable.getSpanEnd(dbwxVar)), editable.length());
                editable.removeSpan(dbwxVar);
            }
            if (i > length) {
                editable.delete(length, i);
            }
        }
        SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView = this.a;
        if (!spannedMultiAutoCompleteTextView.f || spannedMultiAutoCompleteTextView.m()) {
            if (this.a.l()) {
                SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView2 = this.a;
                if (spannedMultiAutoCompleteTextView2.h != null) {
                    spannedMultiAutoCompleteTextView2.e = true;
                    int selectionEnd = spannedMultiAutoCompleteTextView2.getSelectionEnd();
                    int findTokenStart = this.a.d.findTokenStart(editable, selectionEnd);
                    SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView3 = this.a;
                    ddmi ddmiVar = spannedMultiAutoCompleteTextView3.m;
                    if (ddmiVar != null) {
                        ddmiVar.a();
                        return;
                    }
                    Filter filter = spannedMultiAutoCompleteTextView3.h;
                    CharSequence subSequence = editable.subSequence(findTokenStart, selectionEnd);
                    final SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView4 = this.a;
                    filter.filter(subSequence, new Filter.FilterListener() { // from class: dbwz
                        @Override // android.widget.Filter.FilterListener
                        public final void onFilterComplete(int i2) {
                            SpannedMultiAutoCompleteTextView.this.k(i2);
                        }
                    });
                    return;
                }
                return;
            }
            SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView5 = this.a;
            if (spannedMultiAutoCompleteTextView5.m != null) {
                boolean z = this.c;
                emxf.l(true);
                if (z) {
                    Editable text = spannedMultiAutoCompleteTextView5.getText();
                    int selectionEnd2 = spannedMultiAutoCompleteTextView5.getSelectionEnd();
                    int findTokenStart2 = selectionEnd2 >= 0 ? selectionEnd2 - spannedMultiAutoCompleteTextView5.d.findTokenStart(text, selectionEnd2) : 0;
                    if (findTokenStart2 < 2 && findTokenStart2 > 0) {
                        this.a.m.a();
                        return;
                    }
                }
            }
            this.a.g();
            Filter filter2 = this.a.h;
            if (filter2 != null) {
                filter2.filter(null);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView = this.a;
        spannedMultiAutoCompleteTextView.f = spannedMultiAutoCompleteTextView.m();
        this.b = null;
        if (i3 != 0) {
            z = false;
        } else if (i2 > 0) {
            z = true;
            i3 = 0;
        } else {
            i3 = 0;
            z = false;
        }
        this.c = i3 < i2;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (!z || spanned == null) {
            return;
        }
        int i4 = (i + i2) - i3;
        this.b = (dbwx[]) spanned.getSpans(i4, i4, dbwx.class);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
