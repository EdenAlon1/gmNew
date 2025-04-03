package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akdr extends ffhv implements ffji {
    int a;
    final /* synthetic */ akee b;
    final /* synthetic */ ffbc c;
    final /* synthetic */ Duration d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akdr(akee akeeVar, ffbc ffbcVar, Duration duration, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = akeeVar;
        this.c = ffbcVar;
        this.d = duration;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            akee akeeVar = this.b;
            this.a = 1;
            obj = akeeVar.d(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        akdk akdkVar = (akdk) obj;
        if (!akdkVar.a() && akdkVar.c.b == null) {
            throw new IllegalStateException("Failed handshakeResult without exception set");
        }
        akee.j(this.c, akdkVar.c);
        akef akefVar = (akef) this.b.f.b();
        Duration duration = this.d;
        duration.getClass();
        akdkVar.getClass();
        if (akdkVar.a()) {
            sqv.e((sqv) akefVar.a.b(), 3, akefVar.a(duration), 0, 0, 0, akdkVar.b, null, 92);
        } else {
            sqv sqvVar = (sqv) akefVar.a.b();
            eqom eqomVar = akdkVar.a;
            eqomVar.getClass();
            sqv.d(sqvVar, 3, eqomVar, akdkVar.b, null, 120);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new akdr(this.b, this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}
