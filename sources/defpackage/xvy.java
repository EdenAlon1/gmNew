package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xvy {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiDataConverter");
    private static final Set f;
    public final Context b;
    public final ffhd c;
    public final askd d;
    public final athc e;
    private final ffsk g;
    private final cazx h;
    private final xwu i;
    private final dozj j;
    private final asnh k;
    private final xtd l;

    static {
        int i = fflc.a;
        f = fffi.d(new ffkb(drni.class), new ffkb(drnl.class), new ffkb(drng.class), new ffkb(doyd.class), new ffkb(dren.class), new ffkb(dqzc.class));
    }

    public xvy(Context context, ffsk ffskVar, ffhd ffhdVar, cazx cazxVar, xwu xwuVar, dozj dozjVar, askd askdVar, asnh asnhVar, xtd xtdVar, athc athcVar) {
        context.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        xwuVar.getClass();
        dozjVar.getClass();
        askdVar.getClass();
        this.b = context;
        this.g = ffskVar;
        this.c = ffhdVar;
        this.h = cazxVar;
        this.i = xwuVar;
        this.j = dozjVar;
        this.d = askdVar;
        this.k = asnhVar;
        this.l = xtdVar;
        this.e = athcVar;
    }

    public static final boolean b(xhp xhpVar) {
        xhpVar.getClass();
        if (xhpVar instanceof xho) {
            return d(((xho) xhpVar).a);
        }
        if (xhpVar instanceof xhk) {
            return d(((xhk) xhpVar).b);
        }
        if (xhpVar instanceof xhl) {
            return true;
        }
        if (xhpVar instanceof xhj) {
            return d(((xhj) xhpVar).b);
        }
        throw new ffcd();
    }

    private final ffxx c(doxs doxsVar, Uri uri) {
        if (doxsVar instanceof drni) {
            Uri parse = Uri.parse(drma.b((drlj) doxsVar, new drkd(3)).f());
            parse.getClass();
            return new ffyg(new dlwd(parse, uri, this.l.a((doyc) doxsVar)));
        }
        byte[] bArr = null;
        if (doxsVar instanceof drnl) {
            Uri parse2 = Uri.parse(drma.b((drlj) doxsVar, new drkf(bArr)).f());
            parse2.getClass();
            return new ffyg(new dlwh(parse2, uri, this.l.a((doyc) doxsVar)));
        }
        if (!(doxsVar instanceof drng)) {
            if (doxsVar instanceof dren) {
                Uri parse3 = Uri.parse(((drem) drma.a((drli) doxsVar, new drkd(3))).b);
                parse3.getClass();
                return new ffyg(new dlwd(parse3, uri, ((dren) doxsVar).d()));
            }
            if (doxsVar instanceof dqzc) {
                Uri parse4 = Uri.parse(((dqzc) doxsVar).b);
                parse4.getClass();
                return new ffyg(new dlwd(parse4, uri, this.l.a((doyc) doxsVar)));
            }
            if (!(doxsVar instanceof doyd)) {
                throw new IllegalStateException("Attachment isConvertible, but no case for it exists");
            }
            doyd doydVar = (doyd) doxsVar;
            String a2 = doydVar.a.a();
            if (!le.z(a2)) {
                return new fgcp(new xvu(doydVar, this, a2, zwf.a(a2), null));
            }
            cazx cazxVar = this.h;
            Uri parse5 = uri == null ? Uri.parse(doydVar.b) : uri;
            parse5.getClass();
            xvx xvxVar = new xvx(cazxVar.a(parse5), this);
            ffsk ffskVar = this.g;
            int i = fgcz.a;
            return fgbn.b(xvxVar, ffskVar, fgcy.a(1000L, 2), new dlvv(""));
        }
        xwu xwuVar = this.i;
        drng drngVar = (drng) doxsVar;
        String str = drngVar.b;
        Duration duration = drngVar.e;
        Uri parse6 = Uri.parse(str);
        parse6.getClass();
        final zxl a3 = xwuVar.d.a(parse6, duration, 2);
        final fgcm a4 = fgdm.a(null);
        final fgcm a5 = fgdm.a(false);
        List g = ffdx.g(a3.f(), a3.e(), a3.c(), a3.b(), a4);
        ffix ffixVar = new ffix() { // from class: xwi
            @Override // defpackage.ffix
            public final Object invoke() {
                fgcm fgcmVar = fgcm.this;
                Float f2 = (Float) fgcmVar.c();
                zxl zxlVar = a3;
                if (f2 != null) {
                    zxlVar.l(f2.floatValue());
                }
                fgcm fgcmVar2 = a5;
                fgcmVar.f(null);
                if (((Boolean) fgcmVar2.c()).booleanValue()) {
                    zxlVar.h();
                    fgcmVar2.f(false);
                }
                return ffcu.a;
            }
        };
        long j = ffpw.a;
        Object b = xwuVar.c.b();
        b.getClass();
        long e = ffpy.e(((Number) b).longValue(), ffpz.c);
        ffxx[] ffxxVarArr = (ffxx[]) ffdx.ak(g).toArray(new ffxx[0]);
        int length = ffxxVarArr.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = false;
        }
        int length2 = ffxxVarArr.length;
        ArrayList arrayList = new ArrayList(length2);
        int i3 = 0;
        int i4 = 0;
        while (i3 < length2) {
            arrayList.add(new fgbt(ffxxVarArr[i3], new xwl(zArr, i4, null)));
            i3++;
            i4++;
        }
        return new ffzh(new xwq(xwuVar.b, e, ffxxVarArr, zArr, null), new xwo((ffxx[]) ffdx.ak(arrayList).toArray(new ffxx[0]), xwuVar, drngVar, ffixVar, a3, a5, a4));
    }

    private static final boolean d(doxs doxsVar) {
        Set set = f;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (ffiu.a((ffmo) it.next()).isAssignableFrom(doxsVar.getClass())) {
                return true;
            }
        }
        return false;
    }

    public final ffxx a(xhp xhpVar) {
        ffkb ffkbVar;
        Object dlvzVar;
        xhpVar.getClass();
        if (!b(xhpVar)) {
            throw new IllegalArgumentException(a.i(xhpVar, "Cannot convert ", " to AttachmentUiData"));
        }
        if (xhpVar instanceof xho) {
            xho xhoVar = (xho) xhpVar;
            return c(xhoVar.a, xhoVar.b.c);
        }
        if (xhpVar instanceof xhk) {
            return c(((xhk) xhpVar).b, null);
        }
        if (!(xhpVar instanceof xhl)) {
            if (xhpVar instanceof xhj) {
                return c(((xhj) xhpVar).b, null);
            }
            throw new ffcd();
        }
        drka a2 = drjz.a(((xhl) xhpVar).b, this.j.d);
        if (a2 instanceof drjx) {
            int i = fflc.a;
            ffkbVar = new ffkb(drng.class);
        } else if (a2 instanceof drld) {
            int i2 = fflc.a;
            ffkbVar = new ffkb(drni.class);
        } else if (a2 instanceof drnd) {
            int i3 = fflc.a;
            ffkbVar = new ffkb(drnl.class);
        } else {
            int i4 = fflc.a;
            ffkbVar = new ffkb(doyd.class);
        }
        if (ffkj.e(ffkbVar, new ffkb(drni.class))) {
            dlvzVar = new dlwe();
        } else if (ffkj.e(ffkbVar, new ffkb(drnl.class))) {
            dlvzVar = new dlwi();
        } else if (ffkj.e(ffkbVar, new ffkb(drng.class))) {
            dlvzVar = new dlvl("", null, null, false, false, false, null, new dlvg(this.k.a(), this.e.a()));
        } else {
            if (!ffkj.e(ffkbVar, new ffkb(doyd.class))) {
                throw new UnsupportedOperationException(a.i(ffkbVar, "Cannot convert unresolved ", " to AttachmentUiData"));
            }
            dlvzVar = new dlvz();
        }
        return new ffyg(dlvzVar);
    }
}
