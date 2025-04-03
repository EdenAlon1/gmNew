package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dquz extends dqur {
    public String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dquz(dqoy dqoyVar, dqkk dqkkVar, dqxh dqxhVar, ffsk ffskVar) {
        super(dqoyVar, dqkkVar, ffskVar, dqxhVar);
        dqoyVar.getClass();
        dqkkVar.getClass();
        dqxhVar.getClass();
        ffskVar.getClass();
    }

    @Override // defpackage.dqur
    /* renamed from: H */
    public final dquo e(ViewGroup viewGroup, int i) {
        return G(viewGroup);
    }

    @Override // defpackage.dqur, defpackage.vk
    public final /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return G(viewGroup);
    }

    @Override // defpackage.dqur
    public final /* bridge */ /* synthetic */ dqro m(int i) {
        String str = this.n;
        if (str == null) {
            ffkj.c("currentQuery");
            str = null;
        }
        return new dqrn(str);
    }
}
