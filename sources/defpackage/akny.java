package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akny extends ffhv implements ffjm {
    int a;
    final /* synthetic */ akoa b;
    final /* synthetic */ Intent c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akny(akoa akoaVar, Intent intent, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = akoaVar;
        this.c = intent;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akny) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            akoa akoaVar = this.b;
            Intent intent = this.c;
            this.a = 1;
            if (akoaVar.c(intent, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new akny(this.b, this.c, ffguVar);
    }
}
