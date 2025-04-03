package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.apps.messaging.R;
import defpackage.ehed;
import defpackage.ehee;
import defpackage.ehet;
import defpackage.ehez;
import defpackage.ehfe;
import defpackage.ehfo;
import defpackage.ehjg;
import defpackage.ksr;
import defpackage.kvo;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class MaterialCalendarGridView extends GridView {
    private final Calendar a;
    private final boolean b;

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    private static int b(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private final View c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ehfe getAdapter2() {
        return (ehfe) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int a;
        int b;
        int a2;
        int b2;
        int i;
        int i2;
        int right;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        ehfe adapter = materialCalendarGridView.getAdapter();
        ehee eheeVar = adapter.c;
        ehed ehedVar = adapter.e;
        int max = Math.max(adapter.b(), materialCalendarGridView.getFirstVisiblePosition());
        int min = Math.min(adapter.c(), materialCalendarGridView.getLastVisiblePosition());
        Long item = adapter.getItem(max);
        Long item2 = adapter.getItem(min);
        for (ksr ksrVar : eheeVar.b()) {
            Object obj = ksrVar.a;
            if (obj == null || ksrVar.b == null) {
                materialCalendarGridView = this;
            } else {
                Long l = (Long) obj;
                long longValue = l.longValue();
                Long l2 = (Long) ksrVar.b;
                long longValue2 = l2.longValue();
                if (item == null || item2 == null || l.longValue() > item2.longValue() || l2.longValue() < item.longValue()) {
                    materialCalendarGridView = this;
                    max = max;
                    min = min;
                    adapter = adapter;
                } else {
                    boolean k = ehjg.k(materialCalendarGridView);
                    if (longValue < item.longValue()) {
                        if (max % adapter.b.d == 0) {
                            right = 0;
                        } else {
                            int i3 = max - 1;
                            right = !k ? materialCalendarGridView.c(i3).getRight() : materialCalendarGridView.c(i3).getLeft();
                        }
                        b = right;
                        a = max;
                    } else {
                        materialCalendarGridView.a.setTimeInMillis(longValue);
                        a = adapter.a(materialCalendarGridView.a.get(5));
                        b = b(materialCalendarGridView.c(a));
                    }
                    if (longValue2 > item2.longValue()) {
                        b2 = (min + 1) % adapter.b.d == 0 ? materialCalendarGridView.getWidth() : !k ? materialCalendarGridView.c(min).getRight() : materialCalendarGridView.c(min).getLeft();
                        a2 = min;
                    } else {
                        materialCalendarGridView.a.setTimeInMillis(longValue2);
                        a2 = adapter.a(materialCalendarGridView.a.get(5));
                        b2 = b(materialCalendarGridView.c(a2));
                    }
                    int itemId = (int) adapter.getItemId(a);
                    int i4 = max;
                    int i5 = min;
                    int itemId2 = (int) adapter.getItemId(a2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        int numColumns2 = (numColumns + materialCalendarGridView.getNumColumns()) - 1;
                        View c = materialCalendarGridView.c(numColumns);
                        int top = c.getTop() + ehedVar.a.b();
                        ehfe ehfeVar = adapter;
                        int bottom = c.getBottom() - ehedVar.a.a();
                        if (k) {
                            int i6 = a2 > numColumns2 ? 0 : b2;
                            if (numColumns > a) {
                                int i7 = i6;
                                i2 = getWidth();
                                i = i7;
                            } else {
                                i = i6;
                                i2 = b;
                            }
                        } else {
                            i = numColumns > a ? 0 : b;
                            i2 = a2 > numColumns2 ? getWidth() : b2;
                        }
                        canvas.drawRect(i, top, i2, bottom, ehedVar.h);
                        itemId++;
                        materialCalendarGridView = this;
                        adapter = ehfeVar;
                    }
                    materialCalendarGridView = this;
                    max = i4;
                    min = i5;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(getAdapter().c());
        } else if (i == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= getAdapter().b() && selectedItemPosition <= getAdapter().c())) {
            return true;
        }
        if (i != 19) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.b) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof ehfe)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), ehfe.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = ehfo.e();
        if (ehez.aY(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.b = ehez.aZ(getContext(), R.attr.nestedScrollable);
        kvo.p(this, new ehet());
    }
}
