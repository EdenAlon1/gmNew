package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbgn implements Comparator {
    final /* synthetic */ bbgp a;

    public bbgn(bbgp bbgpVar) {
        this.a = bbgpVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ffgh.a(Boolean.valueOf(this.a.b((bseh) obj)), Boolean.valueOf(this.a.b((bseh) obj2)));
    }
}
