package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kzl extends BaseAdapter implements Filterable, kzm {
    private Context a;
    boolean b;
    public boolean c;
    public Cursor d;
    private int e;
    private kzj f;
    private DataSetObserver g;
    private kzn h;

    public kzl(Context context) {
        i(context, 0);
    }

    @Override // defpackage.kzm
    public Cursor a(CharSequence charSequence) {
        return this.d;
    }

    public abstract View b(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // defpackage.kzm
    public CharSequence c(Cursor cursor) {
        throw null;
    }

    @Override // defpackage.kzm
    public void e(Cursor cursor) {
        Cursor h = h(cursor);
        if (h != null) {
            h.close();
        }
    }

    public abstract void f(View view, Cursor cursor);

    @Override // defpackage.kzm
    public final Cursor g() {
        return this.d;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.b || (cursor = this.d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        Cursor cursor;
        if (!this.b || (cursor = this.d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        if (view == null) {
            view = j(viewGroup);
        }
        f(view, this.d);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.h == null) {
            this.h = new kzn(this);
        }
        return this.h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.b || (cursor = this.d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.d;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.b && (cursor = this.d) != null && cursor.moveToPosition(i)) {
            return this.d.getLong(this.e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        Cursor cursor = this.d;
        if (cursor == null) {
            throw new IllegalStateException("this should only be called when the cursor is non-null");
        }
        if (!cursor.moveToPosition(i)) {
            throw new IllegalStateException(a.h(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = b(this.a, this.d, viewGroup);
        }
        f(view, this.d);
        return view;
    }

    public Cursor h(Cursor cursor) {
        Cursor cursor2 = this.d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            kzj kzjVar = this.f;
            if (kzjVar != null) {
                cursor2.unregisterContentObserver(kzjVar);
            }
            DataSetObserver dataSetObserver = this.g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.d = cursor;
        if (cursor == null) {
            this.e = -1;
            this.b = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        kzj kzjVar2 = this.f;
        if (kzjVar2 != null) {
            cursor.registerContentObserver(kzjVar2);
        }
        DataSetObserver dataSetObserver2 = this.g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.e = cursor.getColumnIndexOrThrow("_id");
        this.b = true;
        notifyDataSetChanged();
        return cursor2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    final void i(Context context, int i) {
        if (i == 1) {
            this.c = true;
            i = 3;
        } else {
            this.c = false;
        }
        this.d = null;
        this.b = false;
        this.a = context;
        this.e = -1;
        if ((i & 2) == 2) {
            this.f = new kzj(this);
            this.g = new kzk(this);
        } else {
            this.f = null;
            this.g = null;
        }
    }

    public View j(ViewGroup viewGroup) {
        throw null;
    }

    public kzl(Context context, byte[] bArr) {
        i(context, 1);
    }
}
