package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckvw extends ffhv implements ffjm {
    final /* synthetic */ ckwi a;
    final /* synthetic */ Uri b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckvw(ckwi ckwiVar, Uri uri, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ckwiVar;
        this.b = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckvw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        enip f = this.a.i.v(this.b).f();
        f.getClass();
        return ffdx.ak(f);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ckvw(this.a, this.b, ffguVar);
    }
}
