package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqkz implements aqky {
    private final Context a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;

    public aqkz(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9) {
        this.a = context;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.g = ffbrVar5;
        this.f = ffbrVar6;
        this.h = ffbrVar7;
        this.i = ffbrVar8;
        this.j = ffbrVar9;
    }

    static boolean c(bvpo bvpoVar, boolean z) {
        return TextUtils.equals(bvpoVar.g, true != z ? "EMERGENCY+SERVICE+PROVIDER" : "EMERGENCY+SERVICE+PROVIDER+DEMO");
    }

    private static bvpo d(String str) {
        bdrw.d(str, 1);
        String[] strArr = ParticipantsTable.a;
        bvpp bvppVar = new bvpp();
        bvppVar.T(-2);
        bvppVar.S(-1);
        bvppVar.R(cuxt.d(str));
        bvppVar.u(null);
        bvppVar.t(null);
        bvppVar.N(null);
        bvppVar.l(-1L);
        bvppVar.D(null);
        bvppVar.e(false);
        bvppVar.U(0);
        bvppVar.V(null);
        return bvppVar;
    }

    private final void e(bvpo bvpoVar) {
        Resources resources = this.a.getResources();
        if (TextUtils.equals(bvpoVar.g, "ʼUNKNOWN_SENDER!ʼ")) {
            bvpoVar.q(resources.getString(R.string.unknown_sender));
            bvpoVar.u(bvpoVar.h);
            bvpoVar.l(-2L);
            return;
        }
        if (TextUtils.equals(bvpoVar.g, "ʼWAP_PUSH_SI!ʼ")) {
            bvpoVar.q(resources.getString(R.string.wap_push_from));
            bvpoVar.u(bvpoVar.h);
            bvpoVar.l(-2L);
            return;
        }
        if (TextUtils.equals(bvpoVar.g, ((cpbs) this.c.b()).a(-1).k())) {
            bvpoVar.q(resources.getString(R.string.spam_reporting_from));
            bvpoVar.u(bvpoVar.h);
            bvpoVar.l(-2L);
            return;
        }
        if (((asvn) this.d.b()).a() && c(bvpoVar, false)) {
            bvpoVar.q(resources.getString(R.string.recipient_title_satellite));
            bvpoVar.u(bvpoVar.h);
            bvpoVar.l(-2L);
            return;
        }
        if (((asvn) this.d.b()).a() && c(bvpoVar, true)) {
            bvpoVar.q(resources.getString(R.string.recipient_title_satellite_demo));
            bvpoVar.u(bvpoVar.h);
            bvpoVar.l(-2L);
            return;
        }
        Optional optional = (Optional) this.f.b();
        if (optional.isPresent() && ((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && ((cjdk) optional.get()).r().equals(bvpoVar.g)) {
            cjdk cjdkVar = (cjdk) ((Optional) this.f.b()).get();
            bvpoVar.q(cjdkVar.s());
            bvpoVar.u(cjdkVar.s());
            bvpoVar.N(cjdkVar.c());
            bvpoVar.l(-2L);
            bvpoVar.J(3);
        }
    }

    private final void f(aoku aokuVar) {
        Optional optional = (Optional) ((fbbb) this.e).a;
        Optional optional2 = (Optional) ((fbbb) this.g).a;
        if (optional.isPresent() && optional2.isPresent()) {
            cazr cazrVar = (cazr) optional2.get();
            aokuVar.n();
            if (cazrVar.a()) {
                cazq cazqVar = (cazq) optional.get();
                aokuVar.n();
                cazqVar.d();
            }
        }
    }

    @Override // defpackage.aqky
    public final ParticipantsTable.BindData a(aoku aokuVar) {
        cfva cfvaVar = aoqm.a;
        if (((Boolean) new aoot().get()).booleanValue()) {
            String n = aokuVar.n();
            n.getClass();
            bvpo d = d(n);
            String l = aokuVar.l();
            l.getClass();
            d.I(l);
            d.q(emxe.b(aokuVar.G().a));
            e(d);
            if (aokuVar.B()) {
                d.J(1);
            }
            if (((Boolean) this.i.b()).booleanValue()) {
                f(aokuVar);
            }
            return d.a();
        }
        String j = aokuVar.j();
        j.getClass();
        ffbr ffbrVar = this.j;
        bvpo d2 = d(j);
        String l2 = ((astw) ffbrVar.b()).a() ? aokuVar.l() : aokuVar.o();
        l2.getClass();
        d2.I(l2);
        d2.q(emxe.b(aokuVar.G().a));
        e(d2);
        if (aokuVar.B()) {
            d2.J(1);
        }
        if (aokuVar.A() && ((Optional) this.f.b()).isPresent()) {
            d2.J(3);
            d2.N(((cjdk) ((Optional) this.f.b()).get()).c());
        }
        if (((Boolean) this.i.b()).booleanValue()) {
            f(aokuVar);
        }
        return d2.a();
    }

    @Override // defpackage.aqky
    public final ParticipantsTable.BindData b(qmc qmcVar) {
        bvpo C = a(((aolr) this.b.b()).s(qmcVar)).C();
        C.l(qmcVar.f);
        C.D(qmcVar.k);
        cjzf.b(C, qmcVar.b, null);
        cjzf cjzfVar = (cjzf) this.h.b();
        Uri uri = qmcVar.i;
        cjzfVar.a(C, uri != null ? uri.toString() : null);
        if (C.q < 0) {
            C.l(-1L);
        }
        C.p(qmcVar.g.longValue());
        e(C);
        return C.a();
    }
}
