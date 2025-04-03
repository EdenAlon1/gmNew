package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cveb implements cvfz {
    private final bdtd a;
    private final cqoh b;
    private final ffbr c;

    public cveb(bdtd bdtdVar, cqoh cqohVar, ffbr ffbrVar) {
        bdtdVar.getClass();
        cqohVar.getClass();
        ffbrVar.getClass();
        this.a = bdtdVar;
        this.b = cqohVar;
        this.c = ffbrVar;
    }

    private final void c(final ParticipantsTable.BindData bindData, int i, long j) {
        bsob e = bsom.e();
        e.c(bsom.c.a);
        e.i(new Function() { // from class: cvdz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                bsolVar.j(0);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brwp a = brww.a();
        a.e(new Function() { // from class: cvea
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brwv brwvVar = (brwv) obj;
                String S = ParticipantsTable.BindData.this.S();
                S.getClass();
                brwvVar.c(Long.parseLong(S));
                return brwvVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw f = ((bsob) e.j(dtvz.i(a.b(), brww.c.b, bsom.c.a))).b().f();
        if (((enou) f).c == 1) {
            cbvt cbvtVar = (cbvt) this.c.b();
            Optional empty = Optional.empty();
            f.getClass();
            cbvtVar.j(empty, (ConversationIdType) ffdx.T(f), this.a.e(), bindData, engw.r(bindData), i, j, -1L);
        }
    }

    @Override // defpackage.cvfz
    public final void a(ParticipantsTable.BindData bindData, long j) {
        c(bindData, 244, j);
    }

    @Override // defpackage.cvfz
    public final void b(ParticipantsTable.BindData bindData) {
        bindData.getClass();
        c(bindData, 243, this.b.f().toEpochMilli());
    }
}
