package defpackage;

import com.google.android.gms.asterism.SetAsterismConsentRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class delc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ delf b;
    final /* synthetic */ SetAsterismConsentRequest c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public delc(ffgu ffguVar, delf delfVar, SetAsterismConsentRequest setAsterismConsentRequest) {
        super(2, ffguVar);
        this.b = delfVar;
        this.c = setAsterismConsentRequest;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((delc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dhre a = ((deys) this.b.a.b()).a(this.c);
        this.a = 1;
        Object a2 = axpj.a(a, this);
        return a2 == ffhhVar ? ffhhVar : a2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        delc delcVar = new delc(ffguVar, this.b, this.c);
        delcVar.d = obj;
        return delcVar;
    }
}
