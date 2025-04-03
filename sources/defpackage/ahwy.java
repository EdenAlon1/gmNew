package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwy implements ffxx {
    final /* synthetic */ ffxx[] a;
    final /* synthetic */ ahwz b;
    final /* synthetic */ List c;

    public ahwy(ffxx[] ffxxVarArr, ahwz ahwzVar, List list) {
        this.a = ffxxVarArr;
        this.b = ahwzVar;
        this.c = list;
    }

    @Override // defpackage.ffxx
    public final Object a(ffxy ffxyVar, ffgu ffguVar) {
        ffxx[] ffxxVarArr = this.a;
        Object a = fgev.a(ffxyVar, ffxxVarArr, new ahww(ffxxVarArr), new ahwx(null, this.b, this.c), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }
}
