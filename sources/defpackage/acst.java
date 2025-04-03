package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acst extends ffhv implements ffjm {
    int a;
    final /* synthetic */ acsu b;
    final /* synthetic */ Intent c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acst(acsu acsuVar, Intent intent, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = acsuVar;
        this.c = intent;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acst) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        acsu acsuVar = this.b;
        Intent intent = this.c;
        this.a = 1;
        Object a = ffra.a(ekxi.a(acsuVar.d), new acss(null, acsuVar, intent), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new acst(this.b, this.c, ffguVar);
    }
}
