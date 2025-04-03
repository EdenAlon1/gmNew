package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class elyb extends elyu implements elpd {
    public final List a = new ArrayList();

    @Override // defpackage.elpd
    public final /* bridge */ /* synthetic */ Object a() {
        c(DesugarCollections.unmodifiableList(this.a));
        return b();
    }

    public abstract elyc b();

    public abstract void c(List list);
}
