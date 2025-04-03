package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzg extends ffkk implements ffjm {
    final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzg(String str) {
        super(2);
        this.a = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            grl.b(this.a, jjs.b(hvi.e, fzf.a), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 131068);
        }
        return ffcu.a;
    }
}
