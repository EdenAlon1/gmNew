package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cutm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cutp b;
    final /* synthetic */ Uri c;
    final /* synthetic */ String d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cutm(ffgu ffguVar, cutp cutpVar, Uri uri, String str) {
        super(2, ffguVar);
        this.b = cutpVar;
        this.c = uri;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cutm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        long j = ffpw.a;
        Object e = cubs.E.e();
        e.getClass();
        long e2 = ffpy.e(((Number) e).longValue(), ffpz.d);
        cuto cutoVar = new cuto(this.b, this.c, this.d, null);
        this.a = 1;
        Object b = ffvm.b(e2, cutoVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cutm cutmVar = new cutm(ffguVar, this.b, this.c, this.d);
        cutmVar.e = obj;
        return cutmVar;
    }
}
