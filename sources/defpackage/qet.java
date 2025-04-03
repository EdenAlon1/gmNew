package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qet extends qlz {
    final /* synthetic */ qlz a;

    public qet(qlz qlzVar) {
        this.a = qlzVar;
    }

    @Override // defpackage.qlz
    public final /* bridge */ /* synthetic */ Object a(qly qlyVar) {
        Float f = (Float) this.a.a(qlyVar);
        if (f == null) {
            return null;
        }
        return Float.valueOf(f.floatValue() * 2.55f);
    }
}
