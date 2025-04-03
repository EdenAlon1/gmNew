package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tud {
    public final ffbr a;
    private final Context b;

    public tud(Context context, ffbr ffbrVar) {
        context.getClass();
        ffbrVar.getClass();
        this.b = context;
        this.a = ffbrVar;
    }

    public static /* synthetic */ dnym d(tud tudVar, ambn ambnVar) {
        ambnVar.getClass();
        return tudVar.f(ambnVar.a(), ambnVar.e(), ambnVar.b(), false);
    }

    private final dnwq e(Uri uri, String str, aoku aokuVar) {
        if (uri != null) {
            return new dnwn(uri, null, null, dnwk.a, null, 22);
        }
        final String a = crjn.a(crjm.r(str, aokuVar));
        ffix ffixVar = new ffix() { // from class: tua
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(((cttz) tud.this.a.b()).d(a));
            }
        };
        return str.length() == 0 ? new dnwp(new tub(ffixVar), dnwk.a, 1) : new dnwm(new tuc(ffixVar), str.charAt(0), dnwk.a);
    }

    private final dnym f(Uri uri, String str, aoku aokuVar, boolean z) {
        return new dnyo(e(uri, str, aokuVar), "", true == z ? 3 : 1, null, 0.0f, null, 56);
    }

    public final dnwq a(ChipData chipData) {
        chipData.getClass();
        if (chipData.c != null) {
            return e(chipData.d, chipData.b, chipData.a);
        }
        Uri k = crjm.k(this.b);
        k.getClass();
        return new dnwn(k, null, null, null, null, 30);
    }

    public final dnym b(amar amarVar, boolean z) {
        return f(amarVar.a(), amarVar.d(), ((ambh) ffdx.K(amarVar.b())).a, z);
    }
}
