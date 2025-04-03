package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apxf extends ffhv implements ffjm {
    final /* synthetic */ apxi a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apxf(ffgu ffguVar, apxi apxiVar, Uri uri) {
        super(2, ffguVar);
        this.a = apxiVar;
        this.b = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apxf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return new Long(this.a.b.b(this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        apxf apxfVar = new apxf(ffguVar, this.a, this.b);
        apxfVar.c = obj;
        return apxfVar;
    }
}
