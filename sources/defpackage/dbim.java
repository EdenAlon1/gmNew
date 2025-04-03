package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbim extends ffhv implements ffjm {
    final /* synthetic */ dbip a;
    final /* synthetic */ eg b;
    final /* synthetic */ Intent c;
    final /* synthetic */ hho d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbim(dbip dbipVar, eg egVar, Intent intent, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dbipVar;
        this.b = egVar;
        this.c = intent;
        this.d = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbim) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ael aelVar = new ael();
        final hho hhoVar = this.d;
        adg b = this.b.h.b("recover_key_flow", aelVar, new adf() { // from class: dbil
            @Override // defpackage.adf
            public final void a(Object obj2) {
                int i = ((ade) obj2).a;
                dbip.a.p(a.f(i, "Got activity result ", " for enroll key flow"));
                hho.this.b(a.h(i, "Finished enroll key flow. \nResultCode: "));
            }
        });
        dbip dbipVar = this.a;
        dbipVar.d = b;
        adg adgVar = dbipVar.d;
        if (adgVar == null) {
            ffkj.c("setNewLskfLauncher");
            adgVar = null;
        }
        adgVar.c(this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dbim(this.a, this.b, this.c, this.d, ffguVar);
    }
}
