package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpb extends ffkk implements ffji {
    final /* synthetic */ jzn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpb(jzn jznVar) {
        super(1);
        this.a = jznVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((Number) obj).floatValue();
        return Float.valueOf(this.a.em(56.0f));
    }
}
