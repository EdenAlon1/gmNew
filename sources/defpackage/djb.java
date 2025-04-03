package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class djb extends ffkk implements ffji {
    final /* synthetic */ djc a;
    final /* synthetic */ int b;
    final /* synthetic */ iqk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djb(djc djcVar, int i, iqk iqkVar) {
        super(1);
        this.a = djcVar;
        this.b = i;
        this.c = iqkVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        int c = this.a.a.c();
        if (c < 0) {
            c = 0;
        }
        djc djcVar = this.a;
        int i = this.b;
        boolean z = djcVar.b;
        if (c > i) {
            c = i;
        }
        int i2 = z ? c - i : -c;
        boolean z2 = djcVar.c;
        iqjVar.j(new dja(this.c, true != z2 ? i2 : 0, true == z2 ? i2 : 0));
        return ffcu.a;
    }
}
