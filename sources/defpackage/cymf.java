package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cymf implements bcvm {
    final /* synthetic */ cymi a;

    public cymf(cymi cymiVar) {
        this.a = cymiVar;
    }

    private final boolean e(bcvr bcvrVar) {
        int o = bcvrVar.o();
        if (o == this.a.i) {
            return false;
        }
        ((ensz) cymi.a.n().h("com/google/android/apps/messaging/ui/conversation/conversationbottombar/ConversationBottomBarDataService$3", "updateIfProtocolChanged", 165, "ConversationBottomBarDataService.java")).u("Protocol changed: from %d to %d.", this.a.i, o);
        this.a.i = o;
        return true;
    }

    @Override // defpackage.bcvm
    public final void b(bcvr bcvrVar, int i) {
        Optional empty;
        if (e(bcvrVar)) {
            this.a.a();
        }
        int q = bcvrVar.q();
        cymi cymiVar = this.a;
        int i2 = cymiVar.j;
        if (q != i2) {
            cymiVar.j = bcvrVar.q();
            empty = Optional.of(Integer.valueOf(i2));
        } else {
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            this.a.c(((Integer) empty.get()).intValue());
            cymi cymiVar2 = this.a;
            cymiVar2.b(cymiVar2.j);
            this.a.a();
            ((ensz) cymi.a.n().h("com/google/android/apps/messaging/ui/conversation/conversationbottombar/ConversationBottomBarDataService$3", "onDraftChanged", 143, "ConversationBottomBarDataService.java")).B("Subscription changed: old subId %d, new subId %d.", empty.get(), this.a.j);
        }
    }

    @Override // defpackage.bcvm
    public final void ft(bcvr bcvrVar) {
        if (e(bcvrVar)) {
            this.a.a();
        }
    }

    @Override // defpackage.bcvm
    public final void fs() {
    }

    @Override // defpackage.bcvm
    public final void fv(bcvr bcvrVar) {
    }
}
