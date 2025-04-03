package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baqs extends ffhv implements ffjm {
    final /* synthetic */ bara a;
    final /* synthetic */ Context b;
    final /* synthetic */ ll c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqs(ffgu ffguVar, bara baraVar, Context context, ll llVar) {
        super(2, ffguVar);
        this.a = baraVar;
        this.b = context;
        this.c = llVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baqs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cskc cskcVar = bara.a;
        return this.a.k.Z(this.b, this.c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        baqs baqsVar = new baqs(ffguVar, this.a, this.b, this.c);
        baqsVar.d = obj;
        return baqsVar;
    }
}
