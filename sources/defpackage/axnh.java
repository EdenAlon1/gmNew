package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axnh {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ffcu a(ffud ffudVar, ffrp ffrpVar, final erpf erpfVar) {
        Object a;
        ffudVar.hZ(new ffji() { // from class: axnd
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                erpf.this.b();
                return ffcu.a;
            }
        });
        try {
            a = erpfVar.a();
        } catch (CancellationException e) {
            ffrpVar.a(e);
        } catch (ExecutionException e2) {
            e = e2;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            ffrpVar.a(e);
        }
        if (a == null) {
            throw new IllegalArgumentException("Null value is not supported");
        }
        ((ffuq) ffrpVar).S(a);
        return ffcu.a;
    }

    public static final ffss b(erph erphVar, ffsk ffskVar) {
        ffskVar.getClass();
        final elfj elfjVar = new elfj(erphVar);
        final ffud c = ffui.c(ffskVar.hT());
        final ffrq ffrqVar = new ffrq();
        c.hZ(new ffji() { // from class: axne
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                elfj.this.a.n();
                ffrqVar.t(null);
                return ffcu.a;
            }
        });
        final ffji ffjiVar = new ffji() { // from class: axnf
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return axnh.a(ffud.this, ffrqVar, (erpf) obj);
            }
        };
        final erpg erpgVar = new erpg() { // from class: axng
            @Override // defpackage.erpg
            public final void a(erpf erpfVar) {
                ffji.this.invoke(erpfVar);
            }
        };
        erph erphVar2 = elfjVar.a;
        erpp erppVar = erpp.a;
        long j = eldl.a;
        final elat e = ekyf.e();
        erphVar2.m(new erpg() { // from class: elcr
            @Override // defpackage.erpg
            public final void a(erpf erpfVar) {
                long j2 = eldl.a;
                elat h = ekyf.h(ekyf.b(), elat.this);
                try {
                    erpgVar.a(erpfVar);
                } finally {
                }
            }
        }, erppVar);
        return ffrqVar;
    }
}
