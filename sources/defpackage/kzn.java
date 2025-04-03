package defpackage;

import android.database.Cursor;
import android.widget.Filter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kzn extends Filter {
    final kzm a;

    public kzn(kzm kzmVar) {
        this.a = kzmVar;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.a.c((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.a.a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor g = this.a.g();
        if (filterResults.values == null || filterResults.values == g) {
            return;
        }
        this.a.e((Cursor) filterResults.values);
    }
}
