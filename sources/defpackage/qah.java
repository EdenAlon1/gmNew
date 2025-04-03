package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qah extends ffkk implements ffix {
    final /* synthetic */ WorkDatabase a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qah(WorkDatabase workDatabase) {
        super(0);
        this.a = workDatabase;
    }

    @Override // defpackage.ffix
    public final /* synthetic */ Object invoke() {
        pyk D = this.a.D();
        pzg pzgVar = (pzg) D;
        pzgVar.a.m();
        oyf d = pzgVar.i.d();
        try {
            ((pzg) D).a.n();
            try {
                d.a();
                ((pzg) D).a.q();
                pzgVar.i.f(d);
                return ffcu.a;
            } finally {
                ((pzg) D).a.o();
            }
        } catch (Throwable th) {
            pzgVar.i.f(d);
            throw th;
        }
    }
}
