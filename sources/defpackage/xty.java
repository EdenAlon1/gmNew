package defpackage;

import android.net.Uri;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xty implements dqmi {
    final /* synthetic */ xuk a;

    public xty(xuk xukVar) {
        this.a = xukVar;
    }

    @Override // defpackage.dqlx
    public final Object a(doxs doxsVar, ffgu ffguVar) {
        xuk xukVar = this.a;
        return ffra.a(ekxi.a(xukVar.c), new xtt(null, doxsVar, xukVar, this), ffguVar);
    }

    @Override // defpackage.dqlx
    public final void b() {
        xuk xukVar = this.a;
        axol.k(xukVar.e, null, new xtw(xukVar, null), 3);
    }

    @Override // defpackage.dqlx
    public final void d(final doxs doxsVar) {
        Object obj;
        doxsVar.getClass();
        if (this.a.p.a()) {
            Iterator it = ((xhu) this.a.f.a.c()).b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (doxw.a((xhp) obj, doxsVar)) {
                        break;
                    }
                }
            }
            xhp xhpVar = (xhp) obj;
            if (xhpVar != null) {
                ((xfv) this.a.q.b()).e(xhpVar.a(), 3);
            } else {
                ensk j = xuk.a.j();
                j.Y(ente.a, "BugleComposeRow2");
                ((enrr) j.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$hugoDraftAttachmentsController$1", "removeAttachment", 522, "DraftAttachmentController.kt")).t("Cannot log onRemoveStart because cannot find DraftAttachment for %s", doxsVar);
            }
        }
        this.a.h(new ffji() { // from class: xts
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                xhp xhpVar2 = (xhp) obj2;
                xhpVar2.getClass();
                return Boolean.valueOf(doxw.a(xhpVar2, doxs.this));
            }
        });
    }

    @Override // defpackage.dqlx
    public final void e(doxs doxsVar) {
        if (!ctjd.d() && (doxsVar instanceof dqzc)) {
            ensk h = xuk.a.h();
            h.Y(ente.a, "BugleComposeRow2");
            ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$hugoDraftAttachmentsController$1", "send", 560, "DraftAttachmentController.kt")).q("Not direct sending custom sticker");
        } else {
            ensk e = xuk.a.e();
            e.Y(ente.a, "BugleComposeRow2");
            ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$hugoDraftAttachmentsController$1", "send", 563, "DraftAttachmentController.kt")).t("Launching direct send %s", doxsVar);
            xuk xukVar = this.a;
            axol.k(xukVar.d, null, new xtx(doxsVar, xukVar, this, null), 3);
        }
    }

    @Override // defpackage.dqlx
    public final boolean f() {
        return ((xwy) this.a.s.c()).c;
    }

    public final xhp g(doxs doxsVar, boolean z) {
        if (doxsVar instanceof doyc) {
            return new xhk(this.a.u.a(), (doyc) doxsVar);
        }
        if (this.a.r.a() && (doxsVar instanceof dren)) {
            return new xhj(this.a.u.a(), (dren) doxsVar);
        }
        return new xho(doxsVar, new xhn(this.a.u.a(), (Uri) null, z ? emyg.c(this.a.m) : null, (ffss) null, 54));
    }

    @Override // defpackage.dqmi
    public final fgdj h() {
        ffji ffjiVar = new ffji() { // from class: xtq
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                xhu xhuVar = (xhu) obj;
                xhuVar.getClass();
                return xhuVar.b;
            }
        };
        xuk xukVar = this.a;
        return axqw.c(xukVar.f.a, xukVar.e, ffjiVar);
    }

    public final void i(final String str, final Boolean bool) {
        this.a.f.c(new ffji() { // from class: xtr
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                xhu xhuVar = (xhu) obj;
                xhuVar.getClass();
                String str2 = xhuVar.a;
                Boolean bool2 = bool;
                String str3 = str;
                if (ffkj.e(str2, str3) && (bool2 == null || ffkj.e(Boolean.valueOf(xhuVar.h), bool2))) {
                    return xhuVar;
                }
                return xhu.c(xhuVar, str3, null, null, false, null, null, bool2 != null ? bool2.booleanValue() : xhuVar.h, 2, 638);
            }
        });
    }

    @Override // defpackage.dqlx
    public final void c() {
    }
}
