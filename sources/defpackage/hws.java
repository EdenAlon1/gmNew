package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hws extends ffkk implements ffjm {
    final /* synthetic */ jfs a;
    final /* synthetic */ hwu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hws(jfs jfsVar, hwu hwuVar) {
        super(2);
        this.a = jfsVar;
        this.b = hwuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        jjw jjwVar = (jjw) obj2;
        if (!this.a.b.a(jjwVar.e)) {
            this.b.m(intValue, jjwVar);
            this.b.j();
        }
        return ffcu.a;
    }
}
