package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqwq extends fflr {
    final /* synthetic */ dqwt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqwq(dqwt dqwtVar) {
        super(null);
        this.a = dqwtVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        dqof dqofVar;
        dqsv dqsvVar = (dqsv) obj2;
        dqwt dqwtVar = this.a;
        Integer num = dqwtVar.d().a;
        if (num != null) {
            dqwtVar.d().q(num.intValue());
        }
        int a = this.a.d().a();
        for (int i = 0; i < a; i++) {
            dqof m = this.a.d().m(i);
            CharSequence charSequence = null;
            CharSequence a2 = m != null ? m.a() : null;
            if (dqsvVar != null && (dqofVar = dqsvVar.d) != null) {
                charSequence = dqofVar.a();
            }
            if (ffkj.e(a2, charSequence)) {
                this.a.d().q(i);
                return;
            }
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
