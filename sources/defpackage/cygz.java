package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cygz implements cygt {
    public final errl a;
    public final bctx b;
    public buxm c;
    private final ejvb d;

    public cygz(ejvb ejvbVar, errl errlVar, bctx bctxVar) {
        this.d = ejvbVar;
        this.a = errlVar;
        this.b = bctxVar;
    }

    @Override // defpackage.cygt
    public final ejuh a(final ConversationIdType conversationIdType) {
        final bvvl c = bcui.c(conversationIdType);
        buxo d = MessagesTable.d();
        d.z("createMessagesTableQuery");
        d.v(MessagesTable.c.a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesTable.c.ac);
        arrayList.add(MessagesTable.c.k);
        arrayList.add(MessagesTable.c.j);
        d.c((buun[]) arrayList.toArray(new buun[arrayList.size()]));
        bsob e = bsom.e();
        e.i(new Function() { // from class: cygu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                bsolVar.q(ConversationIdType.this);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtvy i = dtvz.i(e.b(), bsom.c.f, MessagesTable.c.a);
        ((dtrd) i).e = "latest_message";
        i.d(true);
        d.D(i.g());
        this.c = d.b();
        return new ejuy(this.d, new eros() { // from class: cygv
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                final cygz cygzVar = cygz.this;
                final bvvl bvvlVar = c;
                final buxm buxmVar = cygzVar.c;
                final elfl g = elfo.g(new Callable() { // from class: cygw
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return cygz.this.b.a(bvvlVar.y());
                    }
                }, cygzVar.a);
                final elfl g2 = elfo.g(new Callable() { // from class: cygx
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return buxm.this.y();
                    }
                }, cygzVar.a);
                return new erph(elfo.k(g2, g).a(new Callable() { // from class: cygy
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        bctw bctwVar = (bctw) erqt.q(elfl.this);
                        engw engwVar = (engw) erqt.q(g2);
                        boolean z = false;
                        if (!engwVar.isEmpty() && ctid.a) {
                            MessagesTable.BindData bindData = (MessagesTable.BindData) engwVar.get(0);
                            if (bindData.s() == 8 && bindData.l() != 1 && bindData.o() == 8) {
                                z = true;
                            }
                        }
                        return new cygr(bctwVar, z, buxmVar);
                    }
                }, cygzVar.a));
            }
        }, "PREMIUM_SMS_BANNER_STATE_KEY".concat(conversationIdType.toString()));
    }
}
