package defpackage;

import com.google.android.apps.messaging.shared.util.block.BlockedNumbersJob;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crqg extends ffhv implements ffjm {
    final /* synthetic */ crqh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crqg(crqh crqhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = crqhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crqg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((crqf) this.a.b.b()).d();
        BlockedNumbersJob.c(this.a.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new crqg(this.a, ffguVar);
    }
}
