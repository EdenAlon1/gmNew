package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cutf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cutp b;
    final /* synthetic */ Uri c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cutf(ffgu ffguVar, cutp cutpVar, Uri uri) {
        super(2, ffguVar);
        this.b = cutpVar;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cutf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cutp cutpVar = this.b;
        Uri uri = this.c;
        this.a = 1;
        Object d = cutpVar.d(uri, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cutf cutfVar = new cutf(ffguVar, this.b, this.c);
        cutfVar.d = obj;
        return cutfVar;
    }
}
