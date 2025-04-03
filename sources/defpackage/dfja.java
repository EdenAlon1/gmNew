package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfja implements ffaz {
    private final int a;
    private final dfiz b;

    public dfja(dfiz dfizVar, int i) {
        this.b = dfizVar;
        this.a = i;
    }

    @Override // defpackage.ffaz
    public final void a(Object obj, ffbc ffbcVar) {
        int i = this.a;
        if (i == 0) {
            this.b.f((dfjo) obj, ffbcVar);
        } else if (i != 1) {
            this.b.d((dfjg) obj, ffbcVar);
        } else {
            this.b.e((dfjk) obj, ffbcVar);
        }
    }
}
