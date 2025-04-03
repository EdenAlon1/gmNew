package defpackage;

import java.io.InputStream;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aajr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aajs b;
    final /* synthetic */ String c;
    final /* synthetic */ fgcm d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aajr(aajs aajsVar, String str, fgcm fgcmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aajsVar;
        this.c = str;
        this.d = fgcmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aajr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ffsk ffskVar = (ffsk) this.e;
                emmt emmtVar = (emmt) this.b.b.b();
                String str = this.c;
                emhu emhuVar = (emhu) emhv.a.createBuilder();
                emhuVar.getClass();
                emhw emhwVar = (emhw) emhx.a.createBuilder();
                emhwVar.getClass();
                emhy.c(str, emhwVar);
                emhy.b("screen_effects", emhwVar);
                emht.b(emhy.a(emhwVar), emhuVar);
                ffud b = axnh.b(emmtVar.c(emht.a(emhuVar)), ffskVar);
                this.a = 1;
                obj = ((ffuq) b).B(this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            eyfc a = eyfc.a();
            eykv eykvVar = ((eylg) eyfy.parseFrom(eylg.a, (InputStream) obj, a)).c;
            if (eykvVar == null) {
                eykvVar = eykv.a;
            }
            eykvVar.getClass();
            this.d.f(eykvVar);
        } catch (Exception e) {
            enrr a2 = aajs.a.a(Level.WARNING);
            a2.Y(ente.a, "BugleReactions");
            ((enrr) a2.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/effects/ReactionEffectAnimationMap$loadEffectAsset$1", "invokeSuspend", 61, "ReactionEffectAnimationMap.kt")).D("Could not parse the reaction effects %s from mdd: %s", this.c, e.toString());
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aajr aajrVar = new aajr(this.b, this.c, this.d, ffguVar);
        aajrVar.e = obj;
        return aajrVar;
    }
}
