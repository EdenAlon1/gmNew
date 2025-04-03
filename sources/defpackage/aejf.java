package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aejf extends vm {
    private static final cskc a = cskc.g("Bugle", "ConversationListAdapter");

    @Override // defpackage.vm
    public final void a() {
        a.q("onChanged");
    }

    @Override // defpackage.vm
    public final void b(int i, int i2) {
        csjb d = a.d();
        d.I("onItemRangeChanged");
        d.y("positionStart", i);
        d.y("itemCount", i2);
        d.r();
    }

    @Override // defpackage.vm
    public final void c(int i, int i2, Object obj) {
        csjb d = a.d();
        d.I("onItemRangeChanged");
        d.y("positionStart", i);
        d.y("itemCount", i2);
        d.A("payload", obj);
        d.r();
    }

    @Override // defpackage.vm
    public final void d(int i, int i2) {
        csjb d = a.d();
        d.I("onItemRangeInserted");
        d.y("positionStart", i);
        d.y("itemCount", i2);
        d.r();
    }

    @Override // defpackage.vm
    public final void e(int i, int i2) {
        csjb d = a.d();
        d.I("onItemRangeRemoved");
        d.y("positionStart", i);
        d.y("itemCount", i2);
        d.r();
    }

    @Override // defpackage.vm
    public final void g(int i, int i2) {
        csjb d = a.d();
        d.I("onItemRangeMoved");
        d.y("fromPosition", i);
        d.y("toPosition", i2);
        d.y("itemCount", 1);
        d.r();
    }
}
