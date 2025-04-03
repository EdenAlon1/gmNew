package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwbl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwbn b;
    final /* synthetic */ ChipData c;
    final /* synthetic */ boolean d;
    final /* synthetic */ aqux e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwbl(ffgu ffguVar, cwbn cwbnVar, ChipData chipData, boolean z, aqux aquxVar) {
        super(2, ffguVar);
        this.b = cwbnVar;
        this.c = chipData;
        this.d = z;
        this.e = aquxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwbl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        boolean z = this.d;
        aqux aquxVar = this.e;
        this.a = 1;
        Object c = cwbnVar.c(chipData, z, aquxVar, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cwbl cwblVar = new cwbl(ffguVar, this.b, this.c, this.d, this.e);
        cwblVar.f = obj;
        return cwblVar;
    }
}
