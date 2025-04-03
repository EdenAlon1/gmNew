package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gte extends ffkk implements ffji {
    final /* synthetic */ gul a;
    final /* synthetic */ hho b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gte(gul gulVar, hho hhoVar) {
        super(1);
        this.a = gulVar;
        this.b = hhoVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        boolean z = ((iix) obj).a.getUnicodeChar() == 0 && jpm.e(guj.g(this.b).c) == 0;
        if (z) {
            this.a.j(0);
        }
        return Boolean.valueOf(z);
    }
}
