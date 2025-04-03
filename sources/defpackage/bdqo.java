package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdqo {
    private final ffbr a;
    private final ffbr b;

    public bdqo(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    public static ParticipantColor a(ParticipantsTable.BindData bindData) {
        return new ParticipantColor(bindData.l(), bindData.k(), bindData.m());
    }

    public static void d(bvpo bvpoVar, ParticipantColor participantColor) {
        ParticipantColor participantColor2 = new ParticipantColor(bvpoVar.t, bvpoVar.s, bvpoVar.u);
        if (participantColor2.f(participantColor)) {
            participantColor2.d(participantColor);
            bvpoVar.i(participantColor2.a);
            bvpoVar.h(participantColor2.b);
            bvpoVar.s(participantColor2.c);
        }
    }

    public final void b(bvpo bvpoVar) {
        if (bvpoVar.I == -1 || csqy.e().contains(Long.valueOf(bvpoVar.I))) {
            bvpoVar.l(-2L);
            bvpoVar.D(null);
            bvpoVar.k(null);
            bvpoVar.W(0);
            bvpoVar.p(-1L);
            bvpoVar.getClass();
            if (bvpoVar.Q != cjwi.PROFILE_PEOPLE_SHARING_SOURCE) {
                bvpoVar.N(null);
                bvpoVar.K(cjwi.PROFILE_UNSPECIFIED_SOURCE);
            }
            bvpoVar.u(null);
            bvpoVar.t(null);
            bvpoVar.G(cjwi.PROFILE_UNSPECIFIED_SOURCE);
        } else {
            bvpoVar.l(-2L);
        }
        c(bvpoVar);
    }

    public final void c(bvpo bvpoVar) {
        csix.l(bvpoVar);
        if (a(bvpoVar.a()).a == 2) {
            bvpoVar.a();
            return;
        }
        d(bvpoVar, new ParticipantColor(0, ((cttz) this.a.b()).f(crjn.a(bvpoVar.f)), 0));
        bvpoVar.a();
    }
}
