package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egtz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ egub b;
    final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egtz(egub egubVar, Uri uri, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = egubVar;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egtz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            egub egubVar = this.b;
            Uri uri = this.c;
            this.a = 1;
            egsw egswVar = (egsw) egubVar.a;
            Object a = ffra.a(egswVar.d, new egst(egswVar, uri, null), this);
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
        return new egtz(this.b, this.c, ffguVar);
    }
}
