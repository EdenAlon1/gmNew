package defpackage;

import android.view.View;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kla implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int[] iArr = kvo.a;
        float b = kvd.b((View) obj);
        float b2 = kvd.b((View) obj2);
        if (b > b2) {
            return -1;
        }
        return b < b2 ? 1 : 0;
    }
}
