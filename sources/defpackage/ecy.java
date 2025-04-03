package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ecy extends ffkk implements ffjm {
    final /* synthetic */ hun a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecy(hun hunVar) {
        super(2);
        this.a = hunVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return new kaa(this.a.a(0, (int) (((kaf) obj).a >> 32), (kah) obj2) << 32);
    }
}
