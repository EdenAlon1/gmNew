package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akvi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ akvj b;
    final /* synthetic */ Intent c;
    final /* synthetic */ cniz d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akvi(akvj akvjVar, Intent intent, cniz cnizVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = akvjVar;
        this.c = intent;
        this.d = cnizVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akvi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ffsk ffskVar = (ffsk) this.e;
        akvj akvjVar = this.b;
        Intent intent = this.c;
        cniz cnizVar = this.d;
        List<akvw> list = akvjVar.a;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        for (akvw akvwVar : list) {
            arrayList.add(ffra.b(ffskVar, ekxi.a(ffhe.a), ffsm.a, new akvh(null, akvwVar, intent, cnizVar)));
        }
        this.a = 1;
        Object a = ffqv.a(arrayList, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        akvi akviVar = new akvi(this.b, this.c, this.d, ffguVar);
        akviVar.e = obj;
        return akviVar;
    }
}
