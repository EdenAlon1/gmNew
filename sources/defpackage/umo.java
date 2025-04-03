package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class umo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ umw b;
    final /* synthetic */ Uri c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public umo(ffgu ffguVar, umw umwVar, Uri uri) {
        super(2, ffguVar);
        this.b = umwVar;
        this.c = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((umo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        elfl c = this.b.c.c(this.c);
        c.getClass();
        this.a = 1;
        Object c2 = fgfz.c(c, this);
        return c2 == ffhhVar ? ffhhVar : c2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        umo umoVar = new umo(ffguVar, this.b, this.c);
        umoVar.d = obj;
        return umoVar;
    }
}
