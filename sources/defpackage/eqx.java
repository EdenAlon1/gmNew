package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqx extends ffkk implements ffjm {
    final /* synthetic */ jlm a;
    final /* synthetic */ List b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqx(jlm jlmVar, List list, int i) {
        super(2);
        this.a = jlmVar;
        this.b = list;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.c | 1);
        eqy.a(this.a, this.b, (hfd) obj, a);
        return ffcu.a;
    }
}
