package defpackage;

import android.os.Parcelable;
import android.text.SpanWatcher;
import android.text.Spannable;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbwy implements SpanWatcher {
    final /* synthetic */ SpannedMultiAutoCompleteTextView a;

    public dbwy(SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView) {
        this.a = spannedMultiAutoCompleteTextView;
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        ddmt ddmtVar;
        if (!(obj instanceof dbwx) || (ddmtVar = this.a.k) == null) {
            return;
        }
        Parcelable parcelable = ((dbwx) obj).a;
        if (parcelable instanceof SearchFilterDataItem) {
            ddmtVar.a.h((SearchFilterDataItem) parcelable);
        } else {
            csjy.n("BugleZeroStateSearch", "Token of the wrong type was removed. Expected an instance of SearchFilterDataItem");
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (!(obj instanceof dbwx) || i2 - i == i4 - i3) {
            return;
        }
        csix.c("TokenSpan should not be changed after creation.");
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        ddmt ddmtVar;
        if (!(obj instanceof dbwx) || (ddmtVar = this.a.k) == null) {
            return;
        }
        Parcelable parcelable = ((dbwx) obj).a;
        if (parcelable instanceof SearchFilterDataItem) {
            ddmtVar.a.j((SearchFilterDataItem) parcelable);
        } else {
            csjy.n("BugleZeroStateSearch", "Token of the wrong type was removed. Expected an instance of SearchFilterDataItem");
        }
    }
}
