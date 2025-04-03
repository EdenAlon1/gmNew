package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spk extends ffhv implements ffjm {
    final /* synthetic */ spw a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spk(ffgu ffguVar, spw spwVar) {
        super(2, ffguVar);
        this.a = spwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        UUID c = this.a.f.c();
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("No sessionId found in SharedPrefs");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        spk spkVar = new spk(ffguVar, this.a);
        spkVar.b = obj;
        return spkVar;
    }
}
