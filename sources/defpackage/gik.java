package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gik extends ffkk implements ffji {
    final /* synthetic */ String a;
    final /* synthetic */ ffix b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gik(String str, ffix ffixVar) {
        super(1);
        this.a = str;
        this.b = ffixVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jkv jkvVar = (jkv) obj;
        jkr.z(jkvVar, 1.0f);
        jkr.k(jkvVar, this.a);
        jkr.h(jkvVar, null, new gij(this.b));
        return ffcu.a;
    }
}
