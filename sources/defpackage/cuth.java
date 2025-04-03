package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuth extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cutp b;
    final /* synthetic */ Uri c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuth(cutp cutpVar, Uri uri, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cutpVar;
        this.c = uri;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuth) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        String str = this.d;
        this.a = 1;
        Object f = cutpVar.f(uri, str, this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cuth(this.b, this.c, this.d, ffguVar);
    }
}
