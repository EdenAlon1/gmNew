package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsnw implements dtuq {
    @Override // defpackage.dtuq
    public final String a() {
        return "conversations";
    }

    @Override // defpackage.dtuq
    public final void b(dtve dtveVar) {
        dtveVar.y(bsom.l(Alert.DURATION_SHOW_INDEFINITELY, "conversations"));
        for (String str : bsom.n(Alert.DURATION_SHOW_INDEFINITELY)) {
            dtveVar.y(str);
        }
    }
}
