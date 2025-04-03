package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fnk extends ffkk implements ffji {
    final /* synthetic */ boolean a;
    final /* synthetic */ String b;
    final /* synthetic */ fnv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnk(boolean z, String str, fnv fnvVar) {
        super(1);
        this.a = z;
        this.b = str;
        this.c = fnvVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jkv jkvVar = (jkv) obj;
        if (this.a) {
            jkr.n(jkvVar, 0);
        }
        jkr.o(jkvVar, this.b);
        jkr.d(jkvVar, null, new fnj(this.c));
        return ffcu.a;
    }
}
