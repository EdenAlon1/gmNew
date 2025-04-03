package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwbd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwbn b;
    final /* synthetic */ ChipData c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwbd(ffgu ffguVar, cwbn cwbnVar, ChipData chipData) {
        super(2, ffguVar);
        this.b = cwbnVar;
        this.c = chipData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwbd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cwbn cwbnVar = this.b;
        ChipData chipData = this.c;
        this.a = 1;
        Object f = cwbnVar.f(chipData.a, this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cwbd cwbdVar = new cwbd(ffguVar, this.b, this.c);
        cwbdVar.d = obj;
        return cwbdVar;
    }
}
