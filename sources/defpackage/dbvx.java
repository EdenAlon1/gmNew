package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbvx implements rif {
    final /* synthetic */ dbvz a;
    final /* synthetic */ int b;

    public dbvx(int i, dbvz dbvzVar) {
        this.b = i;
        this.a = dbvzVar;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [bzme, java.lang.Object] */
    @Override // defpackage.rif
    public final boolean a(qwp qwpVar, Object obj, rix rixVar, boolean z) {
        obj.getClass();
        rixVar.getClass();
        ((ensz) dbvz.a.j()).t("Emoji code download failed, position: %s", bzmd.a(this.b));
        this.a.d.get().m(this.b, 4);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [bzme, java.lang.Object] */
    @Override // defpackage.rif
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2, rix rixVar, qsy qsyVar, boolean z) {
        obj2.getClass();
        rixVar.getClass();
        qsyVar.getClass();
        int i = this.b;
        dbvz dbvzVar = this.a;
        int i2 = i - 1;
        if (i2 == 0) {
            dbvzVar.j = true;
        } else if (i2 != 1) {
            dbvzVar.l = true;
        } else {
            dbvzVar.k = true;
        }
        if (dbvzVar.j && dbvzVar.k && dbvzVar.l) {
            dbvzVar.b(8);
            this.a.d(0);
        }
        dbvz.a.o().t("Emoji code download successfully, position: %s", bzmd.a(this.b));
        this.a.d.get().m(this.b, 3);
        ((akzt) this.a.h.b()).e("Bugle.Gaia.Verification.Prompt.Emoji.Download", 1);
        return false;
    }
}
