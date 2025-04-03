package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pop extends ffkk implements ffji {
    final /* synthetic */ Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pop(Object obj) {
        super(1);
        this.a = obj;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ((Object[]) this.a)[((Number) obj).intValue()];
        if (obj2 != null) {
            return (Byte) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Byte");
    }
}
