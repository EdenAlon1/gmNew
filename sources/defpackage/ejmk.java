package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejmk extends ffhv implements ffjm {
    final /* synthetic */ ejmp a;
    final /* synthetic */ Uri b;
    final /* synthetic */ String c;
    final /* synthetic */ String[] d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejmk(ffgu ffguVar, ejmp ejmpVar, Uri uri, String str, String[] strArr) {
        super(2, ffguVar);
        this.a = ejmpVar;
        this.b = uri;
        this.c = str;
        this.d = strArr;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejmk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return new Integer(this.a.b.a(this.b, this.c, this.d));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ejmk ejmkVar = new ejmk(ffguVar, this.a, this.b, this.c, this.d);
        ejmkVar.e = obj;
        return ejmkVar;
    }
}
