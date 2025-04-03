package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hqo extends ffkk implements ffjm {
    final /* synthetic */ hrh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqo(hrh hrhVar) {
        super(2);
        this.a = hrhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hqt hqtVar = (hqt) obj;
        hho hhoVar = (hho) obj2;
        if (!(hhoVar instanceof hso)) {
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
        }
        Object b = this.a.b(hqtVar, hhoVar.a());
        if (b != null) {
            return new hic(b, ((hso) hhoVar).f());
        }
        return null;
    }
}
