package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elhb extends elha implements eewo {
    final /* synthetic */ elhc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elhb(elhc elhcVar, eewo eewoVar) {
        super(elhcVar, eewoVar);
        this.c = elhcVar;
    }

    @Override // defpackage.eewo
    public final eewl a(String str) {
        eewl a = ((eewo) this.a).a(str);
        if (a == null) {
            return null;
        }
        return new elgy(this.c, a);
    }

    @Override // defpackage.eewo
    public final eewm b(String str) {
        eewm b = ((eewo) this.a).b(str);
        if (b == null) {
            return null;
        }
        return this.c.a(b);
    }
}
