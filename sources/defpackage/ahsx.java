package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahsx extends ffhv implements ffjm {
    final /* synthetic */ ahtb a;
    final /* synthetic */ alxr b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahsx(ffgu ffguVar, ahtb ahtbVar, alxr alxrVar) {
        super(2, ffguVar);
        this.a = ahtbVar;
        this.b = alxrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahsx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (!ekxi.b(u())) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        ekzz f = eleg.f("MessageDetailsScreenUiAdapter#createUiDataFlow");
        try {
            ahtb ahtbVar = this.a;
            alxr alxrVar = this.b;
            zst zstVar = new zst(ahtbVar.f.a(alxrVar, null, null), false, null, null, null, false, false, false, false, false, null, false, false, false, false, true, false, 1211836);
            ahtl ahtlVar = ahtbVar.b;
            axrb.a(new ahtj(((wwd) ahtlVar.b.b()).b, ahtlVar), "TopbarUiData");
            new ahsz(null);
            axrb.a(ahtbVar.c.a(ahtbVar.d, zstVar), "MessageBubbleUiData");
            new ahta(null);
            if (alxrVar.d() instanceof alyn) {
                alya d = alxrVar.d();
                d.getClass();
                throw null;
            }
            alya d2 = alxrVar.d();
            d2.getClass();
            throw null;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ahsx ahsxVar = new ahsx(ffguVar, this.a, this.b);
        ahsxVar.c = obj;
        return ahsxVar;
    }
}
