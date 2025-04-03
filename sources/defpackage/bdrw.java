package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdrw implements cfug {
    private final ffbr a;

    public bdrw(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public static boolean c(String str) {
        return TextUtils.isEmpty(str) || str.trim().length() == 0;
    }

    public static void d(String str, int i) {
        if (c(str)) {
            throw new IllegalArgumentException(a.m(str, i != 1 ? i != 2 ? "DISPLAY" : "NORMALIZED" : "SEND", "Participant's ", " destination is not valid: "));
        }
    }

    @Override // defpackage.cfug
    public final boolean ge() {
        return true;
    }

    @Override // defpackage.cfug
    public final void gg() {
        ffbr ffbrVar = ((azzp) this.a.b()).b;
        final boolean a = azzr.a();
        ((dtuu) ffbrVar.b()).d("ParticipantsColumnSetter#updatePhenotypeColumn", new Runnable() { // from class: azzh
            @Override // java.lang.Runnable
            public final void run() {
                boolean z = a;
                if (z) {
                    azzp.c();
                }
                bvvr f = ParticipantsTable.f();
                f.ap("updatePhenotypeColumn");
                f.x(z);
                f.b().e();
            }
        });
    }
}
