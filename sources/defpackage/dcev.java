package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcev extends abo {
    final /* synthetic */ dcew a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcev(dcew dcewVar) {
        super(true);
        this.a = dcewVar;
    }

    @Override // defpackage.abo
    public final void b() {
        dcew dcewVar = this.a;
        ea h = dcewVar.a.a().h("gallery_browser_fragment_tag");
        if (((Boolean) dcem.a.e()).booleanValue() && h != null) {
            if (!(h instanceof dcdf)) {
                throw new IllegalStateException("Unexpected full screen gallery fragment ".concat(h.toString()));
            }
            dcdk H = ((dcdf) h).H();
            if (((Boolean) dcem.a.e()).booleanValue() && H.m.b()) {
                return;
            }
        }
        dcewVar.e();
        abo aboVar = dcewVar.b;
        if (aboVar != null) {
            aboVar.h(false);
        }
        dcewVar.a.gE().d();
    }
}
