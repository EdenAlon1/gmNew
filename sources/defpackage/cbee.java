package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbee {
    private static final cskc b = cskc.g("BugleDataModel", "ParticipantRecoveryOperation");
    public final ffbr a;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final coxk f;
    private final ffbr g;

    public cbee(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, coxk coxkVar, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = coxkVar;
        this.a = ffbrVar4;
        this.g = ffbrVar5;
    }

    public final engw a(List list) {
        Stream map = Collection.EL.stream(list).map(new Function() { // from class: cbea
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aolr) cbee.this.a.b()).c((String) obj, new emyl() { // from class: cbdz
                    @Override // defpackage.emyl
                    public final Object get() {
                        return Optional.empty();
                    }
                });
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return (engw) map.collect(endq.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.Optional b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbee.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, int, int):j$.util.Optional");
    }

    public final void c(List list, List list2) {
        int i;
        enou enouVar = (enou) list;
        if (enouVar.c != 1) {
            csjb a = b.a();
            a.I("Skip participants restoration");
            a.y("participantsInConversation", enouVar.c);
            a.r();
            ((akzt) this.e.b()).e("Bugle.Datamodel.Operations.EmptyRecipient.RestoreDestinations", 1);
            return;
        }
        int i2 = 0;
        final String S = ((ParticipantsTable.BindData) list.get(0)).S();
        boolean z = list2.size() != 1;
        bvvr f = ParticipantsTable.f();
        f.ap("restoreDestinationsInParticipants");
        if (z) {
            f.O("ʼUNKNOWN_SENDER!ʼ");
            f.H("ʼUNKNOWN_SENDER!ʼ");
            f.r("ʼUNKNOWN_SENDER!ʼ");
            i = 2;
        } else {
            aoku aokuVar = (aoku) list2.get(0);
            aoku k = ((aolr) this.a.b()).k(aokuVar);
            cfva cfvaVar = aoqm.a;
            ffbr ffbrVar = this.a;
            boolean a2 = asvj.a();
            aoku i3 = ((aolr) ffbrVar.b()).i(k, !a2);
            f.O(aokuVar.n());
            f.H(k.n());
            f.r(i3.H(a2).toString());
            i = 3;
        }
        f.V(new Function() { // from class: cbdy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                bvvwVar.k(S);
                bvvwVar.w(-2);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        try {
            i2 = ((Boolean) ((cfup) bdrs.b.get()).e()).booleanValue() ? ((bdrv) this.g.b()).b(f, bdsp.g) : ((Boolean) ((cfup) bdrs.a.get()).e()).booleanValue() ? ((bdrv) this.g.b()).a(f.b()) : f.b().e();
            if (i2 == 0) {
                i = 4;
            }
        } catch (SQLiteConstraintException e) {
            i = true != z ? 5 : 6;
            csjb e2 = b.e();
            e2.I("Participants constraint failed");
            e2.y("restoreCounterKey", i);
            e2.s(e);
        }
        ((akzt) this.e.b()).e("Bugle.Datamodel.Operations.EmptyRecipient.RestoreDestinations", i);
        csjb a3 = b.a();
        a3.I("Participant restored");
        a3.f(S);
        a3.y("updatedCount", i2);
        a3.y("telephonyRecipients", list2.size());
        a3.y("restoreCounterKey", i);
        a3.r();
    }
}
