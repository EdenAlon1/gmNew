package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqjn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqjz b;
    final /* synthetic */ dqij c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqjn(dqjz dqjzVar, dqij dqijVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqjzVar;
        this.c = dqijVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqjn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        efiv efivVar = (efiv) this.b.b.b();
        efkj efkjVar = dqjm.a;
        dqjz dqjzVar = this.b;
        String str = (String) dqjzVar.e.b.invoke(this.c.a);
        dqij dqijVar = this.c;
        String str2 = dqijVar.d;
        String a = str2 != null ? dqjm.a(str2) : null;
        Instant instant = dqijVar.c;
        dqgm dqgmVar = dqijVar.b;
        String str3 = dqjzVar.f;
        str.getClass();
        efko efkoVar = new efko();
        efkoVar.b("\n          INSERT INTO `usages` (`type`, `value`, `context`, `time`, `search_term`)\n          VALUES (?, ?, ?, ?, ?)\n          ");
        efkoVar.d(str3);
        efkoVar.d(str);
        efkoVar.c(Long.valueOf(dqgmVar.a));
        efkoVar.c(Long.valueOf(instant.toEpochMilli()));
        efkoVar.d(a);
        ListenableFuture c = efivVar.c(efkoVar.a());
        c.getClass();
        this.a = 1;
        Object c2 = fgfz.c(c, this);
        return c2 == ffhhVar ? ffhhVar : c2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqjn(this.b, this.c, ffguVar);
    }
}
