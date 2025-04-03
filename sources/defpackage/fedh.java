package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fedh implements Comparator {
    final /* synthetic */ fedi a;

    public fedh(fedi fediVar) {
        this.a = fediVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        fedi fediVar = this.a;
        int a = fediVar.a(obj) - fediVar.a(obj2);
        return a != 0 ? a : obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
