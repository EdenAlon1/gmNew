package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekjn extends ljp {
    final /* synthetic */ ekjm a;
    private final eisx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekjn(ekjm ekjmVar, eisx eisxVar) {
        super(ekjmVar.b);
        this.a = ekjmVar;
        this.b = eisxVar;
    }

    @Override // defpackage.ljp
    public final lml e(Class cls, llv llvVar) {
        emxf.l(cls.equals(ekjo.class));
        return new ekjo(llvVar, this.a.a, this.b);
    }
}
