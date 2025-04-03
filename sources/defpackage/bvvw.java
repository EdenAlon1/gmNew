package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvw extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bvvs(this);
    }

    public final void b(Function... functionArr) {
        Object apply;
        bvvw[] bvvwVarArr = new bvvw[functionArr.length];
        for (int i = 0; i < functionArr.length; i++) {
            Function function = functionArr[i];
            String[] strArr = ParticipantsTable.a;
            apply = function.apply(new bvvw());
            bvvwVarArr[i] = (bvvw) apply;
        }
        ar(bvvwVarArr);
    }

    public final void c() {
        aq(new dtwe("participants.blocked", 1, 1));
    }

    public final void d(String str) {
        int intValue = ParticipantsTable.i().intValue();
        if (intValue < 31020) {
            dtub.w("cms_id", intValue);
        }
        aq(new dtrt("participants.cms_id", 1, String.valueOf(str)));
    }

    public final void e(Iterable iterable) {
        int intValue = ParticipantsTable.i().intValue();
        if (intValue < 31020) {
            dtub.w("cms_id", intValue);
        }
        aq(new dtrw("participants.cms_id", 3, at(iterable), false));
    }

    public final void f() {
        int intValue = ParticipantsTable.i().intValue();
        if (intValue < 31020) {
            dtub.w("cms_id", intValue);
        }
        aq(new dtrx("participants.cms_id", 6));
    }

    public final void g() {
        int intValue = ParticipantsTable.i().intValue();
        if (intValue < 31020) {
            dtub.w("cms_id", intValue);
        }
        aq(new dtrx("participants.cms_id", 5));
    }

    public final void h(csgg... csggVarArr) {
        int intValue = ParticipantsTable.i().intValue();
        if (intValue < 58210) {
            dtub.w("cms_life_cycle", intValue);
        }
        aq(new dtrw("participants.cms_life_cycle", 3, at((Iterable) DesugarArrays.stream(csggVarArr).map(new Function() { // from class: bvvt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((csgg) obj).ordinal());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new bvvu()))), true));
    }

    public final void i(csgg csggVar) {
        int intValue = ParticipantsTable.i().intValue();
        if (intValue < 58210) {
            dtub.w("cms_life_cycle", intValue);
        }
        aq(new dtwe("participants.cms_life_cycle", 2, Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal())));
    }

    public final void j(Iterable iterable) {
        aq(new dtrw("participants.contact_id", 3, at(iterable), true));
    }

    public final void k(String str) {
        aq(new dtrt("participants._id", 1, String.valueOf(str)));
    }

    public final void l(dtzj dtzjVar) {
        aq(new dtru("participants._id", 3, dtzjVar));
    }

    public final void m(Iterable iterable) {
        aq(new dtrw("participants._id", 3, at(iterable), false));
    }

    public final void n(long j) {
        aq(new dtwe("participants._id", 10, Long.valueOf(j)));
    }

    public final void o(boolean z) {
        int intValue = ParticipantsTable.i().intValue();
        if (intValue < 60640) {
            dtub.w("is_enterprise_contact", intValue);
        }
        aq(new dtwe("participants.is_enterprise_contact", 1, Integer.valueOf(z ? 1 : 0)));
    }

    public final void p(byzi byziVar) {
        int intValue = ParticipantsTable.i().intValue();
        if (intValue < 31030) {
            dtub.w("latest_verification_status", intValue);
        }
        aq(new dtwe("participants.latest_verification_status", 2, Integer.valueOf(byziVar == null ? 0 : byziVar.ordinal())));
    }

    public final void q() {
        aq(new dtrx("participants.lookup_key", 5));
    }

    public final void r(String str) {
        aq(new dtrt("participants.normalized_destination", 1, String.valueOf(str)));
    }

    public final void s(Iterable iterable) {
        aq(new dtrw("participants.normalized_destination", 3, at(iterable), false));
    }

    public final void t(int i) {
        int intValue = ParticipantsTable.i().intValue();
        if (intValue < 12001) {
            dtub.w("participant_type", intValue);
        }
        aq(new dtwe("participants.participant_type", 1, Integer.valueOf(i)));
    }

    public final void u() {
        aq(new dtrx("participants.profile_photo_uri", 6));
    }

    public final void v(int i) {
        int intValue = ParticipantsTable.i().intValue();
        if (intValue < 2000) {
            dtub.w("sim_slot_id", intValue);
        }
        aq(new dtwe("participants.sim_slot_id", 1, Integer.valueOf(i)));
    }

    public final void w(int i) {
        aq(new dtwe("participants.sub_id", 1, Integer.valueOf(i)));
    }

    public final void x(int i) {
        aq(new dtwe("participants.sub_id", 7, Integer.valueOf(i)));
    }

    public final void y() {
        aq(new dtwe("participants.sub_id", 2, -2));
    }
}
