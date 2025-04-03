package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgr implements ffxx {
    final /* synthetic */ ffxx a;
    final /* synthetic */ Map b;
    final /* synthetic */ ffsk c;
    final /* synthetic */ List d;
    final /* synthetic */ zgu e;

    public zgr(ffxx ffxxVar, Map map, ffsk ffskVar, List list, zgu zguVar) {
        this.a = ffxxVar;
        this.b = map;
        this.c = ffskVar;
        this.d = list;
        this.e = zguVar;
    }

    @Override // defpackage.ffxx
    public final Object a(ffxy ffxyVar, ffgu ffguVar) {
        Object a = this.a.a(new zgq(ffxyVar, this.b, this.c, this.d, this.e), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }
}
