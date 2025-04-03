package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yaq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yar b;
    final /* synthetic */ Uri c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yaq(ffgu ffguVar, yar yarVar, Uri uri) {
        super(2, ffguVar);
        this.b = yarVar;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yaq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cutd cutdVar = (cutd) this.b.g.b();
        Uri uri = this.c;
        this.a = 1;
        Object a = cutdVar.a(uri, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yaq yaqVar = new yaq(ffguVar, this.b, this.c);
        yaqVar.d = obj;
        return yaqVar;
    }
}
