package defpackage;

import com.google.android.ims.provisioning.config.WelcomeMessage;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmfi implements coph {
    final /* synthetic */ ffbr a;
    final /* synthetic */ ffbr b;
    final /* synthetic */ ffbr c;

    public cmfi(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    @Override // defpackage.coph
    public final Optional a() {
        Optional o = ((ckds) this.a.b()).o();
        final ffji ffjiVar = new ffji() { // from class: cmfe
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                WelcomeMessage welcomeMessage = (WelcomeMessage) obj;
                diun diunVar = (diun) diuo.a.createBuilder();
                diunVar.getClass();
                String str = welcomeMessage.mMessage;
                str.getClass();
                diunVar.copyOnWrite();
                diuo diuoVar = (diuo) diunVar.instance;
                diuoVar.b |= 1;
                diuoVar.c = str;
                String str2 = welcomeMessage.mTitle;
                str2.getClass();
                diunVar.copyOnWrite();
                diuo diuoVar2 = (diuo) diunVar.instance;
                diuoVar2.b |= 2;
                diuoVar2.d = str2;
                boolean z = welcomeMessage.mHasAcceptButton;
                diunVar.copyOnWrite();
                diuo diuoVar3 = (diuo) diunVar.instance;
                diuoVar3.b |= 4;
                diuoVar3.e = z;
                boolean z2 = welcomeMessage.mHasRejectButton;
                diunVar.copyOnWrite();
                diuo diuoVar4 = (diuo) diunVar.instance;
                diuoVar4.b |= 8;
                diuoVar4.f = z2;
                boolean z3 = welcomeMessage.hasSettingsButton;
                diunVar.copyOnWrite();
                diuo diuoVar5 = (diuo) diunVar.instance;
                diuoVar5.b |= 16;
                diuoVar5.g = z3;
                eyfy build = diunVar.build();
                build.getClass();
                return (diuo) build;
            }
        };
        Optional map = o.map(new Function() { // from class: cmff
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map.getClass();
        final diuo diuoVar = (diuo) fflm.a(map, diuo.a);
        Optional h = ((cort) this.b.b()).h(cors.a);
        final ffbr ffbrVar = this.a;
        final ffji ffjiVar2 = new ffji() { // from class: cmfg
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                cosz coszVar = (cosz) obj;
                cmgj cmgjVar = (cmgj) cmgn.a.createBuilder();
                cmgjVar.getClass();
                DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((cmgn) cmgjVar.instance).b)).getClass();
                String str = coszVar.c;
                str.getClass();
                diuo diuoVar2 = diuo.this;
                diuoVar2.getClass();
                cmgjVar.a(str, diuoVar2);
                DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((cmgn) cmgjVar.instance).c)).getClass();
                String str2 = coszVar.c;
                str2.getClass();
                cmgjVar.b(str2, ((ckds) ffbrVar.b()).H());
                eyfy build = cmgjVar.build();
                build.getClass();
                return (cmgn) build;
            }
        };
        Optional map2 = h.map(new Function() { // from class: cmfh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map2.getClass();
        return map2;
    }

    @Override // defpackage.copg
    public final void c() {
        ((akzt) this.c.b()).c("Bugle.Rcs.CarrierTos.Data.Migration.Counts");
    }

    @Override // defpackage.coph
    public final void b() {
    }
}
