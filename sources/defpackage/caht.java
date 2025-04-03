package defpackage;

import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class caht extends ffhv implements ffjm {
    final /* synthetic */ caia a;
    final /* synthetic */ Instant b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caht(caia caiaVar, Instant instant, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = caiaVar;
        this.b = instant;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caht) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final Instant instant = this.b;
        instant.getClass();
        csjb a = caji.a.a();
        a.I("delete");
        a.A("cutoff", instant);
        a.r();
        String[] strArr = bwgw.a;
        bwgl bwglVar = new bwgl();
        bwglVar.f("deleteSavedDecryptResultOlderThan");
        bwglVar.a(new Function() { // from class: cajf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bwgv bwgvVar = (bwgv) obj2;
                bwgvVar.aq(new dtwe("pending_incoming_message_rcs_table.received_timestamp", 10, Long.valueOf(Instant.this.toEpochMilli())));
                bwgvVar.b(byze.DECRYPTED);
                return bwgvVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return new Integer(bwglVar.d());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new caht(this.a, this.b, ffguVar);
    }
}
