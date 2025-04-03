package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejwy implements ejvv {
    final /* synthetic */ ejwz a;

    public ejwy(ejwz ejwzVar) {
        this.a = ejwzVar;
    }

    @Override // defpackage.ejvv
    public final void a(ejvu ejvuVar) {
        boolean a;
        int ordinal = ejvuVar.c.ordinal();
        if (ordinal == 0) {
            a = ejww.a(this.a.g, null, ejvs.LOCAL_STATE_CHANGE);
        } else {
            if (ordinal != 1) {
                throw new IllegalStateException("Unrecognized CallReason: ".concat(ejvuVar.toString()));
            }
            if (ejww.a(this.a.g, ejvs.LOCAL_STATE_CHANGE, ejvs.REMOTE_STATE_CHANGE)) {
                return;
            } else {
                a = ejww.a(this.a.g, null, ejvs.REMOTE_STATE_CHANGE);
            }
        }
        if (a) {
            ejwz ejwzVar = this.a;
            ejwzVar.c.execute(new Runnable() { // from class: ejwx
                @Override // java.lang.Runnable
                public final void run() {
                    ejwy ejwyVar = ejwy.this;
                    ejvs ejvsVar = (ejvs) ejwyVar.a.g.getAndSet(null);
                    ejwz ejwzVar2 = ejwyVar.a;
                    ejua ejuaVar = (ejua) ejwzVar2.i;
                    long j = ejuaVar.d;
                    Instant f = ejwzVar2.a.f();
                    emxf.m(j != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
                    ejuh ejuhVar = ejuaVar.a;
                    ejwzVar2.i = new ejua(ejuhVar, ejuaVar.b, ejuaVar.c, ejuaVar.d, ejuaVar.f, ejuaVar.e.g(ejuhVar, f));
                    if (ejvs.LOCAL_STATE_CHANGE.equals(ejvsVar)) {
                        ejwz ejwzVar3 = ejwyVar.a;
                        ejwzVar3.f(((ejua) ejwzVar3.i).e);
                    } else {
                        if (!ejvs.REMOTE_STATE_CHANGE.equals(ejvsVar)) {
                            throw new IllegalStateException("Invalidation was ".concat(String.valueOf(String.valueOf(ejvsVar))));
                        }
                        ejwz ejwzVar4 = ejwyVar.a;
                        ejwzVar4.e(((ejua) ejwzVar4.i).e);
                    }
                }
            });
        }
    }
}
