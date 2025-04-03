package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djpj extends djop {
    public djpj(djqf djqfVar) {
        super(djqfVar);
    }

    @Override // defpackage.diya, defpackage.dixy
    public final String a() {
        return "DisabledState";
    }

    @Override // defpackage.djop, defpackage.diya, defpackage.dixy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 4 || i == 7 || i == 8) {
            return true;
        }
        return super.e(message);
    }
}
