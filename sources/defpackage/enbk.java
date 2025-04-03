package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class enbk extends encd implements enkg {
    private static final long serialVersionUID = 6588350623831699109L;

    protected enbk(Map map) {
        super(map);
    }

    @Override // defpackage.encd
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.encd
    public final /* synthetic */ Collection b() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.encd
    public final Collection e(Collection collection) {
        return DesugarCollections.unmodifiableList((List) collection);
    }

    @Override // defpackage.encd
    public final Collection f(Object obj, Collection collection) {
        return n(obj, (List) collection, null);
    }

    @Override // defpackage.encd, defpackage.ennd
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final List c(Object obj) {
        return (List) super.c(obj);
    }

    @Override // defpackage.encd, defpackage.ennd
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final List d(Object obj) {
        return (List) super.d(obj);
    }
}
