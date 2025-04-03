package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alzu implements alzt {
    private final cmgr a;

    public alzu(cmgr cmgrVar) {
        this.a = cmgrVar;
    }

    @Override // defpackage.alzt
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    @Override // defpackage.alzt
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        alzn alznVar = (alzn) obj;
        if (Objects.equals(c(), alznVar)) {
            return false;
        }
        this.a.m(alznVar.equals(alzn.ENABLED) ? cmip.TOGGLE_STATE_ENABLED : cmip.TOGGLE_STATE_USER_DISABLED);
        return true;
    }

    public final alzn c() {
        return this.a.n() ? alzn.ENABLED : alzn.DISABLED;
    }
}
