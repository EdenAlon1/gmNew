package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ennt extends ennv implements enkg {
    private static final long serialVersionUID = 0;

    public ennt(enkg enkgVar) {
        super(enkgVar);
    }

    @Override // defpackage.ennv, defpackage.enfl
    /* renamed from: e */
    public final /* synthetic */ ennd hC() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [enkg, ennd] */
    @Override // defpackage.ennv, defpackage.enfl, defpackage.ennd
    /* renamed from: g */
    public final List c(Object obj) {
        return DesugarCollections.unmodifiableList(this.a.c(obj));
    }

    @Override // defpackage.ennv, defpackage.enfl, defpackage.ennd
    /* renamed from: h */
    public final List d(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ennv, defpackage.enfl, defpackage.enfm
    public final /* synthetic */ Object hC() {
        return this.a;
    }
}
