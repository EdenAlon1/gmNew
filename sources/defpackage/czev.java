package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czev extends cslh {
    final /* synthetic */ czex a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czev(czex czexVar) {
        super("Bugle.Async.RecentItemBuffer.ReadFromShared.Duration");
        this.a = czexVar;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        czex czexVar = this.a;
        String f = czexVar.c.f(czexVar.d, null);
        czexVar.a.clear();
        if (f != null) {
            Iterator it = emye.b(',').g(f).iterator();
            while (it.hasNext()) {
                this.a.a.add((String) it.next());
            }
        }
        return null;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            ((czew) it.next()).J(this.a);
        }
    }
}
