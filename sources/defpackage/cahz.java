package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cahz extends ffhv implements ffjm {
    final /* synthetic */ caia a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cahz(caia caiaVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = caiaVar;
        this.b = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cahz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = bwgw.a;
        bwgl bwglVar = new bwgl();
        bwglVar.f("removeOldPendingFtdMessages");
        final long j = this.b;
        bwglVar.a(new Function() { // from class: caie
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bwgv bwgvVar = (bwgv) obj2;
                bwgvVar.b(byze.FAILED_TO_DECRYPT);
                bwgvVar.aq(new dtwe("pending_incoming_message_rcs_table.received_timestamp", 8, Long.valueOf(j)));
                return bwgvVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int d = bwglVar.d();
        csjb c = caig.a.c();
        c.I("Removed old pending messages.");
        c.y("count", d);
        c.r();
        return new Integer(d);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cahz(this.a, this.b, ffguVar);
    }
}
