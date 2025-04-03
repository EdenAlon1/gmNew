package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjvi extends ffhv implements ffjm {
    final /* synthetic */ cjvk a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjvi(ffgu ffguVar, cjvk cjvkVar) {
        super(2, ffguVar);
        this.a = cjvkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjvi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cjvk cjvkVar = this.a;
        Uri uri = cjvkVar.h.a;
        if (uri == null) {
            return null;
        }
        ctas ctasVar = cjvkVar.d;
        int i = (int) cjvkVar.f;
        return ctasVar.b(uri, i, i, cjvkVar.e);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjvi cjviVar = new cjvi(ffguVar, this.a);
        cjviVar.b = obj;
        return cjviVar;
    }
}
