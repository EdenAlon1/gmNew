package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cncb implements bdnx, bdns {
    private static final entd a = entd.c("BugleReactions");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private Optional e;

    public cncb(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = Optional.empty();
    }

    @Override // defpackage.bdnx
    public final ekzz c() {
        return eleg.f("XmsReactionsOnXmsMessageReceivedListener");
    }

    @Override // defpackage.bdnx, defpackage.bdns
    public final void e(String str) {
        if (str == null || str.length() <= 0 || !ffol.e(str.charAt(0), (char) 8202, false)) {
            return;
        }
        ((ensz) a.h()).q("Starting to classify xMS reaction.");
        this.e = ((ctsa) this.b.b()).a(str);
    }

    @Override // defpackage.bdnx, defpackage.bdns
    public final void g(MessageCoreData messageCoreData) {
        if (this.e.isPresent()) {
            messageCoreData.bx(true);
            cndg cndgVar = (cndg) this.d.b();
            fbwv fbwvVar = (fbwv) this.e.get();
            fbvt fbvtVar = fbwvVar.b == 2 ? (fbvt) fbwvVar.c : fbvt.a;
            fbvtVar.getClass();
            cndgVar.a(fbvtVar, messageCoreData);
        }
    }

    @Override // defpackage.bdnx, defpackage.bdns
    public final void gc(MessageCoreData messageCoreData) {
        String aA = messageCoreData.aA();
        if (aA != null && this.e.isPresent()) {
            ensz enszVar = (ensz) a.h();
            enszVar.Y(csux.p, messageCoreData.z());
            enszVar.Y(csux.m, messageCoreData.aA());
            enszVar.Y(cmsm.a, messageCoreData.B());
            enszVar.q("Starting to process xMS reaction.");
            cnej cnejVar = (cnej) this.c.b();
            cneg cnegVar = (cneg) cneh.a.createBuilder();
            cnegVar.getClass();
            cnei.b(messageCoreData.z().a(), cnegVar);
            cnei.d(aA, cnegVar);
            cnei.c(messageCoreData.B().b(), cnegVar);
            cnei.e((fbwv) this.e.get(), cnegVar);
            cnei.f(messageCoreData.o(), cnegVar);
            cnejVar.a(cnei.a(cnegVar));
        }
    }
}
