package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vig implements dqmn {
    final /* synthetic */ vij a;

    public vig(vij vijVar) {
        this.a = vijVar;
    }

    @Override // defpackage.dqmn
    public final /* synthetic */ CharSequence a() {
        return "";
    }

    @Override // defpackage.dqmn
    public final void f(dqrp dqrpVar) {
        this.a.b.hw();
        this.a.h.c(dqrpVar);
        this.a.h.a(dqrpVar);
        cmrl b = ((cmrq) this.a.d.b()).b(dqrpVar.b.a().toString());
        cmrv b2 = cmrv.b(b.e);
        if (b2 == null) {
            b2 = cmrv.UNRECOGNIZED;
        }
        if (b2 == cmrv.REACTION_TYPE_UNSPECIFIED) {
            throw new IllegalArgumentException("Could not send unspecified reaction from the custom reactions dialog.");
        }
        Optional optional = this.a.j;
        cmrm cmrmVar = ffkj.e(optional, Optional.empty()) ? cmrm.ADD_REACTION : ffkj.e(optional, Optional.of(b)) ? cmrm.REMOVE_REACTION : cmrm.REPLACE_REACTION;
        ffjm ffjmVar = this.a.i;
        if (ffjmVar != null) {
            b.getClass();
            ffjmVar.a(b, cmrmVar);
        }
    }

    @Override // defpackage.dqmn
    public final void d() {
    }

    @Override // defpackage.dqmn
    public final void e() {
    }

    @Override // defpackage.dqmn
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.dqmn
    public final void b(CharSequence charSequence) {
    }

    @Override // defpackage.dqmn
    public final void c(CharSequence charSequence) {
    }

    @Override // defpackage.dqmn
    public final void g(CharSequence charSequence) {
    }

    @Override // defpackage.dqmn
    public final void i(CharSequence charSequence) {
    }
}
