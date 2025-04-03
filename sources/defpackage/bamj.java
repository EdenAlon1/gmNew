package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bamj implements Comparator {
    final /* synthetic */ bamw a;

    public bamj(bamw bamwVar) {
        this.a = bamwVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ffgh.a(Boolean.valueOf(this.a.o((bseh) obj)), Boolean.valueOf(this.a.o((bseh) obj2)));
    }
}
