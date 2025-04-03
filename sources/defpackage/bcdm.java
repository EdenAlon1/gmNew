package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcdm implements dtuq {
    @Override // defpackage.dtuq
    public final String a() {
        return "parts_backup";
    }

    @Override // defpackage.dtuq
    public final void b(dtve dtveVar) {
        dtveVar.y(bcds.d(Alert.DURATION_SHOW_INDEFINITELY, "parts_backup"));
        for (String str : bcds.f()) {
            dtveVar.y(str);
        }
    }
}
