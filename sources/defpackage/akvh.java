package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akvh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ akvw b;
    final /* synthetic */ Intent c;
    final /* synthetic */ cniz d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akvh(ffgu ffguVar, akvw akvwVar, Intent intent, cniz cnizVar) {
        super(2, ffguVar);
        this.b = akvwVar;
        this.c = intent;
        this.d = cnizVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akvh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            akvw akvwVar = this.b;
            Intent intent = this.c;
            cniz cnizVar = this.d;
            this.a = 1;
            if (akvwVar.a(intent, cnizVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        akvh akvhVar = new akvh(ffguVar, this.b, this.c, this.d);
        akvhVar.e = obj;
        return akvhVar;
    }
}
