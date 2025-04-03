package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etr extends ffkk implements ffjm {
    final /* synthetic */ fhi a;
    final /* synthetic */ boolean b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etr(fhi fhiVar, boolean z, int i) {
        super(2);
        this.a = fhiVar;
        this.b = z;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fhi fhiVar = this.a;
        int i = this.c;
        eub.b(fhiVar, this.b, (hfd) obj, hip.a(i | 1));
        return ffcu.a;
    }
}
