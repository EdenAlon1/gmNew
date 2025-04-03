package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class chzy implements ffau {
    public ffam a;
    final /* synthetic */ chzz b;
    private final ffbc c;

    public chzy(chzz chzzVar) {
        this.b = chzzVar;
        this.c = new chzv(chzzVar);
    }

    @Override // defpackage.ffbc
    public final void a() {
        chzz chzzVar = this.b;
        if (chzzVar.H) {
            ekzz f = eleg.f("ReceiveMessagesResponseObserver::onCompleted");
            try {
                this.c.a();
                f.close();
                return;
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ekzm b = chzzVar.i.b("ReceiveMessagesResponseObserver#onCompleted");
        try {
            this.c.a();
            b.close();
        } catch (Throwable th3) {
            try {
                b.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.ffbc
    public final void b(Throwable th) {
        chzz chzzVar = this.b;
        if (chzzVar.H) {
            ekzz f = eleg.f("ReceiveMessagesResponseObserver::onError");
            try {
                this.c.b(th);
                f.close();
                return;
            } catch (Throwable th2) {
                try {
                    f.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        ekzm b = chzzVar.i.b("ReceiveMessagesResponseObserver#onError");
        try {
            this.c.b(th);
            b.close();
        } catch (Throwable th4) {
            try {
                b.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @Override // defpackage.ffbc
    public final /* synthetic */ void c(Object obj) {
        chzz chzzVar = this.b;
        fcbj fcbjVar = (fcbj) obj;
        if (chzzVar.H) {
            ekzz f = eleg.f("ReceiveMessagesResponseObserver::onNext");
            try {
                this.c.c(fcbjVar);
                f.close();
                return;
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ekzm b = chzzVar.i.b("ReceiveMessagesResponseObserver#onNext");
        try {
            this.c.c(fcbjVar);
            b.close();
        } catch (Throwable th3) {
            try {
                b.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.ffau
    public final void d(ffam ffamVar) {
        this.a = ffamVar;
    }

    public final void e() {
        if (this.a != null) {
            ensk h = chzz.c.h();
            h.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$ReceiveMessagesResponseObserver", "disconnect", 735, "BindHandlerImpl.java")).t("%s BindHandler: Cancelling stream intentionally. onError will be called but no-op", epkl.a(this.b.J));
            this.a.d("Closing Bind channel", new chzw());
        }
    }
}
