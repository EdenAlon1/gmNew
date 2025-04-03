package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtjx extends ffkk implements ffji {
    final /* synthetic */ kgq a;
    final /* synthetic */ List b;
    final /* synthetic */ Map c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtjx(kgq kgqVar, List list, Map map) {
        super(1);
        this.a = kgqVar;
        this.b = list;
        this.c = map;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = this.b;
        Map map = this.c;
        this.a.c((iqj) obj, list, map);
        return ffcu.a;
    }
}
