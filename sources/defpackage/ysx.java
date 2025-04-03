package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ysx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ysz b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysx(ysz yszVar, Uri uri, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yszVar;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ysx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ysz yszVar = this.b;
            Uri uri = this.c;
            this.a = 2;
            Object a = ffra.a(ekxi.a(yszVar.d), new yst(null, yszVar, uri), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ysx(this.b, this.c, ffguVar);
    }
}
