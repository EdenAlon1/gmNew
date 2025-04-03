package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ery extends ffkk implements ffjm {
    final /* synthetic */ fgd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ery(fgd fgdVar) {
        super(2);
        this.a = fgdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long longValue = ((Number) obj2).longValue();
        if (fgk.a(this.a, longValue)) {
            return Long.valueOf(longValue);
        }
        return null;
    }
}
