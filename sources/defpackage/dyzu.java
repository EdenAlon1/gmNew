package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzu extends dzar {
    private engw a;

    @Override // defpackage.dzar
    public final dzas a() {
        engw engwVar = this.a;
        if (engwVar != null) {
            return new dyzv(engwVar);
        }
        throw new IllegalStateException("Missing required properties: contactIds");
    }

    @Override // defpackage.dzar
    public final void b(List list) {
        this.a = engw.n(list);
    }
}
