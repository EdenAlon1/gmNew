package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bruz implements fbba {
    public static dtux a() {
        return new dtuf(brux.c, "conversation_participants_audit_log", new dtue() { // from class: brur
            @Override // defpackage.dtue
            public final void a(int i, dtve dtveVar) {
                Integer valueOf = Integer.valueOf(i);
                String[] strArr = brux.a;
                valueOf.getClass();
                if (i == 59370) {
                    brux.d(dtveVar, 59370);
                } else {
                    if (i != 59440) {
                        return;
                    }
                    dtveVar.y("ALTER TABLE conversation_participants_audit_log ADD COLUMN last_modified_by_key TEXT;");
                }
            }
        });
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
