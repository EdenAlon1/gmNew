package defpackage;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddns extends Filter {
    final /* synthetic */ ddnt a;
    private final ddqu b;

    public ddns(ddnt ddntVar, ddqu ddquVar) {
        this.a = ddntVar;
        this.b = ddquVar;
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String charSequence2;
        csix.h();
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            try {
                charSequence2 = charSequence.toString();
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                ddnt.a.r("Failed to get suggestions.");
                return filterResults;
            }
        }
        List list = (List) dtnq.b(this.b.p(charSequence2), 10L, TimeUnit.SECONDS);
        filterResults.values = list;
        filterResults.count = list.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults == null || filterResults.values == null) {
            this.a.c = new ArrayList();
            this.a.notifyDataSetInvalidated();
            return;
        }
        this.a.c = (List) filterResults.values;
        csix.l(this.a.c);
        if (filterResults.count > 0) {
            this.a.notifyDataSetChanged();
        } else {
            this.a.notifyDataSetInvalidated();
        }
    }
}
