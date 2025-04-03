package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crne {
    public static final cskc a = cskc.g("BugleNetwork", "OtpCheckerUtil");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;

    public crne(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.b = ffbrVar;
        this.c = ffbrVar4;
        this.f = ffbrVar5;
    }

    public final ListenableFuture a(int i) {
        String g;
        if (!chru.a()) {
            a.m("Tachyon phone registration is not available. Skip OTP check");
            return erqt.i(false);
        }
        if (((atre) this.d.b()).a()) {
            awui a2 = ((ckac) this.e.b()).a(i);
            g = a2 != null ? a2.d : null;
        } else {
            g = ((chco) this.c.b()).g(i);
        }
        if (!TextUtils.isEmpty(g)) {
            return elfr.j(((chpz) this.b.b()).a(g).a(), new emwl() { // from class: crnd
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    if (!((chod) obj).h.H()) {
                        return true;
                    }
                    crne.a.m("Data store does not have token to verify OTP. Skip OTP check.");
                    return false;
                }
            }, erpp.a);
        }
        a.m("RCS phone number is not available. Skip OTP check");
        return erqt.i(false);
    }
}
