package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxtj implements fbba {
    public static dtux a() {
        return new dtuf(bxth.d, "self_participants", new dtue() { // from class: bxsz
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = bxth.a;
                valueOf.getClass();
                if (i == 29050) {
                    bxth.d(dtveVar, 29050);
                } else {
                    if (i != 29080) {
                        return;
                    }
                    dtveVar.y("ALTER TABLE self_participants ADD COLUMN smsc TEXT;");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
