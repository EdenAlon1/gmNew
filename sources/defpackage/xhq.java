package defpackage;

import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhq {
    public static final doxr a(xhp xhpVar) {
        xhpVar.getClass();
        if (xhpVar instanceof xho) {
            return ((xho) xhpVar).a.fm();
        }
        if (xhpVar instanceof xhk) {
            return ((xhk) xhpVar).b.fm();
        }
        if (xhpVar instanceof xhl) {
            return ((xhl) xhpVar).e;
        }
        if (xhpVar instanceof xhj) {
            return ((xhj) xhpVar).b.a();
        }
        throw new ffcd();
    }

    public static final drlw b(xhp xhpVar) {
        xhpVar.getClass();
        if (xhpVar instanceof xho) {
            return e(((xho) xhpVar).a);
        }
        if (xhpVar instanceof xhk) {
            return e(((xhk) xhpVar).b);
        }
        if (xhpVar instanceof xhl) {
            return ((xhl) xhpVar).b.b;
        }
        if (xhpVar instanceof xhj) {
            return ((xhj) xhpVar).b.b();
        }
        throw new ffcd();
    }

    public static final drlx c(doxs doxsVar, drlk drlkVar, long j) {
        if (doxsVar instanceof doyc) {
            return ((doyc) doxsVar).b();
        }
        if (doxsVar instanceof drli) {
            return drma.d((drlj) doxsVar, drlkVar, Long.valueOf(j)).b();
        }
        if (doxsVar instanceof drlh) {
            return ((drlh) doxsVar).b();
        }
        if (doxsVar instanceof RichLocation) {
            return ((RichLocation) doxsVar).d;
        }
        throw new UnsupportedOperationException("Cannot get MediaType for ".concat(String.valueOf(doxsVar.fo())));
    }

    public static final boolean d(xhp xhpVar) {
        xhpVar.getClass();
        drlw b = b(xhpVar);
        return (ffkj.e(b, drlu.a) || ffkj.e(b, drlv.a)) && !ffkj.e(a(xhpVar), doya.a);
    }

    private static final drlw e(doxs doxsVar) {
        if (doxsVar instanceof doyc) {
            return ((doyc) doxsVar).b().b;
        }
        if (doxsVar instanceof drlj) {
            return ((drlj) doxsVar).m();
        }
        if (doxsVar instanceof RichLocation) {
            return ((RichLocation) doxsVar).d.b;
        }
        throw new UnsupportedOperationException("Cannot get type for ".concat(String.valueOf(doxsVar.fo())));
    }
}
