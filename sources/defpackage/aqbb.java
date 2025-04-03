package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqbb implements apuh {
    public static final /* synthetic */ int b = 0;
    private static final engw c;
    private static final engw d;
    private static final buxz e;
    private static final buxz f;
    public final cqoh a;
    private final ahor g;
    private final ffbr h;

    static {
        engw u = engw.u(100, 1, 2, 11);
        c = u;
        engw v = engw.v(100, 1, 2, 11, 5);
        d = v;
        String[] strArr = MessagesTable.a;
        buxz buxzVar = new buxz();
        buxzVar.ai(u);
        buxzVar.B(false);
        e = buxzVar;
        buxz buxzVar2 = new buxz();
        buxzVar2.ai(v);
        buxzVar2.B(false);
        f = buxzVar2;
    }

    public aqbb(cqoh cqohVar, ahor ahorVar, ffbr ffbrVar) {
        cqohVar.getClass();
        ahorVar.getClass();
        ffbrVar.getClass();
        this.a = cqohVar;
        this.g = ahorVar;
        this.h = ffbrVar;
    }

    private final boolean f() {
        return this.g.c();
    }

    @Override // defpackage.apuh
    public final buxo a(buxo buxoVar) {
        buxo c2 = apag.c("reply_parts", null, null, null, 14);
        if (f()) {
            btql b2 = btqq.b();
            b2.d(new Function() { // from class: aqax
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    btpq btpqVar = (btpq) obj;
                    int i = aqbb.b;
                    return new btpr[]{btpqVar.a, btpqVar.c, btpqVar.e, btpqVar.g, btpqVar.k, btpqVar.d};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            dtvy i = dtvz.i(b2.b(), btqq.c.b, MessagesTable.c.a);
            ((dtrd) i).e = "reply_preview";
            c2.G(i.g());
        }
        String[] strArr = bufy.a;
        bufs bufsVar = new bufs(bufy.a);
        bufsVar.z("+loadMessageReplies");
        dtvy s = c2.b().s(MessagesTable.c.a, bufy.c.b, ((Boolean) this.h.b()).booleanValue() ? new buxs(f) : new buxs(e));
        ((dtrd) s).e = "reply_messages";
        bufsVar.G(s.g());
        buxoVar.G(dtvz.i(bufsVar.b(), bufy.c.a, MessagesTable.c.a).g());
        return buxoVar;
    }

    @Override // defpackage.apuh
    public final boolean c() {
        return true;
    }

    @Override // defpackage.apuh
    public final void d(apuf apufVar, MessagesTable.BindData bindData, aoug aougVar, enhk enhkVar, amfx amfxVar, aptd aptdVar) {
        bueo bueoVar;
        bindData.getClass();
        aougVar.getClass();
        enhkVar.getClass();
        amfxVar.getClass();
        String[] strArr = bufy.a;
        dtro[] aG = bindData.aG("message_replies", new bueo[0]);
        bueo[] bueoVarArr = (bueo[]) aG;
        bueoVarArr.getClass();
        alyu alyuVar = null;
        alyuVar = null;
        alyuVar = null;
        alyuVar = null;
        if (bueoVarArr.length == 0) {
            aG = null;
        }
        bueo[] bueoVarArr2 = (bueo[]) aG;
        if (bueoVarArr2 != null && (bueoVar = (bueo) ffdo.G(bueoVarArr2)) != null) {
            if (!bueoVar.m().c()) {
                dtro[] aG2 = bindData.aG("reply_messages", new MessagesTable.BindData[0]);
                aG2.getClass();
                MessagesTable.BindData bindData2 = (MessagesTable.BindData) ffdo.H(aG2);
                if (bindData2 != null) {
                    apuf n = apug.n();
                    if (f()) {
                        dtro[] aG3 = bindData.aG("reply_preview", new bton[0]);
                        aG3.getClass();
                        bton btonVar = (bton) ffdo.H(aG3);
                        ((apsm) n).a = btonVar != null ? new aqaz(btonVar, this) : null;
                    }
                    aoyv aoyvVar = (aoyv) aptdVar;
                    engw c2 = aoyvVar.c(bindData2, aoyvVar.a((PartsTable.BindData[]) bindData.aG("reply_parts", new PartsTable.BindData[0]), false), new BugleConversationId(bindData2.C()), aougVar, enhkVar, n.a(), amfxVar);
                    c2.getClass();
                    alyuVar = new aqay((alxr) ffdx.K(c2));
                }
            } else if (bueoVar.k() == ajrb.UNSPECIFIED) {
                alyuVar = new aqba();
            }
        }
        ((apsm) apufVar).c = alyuVar;
    }

    @Override // defpackage.apuh
    public final /* synthetic */ aptb e() {
        return new apur("replied to");
    }

    @Override // defpackage.apuh
    public final /* synthetic */ bwdf b(bwdf bwdfVar) {
        return bwdfVar;
    }
}
