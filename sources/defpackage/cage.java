package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import google.internal.communications.instantmessaging.v1.TachyonCommon$PublicPreKeySets;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cage implements ciin {
    private final TachyonCommon$PublicPreKeySets a;
    private final String b;
    private String c = "";
    private long d = 0;

    public cage(TachyonCommon$PublicPreKeySets tachyonCommon$PublicPreKeySets, String str) {
        this.a = tachyonCommon$PublicPreKeySets;
        this.b = str;
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.d;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return new ciii(this.b);
    }

    @Override // defpackage.ciin
    public final ListenableFuture c(fcfo fcfoVar) {
        fcmb fcmbVar = (fcmb) fcmc.a.createBuilder();
        fcmbVar.copyOnWrite();
        fcmc fcmcVar = (fcmc) fcmbVar.instance;
        fcfoVar.getClass();
        fcmcVar.c = fcfoVar;
        fcmcVar.b |= 1;
        fcmbVar.copyOnWrite();
        fcmc fcmcVar2 = (fcmc) fcmbVar.instance;
        TachyonCommon$PublicPreKeySets tachyonCommon$PublicPreKeySets = this.a;
        tachyonCommon$PublicPreKeySets.getClass();
        fcmcVar2.d = tachyonCommon$PublicPreKeySets;
        fcmcVar2.b |= 2;
        fcmc fcmcVar3 = (fcmc) fcmbVar.build();
        this.c = fcfoVar.c;
        return erqt.i(fcmcVar3);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        fcej fcejVar = (fcej) fcek.a.createBuilder();
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).c = this.b;
        return chrvVar.d((fcek) fcejVar.build()).g((fcmc) eyhsVar);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        long j;
        fcme fcmeVar = (fcme) eyhsVar;
        if (fcmeVar != null) {
            fcfq fcfqVar = fcmeVar.b;
            if (fcfqVar == null) {
                fcfqVar = fcfq.a;
            }
            j = fcfqVar.b;
        } else {
            j = 0;
        }
        this.d = j;
        return ernq.f(erny.f(erqc.o(erqt.i(fcmeVar)), new emwl() { // from class: cagc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Status.b;
            }
        }, erpp.a), Throwable.class, new emwl() { // from class: cagd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Status.c((Throwable) obj);
            }
        }, erpp.a);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "UploadPreKeysHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.c;
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void h(Throwable th) {
        ciim.c(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void i() {
        ciim.a(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void j() {
        ciim.b(this);
    }

    @Override // defpackage.cijo
    public final void k() {
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
