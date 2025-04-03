package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yox extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xwy b;
    final /* synthetic */ yoz c;
    final /* synthetic */ doxs d;
    final /* synthetic */ ffji e;
    final /* synthetic */ xhi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yox(xwy xwyVar, yoz yozVar, doxs doxsVar, ffji ffjiVar, xhi xhiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xwyVar;
        this.c = yozVar;
        this.d = doxsVar;
        this.e = ffjiVar;
        this.f = xhiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yox) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                long j = this.b.b / 1024;
                aigz aigzVar = this.c.a;
                Uri parse = Uri.parse(((drnl) this.d).b);
                parse.getClass();
                drnl drnlVar = (drnl) this.d;
                aiod aiodVar = new aiod(parse, j, drnlVar.c, drnlVar.d);
                this.a = 1;
                obj = aigzVar.f(aiodVar, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            Uri uri = (Uri) obj;
            if (uri != null) {
                ffji ffjiVar = this.e;
                xhi xhiVar = this.f;
                drlx a = drlo.a("video/*");
                if (a == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ffjiVar.invoke(new xhl(xhiVar, a, uri, null, new doxm("com.samsung.app.newtrim", 2)));
            }
        } catch (RuntimeException unused) {
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yox(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
