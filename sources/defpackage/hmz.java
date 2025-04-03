package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmz implements Comparator {
    final /* synthetic */ ffji a;

    public hmz(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Comparable, java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ffji ffjiVar = this.a;
        return ffgh.a(ffjiVar.invoke(obj), ffjiVar.invoke(obj2));
    }
}
