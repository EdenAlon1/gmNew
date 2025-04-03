package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccxb extends ffhv implements ffjm {
    final /* synthetic */ ccxe a;
    final /* synthetic */ List b;
    final /* synthetic */ ccvl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccxb(ccxe ccxeVar, List list, ccvl ccvlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ccxeVar;
        this.b = list;
        this.c = ccvlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccxb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ecri d = this.a.e.d();
        d.getClass();
        ecrh ecrhVar = ecrh.SUCCESS;
        try {
            try {
                final ccxe ccxeVar = this.a;
                dtuu dtuuVar = ccxeVar.d;
                final List list = this.b;
                final ccvl ccvlVar = this.c;
                dtuuVar.d("CmsMessageBackupDelegate#onInsertionBatchCompleted", new Runnable() { // from class: ccxa
                    @Override // java.lang.Runnable
                    public final void run() {
                        ccxe.this.g(ccxe.h(list), ccvlVar);
                    }
                });
                ccxe ccxeVar2 = this.a;
                ccxeVar2.e.f(d, new ecda("OnInsertionBatchCompleted"), null, ecrhVar);
                return ffcu.a;
            } catch (Exception e) {
                ecrh ecrhVar2 = ecrh.ERROR;
                throw e;
            }
        } catch (Throwable th) {
            ccxe ccxeVar3 = this.a;
            ccxeVar3.e.f(d, new ecda("OnInsertionBatchCompleted"), null, ecrhVar);
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ccxb(this.a, this.b, this.c, ffguVar);
    }
}
