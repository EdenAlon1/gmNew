package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xvr implements ffxx {
    final /* synthetic */ ffxx[] a;
    final /* synthetic */ xvs b;
    final /* synthetic */ List c;

    public xvr(ffxx[] ffxxVarArr, xvs xvsVar, List list) {
        this.a = ffxxVarArr;
        this.b = xvsVar;
        this.c = list;
    }

    @Override // defpackage.ffxx
    public final Object a(ffxy ffxyVar, ffgu ffguVar) {
        ffxx[] ffxxVarArr = this.a;
        Object a = fgev.a(ffxyVar, ffxxVarArr, new xvp(ffxxVarArr), new xvq(null, this.b, this.c), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }
}
