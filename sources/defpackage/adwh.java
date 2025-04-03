package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adwh extends abo {
    final /* synthetic */ adwi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adwh(adwi adwiVar) {
        super(true);
        this.a = adwiVar;
    }

    @Override // defpackage.abo
    public final void b() {
        adwi adwiVar = this.a;
        int i = adwiVar.d;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            adwiVar.c.h(false);
            adwiVar.a.gE().d();
        } else if (i2 == 1 || i2 == 2) {
            adwiVar.a();
        }
    }
}
