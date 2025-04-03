package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddpn extends ddpu {
    private engw a;
    private engw b;
    private enip c;

    @Override // defpackage.ddpu
    public final ddpv a() {
        engw engwVar;
        enip enipVar;
        engw engwVar2 = this.a;
        if (engwVar2 != null && (engwVar = this.b) != null && (enipVar = this.c) != null) {
            return new ddpo(engwVar2, engwVar, enipVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" starredTextResultItemData");
        }
        if (this.b == null) {
            sb.append(" conversationListViewData");
        }
        if (this.c == null) {
            sb.append(" conversationsWithNoMatchingParts");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ddpu
    public final void b(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null conversationListViewData");
        }
        this.b = engwVar;
    }

    @Override // defpackage.ddpu
    public final void c(enip enipVar) {
        if (enipVar == null) {
            throw new NullPointerException("Null conversationsWithNoMatchingParts");
        }
        this.c = enipVar;
    }

    @Override // defpackage.ddpu
    public final void d(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null starredTextResultItemData");
        }
        this.a = engwVar;
    }
}
