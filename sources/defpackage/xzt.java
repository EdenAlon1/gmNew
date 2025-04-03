package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xzt extends ffhv implements ffjm {
    final /* synthetic */ xzu a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzt(ffgu ffguVar, xzu xzuVar, Uri uri) {
        super(2, ffguVar);
        this.a = xzuVar;
        this.b = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xzt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        xzu xzuVar = this.a;
        xzuVar.b.j(xzuVar.a, this.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        xzt xztVar = new xzt(ffguVar, this.a, this.b);
        xztVar.c = obj;
        return xztVar;
    }
}
