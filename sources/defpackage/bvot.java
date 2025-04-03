package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvot implements dtuq {
    @Override // defpackage.dtuq
    public final String a() {
        return "participants_audit_log";
    }

    @Override // defpackage.dtuq
    public final void b(dtve dtveVar) {
        dtveVar.y(bvoy.d(Alert.DURATION_SHOW_INDEFINITELY, "participants_audit_log"));
        for (String str : bvoy.e(Alert.DURATION_SHOW_INDEFINITELY)) {
            dtveVar.y(str);
        }
    }
}
