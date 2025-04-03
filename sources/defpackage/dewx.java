package defpackage;

import com.google.android.gms.appdatasearch.SuggestionResults;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dewx implements Iterator {
    final /* synthetic */ SuggestionResults a;
    private int b = 0;

    public dewx(SuggestionResults suggestionResults) {
        this.a = suggestionResults;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String[] strArr = this.a.b;
        return strArr != null && this.b < strArr.length;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b++;
        return new deww();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
