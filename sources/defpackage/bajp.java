package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bajp {
    public final csmx a;

    public bajp(final ctwb ctwbVar, final csjk csjkVar, final bbfo bbfoVar) {
        this.a = new csmx() { // from class: bajn
            @Override // defpackage.csmx
            public final void y() {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final csjk csjkVar2 = csjkVar;
                ctwb.this.o(new ctwa() { // from class: bajo
                    @Override // defpackage.ctwa
                    public final boolean a(int i) {
                        csjk csjkVar3 = csjk.this;
                        if (((csmz) csjkVar3.a()).g(i) != csod.AVAILABLE && ((csmz) csjkVar3.a()).e(i) != csod.AVAILABLE && ((csmz) csjkVar3.a()).f() != csod.AVAILABLE) {
                            return true;
                        }
                        atomicBoolean.set(true);
                        return false;
                    }
                });
                if (atomicBoolean.get()) {
                    bbfo bbfoVar2 = bbfoVar;
                    if (auke.a()) {
                        bbfoVar2.d(9);
                    } else {
                        bbfoVar2.d(1);
                    }
                }
            }
        };
    }
}
