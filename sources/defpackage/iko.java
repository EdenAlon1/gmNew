package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iko extends ikc {
    private final String c;

    public iko(ikq ikqVar) {
        super(ikqVar, null);
        this.c = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // defpackage.ikc
    public final void b(ikq ikqVar) {
        izg h = h();
        if (h != null) {
            if (ikqVar == null) {
                int i = ikq.b;
                ikqVar = ikp.a;
            }
            h.a = ikqVar;
            jat.a.a(h.c, h.a);
        }
    }

    @Override // defpackage.ixv
    public final /* synthetic */ Object e() {
        return this.c;
    }

    @Override // defpackage.ikc
    public final boolean g(int i) {
        return (ilq.b(i, 3) || ilq.b(i, 4)) ? false : true;
    }
}
