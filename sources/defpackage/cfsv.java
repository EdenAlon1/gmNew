package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfsv implements bdoa, bdnu, bdnx, bdns {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/emergency/session/EmergencySessionManager");
    public final long b;
    public final long c;
    public final long d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    private final ffsk j;
    private final ffbr k;
    private final ffbz l;
    private final cqor m;

    public cfsv(long j, long j2, long j3, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.j = ffskVar;
        this.e = ffbrVar;
        this.k = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.l = ffca.a(new ffix() { // from class: cfsr
            @Override // defpackage.ffix
            public final Object invoke() {
                return new cnq((int) cfsv.this.d);
            }
        });
        this.m = new cqoq("EmergencySessionManagerImpl::createTraceSpan");
    }

    public static final void f(final apkn apknVar) {
        apko.b(apknVar).q(new Function() { // from class: cfss
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bszl bszlVar = (bszl) obj;
                apkn apknVar2 = apkn.this;
                bszlVar.b(apknVar2.a);
                bszlVar.c(apknVar2.b);
                return bszlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    private final void h(MessageCoreData messageCoreData) {
        axol.k(this.j, null, new cfsu(this, messageCoreData, null), 3);
    }

    @Override // defpackage.bdoa
    public final void a(MessageCoreData messageCoreData) {
        if (((attl) this.k.b()).a()) {
            cnq b = b();
            ConversationIdType z = messageCoreData.z();
            z.getClass();
            if (!ffkj.e(b.c(z), false)) {
                h(messageCoreData);
                return;
            }
            enrr enrrVar = (enrr) a.g();
            enrrVar.Y(csux.p, messageCoreData.z());
            enrrVar.Y(csux.b, messageCoreData.B());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/emergency/session/EmergencySessionManager", "onProcessSendSuccess", 149, "EmergencySessionManager.kt")).q("onProcessSendSuccess called but conversation is not emergency RCS.");
        }
    }

    public final cnq b() {
        return (cnq) this.l.a();
    }

    @Override // defpackage.bdoa, defpackage.bdnx
    public final ekzz c() {
        return this.m.a();
    }

    @Override // defpackage.bdnu
    public final void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        gc(messageCoreData);
    }

    @Override // defpackage.bdnx, defpackage.bdns
    public final void e(String str) {
    }

    @Override // defpackage.bdnx, defpackage.bdns
    public final void gc(MessageCoreData messageCoreData) {
        if (((attl) this.k.b()).a()) {
            cnq b = b();
            ConversationIdType z = messageCoreData.z();
            z.getClass();
            if (!ffkj.e(b.c(z), false)) {
                h(messageCoreData);
                return;
            }
            enrr enrrVar = (enrr) a.g();
            enrrVar.Y(csux.p, messageCoreData.z());
            enrrVar.Y(csux.b, messageCoreData.B());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/emergency/session/EmergencySessionManager", "afterMessageInsertedInCriticalPath", 126, "EmergencySessionManager.kt")).q("afterMessageInsertedInCriticalPath called but conversation is not emergency RCS.");
        }
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnu
    public final void g(MessageCoreData messageCoreData) {
    }
}
