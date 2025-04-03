package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajcs extends ffhv implements ffjm {
    final /* synthetic */ ajct a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajcs(ajct ajctVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ajctVar;
        this.b = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajcs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (!((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() || !((Boolean) ((cfup) ctjd.aH.get()).e()).booleanValue()) {
            return ffcu.a;
        }
        ajct ajctVar = this.a;
        ajcq ajcqVar = ajcq.a;
        cetp cetpVar = new cetp();
        cetpVar.b = "penpal_dedupe_tag";
        cetpVar.c = Duration.ofMinutes(this.b);
        ((cevh) ajctVar.b.a.b()).a(ceyr.h("penpal_conversation_auto_generate", ajcqVar, cetpVar.a()));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajcs(this.a, this.b, ffguVar);
    }
}
