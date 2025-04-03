package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crsa implements crrt {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final dtuu j;
    private final ffbr k;
    private final ffhd l;
    private final ffsk m;

    public crsa(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, dtuu dtuuVar, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffhd ffhdVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        dtuuVar.getClass();
        ffbrVar9.getClass();
        ffbrVar10.getClass();
        ffbrVar11.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        this.g = ffbrVar;
        this.a = ffbrVar2;
        this.b = ffbrVar3;
        this.c = ffbrVar4;
        this.d = ffbrVar5;
        this.h = ffbrVar6;
        this.i = ffbrVar7;
        this.e = ffbrVar8;
        this.j = dtuuVar;
        this.k = ffbrVar10;
        this.f = ffbrVar11;
        this.l = ffhdVar;
        this.m = ffskVar;
    }

    public static final ConversationIdType e(crsd crsdVar) {
        ConversationId conversationId;
        ConversationIdType conversationIdType;
        if (!cubs.a().booleanValue() && (conversationIdType = crsdVar.e) != null) {
            return conversationIdType;
        }
        if (!cubs.a().booleanValue() || (conversationId = crsdVar.d) == null) {
            return null;
        }
        return bdgq.b(conversationId.b());
    }

    @Override // defpackage.crrt
    public final elfl a(crsd crsdVar) {
        elfl c;
        c = axol.c(this.m, ffhe.a, ffsm.a, new crry(this, crsdVar, null));
        return c;
    }

    @Override // defpackage.crrt
    public final Object b(crsn crsnVar, ffgu ffguVar) {
        ParticipantsTable.BindData b;
        if ((crsnVar.b & 4) == 0) {
            return null;
        }
        String str = crsnVar.e;
        str.getClass();
        if (str.length() == 0 || (b = ((bdrr) this.g.b()).b(crsnVar.e)) == null) {
            return null;
        }
        return fgfz.c(((aqkp) this.i.b()).m(((aolr) this.h.b()).q(b)), ffguVar);
    }

    @Override // defpackage.crrt
    public final Object c(crsd crsdVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.l), new crrx(null, this, crsdVar), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(final defpackage.crsd r6, defpackage.ffgu r7) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crsa.d(crsd, ffgu):java.lang.Object");
    }
}
