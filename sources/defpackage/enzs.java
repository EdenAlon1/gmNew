package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enzs implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i = ((enzt) obj).a;
        int i2 = ((enzt) obj2).a;
        if (i < i2) {
            return 1;
        }
        return i <= i2 ? 0 : -1;
    }
}
