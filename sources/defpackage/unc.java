package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unc extends ffhv implements ffjm {
    final /* synthetic */ une a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unc(ffgu ffguVar, une uneVar, Uri uri) {
        super(2, ffguVar);
        this.a = uneVar;
        this.b = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((unc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        une uneVar = this.a;
        return Boolean.valueOf(uneVar.c.f(uneVar.a, this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        unc uncVar = new unc(ffguVar, this.a, this.b);
        uncVar.c = obj;
        return uncVar;
    }
}
