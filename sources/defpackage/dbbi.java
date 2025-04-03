package defpackage;

import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import j$.time.temporal.TemporalAccessor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbbi extends ffhv implements ffji {
    Object a;
    int b;
    final /* synthetic */ ffji c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbbi(ffji ffjiVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.c = ffjiVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            DateTimeFormatter withZone = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withZone(cuxw.a);
            ffji ffjiVar = this.c;
            this.a = withZone;
            this.b = 1;
            Object invoke = ffjiVar.invoke(this);
            if (invoke == ffhhVar) {
                return ffhhVar;
            }
            obj2 = withZone;
            obj = invoke;
        }
        return ((DateTimeFormatter) obj2).format((TemporalAccessor) obj);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dbbi(this.c, (ffgu) obj).b(ffcu.a);
    }
}
