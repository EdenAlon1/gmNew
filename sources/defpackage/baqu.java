package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baqu extends ffhv implements ffjm {
    final /* synthetic */ bara a;
    final /* synthetic */ fflb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqu(ffgu ffguVar, bara baraVar, fflb fflbVar) {
        super(2, ffguVar);
        this.a = baraVar;
        this.b = fflbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baqu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cskc cskcVar = bara.a;
        return this.a.k.u((Uri) this.b.a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        baqu baquVar = new baqu(ffguVar, this.a, this.b);
        baquVar.c = obj;
        return baquVar;
    }
}
