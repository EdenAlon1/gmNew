package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsjm extends fflr {
    final /* synthetic */ dsjn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsjm(dsjn dsjnVar) {
        super(null);
        this.a = dsjnVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        dsjl dsjlVar = (dsjl) obj2;
        dsjl dsjlVar2 = (dsjl) obj;
        if (dsjlVar2 != null) {
            dsjn dsjnVar = this.a;
            dqlt dqltVar = dsjnVar.d;
            if (dqltVar != null) {
                dsjnVar.e.m(dqltVar);
            }
            dsjn dsjnVar2 = this.a;
            dqnl dqnlVar = dsjnVar2.b;
            if (dqnlVar != null) {
                dsjnVar2.e.l(dqnlVar);
            }
            dsjk dsjkVar = this.a.c;
            if (dsjkVar != null) {
                kvo.s(dsjlVar2.a, dsjkVar.a(), null);
            }
            this.a.e.o(null);
        }
        if (dsjlVar != null) {
            dsjn dsjnVar3 = this.a;
            dsjnVar3.e.o(dsjlVar.b);
            dsjn dsjnVar4 = this.a;
            dqlt dqltVar2 = dsjnVar4.d;
            if (dqltVar2 != null) {
                dsjnVar4.e.j(dqltVar2);
            }
            dsjn dsjnVar5 = this.a;
            dqnl dqnlVar2 = dsjnVar5.b;
            if (dqnlVar2 != null) {
                dsjnVar5.e.k(dqnlVar2);
            }
            final dsjk dsjkVar2 = this.a.c;
            if (dsjkVar2 != null) {
                kvo.s(dsjlVar.a, dsjkVar2.a(), new kue() { // from class: dsji
                    @Override // defpackage.kue
                    public final ktm a(View view, ktm ktmVar) {
                        view.getClass();
                        return (ktm) dsjk.this.b.invoke(ktmVar);
                    }
                });
            }
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
