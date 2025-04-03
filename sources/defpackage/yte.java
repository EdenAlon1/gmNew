package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yte extends ffhv implements ffjm {
    final /* synthetic */ yti a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yte(ffgu ffguVar, yti ytiVar, Uri uri) {
        super(2, ffguVar);
        this.a = ytiVar;
        this.b = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yte) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        yti ytiVar = this.a;
        return Boolean.valueOf(ytiVar.d.f(ytiVar.c, this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yte yteVar = new yte(ffguVar, this.a, this.b);
        yteVar.c = obj;
        return yteVar;
    }
}
