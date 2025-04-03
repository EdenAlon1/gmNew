package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyly implements kyl {
    final /* synthetic */ cxvp a;

    public cyly(cxvp cxvpVar) {
        this.a = cxvpVar;
    }

    @Override // defpackage.kyl
    public final boolean a(kyo kyoVar, int i, Bundle bundle) {
        String str;
        cxvp cxvpVar = this.a;
        cxvv cxvvVar = cxvpVar.a;
        bcpt bcptVar = cxvpVar.b;
        View view = cxvpVar.c;
        String[] strArr = cxtb.sC;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                str = null;
                break;
            }
            str = strArr[i2];
            if (kyoVar.a().hasMimeType(str)) {
                break;
            }
            i2++;
        }
        if (str == null) {
            return false;
        }
        if ((i & 1) != 0) {
            try {
                kyoVar.c();
            } catch (Exception e) {
                cxvv.a.o("requestPermission failed", e);
                return false;
            }
        }
        PendingAttachmentData b = ((bcxm) cxvvVar.aa.b()).b(str, kyoVar.b(), algx.a(cxvvVar.k) == 3 ? eohh.GBOARD_EMOJI : eohh.UNKNOWN_IME);
        b.h = dcln.a(b);
        ((alcb) cxvvVar.U.b()).g(b.h, ((bcvr) cxvvVar.x.a()).k());
        ((bcvr) cxvvVar.x.a()).E(b, bcptVar);
        view.requestFocus();
        return true;
    }
}
