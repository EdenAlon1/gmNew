package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwbe extends ffhv implements ffjm {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ cwbn c;
    final /* synthetic */ ChipData d;
    final /* synthetic */ aqux e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwbe(ffgu ffguVar, boolean z, cwbn cwbnVar, ChipData chipData, aqux aquxVar) {
        super(2, ffguVar);
        this.b = z;
        this.c = cwbnVar;
        this.d = chipData;
        this.e = aquxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwbe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        if (!this.b) {
            return false;
        }
        cwbn cwbnVar = this.c;
        ChipData chipData = this.d;
        aqux aquxVar = this.e;
        this.a = 1;
        Object d = cwbnVar.d(chipData.a, aquxVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cwbe cwbeVar = new cwbe(ffguVar, this.b, this.c, this.d, this.e);
        cwbeVar.f = obj;
        return cwbeVar;
    }
}
