package defpackage;

import com.google.android.apps.messaging.ui.search.presenter.SelectedSearchResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddpq extends SelectedSearchResult {
    private final int a;
    private final int b;

    public ddpq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SelectedSearchResult
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SelectedSearchResult
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SelectedSearchResult) {
            SelectedSearchResult selectedSearchResult = (SelectedSearchResult) obj;
            if (this.a == selectedSearchResult.b() && this.b == selectedSearchResult.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "SelectedSearchResult{type=" + this.a + ", position=" + this.b + "}";
    }
}
