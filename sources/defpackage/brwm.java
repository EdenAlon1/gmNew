package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brwm implements dtuq {
    @Override // defpackage.dtuq
    public final String a() {
        return "conversation_participants";
    }

    @Override // defpackage.dtuq
    public final void b(dtve dtveVar) {
        dtveVar.y(brww.e(Alert.DURATION_SHOW_INDEFINITELY, "conversation_participants"));
        for (String str : brww.h()) {
            dtveVar.y(str);
        }
    }
}
