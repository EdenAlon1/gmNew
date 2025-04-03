package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcas implements dtuq {
    @Override // defpackage.dtuq
    public final String a() {
        return "messages_backup";
    }

    @Override // defpackage.dtuq
    public final void b(dtve dtveVar) {
        dtveVar.y(bcba.d(Alert.DURATION_SHOW_INDEFINITELY, "messages_backup"));
        for (String str : bcba.f(Alert.DURATION_SHOW_INDEFINITELY)) {
            dtveVar.y(str);
        }
    }
}
