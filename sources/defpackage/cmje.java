package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmje {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public cmje(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
    }

    public final void a(final bdhg bdhgVar, final String str) {
        int i;
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("processRcsDeleteMessage");
        buxrVar.q(true);
        buxrVar.Y(new Function() { // from class: cmjc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.X(str);
                buxzVar.O(bdhgVar);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (buxrVar.b().e() == 0) {
            return;
        }
        buxo d = MessagesTable.d();
        d.z("RcsDeleteDatabaseHandler-deleteMessage");
        d.h(new Function() { // from class: cmjd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.O(bdhg.this);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = d.b().y();
        y.getClass();
        MessagesTable.BindData bindData = (MessagesTable.BindData) ffdx.M(y);
        if (bindData != null) {
            if (MessageData.cJ(bindData.s())) {
                i = 117;
            } else if (!MessageData.cT(bindData.s())) {
                return;
            } else {
                i = 23;
            }
            byzp byzpVar = (byzp) this.a.b();
            buoz buozVar = new buoz();
            buozVar.ae(bindData.W());
            buozVar.ag(bindData.X());
            buozVar.U(((awtm) this.c.b()).a());
            buozVar.m(bindData.C());
            buozVar.ao(i);
            buozVar.O(bindData.l());
            buozVar.y(bindData.k());
            buozVar.Y(bindData.w());
            buozVar.ai(bindData.y());
            ((bdjr) this.b.b()).a(byzpVar.c(buozVar.a(), ffel.a));
            ((cgrq) this.d.b()).e(bindData.D());
        }
    }
}
