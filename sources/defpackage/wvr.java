package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvr implements wqq {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/actions/editmessage/EditActionPlugin");
    public final ffsk b;
    public final ffbr c;
    public final aawu d;
    public final abbb e;
    public final adsd f;
    public final ygy g;
    private final Context h;
    private final fgcq i;
    private final abas j;
    private final ffxx k;
    private final Set l;

    public wvr(Context context, ffsk ffskVar, ygy ygyVar, ffbr ffbrVar, ffxx ffxxVar, fgcq fgcqVar, aawu aawuVar, abas abasVar, abbb abbbVar, adsd adsdVar, auou auouVar, auox auoxVar, auow auowVar, aued auedVar) {
        ffxx fgchVar;
        context.getClass();
        ffskVar.getClass();
        ygyVar.getClass();
        ffbrVar.getClass();
        fgcqVar.getClass();
        aawuVar.getClass();
        adsdVar.getClass();
        auedVar.getClass();
        this.h = context;
        this.b = ffskVar;
        this.g = ygyVar;
        this.c = ffbrVar;
        this.i = fgcqVar;
        this.d = aawuVar;
        this.j = abasVar;
        this.e = abbbVar;
        this.f = adsdVar;
        if (auoxVar.a() && auowVar.a() && auedVar.a()) {
            fgchVar = fgck.a(aawuVar.a(), fgcqVar, ffxxVar, new wvj(this, null));
        } else {
            fgchVar = ((ersq) ((auom) auouVar).a.b()).a("bugle.enable_fix_for_edit_action_and_sim_picker") ? new fgch(aawuVar.a(), ffxxVar, new wvk(this, null)) : new wvq(aawuVar.a(), this);
        }
        this.k = fgchVar;
        this.l = fffi.b(aaxf.b);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.l;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.k;
    }

    public final dlsr c(final alxr alxrVar) {
        String string = this.h.getString(R.string.edit_action);
        string.getClass();
        return new dlsr(string, dmzz.aR, false, false, false, false, null, false, null, new ffix() { // from class: wvi
            @Override // defpackage.ffix
            public final Object invoke() {
                alxr alxrVar2 = alxrVar;
                wvr wvrVar = wvr.this;
                axol.k(wvrVar.b, null, new wvn(alxrVar2, wvrVar, null), 3);
                abbb abbbVar = wvrVar.e;
                axol.k(abbbVar.b, null, new abba(abbbVar, null), 3);
                wvrVar.f.a(41);
                wvrVar.d.b();
                return ffcu.a;
            }
        }, 1012);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.aaxe r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wvr.d(aaxe, ffgu):java.lang.Object");
    }
}
