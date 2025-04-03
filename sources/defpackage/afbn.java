package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afbn extends dtrs {
    public static final enru a = enru.c("com/google/android/apps/messaging/label/data/observer/MessageChangeListener");
    public final Consumer b;
    private final ffbr e;
    private final ffbr f;
    public boolean d = true;
    public final Set c = new HashSet();

    public afbn(Consumer consumer, ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = consumer;
        this.e = ffbrVar;
        this.f = ffbrVar2;
    }

    private final void f() {
        if (((Boolean) ((cfup) coxg.a.get()).e()).booleanValue()) {
            emxf.m(!((coxg) this.f.b()).v(), "MessageChangeListener should not be enabled when a sync is in progress");
        }
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        if (!this.d) {
            ensk h = a.h();
            h.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) h;
            enrrVar.W(5, TimeUnit.SECONDS);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/label/data/observer/MessageChangeListener", "onChangeInTransaction", 85, "MessageChangeListener.java")).q("MessageChangeListener is disabled, skipping callback.");
            return;
        }
        f();
        if (aewg.h()) {
            MessagesTable.BindData bindData = (MessagesTable.BindData) dtukVar.b();
            if (bindData != null) {
                if (!((Boolean) afas.a.e()).booleanValue()) {
                    this.c.add(bindData.D());
                } else if (bindData.s() <= 0 || bindData.s() > 25 || bindData.s() == 1) {
                    this.c.add(bindData.D());
                }
            }
            buxq buxqVar = (buxq) dtukVar.d();
            if (buxqVar != null && buxqVar.n("conversation_id")) {
                buxqVar.m(new duao() { // from class: afbj
                    @Override // defpackage.duao
                    public final boolean a(duaw duawVar) {
                        if (!(duawVar instanceof dtrt)) {
                            return false;
                        }
                        dtrt dtrtVar = (dtrt) duawVar;
                        if (!dktk.a(dtrtVar.d, MessagesTable.c.a.toString()) || dtrtVar.b != 1) {
                            return false;
                        }
                        afbn afbnVar = afbn.this;
                        afbnVar.c.add(bdhb.b(dtrtVar.a));
                        return true;
                    }
                });
            }
            if (((Boolean) afas.a.e()).booleanValue() && buxqVar != null && buxqVar.n("message_status")) {
                int a2 = buxqVar.a();
                if (bdjs.y(a2) || bdjs.u(a2) || bdjs.B(a2) || bdjs.x(a2)) {
                    buxqVar.m(new duao() { // from class: afbk
                        @Override // defpackage.duao
                        public final boolean a(duaw duawVar) {
                            if (!(duawVar instanceof dtrt)) {
                                return false;
                            }
                            dtrt dtrtVar = (dtrt) duawVar;
                            if (!dktk.a(dtrtVar.d, MessagesTable.c.a.toString()) || dtrtVar.b != 1) {
                                return false;
                            }
                            afbn afbnVar = afbn.this;
                            afbnVar.c.add(bdhb.b(dtrtVar.a));
                            return true;
                        }
                    });
                }
            }
            if (this.c.isEmpty()) {
                return;
            }
            Set set = this.c;
            ffbr ffbrVar = this.e;
            final engw n = engw.n(set);
            ((dtuu) ffbrVar.b()).g(new dtut() { // from class: afbl
                @Override // defpackage.dtut
                public final ekzz a() {
                    return eleg.f("MCL::onChangeInTransaction::runAfterCommit");
                }
            }, String.valueOf(n.hashCode()), new Runnable() { // from class: afbm
                @Override // java.lang.Runnable
                public final void run() {
                    afbn.this.b.o(n);
                }
            });
            this.c.clear();
        }
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void gb(dtyq dtyqVar) {
        if (this.d) {
            f();
            return;
        }
        ensk h = a.h();
        h.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) h;
        enrrVar.W(5, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/label/data/observer/MessageChangeListener", "onChangeAfterTransaction", 181, "MessageChangeListener.java")).q("MessageChangeListener is disabled, skipping callback.");
    }
}
