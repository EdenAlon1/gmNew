package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azlw implements Comparator {
    final /* synthetic */ azoz a;

    public azlw(azoz azozVar) {
        this.a = azozVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ffgh.a(Boolean.valueOf(!this.a.a.contains(((azop) obj).b())), Boolean.valueOf(!this.a.a.contains(((azop) obj2).b())));
    }
}
