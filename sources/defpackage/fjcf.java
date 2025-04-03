package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fjcf extends fjdy {
    private final fjdt a;
    private final fhfd b;
    private final fjbu c;

    public fjcf(fjdt fjdtVar, fhfd fhfdVar, fjbu fjbuVar) {
        this.a = fjdtVar;
        this.b = fhfdVar;
        this.c = fjbuVar;
    }

    protected abstract Object a(fjbj fjbjVar, Object[] objArr);

    @Override // defpackage.fjdy
    public final Object b(Object[] objArr) {
        return a(new fjcs(this.a, objArr, this.b, this.c), objArr);
    }
}
