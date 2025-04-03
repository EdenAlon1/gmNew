package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnbx implements bdnx, bdns, bdnu {
    private static final entd b = entd.c("BugleReactions");
    public final ffbr a;
    private final ctsa c;
    private final ffbr d;
    private final ffbr e;
    private Optional f;
    private final ffbz g;

    public cnbx(ctsa ctsaVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.c = ctsaVar;
        this.a = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = Optional.empty();
        this.g = ffca.a(new ffix() { // from class: cnbw
            @Override // defpackage.ffix
            public final Object invoke() {
                cnbx cnbxVar = cnbx.this;
                ekzz f = eleg.f("IosReactionsMessageReceivedListener#isReactionClassificationSettingEnabled");
                try {
                    boolean b2 = ((cmso) cnbxVar.a.b()).b();
                    ffig.a(f, null);
                    return Boolean.valueOf(b2);
                } finally {
                }
            }
        });
    }

    private final boolean a() {
        return ((Boolean) this.g.a()).booleanValue();
    }

    @Override // defpackage.bdnx
    public final ekzz c() {
        return eleg.f("IosReactionsMessageReceivedListener");
    }

    @Override // defpackage.bdnu
    public final void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        gc(messageCoreData);
    }

    @Override // defpackage.bdnu
    public final void e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        e(messageCoreData.ar());
    }

    @Override // defpackage.bdnx, defpackage.bdns
    public final void g(MessageCoreData messageCoreData) {
        if (this.f.isEmpty() || !a()) {
            return;
        }
        messageCoreData.bx(true);
        messageCoreData.bz(true);
        cndg cndgVar = (cndg) this.e.b();
        fbwv fbwvVar = (fbwv) this.f.get();
        fbvt fbvtVar = fbwvVar.b == 2 ? (fbvt) fbwvVar.c : fbvt.a;
        fbvtVar.getClass();
        cndgVar.a(fbvtVar, messageCoreData);
    }

    @Override // defpackage.bdnx, defpackage.bdns
    public final void gc(MessageCoreData messageCoreData) {
        String aA = messageCoreData.aA();
        if (this.f.isEmpty() || aA == null) {
            return;
        }
        if (!a()) {
            ensz enszVar = (ensz) b.h();
            enszVar.Y(csux.p, messageCoreData.z());
            enszVar.Y(csux.m, messageCoreData.aA());
            enszVar.Y(cmsm.a, messageCoreData.B());
            enszVar.q("Skipping iOS reaction due to setting being disabled.");
            return;
        }
        ensz enszVar2 = (ensz) b.h();
        enszVar2.Y(csux.p, messageCoreData.z());
        enszVar2.Y(csux.m, messageCoreData.aA());
        enszVar2.Y(cmsm.a, messageCoreData.B());
        enszVar2.q("Starting to process iOS reaction.");
        cnej cnejVar = (cnej) this.d.b();
        cneg cnegVar = (cneg) cneh.a.createBuilder();
        cnegVar.getClass();
        cnei.b(messageCoreData.z().a(), cnegVar);
        cnei.d(aA, cnegVar);
        cnei.c(messageCoreData.B().b(), cnegVar);
        cnei.e((fbwv) this.f.get(), cnegVar);
        cnei.f(messageCoreData.o(), cnegVar);
        cnejVar.a(cnei.a(cnegVar));
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnx, defpackage.bdns
    public final void e(String str) {
        this.f = this.c.a(str);
    }
}
