package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyyg implements cyxw {
    public final Context a;
    public final ffsk b;
    public final aigz c;
    public final eisx d;
    public final cuxh e;
    public final aqkp f;
    public final alxl g;
    public final ffbr h;
    public final ffbr i;
    public final atja j;
    public final ffbr k;
    public final atjg l;
    public final auaa m;
    public final cyyc n;
    public final cyxs o;
    private final ffsk p;
    private final ffxx q;
    private final ffxx r;

    public cyyg(Context context, ffsk ffskVar, ffsk ffskVar2, ffxx ffxxVar, ffxx ffxxVar2, aigz aigzVar, eisx eisxVar, cuxh cuxhVar, cyxs cyxsVar, aqkp aqkpVar, alxl alxlVar, ffbr ffbrVar, ffbr ffbrVar2, atja atjaVar, ffbr ffbrVar3, atjg atjgVar, auaa auaaVar) {
        context.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        aigzVar.getClass();
        eisxVar.getClass();
        cuxhVar.getClass();
        cyxsVar.getClass();
        aqkpVar.getClass();
        alxlVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.a = context;
        this.p = ffskVar;
        this.b = ffskVar2;
        this.q = ffxxVar;
        this.r = ffxxVar2;
        this.c = aigzVar;
        this.d = eisxVar;
        this.e = cuxhVar;
        this.o = cyxsVar;
        this.f = aqkpVar;
        this.g = alxlVar;
        this.h = ffbrVar;
        this.i = ffbrVar2;
        this.j = atjaVar;
        this.k = ffbrVar3;
        this.l = atjgVar;
        this.m = auaaVar;
        this.n = new cyyc(this);
    }

    public static final Uri b(Uri uri) {
        return uri.buildUpon().appendQueryParameter("sz", crjg.b.c).build();
    }

    @Override // defpackage.cyxw
    public final fgdj a() {
        ffxx ffxxVar = this.r;
        cyxs cyxsVar = this.o;
        fgcm fgcmVar = cyxsVar.b;
        fgcm fgcmVar2 = cyxsVar.a;
        ffxx i = axsp.i(axrb.a(this.q, "ConversationProperties"), axrb.c(fgcmVar2, "AvatarClicked"), axrb.c(fgcmVar, "SelectedGroupRecipient"), axrb.a(ffxxVar, "Recipients"), this.p, new cyyd(this, null));
        int i2 = fgcz.a;
        return fgbn.b(i, this.p, fgcy.a(0L, 3), null);
    }
}
