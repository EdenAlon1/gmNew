package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akdy extends ffhv implements ffji {
    int a;
    final /* synthetic */ akee b;
    final /* synthetic */ dfkj c;
    final /* synthetic */ fdyn d;
    final /* synthetic */ ffbc e;
    final /* synthetic */ Duration f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akdy(akee akeeVar, dfkj dfkjVar, fdyn fdynVar, ffbc ffbcVar, Duration duration, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = akeeVar;
        this.c = dfkjVar;
        this.d = fdynVar;
        this.e = ffbcVar;
        this.f = duration;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            akee akeeVar = this.b;
            dfkj dfkjVar = this.c;
            fdyn fdynVar = this.d;
            fdynVar.getClass();
            this.a = 1;
            obj = akeeVar.f(dfkjVar, fdynVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        akdm akdmVar = (akdm) obj;
        akee.j(this.e, akdmVar.e);
        akef akefVar = (akef) this.b.f.b();
        Duration duration = this.f;
        duration.getClass();
        akdmVar.getClass();
        if (!akdmVar.a) {
            sqv sqvVar = (sqv) akefVar.a.b();
            eqom eqomVar = akdmVar.c;
            if (eqomVar == null) {
                eqomVar = eqom.UNKNOWN;
            }
            sqv.d(sqvVar, 10, eqomVar, akdmVar.d, akdmVar.f, 184);
        } else if (akdmVar.b) {
            sqv.e((sqv) akefVar.a.b(), 10, akefVar.a(duration), 0, 0, 0, akdmVar.d, akdmVar.f, 156);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new akdy(this.b, this.c, this.d, this.e, this.f, (ffgu) obj).b(ffcu.a);
    }
}
