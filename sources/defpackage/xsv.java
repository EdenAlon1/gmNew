package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xsv extends ffhv implements ffjm {
    final /* synthetic */ xsw a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsv(ffgu ffguVar, xsw xswVar, Uri uri) {
        super(2, ffguVar);
        this.a = xswVar;
        this.b = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xsv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        xsw xswVar = this.a;
        return Boolean.valueOf(xswVar.d.f(xswVar.b, this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        xsv xsvVar = new xsv(ffguVar, this.a, this.b);
        xsvVar.c = obj;
        return xsvVar;
    }
}
