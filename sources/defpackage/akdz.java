package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akdz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ akee b;
    final /* synthetic */ dfkj c;
    final /* synthetic */ fdyn d;
    final /* synthetic */ ffbc e;
    final /* synthetic */ Duration f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akdz(akee akeeVar, dfkj dfkjVar, fdyn fdynVar, ffbc ffbcVar, Duration duration, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = akeeVar;
        this.c = dfkjVar;
        this.d = fdynVar;
        this.e = ffbcVar;
        this.f = duration;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akdz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            ffbc ffbcVar = this.e;
            Duration duration = this.f;
            bbhj bbhjVar = bbhj.a;
            akdy akdyVar = new akdy(akeeVar, dfkjVar, fdynVar, ffbcVar, duration, null);
            this.a = 1;
            obj = bbhjVar.a("CustomD2DTargetServiceImpl#restoreCustomD2DItem", akdyVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        long j = ((ffpw) obj).c;
        ensk h = akee.a.h();
        h.Y(ente.a, "BugleBackup");
        ensz enszVar = (ensz) h;
        enszVar.W(10, TimeUnit.SECONDS);
        enszVar.s("CustomD2DTargetServiceImpl#restoreCustomD2DItem time: [%s]ms", ffpw.g(j));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new akdz(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
