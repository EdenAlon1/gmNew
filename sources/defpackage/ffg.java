package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffg implements Comparator {
    final /* synthetic */ cnz a;

    public ffg(cnz cnzVar) {
        this.a = cnzVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ffgh.a(Integer.valueOf(this.a.b(((Number) obj).longValue())), Integer.valueOf(this.a.b(((Number) obj2).longValue())));
    }
}
