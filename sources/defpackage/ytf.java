package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ytf extends ffhv implements ffjm {
    final /* synthetic */ yti a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytf(ffgu ffguVar, yti ytiVar, Uri uri) {
        super(2, ffguVar);
        this.a = ytiVar;
        this.b = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ytf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.c.getContentResolver().getType(this.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ytf ytfVar = new ytf(ffguVar, this.a, this.b);
        ytfVar.c = obj;
        return ytfVar;
    }
}
