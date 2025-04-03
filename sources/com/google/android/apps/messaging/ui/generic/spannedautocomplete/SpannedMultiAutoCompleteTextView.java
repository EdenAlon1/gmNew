package com.google.android.apps.messaging.ui.generic.spannedautocomplete;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.QwertyKeyListener;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchBox;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;
import defpackage.csix;
import defpackage.dbwm;
import defpackage.dbwn;
import defpackage.dbws;
import defpackage.dbwt;
import defpackage.dbwu;
import defpackage.dbwv;
import defpackage.dbww;
import defpackage.dbwx;
import defpackage.dbwy;
import defpackage.dbxa;
import defpackage.dbxc;
import defpackage.ddmi;
import defpackage.ddmp;
import defpackage.ddmq;
import defpackage.ddmt;
import defpackage.egyl;
import defpackage.elbq;
import defpackage.elbx;
import defpackage.ffbr;
import defpackage.kvo;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SpannedMultiAutoCompleteTextView extends dbwm {
    public ffbr a;
    public Parcelable b;
    public dbxc c;
    public final dbww d;
    public boolean e;
    public boolean f;
    public dbws g;
    public Filter h;
    public AdapterView.OnItemClickListener i;
    public ListAdapter j;
    public ddmt k;
    public ddmq l;
    public ddmi m;
    private final int n;
    private SpannedAutoCompleteList o;
    private final dbwu p;

    public SpannedMultiAutoCompleteTextView(Context context) {
        this(context, null);
        c();
    }

    public final SpannedAutoCompleteList d() {
        if (this.o == null) {
            SpannedAutoCompleteList spannedAutoCompleteList = (SpannedAutoCompleteList) getRootView().findViewById(this.n);
            this.o = spannedAutoCompleteList;
            spannedAutoCompleteList.a.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: dbwq
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView = SpannedMultiAutoCompleteTextView.this;
                    SearchFilterDataItem item = ((ddnt) spannedMultiAutoCompleteTextView.j).getItem(i);
                    if (item == null) {
                        return;
                    }
                    AdapterView.OnItemClickListener onItemClickListener = spannedMultiAutoCompleteTextView.i;
                    if (onItemClickListener != null) {
                        onItemClickListener.onItemClick(adapterView, view, i, j);
                    }
                    spannedMultiAutoCompleteTextView.h(spannedMultiAutoCompleteTextView.e(item));
                    spannedMultiAutoCompleteTextView.g();
                }
            });
        }
        return this.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence e(Object obj) {
        this.b = obj;
        return this.h.convertResultToString(obj);
    }

    public final void f(Parcelable parcelable) {
        Editable editableText = getEditableText();
        int findTokenStart = this.d.findTokenStart(editableText, editableText.length());
        boolean z = true;
        if (findTokenStart != editableText.length() && ((dbwx[]) editableText.getSpans(findTokenStart, editableText.length(), dbwx.class)).length != 0) {
            z = false;
        }
        csix.k(z);
        editableText.replace(findTokenStart, findTokenStart, this.d.terminateToken(e(parcelable)));
        g();
    }

    public final void g() {
        d().a(false);
        this.e = false;
        ddmq ddmqVar = this.l;
        if (ddmqVar != null) {
            ddmqVar.b.d(false);
        }
    }

    public final void h(CharSequence charSequence) {
        clearComposingText();
        int selectionEnd = getSelectionEnd();
        int findTokenStart = this.d.findTokenStart(getText(), selectionEnd);
        Editable text = getText();
        QwertyKeyListener.markAsReplaced(text, findTokenStart, selectionEnd, TextUtils.substring(text, findTokenStart, selectionEnd));
        text.replace(findTokenStart, selectionEnd, this.d.terminateToken(charSequence));
    }

    public final void i(dbxc dbxcVar) {
        dbxc dbxcVar2 = this.c;
        if (dbxcVar2 != null) {
            dbxcVar2.b();
        }
        this.c = dbxcVar;
        dbxcVar.c(this);
    }

    public final void j() {
        ListAdapter adapter;
        this.b = null;
        SpannedAutoCompleteList d = d();
        ListView listView = d.a;
        if (listView == null || (adapter = listView.getAdapter()) == null || adapter.getCount() == 0) {
            return;
        }
        d.a(true);
        d.setOverScrollMode(0);
        final ddmq ddmqVar = this.l;
        if (ddmqVar != null) {
            if (!ddmqVar.a) {
                ZeroStateSearchBox zeroStateSearchBox = ddmqVar.b;
                zeroStateSearchBox.g = zeroStateSearchBox.getRootView().findViewById(R.id.zero_state_search_scrim);
                ddmqVar.a = true;
                kvo.p(d, new ddmp(ddmqVar));
                ddmqVar.b.g.setOnClickListener(new View.OnClickListener() { // from class: ddmo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ddmq.this.b.d.g();
                    }
                });
            }
            ddmqVar.b.d(true);
        }
    }

    public final void k(int i) {
        if (getWindowVisibility() == 8) {
            return;
        }
        boolean l = l();
        if (i <= 0 || !l) {
            if (m()) {
                g();
                this.e = true;
                return;
            }
            return;
        }
        if (hasFocus() && hasWindowFocus() && this.e) {
            j();
        }
    }

    public final boolean l() {
        Editable text = getText();
        int selectionEnd = getSelectionEnd();
        return selectionEnd >= 0 && selectionEnd - this.d.findTokenStart(text, selectionEnd) >= 2;
    }

    public final boolean m() {
        SpannedAutoCompleteList d = d();
        return d != null && d.getVisibility() == 0;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        egyl.c(this);
    }

    @Override // defpackage.qw, android.view.View
    protected final void onDetachedFromWindow() {
        g();
        this.k = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDisplayHint(int i) {
        super.onDisplayHint(i);
        if (i == 4) {
            g();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            return;
        }
        g();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ddmt ddmtVar = this.k;
        this.k = null;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.b != null) {
            getEditableText().replace(((Integer) savedState.b.first).intValue(), ((Integer) savedState.b.second).intValue(), "");
        }
        ArrayList arrayList = savedState.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            f((Parcelable) arrayList.get(i));
        }
        this.k = ddmtVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Editable editableText = getEditableText();
        dbwx[] dbwxVarArr = (dbwx[]) editableText.getSpans(0, editableText.length(), dbwx.class);
        if (dbwxVarArr.length <= 0) {
            return onSaveInstanceState;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        for (dbwx dbwxVar : dbwxVarArr) {
            savedState.a.add(dbwxVar.a);
        }
        Editable editableText2 = getEditableText();
        dbwx[] dbwxVarArr2 = (dbwx[]) editableText2.getSpans(0, editableText2.length(), dbwx.class);
        Pair pair = null;
        if (dbwxVarArr2 != null && (dbwxVarArr2.length) != 0) {
            int length = editableText2.length();
            int i = 0;
            for (dbwx dbwxVar2 : dbwxVarArr2) {
                length = Math.min(length, editableText2.getSpanStart(dbwxVar2));
                i = Math.max(i, editableText2.getSpanEnd(dbwxVar2));
            }
            if (length < i) {
                pair = Pair.create(Integer.valueOf(length), Integer.valueOf(i));
            }
        }
        savedState.b = pair;
        return savedState;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        int min;
        dbwx[] dbwxVarArr;
        int length;
        Editable text = getText();
        if (text != null && (min = Math.min(i, i2)) < text.length() && (length = (dbwxVarArr = (dbwx[]) text.getSpans(min + 1, text.length(), dbwx.class)).length) > 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                i3 = Math.max(i3, text.getSpanEnd(dbwxVarArr[i4]));
            }
            if (i3 > min) {
                if (i > i2) {
                    setSelection(Math.max(i, i3), i3);
                } else {
                    setSelection(i3, Math.max(i2, i3));
                }
            }
        }
        super.onSelectionChanged(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            return;
        }
        g();
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.p.a = onClickListener;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Editable editableText = getEditableText();
        super.setText(charSequence, TextView.BufferType.EDITABLE);
        Editable editableText2 = getEditableText();
        if (editableText != null) {
            csix.k(editableText != editableText2);
            editableText.clearSpans();
        }
        if (editableText2 != null) {
            editableText2.setSpan(new dbwy(this), 0, charSequence.length(), 18);
        }
    }

    public SpannedMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new dbww(this);
        this.e = true;
        dbwu dbwuVar = new dbwu(this);
        this.p = dbwuVar;
        i(new dbwt(getContext()));
        addTextChangedListener(new elbq((elbx) this.a.b(), new dbxa(this), "ZeroStateSearchBox TokenTextWatcher"));
        setFocusable(true);
        super.setOnClickListener(dbwuVar);
        int inputType = getInputType();
        if ((inputType & 15) == 1) {
            setRawInputType(65536 | inputType);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, dbwn.a, 0, 0);
        try {
            this.n = obtainStyledAttributes.getResourceId(0, R.id.spanned_autocomplete_list);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: PG */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new dbwv();
        final ArrayList a;
        Pair b;

        public SavedState(Parcel parcel) {
            super(parcel);
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            boolean[] zArr = new boolean[1];
            parcel.readBooleanArray(zArr);
            parcel.readList(arrayList, getClass().getClassLoader());
            if (zArr[0]) {
                this.b = Pair.create(Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()));
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            boolean[] zArr = {this.b != null};
            parcel.writeBooleanArray(zArr);
            parcel.writeList(this.a);
            if (zArr[0]) {
                parcel.writeInt(((Integer) this.b.first).intValue());
                parcel.writeInt(((Integer) this.b.second).intValue());
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.a = new ArrayList();
        }
    }
}
