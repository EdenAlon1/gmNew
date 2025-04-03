package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffnz extends ffkk implements ffji {
    final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffnz(int i) {
        super(1);
        this.a = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((Number) obj).intValue();
        throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.a + ".");
    }
}
