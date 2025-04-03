package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btqi implements dtuq {
    @Override // defpackage.dtuq
    public final String a() {
        return "link_preview";
    }

    @Override // defpackage.dtuq
    public final void b(dtve dtveVar) {
        dtveVar.y(btqq.e(Alert.DURATION_SHOW_INDEFINITELY, "link_preview"));
        for (String str : btqq.h()) {
            dtveVar.y(str);
        }
    }
}
